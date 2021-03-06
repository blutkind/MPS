package jetbrains.mps.platform.conf.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BeanExtensionAttribute extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.platform.conf.structure.BeanExtensionAttribute";
  public static final String VALUE = "value";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public BeanExtensionAttribute(SNode node) {
    super(node);
  }

  public String getValue() {
    return this.getProperty(BeanExtensionAttribute.VALUE);
  }

  public void setValue(String value) {
    this.setProperty(BeanExtensionAttribute.VALUE, value);
  }

  public String getName() {
    return this.getProperty(BeanExtensionAttribute.NAME);
  }

  public void setName(String value) {
    this.setProperty(BeanExtensionAttribute.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BeanExtensionAttribute.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BeanExtensionAttribute.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BeanExtensionAttribute.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BeanExtensionAttribute.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BeanExtensionAttribute.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BeanExtensionAttribute.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(BeanExtensionAttribute.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, BeanExtensionAttribute.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, BeanExtensionAttribute.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(BeanExtensionAttribute.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, BeanExtensionAttribute.SMODEL_ATTRIBUTE, node);
  }

  public static BeanExtensionAttribute newInstance(SModel sm, boolean init) {
    return (BeanExtensionAttribute) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.platform.conf.structure.BeanExtensionAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BeanExtensionAttribute newInstance(SModel sm) {
    return BeanExtensionAttribute.newInstance(sm, false);
  }
}
