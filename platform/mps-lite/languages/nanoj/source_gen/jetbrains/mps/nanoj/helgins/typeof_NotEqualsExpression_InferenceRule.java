package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_NotEqualsExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_NotEqualsExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "left", true), "jetbrains.mps.nanoj.helgins", "1197469347339", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "right", true), "jetbrains.mps.nanoj.helgins", "1197469347344", true), SLinkOperations.getTarget(argument, "left", true), null, "jetbrains.mps.nanoj.helgins", "1197469347337");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197469347349", true), SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.BooleanType", null), argument, null, "jetbrains.mps.nanoj.helgins", "1197469347348");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.NotEqualsExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
