package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ExpressionFunctionParam_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ExpressionFunctionParam_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_9().createNode(), argument, "jetbrains.mps.ypath.helgins", "1192620803140");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.ExpressionFunctionParam";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
