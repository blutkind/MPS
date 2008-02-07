package jetbrains.mps.uiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.IStyle;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.MPSColors;

public class Stylesheet_StyleSheet {
  public static final IStyle ATTRIBUTE = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = Stylesheet_StyleSheet.calculateColor(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.PLAIN);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle COMPONENT = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = Stylesheet_StyleSheet.calculateColor1(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.BOLD);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };
  public static final IStyle COMPONENT_INSTANCE = new IStyle() {

    public void apply(EditorCell cell) {
      this.apply(cell, true);
    }

    public void apply(EditorCell cell, boolean recurive) {
      if(cell instanceof EditorCell_Label) {
        EditorCell_Label labelCell = (EditorCell_Label)cell;
        Color color = Stylesheet_StyleSheet.calculateColor2(cell);
        labelCell.getTextLine().setTextColor(color);
      }
      cell.setFontType(MPSFonts.ITALIC);
      if(recurive) {
        if(cell instanceof EditorCell_Collection) {
          EditorCell_Collection collection = (EditorCell_Collection)cell;
          for(EditorCell child : collection) {
            this.apply(child, true);
          }
        }
      }
    }

  };

  private static Color calculateColor(EditorCell cell) {
    Color result;
    result = MPSColors.DARK_MAGENTA;
    return result;
  }

  private static Color calculateColor1(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

  private static Color calculateColor2(EditorCell cell) {
    Color result;
    result = Color.blue;
    return result;
  }

}
