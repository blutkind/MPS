package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_Node_GetAncestorOperation_InferenceRule implements InferenceRule_Runtime {

  public typeOf_Node_GetAncestorOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    RulesUtil.checkAppliedCorrectly_generic(op);
    RulesUtil.checkOpParameters_generic(op);
    final SNode ConceptFromOpParm_typevar_1207354629107 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    RulesUtil.equate_conceptFromOpParm(op, TypeChecker.getInstance().getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207354629107));
    {
      SNode _nodeToCheck_1029348928467 = op;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(op, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207354639036", true), new QuotationClass_86().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(ConceptFromOpParm_typevar_1207354629107)), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1207354639034", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAncestorOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
