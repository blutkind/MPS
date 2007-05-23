package jetbrains.mps.baseLanguage.ext.collections.lang.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.RulesFunctions_Collections;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.baseLanguage.ext.collections.lang.helgins.QuotationClass_19;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_GetSizeOperation_InferenceRule implements InferenceRule_Runtime {

  public  typeof_GetSizeOperation_InferenceRule() {
  }

  public void applyRule(SNode argument) {
    RulesFunctions_Collections.get_inputSequenceType(argument);
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_19().createNode(), argument);
  }
  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetSizeOperation";
  }
  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }
  public boolean overrides() {
    return false;
  }
}
