package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class typeof_UpdateModelProcedure_InferenceRule implements InferenceRule_Runtime {

  public typeof_UpdateModelProcedure_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "argument", true), "jetbrains.mps.logging.refactoring.helgins", "1198577549444", true), new QuotationClass_3().createNode(), SLinkOperations.getTarget(nodeToCheck, "argument", true), null, "jetbrains.mps.logging.refactoring.helgins", "1198577561806", false, 0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.UpdateModelProcedure";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
