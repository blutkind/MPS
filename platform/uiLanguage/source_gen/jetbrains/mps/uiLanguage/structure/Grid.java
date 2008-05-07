package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

import java.util.Iterator;
import java.util.List;

public class Grid extends BaseConcept implements IComponentInstance {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.Grid";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ROW = "row";
  public static String CONTENT = "content";

  public Grid(SNode node) {
    super(node);
  }

  public static Grid newInstance(SModel sm, boolean init) {
    return (Grid) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.Grid", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Grid newInstance(SModel sm) {
    return Grid.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(Grid.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Grid.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Grid.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Grid.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Grid.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Grid.VIRTUAL_PACKAGE, value);
  }

  public int getRowsCount() {
    return this.getChildCount(Grid.ROW);
  }

  public Iterator<GridRow> rows() {
    return this.children(Grid.ROW);
  }

  public List<GridRow> getRows() {
    return this.getChildren(Grid.ROW);
  }

  public void addRow(GridRow node) {
    this.addChild(Grid.ROW, node);
  }

  public void insertRow(GridRow prev, GridRow node) {
    this.insertChild(prev, Grid.ROW, node);
  }

  public int getContentsCount() {
    return this.getChildCount(Grid.CONTENT);
  }

  public Iterator<IComponentPart> contents() {
    return this.children(Grid.CONTENT);
  }

  public List<IComponentPart> getContents() {
    return this.getChildren(Grid.CONTENT);
  }

  public void addContent(IComponentPart node) {
    this.addChild(Grid.CONTENT, node);
  }

  public void insertContent(IComponentPart prev, IComponentPart node) {
    this.insertChild(prev, Grid.CONTENT, node);
  }

}
