package jetbrains.mps.samples.formulaLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;

public class Function_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createError_y1p9lm_a(editorContext, node);
  }

  private EditorCell createError_y1p9lm_a(EditorContext editorContext, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(editorContext, node, "?function?");
    editorCell.setCellId("Error_y1p9lm_a");
    return editorCell;
  }
}
