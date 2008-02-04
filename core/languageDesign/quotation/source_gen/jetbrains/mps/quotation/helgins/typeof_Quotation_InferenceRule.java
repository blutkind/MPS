package jetbrains.mps.quotation.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Quotation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Quotation_InferenceRule() {
  }

  public void applyRule(final SNode quotation) {
    SNode quotationNode = quotation;
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(quotationNode, "jetbrains.mps.quotation.helgins", "1196858483112", true), new QuotationClass_().createNode(SNodeOperations.getConceptDeclaration(SLinkOperations.getTarget(quotationNode, "quotedNode", true))), quotationNode, null, "jetbrains.mps.quotation.helgins", "1196858483110");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.quotation.structure.Quotation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
