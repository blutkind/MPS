package jetbrains.mps.bootstrap.smodelLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_PropertyRefQualifier_InferenceRule implements InferenceRule_Runtime {

  public typeof_PropertyRefQualifier_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    SNode op = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeOperation", false, false);
    SNode propAAQ = SNodeOperations.getAncestor(nodeToCheck, "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyAttributeAccessQualifier", false, false);
    if (op == null || propAAQ == null) {
      {
        BaseIntentionProvider intentionProvider = null;
        TypeChecker.getInstance().reportTypeError(nodeToCheck, "not expected here", "jetbrains.mps.bootstrap.smodelLanguage.helgins@3_0", "1219267263966", intentionProvider);
      }
      return;
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.smodelLanguage.structure.PropertyRefQualifier";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
