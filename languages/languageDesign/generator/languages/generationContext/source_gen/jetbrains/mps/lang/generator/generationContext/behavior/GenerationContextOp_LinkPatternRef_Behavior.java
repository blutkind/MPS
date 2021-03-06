package jetbrains.mps.lang.generator.generationContext.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.structure.BehaviorDescriptor;
import jetbrains.mps.smodel.structure.ConceptRegistry;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class GenerationContextOp_LinkPatternRef_Behavior {
  private static Class[] PARAMETERS_1758784108620115401 = {SNode.class};
  private static Class[] PARAMETERS_1758784108620254540 = {SNode.class, SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode virtual_getTarget_1758784108620114792(SNode thisNode) {
    return SLinkOperations.getTarget(thisNode, "linkPatternVar", false);
  }

  public static void virtual_setTarget_1758784108620254533(SNode thisNode, SNode target) {
    SLinkOperations.setTarget(thisNode, "linkPatternVar", null, false);
  }

  public static SNode call_getTarget_1758784108620115401(SNode thisNode) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    return (SNode) descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_LinkPatternRef"), "virtual_getTarget_1758784108620114792", PARAMETERS_1758784108620115401);
  }

  public static void call_setTarget_1758784108620254540(SNode thisNode, SNode target) {
    BehaviorDescriptor descriptor = ConceptRegistry.getInstance().getBehaviorDescriptorForInstanceNode(thisNode);
    descriptor.invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_LinkPatternRef"), "virtual_setTarget_1758784108620254533", PARAMETERS_1758784108620254540, target);
  }

  public static SNode callSuper_getTarget_1758784108620115401(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_LinkPatternRef"), callerConceptFqName, "virtual_getTarget_1758784108620114792", PARAMETERS_1758784108620115401);
  }

  public static void callSuper_setTarget_1758784108620254540(SNode thisNode, String callerConceptFqName, SNode target) {
    BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_LinkPatternRef"), callerConceptFqName, "virtual_setTarget_1758784108620254533", PARAMETERS_1758784108620254540, target);
  }
}
