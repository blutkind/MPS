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

public class ConstructorDeclaration extends BaseMethodDeclaration implements ClassifierMember, IResolveInfo {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ConstructorDeclaration";
  public static final String NESTED_NAME = "nestedName";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String RESOLVE_INFO = "resolveInfo";
  public static final String VISIBILITY = "visibility";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public ConstructorDeclaration(SNode node) {
    super(node);
  }

  public String getNestedName() {
    return this.getProperty(ConstructorDeclaration.NESTED_NAME);
  }

  public void setNestedName(String value) {
    this.setProperty(ConstructorDeclaration.NESTED_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(ConstructorDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConstructorDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConstructorDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConstructorDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConstructorDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConstructorDeclaration.VIRTUAL_PACKAGE, value);
  }

  public String getResolveInfo() {
    return this.getProperty(ConstructorDeclaration.RESOLVE_INFO);
  }

  public void setResolveInfo(String value) {
    this.setProperty(ConstructorDeclaration.RESOLVE_INFO, value);
  }

  public Visibility getVisibility() {
    return (Visibility) this.getChild(Visibility.class, ConstructorDeclaration.VISIBILITY);
  }

  public void setVisibility(Visibility node) {
    super.setChild(ConstructorDeclaration.VISIBILITY, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(ConstructorDeclaration.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, ConstructorDeclaration.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, ConstructorDeclaration.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(ConstructorDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, ConstructorDeclaration.SMODEL_ATTRIBUTE, node);
  }

  public static ConstructorDeclaration newInstance(SModel sm, boolean init) {
    return (ConstructorDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ConstructorDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConstructorDeclaration newInstance(SModel sm) {
    return ConstructorDeclaration.newInstance(sm, false);
  }
}
