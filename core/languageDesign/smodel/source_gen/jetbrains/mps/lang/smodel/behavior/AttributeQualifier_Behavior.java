package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.behaviour.BehaviorManager;

public class AttributeQualifier_Behavior {
  private static Class[] PARAMETERS_6407023681583066586 = {SNode.class};

  public static void init(SNode thisNode) {
  }

  public static SNode call_getAttributeContainerType_6407023681583057388(SNode thisNode) {
    return AttributeAccess_Behavior.call_getAttributeContainerType_6960953357954139822(SNodeOperations.cast(SNodeOperations.getParent(thisNode), "jetbrains.mps.lang.smodel.structure.AttributeAccess"));
  }

  public static SNode virtual_getTargetConcept_6407023681583066586(SNode thisNode) {
    return SNodeOperations.getNode("r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)", "5169995583184591161");
  }

  public static SNode call_getTargetConcept_6407023681583066586(SNode thisNode) {
    return (SNode) BehaviorManager.getInstance().invoke(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.AttributeQualifier"), "virtual_getTargetConcept_6407023681583066586", PARAMETERS_6407023681583066586);
  }

  public static SNode callSuper_getTargetConcept_6407023681583066586(SNode thisNode, String callerConceptFqName) {
    return (SNode) BehaviorManager.getInstance().invokeSuper(Object.class, SNodeOperations.cast(thisNode, "jetbrains.mps.lang.smodel.structure.AttributeQualifier"), callerConceptFqName, "virtual_getTargetConcept_6407023681583066586", PARAMETERS_6407023681583066586);
  }
}
