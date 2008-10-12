package jetbrains.mps.baseLanguage.regexp.helgins;

/*Generated by MPS */

import jetbrains.mps.lang.typesystem.runtime.AbstractInferenceRule_Runtime;
import jetbrains.mps.lang.typesystem.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_SplitOperation_InferenceRule extends AbstractInferenceRule_Runtime implements InferenceRule_Runtime {

  public typeof_SplitOperation_InferenceRule() {
  }

  public void applyRule(final SNode so, final TypeCheckingContext typeCheckingContext) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_8().createNode(), so, "r:00000000-0000-4000-0000-011c89590517(jetbrains.mps.baseLanguage.regexp.helgins)", "1222260051562");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.regexp.structure.SplitOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
