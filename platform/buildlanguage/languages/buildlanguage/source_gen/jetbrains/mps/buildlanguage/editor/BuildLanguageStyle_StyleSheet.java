package jetbrains.mps.buildlanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class BuildLanguageStyle_StyleSheet {
  public static final Style STRING_LITERAL = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_0(cell);
        }

      });
    }

  };
  public static final Style BOOLEAN_LITERAL = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_1(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateFontStyle3467_0(cell);
        }

      });
    }

  };
  public static final Style INTEGER_LITERAL = new Style() {
    {
    }

  };
  public static final Style KEYWORD = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_2(cell);
        }

      });
      this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateFontStyle3467_1(cell);
        }

      });
    }

  };
  public static final Style TARGET = new Style() {
    {
      this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateFontStyle3467_2(cell);
        }

      });
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_5(cell);
        }

      });
    }

  };
  public static final Style TASK = new Style() {
    {
      this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateFontStyle3467_4(cell);
        }

      });
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_6(cell);
        }

      });
    }

  };
  public static final Style PROPERTY = new Style() {
    {
    }

  };
  public static final Style ATTRIBUTE_NAME = new Style() {
    {
      this.set(StyleAttributes.FONT_STYLE, new AttributeCalculator <Integer>() {

        public Integer calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateFontStyle3467_3(cell);
        }

      });
    }

  };
  public static final Style DEPRACTAED_ATTRIBUTE_NAME = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_3(cell);
        }

      });
    }

  };
  public static final Style PROMPTING = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_4(cell);
        }

      });
    }

  };
  public static final Style COMMENT = new Style() {
    {
      this.set(StyleAttributes.TEXT_COLOR, new AttributeCalculator <Color>() {

        public Color calculate(EditorCell cell) {
          return BuildLanguageStyle_StyleSheet.calculateColor3467_7(cell);
        }

      });
    }

  };

  private static Integer calculateFontStyle3467_0(EditorCell cell) {
    int result;
    result = MPSFonts.BOLD;
    return result;
  }

  private static Integer calculateFontStyle3467_1(EditorCell cell) {
    int result;
    result = MPSFonts.BOLD;
    return result;
  }

  private static Integer calculateFontStyle3467_2(EditorCell cell) {
    int result;
    result = MPSFonts.BOLD;
    return result;
  }

  private static Integer calculateFontStyle3467_3(EditorCell cell) {
    int result;
    result = MPSFonts.PLAIN;
    return result;
  }

  private static Integer calculateFontStyle3467_4(EditorCell cell) {
    int result;
    result = MPSFonts.PLAIN;
    return result;
  }

  private static Color calculateColor3467_0(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_GREEN;
    return result;
  }

  private static Color calculateColor3467_1(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor3467_2(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor3467_3(EditorCell cell) {
    Color result;
    result = MPSColors.red;
    return result;
  }

  private static Color calculateColor3467_4(EditorCell cell) {
    Color result;
    result = MPSColors.lightGray;
    return result;
  }

  private static Color calculateColor3467_5(EditorCell cell) {
    Color result;
    result = MPSColors.darkGray;
    return result;
  }

  private static Color calculateColor3467_6(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_BLUE;
    return result;
  }

  private static Color calculateColor3467_7(EditorCell cell) {
    Color result;
    result = MPSColors.gray;
    return result;
  }

}
