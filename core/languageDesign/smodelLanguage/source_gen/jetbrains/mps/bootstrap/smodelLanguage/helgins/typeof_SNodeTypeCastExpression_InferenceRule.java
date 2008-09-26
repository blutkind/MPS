package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SNodeTypeCastExpression_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SNodeTypeCastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr, final TypeCheckingContext typeCheckingContext) {
    final SNode LeftType_typevar_1186061665928 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    {
      SNode _nodeToCheck_1029348928467 = expr;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186061665928), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(expr, "leftExpression", true), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1186061683045", true), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1186061673586", intentionProvider);
    }
    {
      final SNode _representatorVar0 = TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186061665928);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar0, new Runnable() {

        public void run() {
          if (TypeChecker.getInstance().getSubtypingManager().isSubtype(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186061665928), new QuotationClass_1().createNode(), false, false)) {
            {
              SNode _nodeToCheck_1029348928467 = expr;
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712082190", true), new QuotationClass_0().createNode(SLinkOperations.getTarget(expr, "concept", false)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712082188", intentionProvider);
            }
          } else
          {
            {
              SNode _nodeToCheck_1029348928467 = expr;
              BaseIntentionProvider intentionProvider = null;
              TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712085350", true), new QuotationClass_2().createNode(SLinkOperations.getTarget(expr, "concept", false)), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1203712085348", intentionProvider);
            }
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1186061660362");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeTypeCastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
