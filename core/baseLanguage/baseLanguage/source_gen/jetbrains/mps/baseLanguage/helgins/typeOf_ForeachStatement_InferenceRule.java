package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ForeachStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ForeachStatement_InferenceRule() {
  }

  public void applyRule(final SNode foreachStatement) {
    final SNode T_typevar_1176561507041 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable(false);
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(foreachStatement, "iterable", true), "jetbrains.mps.baseLanguage.helgins", "1207147193776", true), new QuotationClass_81().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041), TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041)), SLinkOperations.getTarget(foreachStatement, "iterable", true), null, "jetbrains.mps.baseLanguage.helgins", "1207147198311", false, 0);
    TypeChecker.getInstance().getRuntimeSupport().createGreaterThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(foreachStatement, "variable", true), "jetbrains.mps.baseLanguage.helgins", "1183457358397", true), TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1176561507041), SLinkOperations.getTarget(foreachStatement, "variable", true), null, "jetbrains.mps.baseLanguage.helgins", "1183457358399", false, 0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ForeachStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
