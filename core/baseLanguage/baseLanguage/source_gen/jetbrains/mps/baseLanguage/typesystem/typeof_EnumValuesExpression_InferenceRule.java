package jetbrains.mps.baseLanguage.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_EnumValuesExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_EnumValuesExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(expression, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1224574958606", true), (SNode)new _Quotations.QuotationClass_90().createNode(SLinkOperations.getTarget(expression, "enumClass", false), typeCheckingContext), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902c5(jetbrains.mps.baseLanguage.typesystem)", "1224574964063", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.EnumValuesExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
