package jetbrains.mps.run.commands.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.baseLanguage.classifiers.behavior.IClassifier_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class CommandType_Behavior {
  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getMembers_1213877402148(SNode thisNode, SNode contextNode) {
    return IClassifier_Behavior.call_getMembers_1213877528020(SLinkOperations.getTarget(thisNode, "classifier", false), contextNode);
  }
}
