package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_AssertStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_AssertStatement_InferenceRule() {
  }

  public void applyRule(final SNode assertStatement) {
    TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(assertStatement, "condition", true), "jetbrains.mps.baseLanguage.helgins", "1176899056092", true), new QuotationClass_31().createNode(), SLinkOperations.getTarget(assertStatement, "condition", true), null, "jetbrains.mps.baseLanguage.helgins", "1176899078020", false, 0);
    if ((SLinkOperations.getTarget(assertStatement, "message", true) != null)) {
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(assertStatement, "message", true), "jetbrains.mps.baseLanguage.helgins", "1176899107820", true), new QuotationClass_32().createNode(), SLinkOperations.getTarget(assertStatement, "message", true), null, "jetbrains.mps.baseLanguage.helgins", "1176899115123", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.AssertStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
