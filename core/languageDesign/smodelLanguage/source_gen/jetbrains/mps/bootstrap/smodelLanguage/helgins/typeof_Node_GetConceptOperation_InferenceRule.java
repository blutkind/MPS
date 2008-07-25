package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.patterns.IMatchingPattern;
import jetbrains.mps.bootstrap.helgins.runtime.HUtil;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Node_GetConceptOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_Node_GetConceptOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    RulesUtil.checkOpParameters_generic(op);
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625778386", true), new QuotationClass_97().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625806639", false, 0, intentionProvider);
    }
    SNode operand = SLinkOperations.getTarget(SNodeOperations.getParent(op, null, false, false), "operand", true);
    {
      final SNode operandType = TypeChecker.getInstance().getRuntimeSupport().typeOf(operand, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625639214", false);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(operandType, new Runnable() {

        public void run() {
          {
            IMatchingPattern pattern_3 = HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType");
            SNode coercedNode_3 = TypeChecker.getInstance().getRuntimeSupport().coerce(TypeChecker.getInstance().getEquationManager().getRepresentator(operandType), pattern_3);
            if (coercedNode_3 != null) {
              if (SLinkOperations.getTarget(coercedNode_3, "concept", false) != null) {
                {
                  SNode _nodeToCheck_1029348928467 = null;
                  BaseIntentionProvider intentionProvider = null;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625860175", true), new QuotationClass_98().createNode(SLinkOperations.getTarget(coercedNode_3, "concept", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625868819", intentionProvider);
                }
              }
            }
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1210625578392");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetConceptOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
