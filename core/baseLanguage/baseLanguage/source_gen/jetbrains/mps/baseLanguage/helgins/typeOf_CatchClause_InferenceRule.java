package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_CatchClause_InferenceRule implements InferenceRule_Runtime {

  public typeOf_CatchClause_InferenceRule() {
  }

  public void applyRule(final SNode catchClause) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(catchClause, "throwable", true), "jetbrains.mps.baseLanguage.helgins", "1176896800008", true), new QuotationClass_21().createNode(), SLinkOperations.getTarget(catchClause, "throwable", true), null, "jetbrains.mps.baseLanguage.helgins", "1176896807264", false, 0);
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.CatchClause";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
