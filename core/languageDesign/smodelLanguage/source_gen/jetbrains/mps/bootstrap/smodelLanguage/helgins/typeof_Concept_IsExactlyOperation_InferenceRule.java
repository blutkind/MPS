package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Concept_IsExactlyOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_Concept_IsExactlyOperation_InferenceRule() {
  }

  public void applyRule(final SNode op) {
    SNode conceptArg = SLinkOperations.getTarget(op, "conceptArgument", true);
    if (SNodeOperations.isInstanceOf(conceptArg, "jetbrains.mps.bootstrap.smodelLanguage.structure.PoundExpression")) {
      // concept expected
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(conceptArg, "expression", true), "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206735630133", false), new QuotationClass_93().createNode(), SLinkOperations.getTarget(conceptArg, "expression", true), null, "jetbrains.mps.bootstrap.smodelLanguage.helgins", "1206735630131", false);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.Concept_IsExactlyOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
