package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellMenuPart_ReferentPrimary_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2608_0(context, node);
  }

  public EditorCell createCollection_2608_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2608_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_2608_2(context, node));
    editorCell.addEditorCell(this.createCollection_2608_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2608_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2608_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2608_2(context, node, "  "));
    editorCell.addEditorCell(this.createConstant_2608_0(context, node, "no customization needed"));
    return editorCell;
  }

  public EditorCell createCollection_2608_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2608_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2608_1(context, node, "primary choose referent menu"));
    return editorCell;
  }

  public EditorCell createConstant_2608_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2608_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2608_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2608_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2608_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2608_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_2608_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2608_0");
  }

  private static void setupBasic_Collection_2608_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2608_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2608_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2608_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.darkGray);
    }
  }

  private static void setupBasic_Collection_2608_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2608_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2608_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2608_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
    }
  }

  private static void setupBasic_Constant_2608_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2608_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

}
