package jetbrains.mps.baseLanguage.collections.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ReverseOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ReverseOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    final SNode elementType_typevar_1184856571984 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    SNode input = RulesFunctions_Collections.getInput(typeCheckingContext, op);
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856579804", true), new QuotationClass_32().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856571984)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856612680", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856630356", true), new QuotationClass_33().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856571984)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856636291", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.ReverseOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
