package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS Apr 19, 2006 1:46:58 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class SNodeTypeCastExpression_Concept_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new SNodeTypeCastExpression_Concept_Actions_DELETE(node));
  }
}
