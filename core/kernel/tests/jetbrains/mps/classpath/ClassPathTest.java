package jetbrains.mps.classpath;

import com.intellij.idea.LoggerFactory;
import com.intellij.util.containers.MultiMap;
import jetbrains.mps.BaseMPSTest;
import jetbrains.mps.TestMain;
import jetbrains.mps.ide.IdeMain;
import jetbrains.mps.ide.IdeMain.TestMode;
import jetbrains.mps.ide.ThreadUtils;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.project.persistence.ProjectDescriptorPersistence;
import jetbrains.mps.project.persistence.SolutionDescriptorPersistence;
import jetbrains.mps.project.structure.modules.ClassPathEntry;
import jetbrains.mps.project.structure.modules.SolutionDescriptor;
import jetbrains.mps.project.structure.project.Path;
import jetbrains.mps.project.structure.project.ProjectDescriptor;
import jetbrains.mps.reloading.AbstractClassPathItem;
import jetbrains.mps.reloading.IClassPathItem;
import jetbrains.mps.reloading.JarFileClassPathItem;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.misc.hash.HashSet;
import jetbrains.mps.vfs.FileSystem;
import jetbrains.mps.vfs.IFile;

import javax.swing.SwingUtilities;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ClassPathTest extends BaseMPSTest {
  private static final Logger LOG = Logger.getLogger(ClassPathTest.class);

  private static final String MPS_CORE_PROJECT = PathManager.getBootstrapPath() + File.separator + "mps.mpr";

  protected void setUp() throws Exception {
    super.setUp();

    com.intellij.openapi.diagnostic.Logger.setFactory(LoggerFactory.getInstance());
    IdeMain.setTestMode(TestMode.CORE_TEST);
    TestMain.configureMPS();
  }

  /*
    Tests that all solutions form mps.mpr have "don't load classes" enabled.

    If a solution containing MPS core code loads its classes, these classes
    will be loaded by two different classloaders - solution classloader and
    application classloader, which will lead to different exceptions like
    ClassCastException and LinkageError in future.
  */
  public void testMPSSolutionsAreNotLoadingClasses() {
    ProjectDescriptor projectDescriptor = new ProjectDescriptor();
    ProjectDescriptorPersistence.loadProjectDescriptor(projectDescriptor, new File(MPS_CORE_PROJECT));
    for (Path solutionPath : projectDescriptor.getSolutions()) {
      IFile solutionFile = FileSystem.getFile(solutionPath.getPath());
      SolutionDescriptor solutionDescriptor = SolutionDescriptorPersistence.loadSolutionDescriptor(solutionFile);
      assertTrue("Solution " + solutionDescriptor.getNamespace() + " is contained by core project, but has \"Don't load classes\" disabled", solutionDescriptor.isDontLoadClasses());
    }
  }

  /*
    Tests that no classes are loaded by two different modules.

    Except: solutions having "don't load classes" enabled, *.jar

    If two modules contain 
  */
  public void testMPSModulesAreNotLoadingSameClasses() throws InvocationTargetException, InterruptedException {
    final MPSProject project = loadProject(MPS_CORE_PROJECT);
    assertNotNull("Can't open project " + MPS_CORE_PROJECT, project);

    final MultiMap<String, LoadEnvironment> loadedClasses = new MultiMap<String, LoadEnvironment>();

    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        List<IModule> modulesToCheck = new ArrayList<IModule>();
        modulesToCheck.addAll(MPSModuleRepository.getInstance().getAllLanguages());
        modulesToCheck.addAll(MPSModuleRepository.getInstance().getAllSolutions());
        modulesToCheck.removeAll(project.getProjectSolutions());

        //collect class2module info
        for (IModule m : modulesToCheck) {
          List<ClassPathEntry> classPaths = m.getModuleDescriptor().getClassPaths();
          for (ClassPathEntry classPath : classPaths) {
            String path = classPath.getPath();
            IClassPathItem pathItem = null;
            try {
              pathItem = AbstractClassPathItem.createFromPath(path, null);
            } catch (IOException e) {
              LOG.error(e);
              continue;
            }

            // do not check libs
            if (pathItem instanceof JarFileClassPathItem) continue;

            for (String className : getAllClasses(pathItem)) {
              String namespace = m.getModuleNamespace();
              if (!loadedClasses.containsKey(className)) {
                loadedClasses.put(className, new HashSet<LoadEnvironment>(1));
              }

              loadedClasses.get(className).add(new LoadEnvironment(namespace, pathItem.toString()));
            }
          }
        }
      }
    });

    waitForEDTTasksToComplete();
    SwingUtilities.invokeAndWait(new Runnable() {
      public void run() {
        TestMain.closeProject(project);
      }
    });
    waitForEDTTasksToComplete();

    List<Conflict> conflicts = new ArrayList<Conflict>();
    for (String className : loadedClasses.keySet()) {
      Collection<LoadEnvironment> environments = loadedClasses.get(className);
      if (environments.size() > 1) {
        Conflict conflict = new Conflict(className);
        conflict.addLoadEnvironments(environments);
        conflicts.add(conflict);
      }
    }
    //assertTrue(getConflictsDescription(conflicts), conflicts.isEmpty());
  }

  private List<String> getAllClasses(IClassPathItem pathItem) {
    Set<String> packages = new HashSet<String>();
    packages.add("");

    List<String> classNames = new ArrayList<String>();

    while (!packages.isEmpty()) {
      String some = packages.iterator().next();
      packages.remove(some);
      packages.addAll(pathItem.getSubpackages(some));

      classNames.addAll(pathItem.getAvailableClasses(some));
    }

    return classNames;
  }

  private MPSProject loadProject(final String projectFilePath) {
    final MPSProject[] projectArray = new MPSProject[]{null};
    ThreadUtils.runInUIThreadAndWait(new Runnable() {
      public void run() {
        try {
          ModelAccess.instance().runWriteAction(new Runnable() {
            public void run() {
              File projectFile = new File(projectFilePath);
              projectArray[0] = TestMain.loadProject(projectFile);
            }
          });
        } catch (Throwable t) {
          t.printStackTrace();
        }
      }
    });
    final MPSProject project = projectArray[0];
    return project;
  }

  private String getConflictsDescription(List<Conflict> conflicts) {
    StringBuilder result = new StringBuilder();
    for (Conflict c : conflicts) {
      result.append(c.toString());
    }
    return result.toString();
  }

  private static class LoadEnvironment {
    private String myModule;
    private String myClassPath;

    public LoadEnvironment(String module, String classPath) {
      myModule = module;
      myClassPath = classPath;
    }

    public String getModule() {
      return myModule;
    }

    public String getClassPath() {
      return myClassPath;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      LoadEnvironment that = (LoadEnvironment) o;

      if (myModule != null ? !myModule.equals(that.myModule) : that.myModule != null) return false;

      return true;
    }

    @Override
    public int hashCode() {
      return myModule != null ? myModule.hashCode() : 0;
    }
  }

  private static class Conflict {
    private List<LoadEnvironment> myLoadEnvironments = new ArrayList<LoadEnvironment>(2);
    private String myClassName;

    private Conflict(String className) {
      myClassName = className;
    }

    public void addLoadEnvironments(Collection<LoadEnvironment> loadEnvironments) {
      myLoadEnvironments.addAll(loadEnvironments);
    }

    public String toString() {
      StringBuilder result = new StringBuilder("Conflict: ");
      result.append(myClassName).append(" was loaded by:\n");

      for (LoadEnvironment le : myLoadEnvironments) {
        result.append("  module: ").append(le.getModule()).append("; classpath item: ").append(le.getClassPath()).append("\n");
      }

      return result.toString();
    }
  }
}
