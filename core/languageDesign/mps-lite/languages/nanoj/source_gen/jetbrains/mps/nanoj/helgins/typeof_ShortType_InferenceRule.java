package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ShortType_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ShortType_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.ShortType";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
