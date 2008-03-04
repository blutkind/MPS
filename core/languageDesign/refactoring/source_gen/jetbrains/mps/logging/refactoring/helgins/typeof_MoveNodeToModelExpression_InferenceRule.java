package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MoveNodeToModelExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_MoveNodeToModelExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "destination", true), "jetbrains.mps.logging.refactoring.helgins", "1199620552363", true), new QuotationClass_6().createNode(), SLinkOperations.getTarget(nodeToCheck, "destination", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199620552358");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.MoveNodeToModelExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
