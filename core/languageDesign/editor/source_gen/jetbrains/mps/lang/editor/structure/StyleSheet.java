package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StyleSheet extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.editor.structure.StyleSheet";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String STYLE_CLASS = "styleClass";

  public StyleSheet(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(StyleSheet.NAME);
  }

  public void setName(String value) {
    this.setProperty(StyleSheet.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(StyleSheet.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(StyleSheet.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(StyleSheet.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(StyleSheet.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(StyleSheet.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(StyleSheet.VIRTUAL_PACKAGE, value);
  }

  public int getStyleClassesCount() {
    return this.getChildCount(StyleSheet.STYLE_CLASS);
  }

  public Iterator<StyleSheetClass> styleClasses() {
    return this.children(StyleSheetClass.class, StyleSheet.STYLE_CLASS);
  }

  public List<StyleSheetClass> getStyleClasses() {
    return this.getChildren(StyleSheetClass.class, StyleSheet.STYLE_CLASS);
  }

  public void addStyleClass(StyleSheetClass node) {
    this.addChild(StyleSheet.STYLE_CLASS, node);
  }

  public void insertStyleClass(StyleSheetClass prev, StyleSheetClass node) {
    this.insertChild(prev, StyleSheet.STYLE_CLASS, node);
  }

  public static StyleSheet newInstance(SModel sm, boolean init) {
    return (StyleSheet) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.StyleSheet", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StyleSheet newInstance(SModel sm) {
    return StyleSheet.newInstance(sm, false);
  }
}
