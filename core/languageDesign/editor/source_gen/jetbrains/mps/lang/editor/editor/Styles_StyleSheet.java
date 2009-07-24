package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.behavior.EditorCellModel_Behavior;

public class Styles_StyleSheet {

  public static Style getRootCellModelStyle(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.INDENT_LAYOUT_INDENT, new AttributeCalculator <Boolean>() {

      public Boolean calculate(EditorCell cell) {
        return Styles_StyleSheet._StyleParameter_QueryFunction_1237383984781((cell == null ?
          null :
          cell.getSNode()
        ), (cell == null ?
          null :
          cell.getEditorContext()
        ));
      }
    });
    style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, new AttributeCalculator <Boolean>() {

      public Boolean calculate(EditorCell cell) {
        return Styles_StyleSheet._StyleParameter_QueryFunction_1237384018255((cell == null ?
          null :
          cell.getSNode()
        ), (cell == null ?
          null :
          cell.getEditorContext()
        ));
      }
    });
    style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, new AttributeCalculator <Boolean>() {

      public Boolean calculate(EditorCell cell) {
        return Styles_StyleSheet._StyleParameter_QueryFunction_1237385537795((cell == null ?
          null :
          cell.getSNode()
        ), (cell == null ?
          null :
          cell.getEditorContext()
        ));
      }
    });
    style.set(StyleAttributes.DRAW_BORDER, true);
    return style;
  }

  public static Style getStyle(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getReference(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    return style;
  }

  public static Style getItem(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getHeader(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.UNDERLINED, true);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getProperty(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.SELECTABLE, false);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    return style;
  }

  public static Style getBordered(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.DRAW_BORDER, true);
    return style;
  }

  public static Style getBorderedCollection(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.DRAW_BORDER, true);
    return style;
  }

  public static Style getTag(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.MATCHING_LABEL, "tag");
    return style;
  }

  public static Style getAttributedCellLabel(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.DRAW_BORDER, true);
    style.set(StyleAttributes.EDITABLE, false);
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    style.set(StyleAttributes.UNDERLINED, new AttributeCalculator <Boolean>() {

      public Boolean calculate(EditorCell cell) {
        return Styles_StyleSheet._StyleParameter_QueryFunction_4411513707977385303((cell == null ?
          null :
          cell.getSNode()
        ), (cell == null ?
          null :
          cell.getEditorContext()
        ));
      }
    });
    return style;
  }

  public static boolean _StyleParameter_QueryFunction_1237383984781(SNode node, EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"))) {
      return false;
    }
    return EditorCellModel_Behavior.call_isIndented_1237383418148(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"));
  }

  public static boolean _StyleParameter_QueryFunction_1237384018255(SNode node, EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"))) {
      return false;
    }
    if (EditorCellModel_Behavior.call_isNewLine_1237383076236(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"))) {
      return true;
    }
    if (SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.EditorCellModel")) {
      return EditorCellModel_Behavior.call_isNewLineChildren_1237383562600(SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.lang.editor.structure.EditorCellModel"));
    }
    return false;
  }

  public static boolean _StyleParameter_QueryFunction_1237385537795(SNode node, EditorContext editorContext) {
    if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"))) {
      return false;
    }
    return EditorCellModel_Behavior.call_isOnNewLine_1237385424172(SNodeOperations.cast(node, "jetbrains.mps.lang.editor.structure.EditorCellModel"));
  }

  public static boolean _StyleParameter_QueryFunction_4411513707977385303(SNode node, EditorContext editorContext) {
    return true;
  }

}
