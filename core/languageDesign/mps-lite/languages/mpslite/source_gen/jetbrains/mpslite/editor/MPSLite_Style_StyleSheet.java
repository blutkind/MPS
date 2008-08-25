package jetbrains.mpslite.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class MPSLite_Style_StyleSheet {
  public static final Style M_P_S_LITE_OPERATION = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_0(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }

  };
  public static final Style M_P_S_LITE_PROPERTY = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_1(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }

  };
  public static final Style M_P_S_LITE_CHILD = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_2(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }

  };
  public static final Style M_P_S_LITE_REFERENCE = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_3(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD_ITALIC);
    }

  };
  public static final Style M_P_S_LITE_OPTION = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_4(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
    }

  };
  public static final Style M_P_S_LITE_OPTIONAL_PART = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return MPSLite_Style_StyleSheet.calculateColor9936_5(cell);
        }

      });
    }

  };

  private static Color calculateColor9936_0(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor9936_1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

  private static Color calculateColor9936_2(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor9936_3(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor9936_4(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor9936_5(EditorCell cell) {
    Color result;
    result = MPSColors.gray;
    return result;
  }

}
