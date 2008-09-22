package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_TypeofExpression_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_TypeofExpression_NonTypesystemRule() {
  }

  public void applyRule(final SNode typeOfExpression) {
    if (!(RulesUtil.withinInferenceItem(typeOfExpression))) {
      TypeChecker.getInstance().reportTypeError(typeOfExpression, "TYPEOF should be used only within inference rules", "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1195217231011");
    }
    if (!(!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(typeOfExpression, "term", true), "jetbrains.mps.bootstrap.helgins.structure.TypeVarReference")))) {
      TypeChecker.getInstance().reportTypeError(typeOfExpression, "type of a type has little sense", "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1204815653385");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
