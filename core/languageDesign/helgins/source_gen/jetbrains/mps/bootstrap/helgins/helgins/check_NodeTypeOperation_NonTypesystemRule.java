package jetbrains.mps.bootstrap.helgins.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.NonTypesystemRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class check_NodeTypeOperation_NonTypesystemRule implements NonTypesystemRule_Runtime {

  public check_NodeTypeOperation_NonTypesystemRule() {
  }

  public void applyRule(final SNode node_TypeOperation) {
    if (!(!(RulesUtil.withinInferenceItem(node_TypeOperation)))) {
      TypeChecker.getInstance().reportTypeError(node_TypeOperation, "don't use typeOperation within inference rules", "r:1222075024049(jetbrains.mps.bootstrap.helgins.helgins)", "1196099140505");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.helgins.structure.Node_TypeOperation";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
