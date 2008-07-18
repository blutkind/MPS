package webr.xml.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;

public class BaseText_Editor extends DefaultNodeEditor {

  private static void setupBasic_ErrorCell6617_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ErrorCell6617_0");
  }

  private static void setupLabel_ErrorCell6617_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_ErrorCell6617_0(context, node);
  }

  public EditorCell create_ErrorCell6617_0(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "baseText");
    setupBasic_ErrorCell6617_0(editorCell, node, context);
    setupLabel_ErrorCell6617_0(editorCell, node, context);
    return editorCell;
  }

}
