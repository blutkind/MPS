package jetbrains.mps.samples.lambdaCalculus.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class LetExpression_Behavior {
  private static Class[] PARAMETERS_8981808925914844606 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> virtual_getVariables_8981808925914841576(SNode thisNode) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(SLinkOperations.getTarget(thisNode, "variable", true));
    return result;
  }

  public static List<SNode> call_getVariables_8981808925914844606(SNode thisNode) {
    return (List<SNode>) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.samples.lambdaCalculus.structure.LetExpression"), "virtual_getVariables_8981808925914841576", PARAMETERS_8981808925914844606);
  }

  public static List<SNode> callSuper_getVariables_8981808925914844606(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.samples.lambdaCalculus.structure.LetExpression"), callerConceptFqName, "virtual_getVariables_8981808925914841576", PARAMETERS_8981808925914844606);
  }
}
