package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_equalsExpression_InferenceRule implements InferenceRule_Runtime {

  public typeOf_equalsExpression_InferenceRule() {
  }

  public void applyRule(final SNode equalsExpr) {
    {
      SNode _nodeToCheck_1029348928467 = equalsExpr;
      TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(equalsExpr, "leftExpression", true), "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401605", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(equalsExpr, "rightExpression", true), "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401609", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins@5_0", "1215617401603");
    }
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_12().createNode(), equalsExpr, "jetbrains.mps.baseLanguage.helgins", "1175606176810");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.EqualsExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
