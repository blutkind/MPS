package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AnnotationLinkDeclaration;

public class NodeAttributeAccessQualifier extends BaseConcept implements IAttributeAccessQualifier {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.NodeAttributeAccessQualifier";
  public static String ANNOTATION_LINK = "annotationLink";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public  NodeAttributeAccessQualifier(SNode node) {
    super(node);
  }

  public static NodeAttributeAccessQualifier newInstance(SModel sm, boolean init) {
    return (NodeAttributeAccessQualifier)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.NodeAttributeAccessQualifier", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeAttributeAccessQualifier newInstance(SModel sm) {
    return NodeAttributeAccessQualifier.newInstance(sm, false);
  }


  public AnnotationLinkDeclaration getAnnotationLink() {
    return (AnnotationLinkDeclaration)this.getReferent(NodeAttributeAccessQualifier.ANNOTATION_LINK);
  }

  public void setAnnotationLink(AnnotationLinkDeclaration node) {
    super.setReferent(NodeAttributeAccessQualifier.ANNOTATION_LINK, node);
  }

  public String getShortDescription() {
    return this.getProperty(NodeAttributeAccessQualifier.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(NodeAttributeAccessQualifier.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(NodeAttributeAccessQualifier.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(NodeAttributeAccessQualifier.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(NodeAttributeAccessQualifier.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(NodeAttributeAccessQualifier.VIRTUAL_PACKAGE, value);
  }

}
