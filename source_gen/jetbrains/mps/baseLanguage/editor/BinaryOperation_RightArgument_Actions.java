package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Sep 22, 2006 8:25:55 PM */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class BinaryOperation_RightArgument_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new BinaryOperation_RightArgument_Actions_DELETE(node));
  }
}
