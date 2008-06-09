package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_ArrayAccess_InferenceRule implements InferenceRule_Runtime {

  public typeOf_ArrayAccess_InferenceRule() {
  }

  public void applyRule(final SNode arrayAccess) {
    final SNode T_typevar_1175601836165 = TypeChecker.getInstance().getRuntimeSupport().createNewRuntimeTypesVariable();
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(arrayAccess, "array", true), "jetbrains.mps.baseLanguage.helgins", "1175601850481", true), new QuotationClass_9().createNode(TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1175601836165)), SLinkOperations.getTarget(arrayAccess, "array", true), null, "jetbrains.mps.baseLanguage.helgins", "1175601848462", false, 0);
    TypeChecker.getInstance().getRuntimeSupport().givetype(TypeChecker.getInstance().getEquationManager().getRepresentator(T_typevar_1175601836165), arrayAccess, "jetbrains.mps.baseLanguage.helgins", "1175601928121");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(arrayAccess, "index", true), "jetbrains.mps.baseLanguage.helgins", "1175603547412", true), new QuotationClass_10().createNode(), SLinkOperations.getTarget(arrayAccess, "index", true), null, "jetbrains.mps.baseLanguage.helgins", "1175603546475", false, 0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ArrayAccessExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
