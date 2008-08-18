package jetbrains.mps.quickQueryLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_Query_node_Parameter_InferenceRule implements InferenceRule_Runtime {

  public typeof_Query_node_Parameter_InferenceRule() {
  }

  public void applyRule(final SNode parameter) {
    SNode functionParameter = SLinkOperations.getTarget(SNodeOperations.getAncestor(parameter, "jetbrains.mps.quickQueryLanguage.structure.ModelQuery", false, false), "conceptDeclaration", false);
    {
      SNode _nodeToCheck_1029348928467 = parameter;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(parameter, "jetbrains.mps.quickQueryLanguage.helgins", "1218797220572", true), new QuotationClass_0().createNode(functionParameter), _nodeToCheck_1029348928467, null, "jetbrains.mps.quickQueryLanguage.helgins", "1218797226779", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.quickQueryLanguage.structure.Query_node_Parameter";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
