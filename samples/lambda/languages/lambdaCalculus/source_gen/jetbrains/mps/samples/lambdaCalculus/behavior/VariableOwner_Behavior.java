package jetbrains.mps.samples.lambdaCalculus.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.List;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class VariableOwner_Behavior {
  private static Class[] PARAMETERS_8981808925914841576 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static List<SNode> call_getVariables_8981808925914841576(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (List<SNode>) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"), "virtual_getVariables_8981808925914841576", PARAMETERS_8981808925914841576);
  }

  public static List<SNode> callSuper_getVariables_8981808925914841576(SNode thisNode, String callerConceptFqName) {
    return (List<SNode>) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.samples.lambdaCalculus.structure.VariableOwner"), callerConceptFqName, "virtual_getVariables_8981808925914841576", PARAMETERS_8981808925914841576);
  }
}
