package jetbrains.mps.baseLanguage.execution.api;

/*Generated by MPS */

import java.io.File;
import com.intellij.util.SystemProperties;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.execution.api.commands.CommandPart;
import jetbrains.mps.util.annotation.ToRemove;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.internal.collections.runtime.ISelector;
import jetbrains.mps.execution.api.commands.ListCommandPart;
import org.apache.commons.lang.StringUtils;
import jetbrains.mps.execution.api.commands.ProcessHandlerBuilder;
import jetbrains.mps.execution.api.commands.KeyValueCommandPart;
import java.io.FileNotFoundException;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.debug.api.IDebugger;
import jetbrains.mps.generator.traceInfo.TraceInfoUtil;
import jetbrains.mps.project.IModule;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.reloading.ClasspathStringCollector;
import jetbrains.mps.project.AbstractModule;
import jetbrains.mps.util.CollectionUtil;
import java.util.Set;
import jetbrains.mps.reloading.CommonPaths;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.project.ModuleId;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.util.SystemInfo;
import jetbrains.mps.internal.collections.runtime.backports.LinkedList;
import jetbrains.mps.util.FileUtil;
import java.io.PrintWriter;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.debug.api.run.IDebuggerConfiguration;
import jetbrains.mps.debug.api.IDebuggerSettings;
import jetbrains.mps.debug.runtime.settings.LocalConnectionSettings;
import jetbrains.mps.debug.api.Debuggers;

public class Java_Command {
  private File myWorkingDirectory_File = new File(SystemProperties.getUserHome());
  private String myJrePath_String = Java_Command.getJdkHome();
  private String myProgramParameter_String;
  private String myVirtualMachineParameter_String;
  private List<String> myClassPath_ListString = ListSequence.fromList(new ArrayList<String>());
  private String myDebuggerSettings_String;
  private CommandPart myVirtualMachineParameter_ProcessBuilderCommandPart;

