package jetbrains.mps.regexp.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class MatchVariableReference_InferenceRule implements InferenceRule_Runtime {

  public  MatchVariableReference_InferenceRule() {
  }

  public void applyRule(final SNode mvr) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_().createNode(), mvr, "jetbrains.mps.regexp.helgins", "1178179183609");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.regexp.structure.MatchVariableReference";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
