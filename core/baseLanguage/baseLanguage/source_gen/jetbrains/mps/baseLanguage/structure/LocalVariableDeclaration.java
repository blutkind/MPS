package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.IResolveInfo;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LocalVariableDeclaration extends VariableDeclaration implements IResolveInfo, IVariableAssignment, IVariableDeclaration, ILocalDeclaration {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public LocalVariableDeclaration(SNode node) {
    super(node);
  }

  public String getResolveInfo() {
    return this.getProperty(LocalVariableDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(LocalVariableDeclaration.RESOLVE_INFO, value);
  }

  public String getShortDescription() {
    return this.getProperty(LocalVariableDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LocalVariableDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LocalVariableDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LocalVariableDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LocalVariableDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LocalVariableDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(LocalVariableDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(LocalVariableDeclaration.NAME, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(LocalVariableDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, LocalVariableDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, LocalVariableDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(LocalVariableDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, LocalVariableDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static LocalVariableDeclaration newInstance(SModel sm, boolean init) {
    return (LocalVariableDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LocalVariableDeclaration newInstance(SModel sm) {
    return LocalVariableDeclaration.newInstance(sm, false);
  }
}
