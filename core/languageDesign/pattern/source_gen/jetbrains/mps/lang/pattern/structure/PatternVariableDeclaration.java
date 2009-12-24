package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PatternVariableDeclaration extends Pattern implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration";
  public static final String VAR_NAME = "varName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public PatternVariableDeclaration(SNode node) {
    super(node);
  }

  public String getVarName() {
    return this.getProperty(PatternVariableDeclaration.VAR_NAME);
  }

  public void setVarName(String value) {
    this.setProperty(PatternVariableDeclaration.VAR_NAME, value);
  }

  public String getName() {
    return this.getProperty(PatternVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(PatternVariableDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(PatternVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(PatternVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(PatternVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(PatternVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(PatternVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(PatternVariableDeclaration.VIRTUAL_PACKAGE, value);
  }

  public static PatternVariableDeclaration newInstance(SModel sm, boolean init) {
    return (PatternVariableDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PatternVariableDeclaration newInstance(SModel sm) {
    return PatternVariableDeclaration.newInstance(sm, false);
  }
}
