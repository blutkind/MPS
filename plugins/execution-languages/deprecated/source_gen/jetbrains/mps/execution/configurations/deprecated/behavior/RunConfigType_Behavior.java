package jetbrains.mps.execution.configurations.deprecated.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class RunConfigType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getMembers_1213877402148(SNode thisNode, SNode contextNode) {
    return IClassifier_Behavior.call_getMembers_1213877528124(SLinkOperations.getTarget(thisNode, "runConfig", false));
  }

  public static SNode virtual_getClassExpression_1213877337357(SNode thisNode) {
    return null;
  }
}
