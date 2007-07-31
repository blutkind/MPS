package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ConceptReference_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_ConceptReference_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    SNode conceptReference = argument;
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_1().createNode(SLinkOperations.getTarget(conceptReference, "concept", false)), conceptReference, "jetbrains.mps.bootstrap.helgins.helgins", "1175521990751");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.ConceptReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
