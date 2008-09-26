package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeCheckingContext;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Link_SetNewChildOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeOf_Link_SetNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op, final TypeCheckingContext typeCheckingContext) {
    RulesUtil.checkAppliedTo_LinkAccess_aggregation(op);
    final SNode Concept_typevar_1206099875685 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099875685));
    {
      final SNode concreteConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099875685);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(concreteConcept, new Runnable() {

        public void run() {
          SNode resultConcept;
          SNode parameterConcept = SLinkOperations.getTarget(op, "concept", false);
          if (parameterConcept == null) {
            resultConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept);
          } else
          {
            resultConcept = parameterConcept;
            if (!(SConceptOperations.isSubConceptOf(parameterConcept, NameUtil.nodeFQName(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept))))) {
              TypeChecker.getInstance().reportTypeError(op, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept), "name"), "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205442304609");
            }
          }
          {
            SNode _nodeToCheck_1029348928467 = op;
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205442304627", true), new QuotationClass_63().createNode(resultConcept), _nodeToCheck_1029348928467, null, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205442304625", intentionProvider);
          }
        }

      }, "r:00000000-0000-4000-0000-011c895902fe(jetbrains.mps.bootstrap.smodelLanguage.helgins)", "1205442246000");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
