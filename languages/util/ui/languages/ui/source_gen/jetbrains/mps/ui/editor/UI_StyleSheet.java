package jetbrains.mps.ui.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;

public class UI_StyleSheet {
  public static Style getUIObjectBox(final EditorCell cell) {
    Style style = new Style(cell);
    return style;
  }

  public static Style getUIObjectMargins(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.SELECTABLE, false);
    return style;
  }

  public static Style getUIObject(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, new Color(102));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    return style;
  }

  public static Style getUIObjectPart(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, new Color(102));
    style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD_ITALIC);
    return style;
  }

  public static Style getContainerBox(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.DRAW_BRACKETS, true);
    style.set(StyleAttributes.BRACKETS_COLOR, new Color(6723993));
    return style;
  }

  public static Style getContainerMargins(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.SELECTABLE, false);
    return style;
  }
}
