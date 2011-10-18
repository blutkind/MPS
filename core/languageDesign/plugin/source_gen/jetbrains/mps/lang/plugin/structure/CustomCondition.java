package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CustomCondition extends ConceptFunction implements ActionParameterCondition {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.CustomCondition";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public CustomCondition(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(CustomCondition.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(CustomCondition.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(CustomCondition.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(CustomCondition.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(CustomCondition.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(CustomCondition.VIRTUAL_PACKAGE, value);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(CustomCondition.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, CustomCondition.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, CustomCondition.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(CustomCondition.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, CustomCondition.SMODEL_ATTRIBUTE, node);
  }

  public static CustomCondition newInstance(SModel sm, boolean init) {
    return (CustomCondition) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.CustomCondition", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CustomCondition newInstance(SModel sm) {
    return CustomCondition.newInstance(sm, false);
  }
}
