package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SemanticDowncastExpression_InferenceRule implements InferenceRule_Runtime {

  public typeof_SemanticDowncastExpression_InferenceRule() {
  }

  public void applyRule(final SNode expr) {
    if ((SLinkOperations.getTarget(expr, "leftExpression", true) != null)) {
      final SNode LeftType_typevar_1186060911559 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
      {
        SNode _nodeToCheck_1029348928467 = expr;
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(expr, "leftExpression", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060928458", true), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186060923030", intentionProvider);
      }
      {
        final SNode _representatorVar1 = TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559);
        TypeChecker.getInstance().getRuntimeSupport().whenConcrete(_representatorVar1, new Runnable() {

          public void run() {
            if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SModelType")) {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712100030", true), new QuotationClass_19().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712100028", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeType")) {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712107222", true), new QuotationClass_20().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712107220", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptType")) {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712110101", true), new QuotationClass_21().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1203712110099", intentionProvider);
              }
            } else
            if (SNodeOperations.isInstanceOf(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "jetbrains.mps.bootstrap.smodelLanguage.structure._LinkAccessT")) {
              if (SPropertyOperations.getBoolean(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "singularCradinality")) {
                {
                  SNode _nodeToCheck_1029348928467 = null;
                  BaseIntentionProvider intentionProvider = null;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059653548", true), new QuotationClass_73().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059653546", intentionProvider);
                }
              } else
              {
                {
                  SNode _nodeToCheck_1029348928467 = null;
                  BaseIntentionProvider intentionProvider = null;
                  TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206060275785", true), new QuotationClass_74().createNode(SLinkOperations.getTarget(TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), "targetConcept", false)), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206060275783", intentionProvider);
                }
              }
            } else
            {
              {
                SNode _nodeToCheck_1029348928467 = null;
                BaseIntentionProvider intentionProvider = null;
                TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(expr, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059626209", true), TypeChecker.getInstance().getEquationManager().getRepresentator(LeftType_typevar_1186060911559), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206059626207", intentionProvider);
              }
            }
          }

        }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186061035207");
      }
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.SemanticDowncastExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
