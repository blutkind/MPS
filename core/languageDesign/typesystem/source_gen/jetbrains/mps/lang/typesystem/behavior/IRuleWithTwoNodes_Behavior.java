package jetbrains.mps.lang.typesystem.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class IRuleWithTwoNodes_Behavior {
  private static Class[] PARAMETERS_4484478261143583672 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getSecondNodeCondition_4484478261143583672(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.IRuleWithTwoNodes"), "virtual_getSecondNodeCondition_4484478261143583672", PARAMETERS_4484478261143583672);
  }

  public static SNode callSuper_getSecondNodeCondition_4484478261143583672(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.typesystem.structure.IRuleWithTwoNodes"), callerConceptFqName, "virtual_getSecondNodeCondition_4484478261143583672", PARAMETERS_4484478261143583672);
  }
}
