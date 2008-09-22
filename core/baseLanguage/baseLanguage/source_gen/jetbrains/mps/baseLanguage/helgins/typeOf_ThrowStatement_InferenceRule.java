package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ThrowStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ThrowStatement_InferenceRule() {
  }

  public void applyRule(final SNode throwStatement) {
    {
      SNode _nodeToCheck_1029348928467 = throwStatement;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(throwStatement, "throwable", true), "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1176896098411", true), new QuotationClass_16().createNode(), _nodeToCheck_1029348928467, null, "r:1222075024069(jetbrains.mps.baseLanguage.helgins)", "1176896118328", false, 0, intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ThrowStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
