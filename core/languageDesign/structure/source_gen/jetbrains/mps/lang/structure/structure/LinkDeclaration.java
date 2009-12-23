package jetbrains.mps.lang.structure.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LinkDeclaration extends BaseConcept implements IStructureDeprecatable {
  public static final String concept = "jetbrains.mps.lang.structure.structure.LinkDeclaration";
  public static final String ROLE = "role";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String META_CLASS = "metaClass";
  public static final String SOURCE_CARDINALITY = "sourceCardinality";
  public static final String SPECIALIZED_LINK = "specializedLink";
  public static final String TARGET = "target";

  public LinkDeclaration(SNode node) {
    super(node);
  }

  public String getRole() {
    return this.getProperty(LinkDeclaration.ROLE);
  }

  public void setRole(String value) {
    this.setProperty(LinkDeclaration.ROLE, value);
  }

  public String getShortDescription() {
    return this.getProperty(LinkDeclaration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LinkDeclaration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LinkDeclaration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LinkDeclaration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LinkDeclaration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LinkDeclaration.VIRTUAL_PACKAGE, value);
  }

  public LinkMetaclass getMetaClass() {
    String value = super.getProperty(LinkDeclaration.META_CLASS);
    return LinkMetaclass.parseValue(value);
  }

  public void setMetaClass(LinkMetaclass value) {
    super.setProperty(LinkDeclaration.META_CLASS, value.getValueAsString());
  }

  public Cardinality getSourceCardinality() {
    String value = super.getProperty(LinkDeclaration.SOURCE_CARDINALITY);
    return Cardinality.parseValue(value);
  }

  public void setSourceCardinality(Cardinality value) {
    super.setProperty(LinkDeclaration.SOURCE_CARDINALITY, value.getValueAsString());
  }

  public LinkDeclaration getSpecializedLink() {
    return (LinkDeclaration) this.getReferent(LinkDeclaration.class, LinkDeclaration.SPECIALIZED_LINK);
  }

  public void setSpecializedLink(LinkDeclaration node) {
    super.setReferent(LinkDeclaration.SPECIALIZED_LINK, node);
  }

  public AbstractConceptDeclaration getTarget() {
    return (AbstractConceptDeclaration) this.getReferent(AbstractConceptDeclaration.class, LinkDeclaration.TARGET);
  }

  public void setTarget(AbstractConceptDeclaration node) {
    super.setReferent(LinkDeclaration.TARGET, node);
  }

  public static LinkDeclaration newInstance(SModel sm, boolean init) {
    return (LinkDeclaration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.structure.structure.LinkDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LinkDeclaration newInstance(SModel sm) {
    return LinkDeclaration.newInstance(sm, false);
  }
}
