package webr.xml.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class Content_Editor extends DefaultNodeEditor {

  private static void setupBasic_ErrorCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1166803177963");
    editorCell.setDrawBorder(false);
  }

  private static void setupLabel_ErrorCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createErrorCell(context, node);
  }

  public EditorCell createErrorCell(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "content");
    Content_Editor.setupBasic_ErrorCell(editorCell, node, context);
    Content_Editor.setupLabel_ErrorCell(editorCell, node, context);
    return editorCell;
  }

}
