package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS  */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class IfStatement_elseBlockStatement_delete {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new IfStatement_elseBlockStatement_delete_DELETE(node));
  }
}
