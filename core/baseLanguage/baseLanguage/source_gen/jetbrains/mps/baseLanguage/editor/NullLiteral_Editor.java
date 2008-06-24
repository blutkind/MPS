package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class NullLiteral_Editor extends DefaultNodeEditor {

  private static void setupBasic_ConstantCell6877_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell6877_0");
    {
      Style inlineStyle = new Style() {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_ConstantCell6877_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
    editorCell.setTextColor(MPSColors.DARK_BLUE);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_ConstantCell6877_0(context, node, "null");
  }

  public EditorCell create_ConstantCell6877_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell6877_0(editorCell, node, context);
    setupLabel_ConstantCell6877_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
