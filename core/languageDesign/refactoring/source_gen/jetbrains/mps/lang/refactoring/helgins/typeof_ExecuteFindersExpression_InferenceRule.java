package jetbrains.mps.lang.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ExecuteFindersExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_ExecuteFindersExpression_InferenceRule() {
  }

  public void applyRule(final SNode expression, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(expression, "searchNode", true), "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243105532", true), new QuotationClass_16().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243105530", true, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createLessThanInequationStrong(typeCheckingContext.typeOf(SLinkOperations.getTarget(expression, "searchScope", true), "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243079709", true), new QuotationClass_15().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243088247", true, 0, intentionProvider);
    }
    {
      SNode _nodeToCheck_1029348928467 = expression;
      BaseIntentionProvider intentionProvider = null;
      typeCheckingContext.createEquation(typeCheckingContext.typeOf(expression, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243132573", true), new QuotationClass_17().createNode(), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590316(jetbrains.mps.lang.refactoring.helgins)", "1212243139732", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.lang.refactoring.structure.ExecuteFindersExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
