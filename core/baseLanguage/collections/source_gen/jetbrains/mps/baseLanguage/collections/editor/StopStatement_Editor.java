package jetbrains.mps.baseLanguage.collections.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class StopStatement_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1224451888514(context, node);
  }

  public EditorCell createCollection1224451888514(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12244518885141224451888514(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1224451888515(context, node, "stop"));
    editorCell.addEditorCell(this.createConstant1224451888517(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant1224451888515(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12244518885151224451888515(editorCell, node, context);
    setupLabel_Constant_1224451888515_1224451888515(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1224451888517(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12244518885171224451888517(editorCell, node, context);
    setupLabel_Constant_1224451888517_1224451888517(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_12244518885141224451888514(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1224451888514");
  }

  private static void setupBasic_Constant_12244518885151224451888515(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224451888515");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12244518885171224451888517(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1224451888517");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1224451888515_1224451888515(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1224451888517_1224451888517(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
