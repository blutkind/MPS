package jetbrains.mps.uiLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ComponentReferencePart_InferenceRule implements InferenceRule_Runtime {

  public  typeof_ComponentReferencePart_InferenceRule() {
  }

  public void applyRule(final SNode nodeToCheck) {
    TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(nodeToCheck, "jetbrains.mps.uiLanguage.helgins", "1202742681504", true), SLinkOperations.getTarget(SLinkOperations.getTarget(nodeToCheck, "component", false), "componentDeclaration", false), nodeToCheck, null, "jetbrains.mps.uiLanguage.helgins", "1202742685648");
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.uiLanguage.structure.ComponentReferencePart";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
