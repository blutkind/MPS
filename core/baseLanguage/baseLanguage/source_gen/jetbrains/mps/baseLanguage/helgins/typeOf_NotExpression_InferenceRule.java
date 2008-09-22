package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_NotExpression_InferenceRule implements InferenceRule_Runtime {

  public typeOf_NotExpression_InferenceRule() {
  }

  public void applyRule(final SNode notExpr) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_27().createNode(), notExpr, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1176900899744");
    {
      SNode _nodeToCheck_1029348928467 = notExpr;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(notExpr, "expression", true), "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1176900878654", true), new QuotationClass_28().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1176900889144", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.NotExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
