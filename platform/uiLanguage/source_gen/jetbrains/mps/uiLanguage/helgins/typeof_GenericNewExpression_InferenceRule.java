package jetbrains.mps.uiLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_GenericNewExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_GenericNewExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression) {
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expression, "jetbrains.mps.uiLanguage.helgins", "1207754534577", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SNodeOperations.getAncestor(SLinkOperations.getTarget(SLinkOperations.getTarget(expression, "creator", true), "constructor", false), "jetbrains.mps.uiLanguage.structure.BeanDeclaration", false, false), "jetbrains.mps.uiLanguage.helgins", "1207754534568", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.uiLanguage.helgins", "1207754534566", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.GenericNewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
