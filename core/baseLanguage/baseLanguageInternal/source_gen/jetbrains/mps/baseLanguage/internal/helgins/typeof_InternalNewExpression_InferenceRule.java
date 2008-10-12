package jetbrains.mps.baseLanguage.internal.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_InternalNewExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_InternalNewExpression_InferenceRule() {
  }

  public void applyRule(final SNode internalNewExpression, final TypeCheckingContext typeCheckingContext) {
    SNode type;
    if ((SLinkOperations.getTarget(internalNewExpression, "type", true) != null)) {
      type = SLinkOperations.getTarget(internalNewExpression, "type", true);
    } else
    {
      type = new QuotationClass_0().createNode();
    }
    {
      SNode _nodeToCheck_1029348928467 = internalNewExpression;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(internalNewExpression, "r:00000000-0000-4000-0000-011c895903ab(jetbrains.mps.baseLanguage.internal.helgins)", "1196525371898", true), type, _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895903ab(jetbrains.mps.baseLanguage.internal.helgins)", "1196525371896", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.internal.structure.InternalNewExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
