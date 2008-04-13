package jetbrains.mps.uiLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_RaiseOperation_InferenceRule implements InferenceRule_Runtime {

  public typeof_RaiseOperation_InferenceRule() {
  }

  public void applyRule(final SNode operation) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequationStrong(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(operation, "argument", true), "jetbrains.mps.uiLanguage.helgins", "1208111607404", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(operation, "eventOperation", true), "member", false), "parameter", true), "jetbrains.mps.uiLanguage.helgins", "1208111636744", true), SLinkOperations.getTarget(operation, "argument", true), null, "jetbrains.mps.uiLanguage.helgins", "1208111631129", false);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.uiLanguage.structure.RaiseOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
