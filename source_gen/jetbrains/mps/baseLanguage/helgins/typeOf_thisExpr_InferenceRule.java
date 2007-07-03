package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_thisExpr_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_thisExpr_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    if((SLinkOperations.getTarget(argument, "classConcept", false) != null)) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_17().createNode(SLinkOperations.getTarget(argument, "classConcept", false)), argument);
    } else
    {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_18().createNode(SNodeOperations.getAncestor(argument, "jetbrains.mps.baseLanguage.structure.ClassConcept", false, false)), argument);
    }
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ThisExpression";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
