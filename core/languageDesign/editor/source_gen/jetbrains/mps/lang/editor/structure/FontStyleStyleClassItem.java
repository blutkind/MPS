package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FontStyleStyleClassItem extends StyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem";
  public static final String STYLE = "style";
  public static final String QUERY = "query";

  public FontStyleStyleClassItem(SNode node) {
    super(node);
  }

  public _FontStyle_Enum getStyle() {
    String value = super.getProperty(FontStyleStyleClassItem.STYLE);
    return _FontStyle_Enum.parseValue(value);
  }

  public void setStyle(_FontStyle_Enum value) {
    super.setProperty(FontStyleStyleClassItem.STYLE, value.getValueAsString());
  }

  public QueryFunction_FontStyle getQuery() {
    return (QueryFunction_FontStyle)this.getChild(QueryFunction_FontStyle.class, FontStyleStyleClassItem.QUERY);
  }

  public void setQuery(QueryFunction_FontStyle node) {
    super.setChild(FontStyleStyleClassItem.QUERY, node);
  }


  public static FontStyleStyleClassItem newInstance(SModel sm, boolean init) {
    return (FontStyleStyleClassItem)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FontStyleStyleClassItem newInstance(SModel sm) {
    return FontStyleStyleClassItem.newInstance(sm, false);
  }

}
