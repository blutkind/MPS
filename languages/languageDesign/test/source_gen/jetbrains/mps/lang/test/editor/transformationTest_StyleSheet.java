package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class transformationTest_StyleSheet {
  public static Style getAssertStyle(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    return style;
  }

  public static Style getNodeAnnotation(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.UNDERLINED, true);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getNodeProperty(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    return style;
  }

  public static Style getEditorOperation(final EditorCell cell) {
    Style style = new Style(cell);
    style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    return style;
  }
}
