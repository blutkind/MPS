package jetbrains.mps.build.packaging.behavior;

/*Generated by MPS */

import jetbrains.mps.lang.core.behavior.BaseConcept_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class CompositeString_BehaviorDescriptor extends BaseConcept_BehaviorDescriptor implements IStringExpression_BehaviorDescriptor {
  public CompositeString_BehaviorDescriptor() {
  }

  public String virtual_getAntValue_8148924375507875982(SNode thisNode) {
    return IStringExpression_Behavior.virtual_getAntValue_8148924375507875982(thisNode);
  }

  public String virtual_getValue_1213877173054(SNode thisNode) {
    return CompositeString_Behavior.virtual_getValue_1213877173054(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.build.packaging.structure.CompositeString";
  }
}
