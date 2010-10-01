/*
 * Copyright 2003-2010 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package jetbrains.mps;

import com.intellij.ide.IdeEventQueue;
import com.intellij.idea.IdeaTestApplication;
import com.intellij.idea.LoggerFactory;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ModalityState;
import com.intellij.openapi.application.ex.ApplicationManagerEx;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ex.ProjectManagerEx;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.baseLanguage.util.plugin.run.MPSLaunch;
import jetbrains.mps.compiler.CompilationResultAdapter;
import jetbrains.mps.generator.GenParameters;
import jetbrains.mps.generator.GeneratorManager;
import jetbrains.mps.generator.generationTypes.InMemoryJavaGenerationHandler;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.ide.progress.ITaskProgressHelper;
import jetbrains.mps.logging.ILoggingHandler;
import jetbrains.mps.logging.LogEntry;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.messages.IMessageHandler;
import jetbrains.mps.messages.Message;
import jetbrains.mps.project.*;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.project.structure.modules.LanguageDescriptor;
import jetbrains.mps.project.structure.modules.StubModelsEntry;
import jetbrains.mps.project.structure.project.testconfigurations.BaseTestConfiguration;
import jetbrains.mps.project.structure.project.testconfigurations.IllegalGeneratorConfigurationException;
import jetbrains.mps.project.tester.DiffReporter;
import jetbrains.mps.project.tester.TesterGenerationHandler;
import jetbrains.mps.refactoring.framework.tests.IRefactoringTester;
import jetbrains.mps.reloading.ClassLoaderManager;
import jetbrains.mps.smodel.*;
import jetbrains.mps.util.FileUtil;
import jetbrains.mps.util.PathManager;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import org.eclipse.jdt.core.compiler.CategorizedProblem;
import org.eclipse.jdt.internal.compiler.CompilationResult;
import org.jdom.JDOMException;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.*;

public class TestMain {
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Usage : TestMain mpsProject");
      return;
    }

    File projectFile = new File(args[0]);
    if (!projectFile.exists()) {
      System.out.println("Can't find a file " + projectFile);
      return;
    }

    TestResult result = testProject(projectFile);
    System.exit(result.isOk() ? 0 : 1);
  }


  public static void testProject(File projectFile, ProjectRunnable pr) {
    IdeMain.setTestMode(TestMode.CORE_TEST);
    TestMain.configureMPS();
    final MPSProject project = loadProject(projectFile);
    pr.execute(project.getProject());
  }

  public static MPSProject loadProject(File projectFile) {
    if (!projectFile.exists()) {
      throw new RuntimeException("Can't find a project in file " + projectFile.getAbsolutePath());
    }

    ApplicationManagerEx.getApplicationEx().doNotSave();

    final ProjectManagerEx projectManager = ProjectManagerEx.getInstanceEx();

    final String filePath = projectFile.getAbsolutePath();

    //this is a workaround for MPS-8840
    final Project[] project = new Project[1];

    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        try {
          project[0] = projectManager.loadAndOpenProject(filePath, false);
        } catch (IOException e) {
          throw new RuntimeException(e);
        } catch (JDOMException e) {
          throw new RuntimeException(e);
        } catch (InvalidDataException e) {
          throw new RuntimeException(e);
        }
      }
    });

    assert project[0] != null;

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        new ModuleMaker().make(
          new LinkedHashSet<IModule>(MPSModuleRepository.getInstance().getAllModules()),
          new EmptyProgressIndicator());
      }
    });

    projectManager.openProject(project[0]);
    return project[0].getComponent(MPSProject.class);
  }

  public static boolean testProjectGenerationForLeaks(File projectFile) {
    return testProjectGenerationForLeaks(projectFile, 1000);
  }

  public static boolean testProjectGenerationForLeaks(File projectFile, int leakThreshold) {
    IdeMain.setTestMode(TestMode.CORE_TEST);

    TestMain.configureMPS();

    final MPSProject project = loadProject(projectFile);
    return testActionForLeaks(new Runnable() {
      public void run() {
        new ProjectTester(project.getProject()).testProject();
      }
    }, leakThreshold);
  }

  public static boolean testRefactoringTestEnvironment(File projectDirectory) {
    IdeMain.setTestMode(TestMode.CORE_TEST);
    TestMain.configureMPS();
    File projectFile = new File(projectDirectory, "testRefactoring" + MPSExtentions.DOT_MPS_PROJECT);
    final MPSProject project = loadProject(projectFile);
    final boolean[] b = new boolean[]{true};
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        if (getSandbox1(project) == null) {
          b[0] = false;
          return;
        }
        if (getSandbox2(project) == null) {
          b[0] = false;
          return;
        }
        if (getTestRefactoringLanguage(project) == null) {
          b[0] = false;
          return;
        }
        if (getTestRefactoringTargetLanguage(project) == null) {
          b[0] = false;
          return;
        }
      }
    });

    ThreadUtils.runInUIThreadNoWait(new Runnable() {
      public void run() {
        project.dispose();
      }
    });
    return b[0];
  }

  private static SModelDescriptor getSandbox1(MPSProject project) {
    return project.getProject().getComponent(ProjectScope.class).getModelDescriptor(SModelReference.fromString("testRefactoring.sandbox"));
  }

  private static SModelDescriptor getSandbox2(MPSProject project) {
    return project.getProject().getComponent(ProjectScope.class).getModelDescriptor(SModelReference.fromString("testRefactoring.sandbox2"));
  }

  private static Language getTestRefactoringLanguage(MPSProject project) {
    return project.getProject().getComponent(ProjectScope.class).getLanguage("testRefactoring");
  }

  private static Language getTestRefactoringTargetLanguage(MPSProject project) {
    return project.getProject().getComponent(ProjectScope.class).getLanguage("testRefactoringTargetLang");
  }

  public static boolean testRefactoringOnProject(final File sourceProjectDir, final IRefactoringTester refactoringTester) {
    IdeMain.setTestMode(TestMode.CORE_TEST);
    TestMain.configureMPS();
    final boolean[] b = new boolean[]{true};


    final File destinationProjectDir = new File(PathManager.getHomePath(), "TEST_REFACTORING");
    if (destinationProjectDir.exists()) {
      FileUtil.delete(destinationProjectDir);
    }
    FileUtil.copyDir(sourceProjectDir, destinationProjectDir);
    final MPSProject[] projectArray = new MPSProject[]{null};
    //loading a project
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        try {
          File projectFile = new File(destinationProjectDir, "testRefactoring" + MPSExtentions.DOT_MPS_PROJECT);
          projectArray[0] = loadProject(projectFile);
          VirtualFile projectVirtualDir = LocalFileSystem.getInstance().refreshAndFindFileByIoFile(destinationProjectDir);
          assert projectVirtualDir != null;
          projectVirtualDir.refresh(false, true);
        } catch (Throwable t) {
          t.printStackTrace();
        }
      }
    });
    if (projectArray[0] == null) return false;

    final MPSProject project = projectArray[0];


    final Runnable continuation = new Runnable() {
      public void run() {
        if (project != null) {
          project.dispose();
        }
        FileUtil.delete(destinationProjectDir);
      }
    };

    final SModelDescriptor[] sandbox1 = new SModelDescriptor[]{null};
    final SModelDescriptor[] sandbox2 = new SModelDescriptor[]{null};
    final Language[] testRefactoringLanguage = new Language[]{null};
    final Language[] testRefactoringTargetLanguage = new Language[]{null};
    ModelAccess.instance().runWriteAction(new Runnable() {
      public void run() {
        try {
          sandbox1[0] = getSandbox1(project);
          sandbox2[0] = getSandbox2(project);
          testRefactoringLanguage[0] = getTestRefactoringLanguage(project);
          testRefactoringTargetLanguage[0] = getTestRefactoringTargetLanguage(project);

          //update languages' classpathes
          {
            LanguageDescriptor testRefactoringDescriptor = testRefactoringLanguage[0].getModuleDescriptor();
            LanguageDescriptor testRefactoringTargetDescriptor = testRefactoringTargetLanguage[0].getModuleDescriptor();

            ClassPathEntry cpEntry1 = new ClassPathEntry();
            ClassPathEntry cpEntry2 = new ClassPathEntry();
            String classPath = destinationProjectDir.getAbsolutePath() + "/classes";
            cpEntry1.setPath(classPath);
            cpEntry2.setPath(classPath);

            testRefactoringDescriptor.getStubModelEntries().add(StubModelsEntry.fromClassPathEntry(cpEntry1));
            testRefactoringTargetDescriptor.getStubModelEntries().add(StubModelsEntry.fromClassPathEntry(cpEntry2));

            testRefactoringLanguage[0].setLanguageDescriptor(testRefactoringDescriptor, false);
            testRefactoringTargetLanguage[0].setLanguageDescriptor(testRefactoringTargetDescriptor, false);
          }
        } catch (Throwable t) {
          t.printStackTrace();
          b[0] = false;
          return;
        }
      }
    });

    if (!b[0]) {
      return false;
    }
    try {
      return refactoringTester.testRefactoring(
        project.getProject(),
        sandbox1[0],
        sandbox2[0],
        testRefactoringLanguage[0],
        testRefactoringTargetLanguage[0]);
    } catch (Throwable t) {
      t.printStackTrace();
      return false;
    } finally {
      // Wait until last invokeLater() is executed
      ApplicationManager.getApplication().invokeAndWait(new Runnable() {
        @Override
        public void run() {}
      }, ModalityState.NON_MODAL);
      ThreadUtils.runInUIThreadAndWait(continuation);
    }
  }

  public static boolean testProjectReloadForLeaks(final File projectFile) {
    IdeMain.setTestMode(TestMode.CORE_TEST);

    return testProjectReloadForLeaks(projectFile, 1000);
  }

  public static boolean testProjectReloadForLeaks(final File projectFile, int leakThreshold) {
    TestMain.configureMPS();

    return testActionForLeaks(new Runnable() {
      public void run() {
        MPSProject project = loadProject(projectFile);
        ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());
        project.dispose();
      }
    }, leakThreshold);
  }

  public static boolean testActionForLeaks(Runnable action, int leakThreshold) {
    action.run();
    gc();
    allowToCreateASnapshot();

    long memory = usedMemory();
    action.run();
    gc();
    allowToCreateASnapshot();

    long delta = usedMemory() - memory;

    System.out.println("delta = " + delta);

    if (delta > leakThreshold * 1000) {
      System.out.println(delta + " bytes leaked");
      return false;
    }

    return true;
  }

  private static void allowToCreateASnapshot() {

//    try {
//      System.out.println("take a snapshot!!!!");
//      Thread.sleep(30000);
//
//    } catch (Throwable t) {
//      t.printStackTrace();
//    }
  }

  private static void gc() {
    for (int i = 0; i < 5; i++) {
      System.gc();
    }
  }

  private static long usedMemory() {
    return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
  }

  public static TestResult testProject(File projectFile) {
    return testProject(projectFile, false);
  }

  public static TestResult testProject(File projectFile, boolean isRunnable) {
    return testProject(projectFile, isRunnable, new String[0]);
  }

  /**
   * Null result means no problems, not null result contains error description.
   *
   * @param projectFile
   * @return
   */
  public static TestResult testProject(File projectFile, boolean isRunnable, String[] configurations) {
    com.intellij.openapi.diagnostic.Logger.setFactory(LoggerFactory.getInstance());
    IdeMain.setTestMode(TestMode.CORE_TEST);
    long start = System.currentTimeMillis();
    configureMPS();

    System.out.println("loading project " + projectFile + "...");
    if (!projectFile.exists()) {
      throw new RuntimeException("Can't find a project in file " + projectFile.getAbsolutePath());
    }

    final MPSProject project = loadProject(projectFile);
    TestResult result = new ProjectTester(project.getProject(), isRunnable).testProject(configurations);

    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        project.dispose();

        IdeEventQueue.getInstance().flushQueue();
        gc();
      }
    });

    result.dump(System.out);

    if (!result.isOk()) {
      if (result.hasGenerationErrors()) {
        System.out.println("there were " + result.myGenerationErrors.size() + " generation error");
        for (String error : result.myGenerationErrors) {
          System.out.println(error);
        }
      }

      if (result.hasGenerationWarnings()) {
        System.out.println("there were " + result.myGenerationWarnings.size() + " generation warnings");
        for (String warning : result.myGenerationWarnings) {
          System.out.println(warning);
        }
      }
      if (result.hasCompilationProblems()) {
        System.out.println("there were " + result.myCompilationProblems.size() + " compilation problems");
        for (String compilationProblem : result.myCompilationProblems) {
          System.out.println(compilationProblem);
        }
      }
    }

    System.out.println("testing took " + (System.currentTimeMillis() - start) + " ms");

    return result;
  }

  public static void configureMPS() {
    String mpsInternal = System.getProperty("mps.internal");
    System.setProperty("idea.is.internal", mpsInternal == null ? "false" : mpsInternal);
    System.setProperty("idea.no.jre.check", "true");
    System.setProperty("idea.load.plugins", "false");
    System.setProperty("idea.platform.prefix", "Idea");

    try {
      IdeaTestApplication.getInstance(null);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

  }

  public static interface ProjectRunnable {
    void execute(Project project);
  }

  public static class ProjectTester {
    private Project myProject;
    private boolean myIsRunnable;

    public ProjectTester(Project project, boolean isRunnable) {
      myProject = project;
      myIsRunnable = isRunnable;
    }

    public ProjectTester(Project project) {
      this(project, false);
    }

    public static List<String> createCompilationProblemsList(List<CompilationResult> compilationResults) {
      List<String> res = new ArrayList<String>();

      for (CompilationResult r : compilationResults) {
        if (r.getErrors() != null) {
          for (CategorizedProblem p : r.getErrors()) {
            res.add(new String(
              r.getCompilationUnit().getFileName()) +
              " (" + p.getSourceLineNumber() + "): " +
              p.getMessage());
          }
        }
      }

      return res;
    }

    private static List<TestFailure> createTestFailures(@NotNull InMemoryJavaGenerationHandler generationHandler, List<SModel> models) {
      List<TestFailure> testFailures = new ArrayList<TestFailure>();
      junit.framework.TestResult result = new junit.framework.TestResult();
      invokeTests(generationHandler, models, result, null);
      testFailures.addAll(Collections.list(result.failures()));
      testFailures.addAll(Collections.list(result.errors()));
      return testFailures;
    }

    public static void invokeTests(@NotNull InMemoryJavaGenerationHandler generationHandler, List<SModel> outputModels, junit.framework.TestResult testResult, ClassLoader baseClassLoader) {
      for (final SModel model : outputModels) {
        for (final SNode outputRoot : model.getRoots()) {
          if (baseClassLoader == null) {
            baseClassLoader = model.getClass().getClassLoader();
          }
          ClassLoader classLoader = generationHandler.getCompiler().getClassLoader(baseClassLoader);
          Boolean isClassConcept = ModelAccess.instance().runReadAction(new Computable<Boolean>() {
            @Override
            public Boolean compute() {
              return !outputRoot.isInstanceOfConcept(ClassConcept.concept);
            }
          });
          if (isClassConcept) {
            continue;
          }
          try {
            String className = ModelAccess.instance().runReadAction(new Computable<String>() {
              @Override
              public String compute() {
                return model.getLongName() + "." + outputRoot.getName();
              }
            });
            final Class testClass = Class.forName(className, true, classLoader);
            if (Modifier.isAbstract(testClass.getModifiers()) || Modifier.isInterface(testClass.getModifiers())) continue;
            if (Modifier.isPrivate(testClass.getModifiers())) continue;
            if (testClass.getAnnotation(classLoader.loadClass(MPSLaunch.class.getName())) != null) continue;

            List<Method> testMethods = new ArrayList<Method>();
            Class<TestCase> testCaseClass = (Class<TestCase>) classLoader.loadClass(TestCase.class.getName());
            boolean isTestCase = testCaseClass.isAssignableFrom(testClass);

            for (Method method : testClass.getMethods()) {
              if (method.getAnnotation((Class<Annotation>) classLoader.loadClass(org.junit.Test.class.getName())) != null
                || (method.getName().startsWith("test") && isTestCase)) {
                testMethods.add(method);
              }
            }

            for (Method testMethod : testMethods) {
              try {
                final Object instance = testClass.newInstance();
                Method setName = testCaseClass.getMethod("setName", String.class);
                setName.invoke(instance, testMethod.getName());
                Method runMethod = testCaseClass.getMethod("run", classLoader.loadClass(junit.framework.TestResult.class.getName()));
                runMethod.invoke(instance, testResult);
              } catch (Throwable ignored) {
                // if one test fails, we still want to try to run the others
                System.err.println(testClass.getCanonicalName() + ":");
                ignored.printStackTrace();
              }
            }
          } catch (Throwable ignored) {
            ignored.printStackTrace(); // exceptions happen for a reason
          }
        }
      }
    }

    private static boolean findAnnotationOfClass(Annotation[] annotations, Class annotationClass) {
      // we do not want to deal with classloader issues here, so doing it plain and simple
      boolean found = false;
      for (Annotation a : annotations) {
        if (a.annotationType().getCanonicalName().equals(annotationClass.getCanonicalName())) {
          found = true;
          break;
        }
      }
      return found;
    }

    public TestResult testProject() {
      return testProject(new String[0]);
    }

    public TestResult testProject(final String[] configurationsGiven) {
      ClassLoaderManager.getInstance().reloadAll(new EmptyProgressIndicator());

      final List<String> errors = new ArrayList<String>();
      final List<String> warnings = new ArrayList<String>();
      final List<String> compilationResults = new ArrayList<String>();
      final List<TestFailure> failedTests = new ArrayList<TestFailure>();
      final List<String> diffReports = new ArrayList<String>();

      final IMessageHandler handler = new MyIMessageHandler(errors, warnings);
      final ILoggingHandler loggingHandler = new MyILoggingHandler(errors, warnings);

      try {
        Logger.addLoggingHandler(loggingHandler);

        final TesterGenerationHandler generationHandler = new TesterGenerationHandler(true);

        ModelAccess.instance().runWriteAction(new Runnable() {
          public void run() {
            List<BaseTestConfiguration> configurations = new ArrayList<BaseTestConfiguration>(myProject.getComponent(MPSProject.class).getProjectDescriptor().getTestConfigurations());

            if (configurations.isEmpty()) {
              throw new RuntimeException("tested project has no test configurations");
            }

            for (BaseTestConfiguration t : configurations) {
              System.out.println("completed : " + configurations.indexOf(t) + " / " + configurations.size());

              if (configurationsGiven.length > 0) {
                boolean exists = false;
                for (String confName : configurationsGiven) {
                  if (confName.equals(t.getName())) {
                    exists = true;
                    break;
                  }
                }
                if (!exists) {
                  continue;
                }
              }

              GenParameters parms;
              try {
                parms = t.getGenParams(myProject, true);
              } catch (IllegalGeneratorConfigurationException e) {
                errors.add("Can't create a generator configuration : " + e.getMessage());
                return;
              }

              int numErrorsBeforeGeneration = errors.size();

              GeneratorManager gm = myProject.getComponent(GeneratorManager.class);
              gm.generateModels(
                parms.getModelDescriptors(),
                new ModuleContext(parms.getModule(), myProject),
                generationHandler,
                new EmptyProgressIndicator(),
                handler
              );

              if (myIsRunnable) {
                diffReports.addAll(DiffReporter.createDiffReports(generationHandler));
              }
              List<SModel> outputModels = new ArrayList<SModel>();
              outputModels.addAll(generationHandler.getOutputModels());
              if (errors.size() > numErrorsBeforeGeneration) {
                System.out.println("There were generation errors, cancelling compilation");
              } else {
                long start = System.currentTimeMillis();

                final List<CompilationResult> compilationResultList = new ArrayList<CompilationResult>();
                CompilationResultAdapter listener = new CompilationResultAdapter() {
                  public void onCompilationResult(CompilationResult r) {
                    compilationResultList.add(r);
                  }
                };
                generationHandler.compile(ITaskProgressHelper.EMPTY, listener);

                System.out.println("Compiled " + compilationResultList.size() + " compilation units in " + (System.currentTimeMillis() - start));
                compilationResults.addAll(createCompilationProblemsList(compilationResultList));
                if (compilationResults.isEmpty()) {
                  System.out.println("Compilation ok");
                }

                failedTests.addAll(createTestFailures(generationHandler, outputModels));
              }

              System.out.println("");
              System.out.println("");
              System.out.println("");
            }
          }
        });
      } finally {
        Logger.removeLoggingHandler(loggingHandler);
      }

      return new TestResult(errors, warnings, compilationResults, failedTests, diffReports);
    }

    private static class MyIMessageHandler implements IMessageHandler {
      private final List<String> myErrors;
      private final List<String> myWarnings;

      public MyIMessageHandler(List<String> errors, List<String> warnings) {
        myErrors = errors;
        myWarnings = warnings;
      }

      public void handle(Message msg) {
        switch (msg.getKind()) {
          case ERROR:
            System.out.println("error: " + msg.getText());
            myErrors.add(msg.getText());
            if (msg.getException() != null) {
              myErrors.add(extractStackTrace(msg.getException()).toString());
            }
            break;

          case WARNING:
            System.out.println("warn:  " + msg.getText());
            myWarnings.add(msg.getText());
            break;

          case INFORMATION:
            System.out.println("info:  " + msg.getText());
            break;

        }
      }

      @Override
      public void clear() {

      }
    }

    private static class MyILoggingHandler implements ILoggingHandler {
      private final List<String> myErrors;
      private final List<String> myWarnings;

      public MyILoggingHandler(List<String> errors, List<String> warnings) {
        myErrors = errors;
        myWarnings = warnings;
      }

      public void info(LogEntry e) {
      }

      public void warning(LogEntry e) {
        myWarnings.add(e.getMessage());
      }

      public void debug(LogEntry e) {

      }

      public void error(LogEntry e) {
        myErrors.add(e.getMessage());
        if (e.getThrowable() != null) {
          myErrors.add(extractStackTrace(e.getThrowable()).toString());
        }
      }

      public void fatal(LogEntry e) {
        myErrors.add(e.getMessage());
      }
    }

    public static StringBuffer extractStackTrace(Throwable e) {
      StringWriter writer = new StringWriter();
      e.printStackTrace(new PrintWriter(writer));
      return writer.getBuffer();
    }
  }
}
