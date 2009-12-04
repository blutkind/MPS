package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.baseLanguage.behavior.ExpressionStatement_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class ConvertToReturnStatement_Intention extends BaseIntention implements Intention {
  public ConvertToReturnStatement_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.ExpressionStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Convert to Return Statement";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return ExpressionStatement_Behavior.call_canServeAsReturn_1239355137616(node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode returnStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ReturnStatement", null);
    SLinkOperations.setTarget(returnStatement, "expression", SNodeOperations.copyNode(SLinkOperations.getTarget(node, "expression", true)), true);
    SNodeOperations.replaceWithAnother(node, returnStatement);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
