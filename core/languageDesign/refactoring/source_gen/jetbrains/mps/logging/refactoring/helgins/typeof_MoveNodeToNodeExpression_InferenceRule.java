package jetbrains.mps.logging.refactoring.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_MoveNodeToNodeExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_MoveNodeToNodeExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "destination", true), "jetbrains.mps.logging.refactoring.helgins", "1199620700412", true), new QuotationClass_7().createNode(), SLinkOperations.getTarget(nodeToCheck, "destination", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199620700407");
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "roleInTarget", true), "jetbrains.mps.logging.refactoring.helgins", "1199620700421", true), new QuotationClass_8().createNode(), SLinkOperations.getTarget(nodeToCheck, "roleInTarget", true), null, "jetbrains.mps.logging.refactoring.helgins", "1199620700416");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.logging.refactoring.structure.MoveNodeToNodeExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
