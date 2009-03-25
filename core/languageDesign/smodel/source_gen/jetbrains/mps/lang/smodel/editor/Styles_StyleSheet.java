package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class Styles_StyleSheet {

  public static Style getRef_link_role(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.darkGray);
        this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
      }
    };
  }

  public static Style getOperationParameter(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.TEXT_COLOR, MPSColors.darkGray);
      }
    };
  }

}
