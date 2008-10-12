package jetbrains.mps.baseLanguage.collections.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GetIndexOfOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_GetIndexOfOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    SNode input = RulesFunctions_Collections.getInput(typeCheckingContext, op);
    final SNode elementType_typevar_1184856779488 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(input, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856761975", true), new QuotationClass_27().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856779488)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856768419", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequation(typeCheckingContext.typeOf(SLinkOperations.getTarget(op, "argument", true), "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856800100", true), TypeChecker.getInstance().getEquationManager().getRepresentator(elementType_typevar_1184856779488), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856809408", false, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(op, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856710777", true), new QuotationClass_28().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c8959032b(jetbrains.mps.baseLanguage.collections.helgins)", "1184856713865", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
