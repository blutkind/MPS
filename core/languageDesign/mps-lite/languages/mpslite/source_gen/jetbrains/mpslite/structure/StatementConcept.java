package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StatementConcept extends BaseConcept implements IMPSLiteConcept {
  public static final String concept = "jetbrains.mpslite.structure.StatementConcept";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String ROOT = "root";
  public static final String ABSTRACT = "abstract";
  public static final String EXTENDS = "extends";

  public StatementConcept(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(StatementConcept.NAME);
  }

  public void setName(String value) {
    this.setProperty(StatementConcept.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(StatementConcept.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(StatementConcept.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(StatementConcept.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(StatementConcept.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(StatementConcept.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(StatementConcept.VIRTUAL_PACKAGE, value);
  }

  public boolean getRoot() {
    return this.getBooleanProperty(StatementConcept.ROOT);
  }

  public void setRoot(boolean value) {
    this.setBooleanProperty(StatementConcept.ROOT, value);
  }

  public boolean getAbstract() {
    return this.getBooleanProperty(StatementConcept.ABSTRACT);
  }

  public void setAbstract(boolean value) {
    this.setBooleanProperty(StatementConcept.ABSTRACT, value);
  }

  public AbstractConceptReference getExtends() {
    return (AbstractConceptReference)this.getChild(AbstractConceptReference.class, StatementConcept.EXTENDS);
  }

  public void setExtends(AbstractConceptReference node) {
    super.setChild(StatementConcept.EXTENDS, node);
  }


  public static StatementConcept newInstance(SModel sm, boolean init) {
    return (StatementConcept)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.StatementConcept", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StatementConcept newInstance(SModel sm) {
    return StatementConcept.newInstance(sm, false);
  }

}
