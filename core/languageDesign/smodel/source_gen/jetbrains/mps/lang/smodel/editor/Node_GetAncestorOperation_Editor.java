package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class Node_GetAncestorOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAliasAndParms_Comp1569_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createComponent_1569_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1569_0(context, node);
  }

  public EditorCell createCollection_1569_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1569_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1569_0(context, node, "The 'ancestor' operation"));
    editorCell.addEditorCell(this.createConstant_1569_1(context, node, ""));
    editorCell.addEditorCell(this.createConstant_1569_2(context, node, "Returns ancestor node (if no parameters returns direct parent)"));
    editorCell.addEditorCell(this.createConstant_1569_3(context, node, ""));
    editorCell.addEditorCell(this.createConstant_1569_4(context, node, "Optional parameters:"));
    editorCell.addEditorCell(this.createCollection_1569_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1569_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1569_1(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1569_5(context, node, "root"));
    editorCell.addEditorCell(this.createConstant_1569_6(context, node, "get top ancestor"));
    editorCell.addEditorCell(this.createConstant_1569_7(context, node, "concept"));
    editorCell.addEditorCell(this.createConstant_1569_8(context, node, "get ancestor which is instance of concept"));
    editorCell.addEditorCell(this.createConstant_1569_9(context, node, "concept in"));
    editorCell.addEditorCell(this.createConstant_1569_10(context, node, "get ancestor which is instance of one of concepts"));
    editorCell.addEditorCell(this.createConstant_1569_11(context, node, "+"));
    editorCell.addEditorCell(this.createConstant_1569_12(context, node, "return current node if it meets the requirements"));
    return editorCell;
  }

  public EditorCell createComponent_1569_0(EditorContext context, SNode node) {
    if (this.myReplaceableAliasAndParms_Comp1569_0 == null) {
      this.myReplaceableAliasAndParms_Comp1569_0 = new jetbrains.mps.lang.smodel.editor.ReplaceableAliasAndParms_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAliasAndParms_Comp1569_0.createEditorCell(context);
    setupBasic_Component_1569_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_1569_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_0(editorCell, node, context);
    setupLabel_Constant_1569_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_1(editorCell, node, context);
    setupLabel_Constant_1569_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_2(editorCell, node, context);
    setupLabel_Constant_1569_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_3(editorCell, node, context);
    setupLabel_Constant_1569_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_4(editorCell, node, context);
    setupLabel_Constant_1569_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_5(editorCell, node, context);
    setupLabel_Constant_1569_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_6(editorCell, node, context);
    setupLabel_Constant_1569_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_7(editorCell, node, context);
    setupLabel_Constant_1569_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_8(editorCell, node, context);
    setupLabel_Constant_1569_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_9(editorCell, node, context);
    setupLabel_Constant_1569_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_10(editorCell, node, context);
    setupLabel_Constant_1569_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_11(editorCell, node, context);
    setupLabel_Constant_1569_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1569_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1569_12(editorCell, node, context);
    setupLabel_Constant_1569_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }


  private static void setupBasic_Collection_1569_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1569_0");
  }

  private static void setupBasic_Constant_1569_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_0");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_2");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_4");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_1569_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1569_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_5");
  }

  private static void setupBasic_Constant_1569_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_6");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_7");
  }

  private static void setupBasic_Constant_1569_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_8");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_9");
  }

  private static void setupBasic_Constant_1569_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_10");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1569_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_11");
  }

  private static void setupBasic_Constant_1569_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1569_12");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Component_1569_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_5(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_7(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_8(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_9(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_10(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_11(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1569_12(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
