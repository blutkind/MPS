package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Node_CopyOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeOf_Node_CopyOperation_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    RulesUtil.checkAppliedCorrectly_generic(node);
    final SNode Concept_typevar_1205967749950 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    RulesUtil.equate_inputNodeConcept(node, TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1205967749950));
    {
      final SNode C = TypeChecker.getInstance().getEquationManager().getRepresentator(Concept_typevar_1205967749950);
      TypeChecker.getInstance().getRuntimeSupport().whenConcrete(C, new Runnable() {

        public void run() {
          SNode inputNodeConcept = TypeChecker.getInstance().getEquationManager().getRepresentator(C);
          TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205967749966", true), new QuotationClass_78().createNode(inputNodeConcept), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205967749964");
        }

      }, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1205967749957");
    }
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(node, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057865109", true), new QuotationClass_47().createNode(), node, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1186057869956", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
