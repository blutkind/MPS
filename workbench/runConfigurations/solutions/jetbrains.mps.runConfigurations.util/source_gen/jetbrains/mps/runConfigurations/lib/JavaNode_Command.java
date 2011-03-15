package jetbrains.mps.runConfigurations.lib;

/*Generated by MPS */

import java.io.File;
import com.intellij.execution.process.ProcessHandler;
import jetbrains.mps.smodel.SNode;
import com.intellij.execution.ExecutionException;
import jetbrains.mps.generator.traceInfo.TraceInfoUtil;

public class JavaNode_Command {
  private File myWorkingDirectory = new File(System.getProperty("user.home"));
  private String myJrePath = Java_Command.getJdkHome();
  private String myProgramParameter;
  private String myVirtualMachineParameter;

  public JavaNode_Command() {
  }

  public JavaNode_Command setWorkingDirectory(File workingDirectory) {
    myWorkingDirectory = workingDirectory;
    return this;
  }

  public JavaNode_Command setJrePath(String jrePath) {
    myJrePath = jrePath;
    return this;
  }

  public JavaNode_Command setProgramParameter(String programParameter) {
    myProgramParameter = programParameter;
    return this;
  }

  public JavaNode_Command setVirtualMachineParameter(String virtualMachineParameter) {
    myVirtualMachineParameter = virtualMachineParameter;
    return this;
  }

  public ProcessHandler createProcess(SNode node) throws ExecutionException {
    return new Java_Command().setJrePath(myJrePath).setWorkingDirectory(myWorkingDirectory).setProgramParameter(myProgramParameter).setVirtualMachineParameter(myVirtualMachineParameter).setClassPath(Java_Command.getClasspath(node)).setClassName(TraceInfoUtil.getGeneratedFileName(node)).createProcess();
  }
}
