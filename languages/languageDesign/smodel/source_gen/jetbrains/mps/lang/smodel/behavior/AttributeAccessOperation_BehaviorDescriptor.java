package jetbrains.mps.lang.smodel.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.IOperation_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class AttributeAccessOperation_BehaviorDescriptor extends SNodeOperation_BehaviorDescriptor implements IOperation_BehaviorDescriptor, ILinkAccess_BehaviorDescriptor {
  public AttributeAccessOperation_BehaviorDescriptor() {
  }

  public boolean virtual_isSingularCardinality_4024382256428848847(SNode thisNode) {
    return AttributeAccessOperation_Behavior.virtual_isSingularCardinality_4024382256428848847(thisNode);
  }

  public SNode virtual_getTargetConcept_4024382256428848859(SNode thisNode) {
    return AttributeAccessOperation_Behavior.virtual_getTargetConcept_4024382256428848859(thisNode);
  }

  public boolean virtual_isAggregation_4024382256428848854(SNode thisNode) {
    return AttributeAccessOperation_Behavior.virtual_isAggregation_4024382256428848854(thisNode);
  }

  public boolean virtual_isLValue_1213877410080(SNode thisNode) {
    return AttributeAccessOperation_Behavior.virtual_isLValue_1213877410080(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.lang.smodel.structure.AttributeAccessOperation";
  }
}
