package jetbrains.mps.lang.quotation.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.LinkAttribute_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class ReferenceAntiquotation_BehaviorDescriptor extends LinkAttribute_BehaviorDescriptor implements AbstractAntiquotation_BehaviorDescriptor {
  public ReferenceAntiquotation_BehaviorDescriptor() {
  }

  public int virtual_getMetaLevelChange_201537367881074474(SNode thisNode) {
    return AbstractAntiquotation_Behavior.virtual_getMetaLevelChange_201537367881074474(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation";
  }
}
