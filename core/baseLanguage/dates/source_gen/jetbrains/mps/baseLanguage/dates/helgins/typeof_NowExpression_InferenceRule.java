package jetbrains.mps.baseLanguage.dates.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NowExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_NowExpression_InferenceRule() {
  }

  public void applyRule(final SNode nowExpression, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = nowExpression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(nowExpression, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.helgins)", "1204416432300", true), new QuotationClass_0().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903d1(jetbrains.mps.baseLanguage.dates.helgins)", "1204416432298", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.dates.structure.NowExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
