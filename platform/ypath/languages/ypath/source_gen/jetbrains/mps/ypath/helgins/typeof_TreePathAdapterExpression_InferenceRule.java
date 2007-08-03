package jetbrains.mps.ypath.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_TreePathAdapterExpression_InferenceRule implements InferenceRule_Runtime {

  public  typeof_TreePathAdapterExpression_InferenceRule() {
  }

  public void applyRule(final SNode argument) {
    TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_().createNode(TypeChecker.getInstance().getRuntimeSupport().typeOf(SLinkOperations.getTarget(argument, "expression", true))), argument, "jetbrains.mps.ypath.helgins", "1185018447615");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.ypath.structure.TreePathAdapterExpression";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
