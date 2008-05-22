package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeVariableDeclaration extends BaseConcept implements INamedConcept, IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration";
  public static String NAME = "name";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String RESOLVE_INFO = "resolveInfo";

  public TypeVariableDeclaration(SNode node) {
    super(node);
  }

  public static TypeVariableDeclaration newInstance(SModel sm, boolean init) {
    return (TypeVariableDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.TypeVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeVariableDeclaration newInstance(SModel sm) {
    return TypeVariableDeclaration.newInstance(sm, false);
  }


  public String getName() {
    return this.getProperty(TypeVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(TypeVariableDeclaration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TypeVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TypeVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TypeVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TypeVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TypeVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TypeVariableDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(TypeVariableDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(TypeVariableDeclaration.RESOLVE_INFO, value);
  }

}