  public Java_Command() {
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setWorkingDirectory(File workingDirectory) {
    // this methods only exist to not make users regenerate their code 
    if (workingDirectory != null) {
      myWorkingDirectory_File = workingDirectory;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setJrePath(String jrePath) {
    // this methods only exist to not make users regenerate their code 
    if (jrePath != null) {
      myJrePath_String = jrePath;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setProgramParameter(String programParameter) {
    // this methods only exist to not make users regenerate their code 
    if (programParameter != null) {
      myProgramParameter_String = programParameter;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setVirtualMachineParameter(String virtualMachineParameter) {
    // this methods only exist to not make users regenerate their code 
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter_String = virtualMachineParameter;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setClassPath(List<String> classPath) {
    // this methods only exist to not make users regenerate their code 
    if (classPath != null) {
      myClassPath_ListString = classPath;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setDebuggerSettings(String debuggerSettings) {
    // this methods only exist to not make users regenerate their code 
    if (debuggerSettings != null) {
      myDebuggerSettings_String = debuggerSettings;
    }
    return this;
  }

  @Deprecated
  @ToRemove(version = 2.1)
  public Java_Command setVirtualMachineParameter(CommandPart virtualMachineParameter) {
    // this methods only exist to not make users regenerate their code 
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter_ProcessBuilderCommandPart = virtualMachineParameter;
    }
    return this;
  }

  public Java_Command setWorkingDirectory_File(File workingDirectory) {
    if (workingDirectory != null) {
      myWorkingDirectory_File = workingDirectory;
    }
    return this;
  }

  public Java_Command setJrePath_String(String jrePath) {
    if (jrePath != null) {
      myJrePath_String = jrePath;
    }
    return this;
  }

  public Java_Command setProgramParameter_String(String programParameter) {
    if (programParameter != null) {
      myProgramParameter_String = programParameter;
    }
    return this;
  }

  public Java_Command setVirtualMachineParameter_String(String virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter_String = virtualMachineParameter;
    }
    return this;
  }

  public Java_Command setClassPath_ListString(List<String> classPath) {
    if (classPath != null) {
      myClassPath_ListString = classPath;
    }
    return this;
  }

  public Java_Command setDebuggerSettings_String(String debuggerSettings) {
    if (debuggerSettings != null) {
      myDebuggerSettings_String = debuggerSettings;
    }
    return this;
  }

  public Java_Command setVirtualMachineParameter_ProcessBuilderCommandPart(CommandPart virtualMachineParameter) {
    if (virtualMachineParameter != null) {
      myVirtualMachineParameter_ProcessBuilderCommandPart = virtualMachineParameter;
    }
    return this;
  }

  public ProcessHandler createProcess(String className) throws ExecutionException {
    return new Java_Command().setWorkingDirectory_File(myWorkingDirectory_File).setJrePath_String(myJrePath_String).setProgramParameter_String(myProgramParameter_String).setVirtualMachineParameter_String(myVirtualMachineParameter_String).setDebuggerSettings_String(myDebuggerSettings_String).createProcess(className, ListSequence.fromList(myClassPath_ListString).select(new ISelector<String, File>() {
      public File select(String it) {
        if (it.startsWith("\"") && it.endsWith("\"")) {
          return new File(it.substring(1, it.length() - 2));
        }
        return new File(it);
      }
    }).toListSequence());
  }

  public ProcessHandler createProcess(String className, List<File> classPath) throws ExecutionException {
    return new Java_Command().setWorkingDirectory_File(myWorkingDirectory_File).setJrePath_String(myJrePath_String).setVirtualMachineParameter_ProcessBuilderCommandPart(new ListCommandPart(ListSequence.fromListAndArray(new ArrayList(), myVirtualMachineParameter_String))).setDebuggerSettings_String(myDebuggerSettings_String).createProcess(new ListCommandPart(ListSequence.fromListAndArray(new ArrayList(), myProgramParameter_String)), className, classPath);
  }

  public ProcessHandler createProcess(CommandPart programParameter, String className, List<File> classPath) throws ExecutionException {
    File java = Java_Command.getJavaCommand(myJrePath_String);
    if (StringUtils.isEmpty(className)) {
      throw new ExecutionException("Classname is empty");
    }
    if (check_yvpt_a0c0a2(programParameter) >= Java_Command.getMaxCommandLine()) {
      try {
        File parametersFile = Java_Command.writeToTmpFile(programParameter.getCommandList());
        File classPathFile = Java_Command.writeToTmpFile(ListSequence.fromList(classPath).select(new ISelector<File, String>() {
          public String select(File it) {
            return it.getAbsolutePath();
          }
        }));
        List<File> classRunnerClassPath = ListSequence.fromList(Java_Command.getClassRunnerClassPath()).select(new ISelector<String, File>() {
          public File select(String it) {
            return new File(it);
          }
        }).toListSequence();
        return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter_ProcessBuilderCommandPart).append(myDebuggerSettings_String).append(new KeyValueCommandPart("-" + "classpath", new ListCommandPart(classRunnerClassPath, File.pathSeparator))).append("jetbrains.mps.execution.lib.startup.ClassRunner").append(new KeyValueCommandPart("-" + ("c"), className)).append(new KeyValueCommandPart("-" + ("f"), parametersFile)).append(new KeyValueCommandPart("-" + ("p"), classPathFile)).build(myWorkingDirectory_File);
      } catch (FileNotFoundException e) {
        throw new ExecutionException("Could not create temporal file for program parameters.", e);
      }

    } else {
      return new ProcessHandlerBuilder().append(java).append(myVirtualMachineParameter_ProcessBuilderCommandPart).append(myDebuggerSettings_String).append(new KeyValueCommandPart("-" + "classpath", new ListCommandPart(classPath, File.pathSeparator))).append(className).append(programParameter).build(myWorkingDirectory_File);
    }
  }

  public ProcessHandler createProcess(final SNode node) throws ExecutionException {
    final Wrappers._T<SNodePointer> nodePointer = new Wrappers._T<SNodePointer>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        nodePointer.value = new SNodePointer(node);
      }
    });
    return new Java_Command().setJrePath_String(myJrePath_String).setWorkingDirectory_File(myWorkingDirectory_File).setProgramParameter_String(myProgramParameter_String).setVirtualMachineParameter_String(myVirtualMachineParameter_String).setDebuggerSettings_String(myDebuggerSettings_String).createProcess(nodePointer.value);
  }

  public ProcessHandler createProcess(SNodePointer nodePointer) throws ExecutionException {
    return new Java_Command().setJrePath_String(myJrePath_String).setWorkingDirectory_File(myWorkingDirectory_File).setProgramParameter_String(myProgramParameter_String).setVirtualMachineParameter_String(myVirtualMachineParameter_String).setClassPath_ListString(Java_Command.getClasspath(nodePointer.getModel().getModule(), true)).setDebuggerSettings_String(myDebuggerSettings_String).createProcess(Java_Command.getClassName(nodePointer));
  }

  public ProcessHandler createProcess(JavaRunParameters runParameters, final SNode node) throws ExecutionException {
    final Wrappers._T<SNodePointer> nodePointer = new Wrappers._T<SNodePointer>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        nodePointer.value = new SNodePointer(node);
      }
    });
    return new Java_Command().setDebuggerSettings_String(myDebuggerSettings_String).createProcess(runParameters, nodePointer.value);
  }

  public ProcessHandler createProcess(JavaRunParameters runParameters, SNodePointer nodePointer) throws ExecutionException {
    return new Java_Command().setJrePath_String(check_yvpt_a0a0a0g(runParameters)).setProgramParameter_String(check_yvpt_a2a0a0g(runParameters)).setVirtualMachineParameter_String(check_yvpt_a3a0a0g(runParameters)).setWorkingDirectory_File((check_yvpt_a0a4a0a0g(runParameters) == null ?
      null :
      new File(check_yvpt_a0a0e0a0a6(runParameters))
    )).setDebuggerSettings_String(myDebuggerSettings_String).createProcess(nodePointer);
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

  private static String getClassName(final SNodePointer node) {
    final Wrappers._T<String> className = new Wrappers._T<String>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        className.value = TraceInfoUtil.getUnitName(node.getNode());
      }
    });
    return className.value;
  }

  private static int getMaxCommandLine() {
    // the command line limit on win is 32767 characters 
    // (see http://blogs.msdn.com/b/oldnewthing/archive/2003/12/10/56028.aspx) 
    // we set the limit to 16384 (half as many) just in case 
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
    final ClasspathStringCollector visitor = new ClasspathStringCollector();
    module.getClassPathItem().accept(visitor);
    if (withDependencies) {
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          AbstractModule.getDependenciesClasspath(CollectionUtil.set(module), false).accept(visitor);
        }
      });
    }

    Set<String> visited = visitor.getClasspath();
    visited.removeAll(CommonPaths.getJDKPath());
    return ListSequence.fromListWithValues(new ArrayList<String>(), visited);
  }

  private static List<String> getClassRunnerClassPath() {
    final Wrappers._T<IModule> module = new Wrappers._T<IModule>();
    ModelAccess.instance().runReadAction(new Runnable() {
      public void run() {
        module.value = MPSModuleRepository.getInstance().getModuleById(ModuleId.fromString("5b247b59-8fd0-4475-a767-9e9ff6a9d01c"));
      }
    });

    return Java_Command.getClasspath(module.value, false);
  }

  public static File getJavaCommand(@Nullable String javaHome) throws ExecutionException {
    if (StringUtils.isEmpty(javaHome) || !(new File(javaHome).exists())) {
      javaHome = Java_Command.getJdkHome();
    }
    if (StringUtils.isEmpty(javaHome)) {
      throw new ExecutionException("Could not find valid java home.");
    }
    return new File(Java_Command.getJavaCommandPath(javaHome));
  }

  public static String getJavaCommandPath(String javaHome) {
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
      if (new File(Java_Command.getJavaCommandPath(javaHome)).exists()) {
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

  private static File writeToTmpFile(Iterable<String> text) throws FileNotFoundException {
    File tmpFile = FileUtil.createTmpFile();
    tmpFile.deleteOnExit();
    PrintWriter writer = new PrintWriter(tmpFile);
    for (String line : Sequence.fromIterable(text)) {
      writer.println(line);
    }
    writer.flush();
    writer.close();
    return tmpFile;
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

  private static int check_yvpt_a0c0a2(CommandPart checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getLength();
    }
    return 0;
  }

  private static String check_yvpt_a0a0a0g(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.getAlternativeJre();
    }
    return null;
  }

  private static String check_yvpt_a2a0a0g(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.programParameters();
    }
    return null;
  }

  private static String check_yvpt_a3a0a0g(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.vmOptions();
    }
    return null;
  }

  private static String check_yvpt_a0a0e0a0a6(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.workingDirectory();
    }
    return null;
  }

  private static String check_yvpt_a0a4a0a0g(JavaRunParameters checkedDotOperand) {
    if (null != checkedDotOperand) {
      return checkedDotOperand.workingDirectory();
    }
    return null;
  }
}
