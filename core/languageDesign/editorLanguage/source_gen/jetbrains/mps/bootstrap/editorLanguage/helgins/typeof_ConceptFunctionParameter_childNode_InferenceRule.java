package jetbrains.mps.bootstrap.editorLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_ConceptFunctionParameter_childNode_InferenceRule implements InferenceRule_Runtime {

  public typeof_ConceptFunctionParameter_childNode_InferenceRule() {
  }

  public void applyRule(final SNode node) {
    SNode refNodeList = SNodeOperations.getAncestor(node, "jetbrains.mps.bootstrap.editorLanguage.structure.CellModel_RefNodeList", false, false);
    if (SLinkOperations.getTarget(refNodeList, "relationDeclaration", false) != null) {
      TypeChecker.getInstance().getRuntimeSupport().givetype(new QuotationClass_6().createNode(SLinkOperations.getTarget(SLinkOperations.getTarget(refNodeList, "relationDeclaration", false), "target", false)), node, "jetbrains.mps.bootstrap.editorLanguage.helgins", "1182235608638");
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.editorLanguage.structure.ConceptFunctionParameter_childNode";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
