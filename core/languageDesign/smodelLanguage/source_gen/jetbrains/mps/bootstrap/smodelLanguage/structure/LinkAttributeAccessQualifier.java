package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration;

public class LinkAttributeAccessQualifier extends BaseConcept implements IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier";
  public static String LINK_QUALIFIER = "linkQualifier";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";
  public static String ANNOTATION_LINK = "annotationLink";

  public  LinkAttributeAccessQualifier(SNode node) {
    super(node);
  }

  public static LinkAttributeAccessQualifier newInstance(SModel sm, boolean init) {
    return ((LinkAttributeAccessQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.LinkAttributeAccessQualifier", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static LinkAttributeAccessQualifier newInstance(SModel sm) {
    return LinkAttributeAccessQualifier.newInstance(sm, false);
  }


  public ILinkAccessQualifier getLinkQualifier() {
    return ((ILinkAccessQualifier)this.getChild(LinkAttributeAccessQualifier.LINK_QUALIFIER));
  }

  public void setLinkQualifier(ILinkAccessQualifier node) {
    super.setChild(LinkAttributeAccessQualifier.LINK_QUALIFIER, node);
  }

  public String getShortDescription() {
    return this.getProperty(LinkAttributeAccessQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(LinkAttributeAccessQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(LinkAttributeAccessQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(LinkAttributeAccessQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(LinkAttributeAccessQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(LinkAttributeAccessQualifier.VIRTUAL_PACKAGE, value);
  }

  public AnnotationLinkDeclaration getAnnotationLink() {
    return ((AnnotationLinkDeclaration)this.getReferent(LinkAttributeAccessQualifier.ANNOTATION_LINK));
  }

  public void setAnnotationLink(AnnotationLinkDeclaration node) {
    super.setReferent(LinkAttributeAccessQualifier.ANNOTATION_LINK, node);
  }

}
