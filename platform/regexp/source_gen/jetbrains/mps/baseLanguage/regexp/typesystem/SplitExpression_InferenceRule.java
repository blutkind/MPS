package jetbrains.mps.baseLanguage.regexp.typesystem;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.typesystem.inference.EquationInfo;
import jetbrains.mps.smodel.SModelUtil_new;

public class SplitExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {
  public SplitExpression_InferenceRule() {
  }

  public void applyRule(final SNode se, final TypeCheckingContext typeCheckingContext) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(se, "expr", true);
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1178179183642", 0, intentionProvider);
      typeCheckingContext.createLessThanInequation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1178179183643", true), (SNode)new _Quotations.QuotationClass_4().createNode(typeCheckingContext), false, info);
    }
    {
      SNode _nodeToCheck_1029348928467 = se;
      BaseIntentionProvider intentionProvider = null;
      EquationInfo info = new EquationInfo(_nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1223981840551", 0, intentionProvider);
      typeCheckingContext.createEquation((SNode)typeCheckingContext.typeOf(_nodeToCheck_1029348928467, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.typesystem)", "1223981840556", true), (SNode)new _Quotations.QuotationClass_5().createNode(typeCheckingContext), info);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.regexp.structure.SplitExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }
}
