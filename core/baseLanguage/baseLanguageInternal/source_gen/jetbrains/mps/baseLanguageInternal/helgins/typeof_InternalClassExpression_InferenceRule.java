package jetbrains.mps.baseLanguageInternal.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InternalClassExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_InternalClassExpression_InferenceRule() {
  }

  public void applyRule(final SNode e) {
    {
      SNode _nodeToCheck_1029348928467 = e;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(e, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371915", true), new QuotationClass_1().createNode(SLinkOperations.getTarget(e, "type", true)), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguageInternal.helgins", "1196525371913", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguageInternal.structure.InternalClassExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
