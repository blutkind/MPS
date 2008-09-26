package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_InsertNewPrevSiblingOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_Node_InsertNewPrevSiblingOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712014834", true), new QuotationClass_12().createNode(SLinkOperations.getTarget(op, "concept", false)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712014832", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
