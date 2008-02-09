package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ValueParameter_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ValueParameter_InferenceRule() {
  }

  public void applyRule(final SNode valueParameter) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(valueParameter, "jetbrains.mps.baseLanguage.helgins", "1202594390188", true), TypeChecker.getInstance().getRuntimeSupport().typeOf(SNodeOperations.getAncestor(valueParameter, "jetbrains.mps.baseLanguage.structure.Property", false, false), "jetbrains.mps.baseLanguage.helgins", "1202594397696", true), valueParameter, null, "jetbrains.mps.baseLanguage.helgins", "1202594395129");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.ValueParameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
