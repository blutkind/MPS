package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;

public class stylesheet_Feature_StyleSheet {

  public static Style getOPPOSITE(final EditorCell cell) {
    return new Style(cell) {
      {
        this.set(StyleAttributes.BACKGROUND_COLOR, MPSColors.lightGray);
        this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      }

    };
  }

}
