package jetbrains.mps.bash.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.CaretPosition;

public class Command_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createConstant_5th3tc_a(editorContext, node);
  }

  private EditorCell createConstant_5th3tc_a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_5th3tc_a");
    BashLanguageStyle_StyleSheet.getHintStyle(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DEFAULT_CARET_POSITON, CaretPosition.FIRST);
      style.set(StyleAttributes.SELECTABLE, true);
      style.set(StyleAttributes.EDITABLE, true);
    }
    editorCell.setDefaultText("?command");
    return editorCell;
  }
}
