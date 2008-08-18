package jetbrains.mps.baseLanguageInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class InternalThisExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1202838194600(context, node);
  }

  public EditorCell createCollection1202838194600(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12028381946001202838194600(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1202838200789(context, node, "_this"));
    return editorCell;
  }

  public EditorCell createConstant1202838200789(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12028382007891202838200789(editorCell, node, context);
    setupLabel_Constant_1202838200789_1202838200789(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_12028381946001202838194600(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1202838194600");
  }

  private static void setupBasic_Constant_12028382007891202838200789(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1202838200789");
  }

  private static void setupLabel_Constant_1202838200789_1202838200789(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
