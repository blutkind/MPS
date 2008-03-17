package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Model_RootsIncludingImportedOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Model_RootsIncludingImportedOperation_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    RulesUtil.checkAppliedCorrectly_generic(node);
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711977834", true), new QuotationClass_49().createNode(SLinkOperations.getTarget(node, "concept", false)), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203711977832");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(node, "scope", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178287492197", true), new QuotationClass_50().createNode(), SLinkOperations.getTarget(node, "scope", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1178287492194");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_RootsIncludingImportedOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
