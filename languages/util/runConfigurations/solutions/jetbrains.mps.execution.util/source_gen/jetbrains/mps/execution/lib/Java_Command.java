package jetbrains.mps.execution.lib;

/*Generated by MPS */

import java.io.File;
import com.intellij.util.SystemProperties;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.internal.collections.runtime.IterableUtils;
import jetbrains.mps.internal.collections.runtime.ISelector;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.util.FileUtil;
import java.io.PrintWriter;
import jetbrains.mps.execution.api.commands.ProcessHandlerBuilder;
import java.io.FileNotFoundException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.runConfigurations.runtime.JavaRunParameters;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.generator.traceInfo.TraceInfoUtil;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.reloading.ClasspathStringCollector;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.util.CollectionUtil;
import jetbrains.mps.reloading.CommonPaths;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.util.SystemInfo;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.debug.api.run.IDebuggerConfiguration;
import jetbrains.mps.debug.api.IDebuggerSettings;
import jetbrains.mps.debug.runtime.settings.LocalConnectionSettings;
import jetbrains.mps.debug.api.Debuggers;

public class Java_Command {
  private File myWorkingDirectory = new File(SystemProperties.getUserHome());
  private String myJrePath = Java_Command.getJdkHome();
  private String myProgramParameter;
  private String myVirtualMachineParameter;
  private List<String> myClassPath = ListSequence.fromList(new ArrayList<String>());
  private String myDebuggerSettings;

  public Java_Command() {
  }

  public Java_Command setWorkingDirectory(File workingDirectory) {
    if (workingDirectory != null) {
      myWorkingDirectory = workingDirectory;
    }
    return this;
  }

  public Java_Command setJrePath(String jrePath) {
    if (jrePath != null) {
      myJrePath = jrePath;
    }
    return this;
  }

  public Java_Command setProgramParameter(String programParameter) {
    if (programParameter != null) {
      myProgramParameter = programParameter;
    }
    return this;
  }

