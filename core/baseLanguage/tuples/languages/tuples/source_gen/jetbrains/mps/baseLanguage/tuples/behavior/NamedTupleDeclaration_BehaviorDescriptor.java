package jetbrains.mps.baseLanguage.tuples.behavior;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.behavior.Classifier_BehaviorDescriptor;
import jetbrains.mps.smodel.SNode;

public class NamedTupleDeclaration_BehaviorDescriptor extends Classifier_BehaviorDescriptor {
  public NamedTupleDeclaration_BehaviorDescriptor() {
  }

  public String virtual_getPresentation_1213877396640(SNode thisNode) {
    return NamedTupleDeclaration_Behavior.virtual_getPresentation_1213877396640(thisNode);
  }

  public SNode virtual_getThisType_3305065273710880775(SNode thisNode) {
    return NamedTupleDeclaration_Behavior.virtual_getThisType_3305065273710880775(thisNode);
  }

  @Override
  public String getConceptFqName() {
    return "jetbrains.mps.baseLanguage.tuples.structure.NamedTupleDeclaration";
  }
}
