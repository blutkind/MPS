package jetbrains.mps.lang.editor.editorTest.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;

public class IBaseTestBlock_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createConstant_5253_s4nz0blfsy1g(editorContext, node);
  }

  private EditorCell createConstant_5253_s4nz0blfsy1g(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5253_s4nz0blfsy1g");
    editorCell.setDefaultText("");
    return editorCell;
  }
}
