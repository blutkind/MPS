package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PredefinedSymbolClasses extends jetbrains.mps.lang.core.structure.BaseConcept implements jetbrains.mps.lang.core.structure.INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClasses";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SYMBOL_CLASS = "symbolClass";

  public PredefinedSymbolClasses(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(PredefinedSymbolClasses.NAME);
  }

  public void setName(String value) {
    this.setProperty(PredefinedSymbolClasses.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PredefinedSymbolClasses.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PredefinedSymbolClasses.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PredefinedSymbolClasses.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PredefinedSymbolClasses.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PredefinedSymbolClasses.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PredefinedSymbolClasses.VIRTUAL_PACKAGE, value);
  }

  public int getSymbolClassesCount() {
    return this.getChildCount(PredefinedSymbolClasses.SYMBOL_CLASS);
  }

  public Iterator<jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration> symbolClasses() {
    return this.children(PredefinedSymbolClassDeclaration.class, PredefinedSymbolClasses.SYMBOL_CLASS);
  }

  public List<jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration> getSymbolClasses() {
    return this.getChildren(PredefinedSymbolClassDeclaration.class, PredefinedSymbolClasses.SYMBOL_CLASS);
  }

  public void addSymbolClass(jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration node) {
    this.addChild(PredefinedSymbolClasses.SYMBOL_CLASS, node);
  }

  public void insertSymbolClass(jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration prev, jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClassDeclaration node) {
    this.insertChild(prev, PredefinedSymbolClasses.SYMBOL_CLASS, node);
  }


  public static PredefinedSymbolClasses newInstance(SModel sm, boolean init) {
    return (PredefinedSymbolClasses)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.PredefinedSymbolClasses", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PredefinedSymbolClasses newInstance(SModel sm) {
    return PredefinedSymbolClasses.newInstance(sm, false);
  }

}
