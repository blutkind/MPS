package jetbrains.mps.runConfigurations.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ComplexRunConfigurationExecutor_Behavior {
  public static void init(SNode thisNode) {
    SPropertyOperations.set(thisNode, "configurationName", "myRunConfiguration");
  }

  public static boolean call_isDebuggable_442015021861764808(SNode thisNode) {
    return (SLinkOperations.getTarget(thisNode, "debugger", true) != null);
  }
}