  public Java_Command setVirtualMachineParameter(String virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter = virtualMachineParameter;
    }
    return this;
  }

  public Java_Command setClassPath(List<String> classPath) {
    if (classPath != null) {
      myClassPath = classPath;
    }
    return this;
  }

  public Java_Command setDebuggerSettings(String debuggerSettings) {
    if (debuggerSettings != null) {
      myDebuggerSettings = debuggerSettings;
    }
    return this;
  }

  public ProcessHandler createProcess(String className) throws ExecutionException {
    String java = Java_Command.getJavaCommand(myJrePath);
    String classPathString = IterableUtils.join(ListSequence.fromList(myClassPath).<String>select(new ISelector<String, String>() {
      public String select(String it) {
        return Java_Command.protect(it);
      }
    }), File.pathSeparator);
    if (StringUtils.isEmpty(className)) {
      throw new ExecutionException("Classname is empty");
    }
    if (check_yvpt_a0d0a0(myProgramParameter) >= Java_Command.getMaxCommandLine()) {
      File tmpFile = FileUtil.createTmpFile();
      // we want to be sure that file is deleted, even when process is not started 
      tmpFile.deleteOnExit();
      try {
        PrintWriter writer = new PrintWriter(tmpFile);
        writer.append(myProgramParameter);
        writer.flush();
        writer.close();
        return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter).append(myDebuggerSettings).appendKey("classpath", classPathString).append(ClassRunner.class.getName()).appendKey(ClassRunner.CLASS_PREFIX, myClassPath).appendKey(ClassRunner.FILE_PREFIX, tmpFile.getAbsolutePath()).build(myWorkingDirectory);
      } catch (FileNotFoundException e) {
        throw new ExecutionException("Could not create temporal file for program parameters.", e);
      }
    } else {
      return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter).append(myDebuggerSettings).appendKey("classpath", classPathString).append(className).append(myProgramParameter).build(myWorkingDirectory);
    }
  }

  public ProcessHandler createProcess(SNode node) throws ExecutionException {
    return new Java_Command().setJrePath(myJrePath).setWorkingDirectory(myWorkingDirectory).setProgramParameter(myProgramParameter).setVirtualMachineParameter(myVirtualMachineParameter).setClassPath(Java_Command.getClasspath(node)).setDebuggerSettings(myDebuggerSettings).createProcess(Java_Command.getClassName(node));
  }

  public ProcessHandler createProcess(JavaRunParameters runParameters, SNode node) throws ExecutionException {
    return new Java_Command().setJrePath(check_yvpt_a0a0a0c(runParameters)).setProgramParameter(check_yvpt_a2a0a0c(runParameters)).setVirtualMachineParameter(check_yvpt_a3a0a0c(runParameters)).setWorkingDirectory((check_yvpt_a0a4a0a0c(runParameters) == null ?
      null :
      new File(check_yvpt_a0a0e0a0a2(runParameters))
    )).setDebuggerSettings(myDebuggerSettings).createProcess(node);
  }

  public static IDebugger getDebugger() {
    return getDebuggerConfiguration().getDebugger();
  }

  public static boolean isUnitNode(SNode node) {
    return StringUtils.isNotEmpty(Java_Command.getClassName(node));
  }

  private static String getClassName(final SNode node) {
    final Wrappers._T<String> className = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        className.value = TraceInfoUtil.getUnitName(node);
      }
    });
    return className.value;
  }

  private static int getMaxCommandLine() {
    return 16384;
  }

  public static List<String> getClasspath(final SNode node) {
    final Wrappers._T<IModule> module = new Wrappers._T<IModule>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        module.value = SNodeOperations.getModel(node).getModelDescriptor().getModule();
      }
    });
    return Java_Command.getClasspath(module.value, true);
  }

  public static List<String> getClasspath(final IModule module, boolean withDependencies) {
    List<String> result = ListSequence.fromList(new ArrayList<String>());
    if (module.getClassesGen() != null) {
      ListSequence.fromList(result).addElement(module.getClassesGen().getAbsolutePath());
    }

    final ClasspathStringCollector visitor = new ClasspathStringCollector(result);
    module.getClassPathItem().accept(visitor);
    if (withDependencies) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          AbstractModule.getDependenciesClasspath(CollectionUtil.set(module), true).accept(visitor);
        }
      });
    }

    List<String> visited = visitor.getResultAndReInit();
    visited.removeAll(CommonPaths.getJDKPath());

    return visited;
  }

  public static String getJavaCommand(@Nullable String javaHome) throws ExecutionException {
    if (StringUtils.isEmpty(javaHome) || !(new File(javaHome).exists())) {
      javaHome = Java_Command.getJdkHome();
    }
    if (StringUtils.isEmpty(javaHome)) {
      throw new ExecutionException("Could not find valid java home.");
    }
    return Java_Command.protect(Java_Command.getJavaCommandUnprotected(javaHome));
  }

  public static String getJavaCommandUnprotected(String javaHome) {
    String result = javaHome + File.separator + "bin" + File.separator;
    String java = "java";
    if (SystemInfo.isMac) {
      result += java;
    } else
    if (SystemInfo.isWindows) {
      result += java + ".exe";
    } else {
      result += java;
    }
    return result;
  }

  public static List<String> getJavaHomes() {
    String systemJavaHome = SystemProperties.getJavaHome();
    List<String> homes = ListSequence.fromList(new LinkedList<String>());
    String systemJdkHome = systemJavaHome.substring(0, systemJavaHome.length() - "/jre".length());
    if (systemJavaHome.endsWith("jre") && new File(systemJdkHome + File.separator + "bin").exists()) {
      ListSequence.fromList(homes).addElement(systemJdkHome);
    }
    if (StringUtils.isNotEmpty(System.getenv("JAVA_HOME"))) {
      ListSequence.fromList(homes).addElement(System.getenv("JAVA_HOME"));
    }
    ListSequence.fromList(homes).addElement(systemJavaHome);
    return homes;
  }

  public static String getJdkHome() {
    List<String> homes = Java_Command.getJavaHomes();
    for (String javaHome : ListSequence.fromList(homes)) {
      if (new File(Java_Command.getJavaCommandUnprotected(javaHome)).exists()) {
        return javaHome;
      }
    }
    return null;
  }

  public static String protect(String result) {
    if (result.contains(" ")) {
      return "\"" + result + "\"";
    }
    return result;
  }

  public static IDebuggerConfiguration getDebuggerConfiguration() {
    return new IDebuggerConfiguration() {
      @Nullable
      public IDebuggerSettings createDebuggerSettings() {
        return new LocalConnectionSettings(true);
      }

      public IDebugger getDebugger() {
        return Debuggers.getInstance().getDebuggerByName("Java");
      }
    };
  }

  private static int check_yvpt_a0d0a0(String checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.length();
    }
    return 0;
  }

  private static String check_yvpt_a0a0a0c(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getAlternativeJre();
    }
    return null;
  }

  private static String check_yvpt_a2a0a0c(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.programParameters();
    }
    return null;
  }

  private static String check_yvpt_a3a0a0c(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.vmOptions();
    }
    return null;
  }

  private static String check_yvpt_a0a0e0a0a2(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.workingDirectory();
    }
    return null;
  }

  private static String check_yvpt_a0a4a0a0c(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.workingDirectory();
    }
    return null;
  }
}
