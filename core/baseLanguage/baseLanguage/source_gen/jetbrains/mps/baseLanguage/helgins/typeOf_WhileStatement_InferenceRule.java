package jetbrains.mps.baseLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeOf_WhileStatement_InferenceRule implements InferenceRule_Runtime {

  public typeOf_WhileStatement_InferenceRule() {
  }

  public void applyRule(final SNode whileStatement) {
    {
      SNode _nodeToCheck_1029348928467 = SLinkOperations.getTarget(whileStatement, "condition", true);
      TypeChecker.getInstance().getRuntimeSupport().createLessThanInequation(TypeChecker.getInstance().getRuntimeSupport().typeOf(_nodeToCheck_1029348928467, "jetbrains.mps.baseLanguage.helgins", "1176895814772", true), new QuotationClass_17().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.baseLanguage.helgins", "1176895826326", false, 0);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.baseLanguage.structure.WhileStatement";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
