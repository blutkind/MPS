package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeVarDeclaration extends Statement implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.TypeVarDeclaration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NULLABLE = "nullable";

  public TypeVarDeclaration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TypeVarDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(TypeVarDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TypeVarDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TypeVarDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TypeVarDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TypeVarDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TypeVarDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TypeVarDeclaration.VIRTUAL_PACKAGE, value);
  }

  public boolean getNullable() {
    return this.getBooleanProperty(TypeVarDeclaration.NULLABLE);
  }

  public void setNullable(boolean value) {
    this.setBooleanProperty(TypeVarDeclaration.NULLABLE, value);
  }


  public static TypeVarDeclaration newInstance(SModel sm, boolean init) {
    return (TypeVarDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypeVarDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeVarDeclaration newInstance(SModel sm) {
    return TypeVarDeclaration.newInstance(sm, false);
  }

}
