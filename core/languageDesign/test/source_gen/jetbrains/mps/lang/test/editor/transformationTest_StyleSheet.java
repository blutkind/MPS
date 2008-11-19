package jetbrains.mps.lang.test.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class transformationTest_StyleSheet {

  public static Style getAssertStyle(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
      }

    };
  }

  public static Style getNodeAnnotation(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        this.set(StyleAttributes.UNDERLINED, true);
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
      }

    };
  }

  public static Style getNodeProperty(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
      }

    };
  }

}
