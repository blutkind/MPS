package jetbrains.mps.nanoj.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_EqualsExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_EqualsExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().createComparableEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "left", true), "jetbrains.mps.nanoj.helgins", "1197301384830", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "right", true), "jetbrains.mps.nanoj.helgins", "1197301384835", true), SLinkOperations.getTarget(argument, "left", true), null, "jetbrains.mps.nanoj.helgins", "1197301384828");
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(argument, "jetbrains.mps.nanoj.helgins", "1197301384840", true), SConceptOperations.createNewNode("jetbrains.mps.nanoj.structure.BooleanType", null), argument, null, "jetbrains.mps.nanoj.helgins", "1197301384839");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.nanoj.structure.EqualsExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return true;
  }

}
