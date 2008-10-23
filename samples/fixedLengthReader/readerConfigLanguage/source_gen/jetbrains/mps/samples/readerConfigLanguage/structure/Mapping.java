package jetbrains.mps.samples.readerConfigLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Mapping extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.samples.readerConfigLanguage.structure.Mapping";
  public static final String CODE = "code";
  public static final String TARGET_CLASS = "targetClass";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String FIELD = "field";

  public Mapping(SNode node) {
    super(node);
  }

  public String getCode() {
    return this.getProperty(Mapping.CODE);
  }

  public void setCode(String value) {
    this.setProperty(Mapping.CODE, value);
  }

  public String getTargetClass() {
    return this.getProperty(Mapping.TARGET_CLASS);
  }

  public void setTargetClass(String value) {
    this.setProperty(Mapping.TARGET_CLASS, value);
  }

  public String getName() {
    return this.getProperty(Mapping.NAME);
  }

  public void setName(String value) {
    this.setProperty(Mapping.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(Mapping.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(Mapping.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(Mapping.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(Mapping.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(Mapping.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(Mapping.VIRTUAL_PACKAGE, value);
  }

  public int getFieldsCount() {
    return this.getChildCount(Mapping.FIELD);
  }

  public Iterator<Field> fields() {
    return this.children(Mapping.FIELD);
  }

  public List<Field> getFields() {
    return this.getChildren(Mapping.FIELD);
  }

  public void addField(Field node) {
    this.addChild(Mapping.FIELD, node);
  }

  public void insertField(Field prev, Field node) {
    this.insertChild(prev, Mapping.FIELD, node);
  }


  public static Mapping newInstance(SModel sm, boolean init) {
    return (Mapping)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.readerConfigLanguage.structure.Mapping", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Mapping newInstance(SModel sm) {
    return Mapping.newInstance(sm, false);
  }

}
