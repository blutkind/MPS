package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Aug 22, 2006 4:03:13 PM */


import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class BinaryOperation_RightArgument_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new BinaryOperation_RightArgument_Actions_DELETE(node));
  }
}
