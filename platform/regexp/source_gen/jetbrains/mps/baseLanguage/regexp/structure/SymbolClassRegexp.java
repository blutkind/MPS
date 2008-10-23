package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SymbolClassRegexp extends Regexp implements SymbolClassRegexpAndPart {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String PART = "part";

  public SymbolClassRegexp(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SymbolClassRegexp.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SymbolClassRegexp.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SymbolClassRegexp.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SymbolClassRegexp.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SymbolClassRegexp.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SymbolClassRegexp.VIRTUAL_PACKAGE, value);
  }

  public int getPartsCount() {
    return this.getChildCount(SymbolClassRegexp.PART);
  }

  public Iterator<SymbolClassPart> parts() {
    return this.children(SymbolClassRegexp.PART);
  }

  public List<SymbolClassPart> getParts() {
    return this.getChildren(SymbolClassRegexp.PART);
  }

  public void addPart(SymbolClassPart node) {
    this.addChild(SymbolClassRegexp.PART, node);
  }

  public void insertPart(SymbolClassPart prev, SymbolClassPart node) {
    this.insertChild(prev, SymbolClassRegexp.PART, node);
  }


  public static SymbolClassRegexp newInstance(SModel sm, boolean init) {
    return (SymbolClassRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.SymbolClassRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SymbolClassRegexp newInstance(SModel sm) {
    return SymbolClassRegexp.newInstance(sm, false);
  }

}
