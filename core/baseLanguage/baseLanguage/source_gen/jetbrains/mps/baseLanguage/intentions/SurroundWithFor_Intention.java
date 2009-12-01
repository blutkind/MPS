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

public class SurroundWithFor_Intention extends SurroundWithIntention {
  public SurroundWithFor_Intention() {
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(SNode p0, EditorContext p1) {
    return "For";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode forStatement = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ForStatement", null);
    List<SNode> selectedNodes = editorContext.getSelectedNodes();
    SNodeOperations.insertNextSiblingChild(node, forStatement);
    for (SNode selectedNode : ListSequence.fromList(selectedNodes)) {
      SLinkOperations.addChild(SLinkOperations.getTarget(forStatement, "body", true), "statement", SNodeOperations.getAncestor(selectedNode, "jetbrains.mps.baseLanguage.structure.Statement", true, false));
    }
    editorContext.select(SLinkOperations.getTarget(SLinkOperations.getTarget(forStatement, "variable", true), "type", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Statement";
  }
}
