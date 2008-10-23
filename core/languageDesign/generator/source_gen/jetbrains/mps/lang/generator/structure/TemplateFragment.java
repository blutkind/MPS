package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateFragment extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateFragment";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String LABEL_DECLARATION = "labelDeclaration";
  public static final String CONTEXT_NODE_QUERY = "contextNodeQuery";

  public TemplateFragment(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(TemplateFragment.NAME);
  }

  public void setName(String value) {
    this.setProperty(TemplateFragment.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TemplateFragment.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TemplateFragment.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TemplateFragment.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TemplateFragment.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TemplateFragment.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TemplateFragment.VIRTUAL_PACKAGE, value);
  }

  public MappingLabelDeclaration getLabelDeclaration() {
    return (MappingLabelDeclaration)this.getReferent(TemplateFragment.LABEL_DECLARATION);
  }

  public void setLabelDeclaration(MappingLabelDeclaration node) {
    super.setReferent(TemplateFragment.LABEL_DECLARATION, node);
  }

  public TemplateFragment_ContextNodeQuery getContextNodeQuery() {
    return (TemplateFragment_ContextNodeQuery)this.getChild(TemplateFragment.CONTEXT_NODE_QUERY);
  }

  public void setContextNodeQuery(TemplateFragment_ContextNodeQuery node) {
    super.setChild(TemplateFragment.CONTEXT_NODE_QUERY, node);
  }


  public static TemplateFragment newInstance(SModel sm, boolean init) {
    return (TemplateFragment)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.generator.structure.TemplateFragment", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TemplateFragment newInstance(SModel sm) {
    return TemplateFragment.newInstance(sm, false);
  }

}
