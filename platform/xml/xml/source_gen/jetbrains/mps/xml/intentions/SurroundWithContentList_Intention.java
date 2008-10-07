package jetbrains.mps.xml.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class SurroundWithContentList_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.xml.structure.Content";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Surround with content list";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode contentList = SConceptOperations.createNewNode("jetbrains.mps.xml.structure.ContentList", null);
    List<SNode> selectedNodes = editorContext.getNodeEditorComponent().getNodeRangeSelection().getNodes();
    if (selectedNodes.isEmpty()) {
      selectedNodes.add(editorContext.getSelectedNode());
    }
    SNode first = selectedNodes.get(0);
    SNodeOperations.insertPrevSiblingChild(first, contentList);
    for(SNode selectedNode : selectedNodes) {
      SLinkOperations.addChild(contentList, "content", selectedNode);
    }
    SLinkOperations.addNewChild(contentList, "content", "jetbrains.mps.xml.structure.Content");
  }

  public String getLocationString() {
    return "jetbrains.mps.xml.intentions";
  }

}
