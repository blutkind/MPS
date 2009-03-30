package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mpslite.structure.PropertyPart;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mpslite.structure.Concretization;
import jetbrains.mps.smodel.SNode;
import jetbrains.mpslite.structure.MPSLitePropertyType_Enum;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConcretePropertyPart extends PropertyPart implements INamedConcept, Concretization {
  public static final String concept = "jetbrains.mpslite.structure.ConcretePropertyPart";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String PROPERTY_TYPE = "propertyType";

  public ConcretePropertyPart(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(ConcretePropertyPart.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ConcretePropertyPart.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ConcretePropertyPart.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ConcretePropertyPart.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(ConcretePropertyPart.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(ConcretePropertyPart.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(ConcretePropertyPart.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConcretePropertyPart.NAME, value);
  }

  public MPSLitePropertyType_Enum getPropertyType() {
    String value = super.getProperty(ConcretePropertyPart.PROPERTY_TYPE);
    return MPSLitePropertyType_Enum.parseValue(value);
  }

  public void setPropertyType(MPSLitePropertyType_Enum value) {
    super.setProperty(ConcretePropertyPart.PROPERTY_TYPE, value.getValueAsString());
  }


  public static ConcretePropertyPart newInstance(SModel sm, boolean init) {
    return (ConcretePropertyPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.ConcretePropertyPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConcretePropertyPart newInstance(SModel sm) {
    return ConcretePropertyPart.newInstance(sm, false);
  }

}
