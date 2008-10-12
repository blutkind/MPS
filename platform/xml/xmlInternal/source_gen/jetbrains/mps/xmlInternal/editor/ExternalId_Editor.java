package jetbrains.mps.xmlInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class ExternalId_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1174861289896(context, node);
  }

  public EditorCell createError1174861289896(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "externalId");
    setupBasic_Error_11748612898961174861289896(editorCell, node, context);
    setupLabel_Error_1174861289896_1174861289896(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_11748612898961174861289896(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Error_1174861289896");
  }

  private static void setupLabel_Error_1174861289896_1174861289896(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
