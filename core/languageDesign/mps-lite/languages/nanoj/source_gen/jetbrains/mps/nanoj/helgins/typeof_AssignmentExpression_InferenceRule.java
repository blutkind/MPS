package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_AssignmentExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_AssignmentExpression_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "rightPart", true), "jetbrains.mps.nanoj.helgins", "1197638406762", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(nodeToCheck, "leftPart", true), "jetbrains.mps.nanoj.helgins", "1197638406767", true), SLinkOperations.getTarget(nodeToCheck, "rightPart", true), null, "jetbrains.mps.nanoj.helgins", "1197638406760", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.AssignmentExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
