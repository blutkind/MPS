package jetbrains.mps.baseLanguageInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSColors;

public class StyleSheet_StyleSheet {
  public static final Style INTERNAL_KEYWORD = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return StyleSheet_StyleSheet.calculateColor5902_0(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }

  };
  public static final Style SQUARE_BRACKET = new Style() {
    {
      this.putAll(BaseLanguageStyle_StyleSheet.BRACKET);
      this.set(StyleAttributes.PADDING_LEFT, 0.0);
      this.set(StyleAttributes.PADDING_RIGHT, 0.0);
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
      this.set(StyleAttributes.SELECTABLE, false);
    }

  };

  private static Color calculateColor5902_0(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

}
