package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_LinkList_AddNewChildOperation_InferenceRule implements InferenceRule_Runtime {

  public typeOf_LinkList_AddNewChildOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedTo_LinkListAccess_aggregation(op);
    final SNode Concept_typevar_1206099501305 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_inputNodeConcept(op, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099501305));
    {
      final SNode concreteConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1206099501305);
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
              TypeChecker.getInstance().reportTypeError(op, SPropertyOperations.getString(parameterConcept, "name") + " is not sub-concept of " + SPropertyOperations.getString(TypeChecker.getInstance().getEquationManager().getRepresentator(concreteConcept), "name"), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205771608879");
            }
          }
          {
            SNode _nodeToCheck_1029348928467 = null;
            BaseIntentionProvider intentionProvider = null;
            TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205771608897", true), new QuotationClass_69().createNode(resultConcept), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205771608895", intentionProvider);
          }
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205771551269");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
