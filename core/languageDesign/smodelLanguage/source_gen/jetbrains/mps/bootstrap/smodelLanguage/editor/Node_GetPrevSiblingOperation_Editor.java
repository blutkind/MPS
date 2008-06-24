package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class Node_GetPrevSiblingOperation_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell1915_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell1915_0");
  }

  private static void setupLabel_ConstantCell1915_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_ConstantCell1915_0(context, node, "prev-sibling");
  }

  public EditorCell create_ConstantCell1915_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell1915_0(editorCell, node, context);
    setupLabel_ConstantCell1915_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
