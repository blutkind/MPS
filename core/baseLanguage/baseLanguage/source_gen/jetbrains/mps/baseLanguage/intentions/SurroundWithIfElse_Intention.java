package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SurroundWithIfElse_Intention extends SurroundWithIntention {
  public SurroundWithIfElse_Intention() {
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(SNode p0, EditorContext p1) {
    return "If / Else";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ifStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.IfStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(ListSequence.fromList(selectedNodes).last(), ifStatement);
    for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      SLinkOperations.addChild(SLinkOperations.getTarget(ifStatement, "ifTrue", true), "statement", SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
    }
    SLinkOperations.setNewChild(ifStatement, "ifFalseStatement", "jetbrains.mps.baseLanguage.structure.BlockStatement");
    editorContext.select(SLinkOperations.getTarget(ifStatement, "condition", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }
}
