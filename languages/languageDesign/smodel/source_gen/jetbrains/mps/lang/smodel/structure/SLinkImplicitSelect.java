package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.LinkDeclaration;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SLinkImplicitSelect extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LINK = "link";
  public static final String SMODEL_ATTRIBUTE = "smodelAttribute";

  public SLinkImplicitSelect(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SLinkImplicitSelect.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SLinkImplicitSelect.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SLinkImplicitSelect.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SLinkImplicitSelect.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SLinkImplicitSelect.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SLinkImplicitSelect.VIRTUAL_PACKAGE, value);
  }

  public LinkDeclaration getLink() {
    return (LinkDeclaration) this.getReferent(LinkDeclaration.class, SLinkImplicitSelect.LINK);
  }

  public void setLink(LinkDeclaration node) {
    super.setReferent(SLinkImplicitSelect.LINK, node);
  }

  public int getSmodelAttributesCount() {
    return this.getChildCount(SLinkImplicitSelect.SMODEL_ATTRIBUTE);
  }

  public Iterator<Attribute> smodelAttributes() {
    return this.children(Attribute.class, SLinkImplicitSelect.SMODEL_ATTRIBUTE);
  }

  public List<Attribute> getSmodelAttributes() {
    return this.getChildren(Attribute.class, SLinkImplicitSelect.SMODEL_ATTRIBUTE);
  }

  public void addSmodelAttribute(Attribute node) {
    this.addChild(SLinkImplicitSelect.SMODEL_ATTRIBUTE, node);
  }

  public void insertSmodelAttribute(Attribute prev, Attribute node) {
    this.insertChild(prev, SLinkImplicitSelect.SMODEL_ATTRIBUTE, node);
  }

  public static SLinkImplicitSelect newInstance(SModel sm, boolean init) {
    return (SLinkImplicitSelect) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SLinkImplicitSelect newInstance(SModel sm) {
    return SLinkImplicitSelect.newInstance(sm, false);
  }
}
