package jetbrains.mps.bootstrap.editorLanguage.helgins;

/*Generated by MPS */

import jetbrains.mps.bootstrap.helgins.runtime.InferenceRule_Runtime;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.intentions.BaseIntentionProvider;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.smodel.SModelUtil_new;

public class typeof_CellKeyMap_FunctionParm_selectedNodes_InferenceRule implements InferenceRule_Runtime {

  public typeof_CellKeyMap_FunctionParm_selectedNodes_InferenceRule() {
  }

  public void applyRule(final SNode selectedNodes) {
    {
      SNode _nodeToCheck_1029348928467 = selectedNodes;
      BaseIntentionProvider intentionProvider = null;
      TypeChecker.getInstance().getRuntimeSupport().createEquation(TypeChecker.getInstance().getRuntimeSupport().typeOf(selectedNodes, "jetbrains.mps.bootstrap.editorLanguage.helgins", "1189583398422", true), new QuotationClass_7().createNode(), _nodeToCheck_1029348928467, null, "jetbrains.mps.bootstrap.editorLanguage.helgins", "1189583402141", intentionProvider);
    }
  }

  public String getApplicableConceptFQName() {
    return "jetbrains.mps.bootstrap.editorLanguage.structure.CellKeyMap_FunctionParm_selectedNodes";
  }

  public boolean isApplicable(SNode argument) {
    return SModelUtil_new.isAssignableConcept(argument.getConceptFqName(), this.getApplicableConceptFQName());
  }

  public boolean overrides() {
    return false;
  }

}
