package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TemplateFragment extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.generator.structure.TemplateFragment";
  public static final String LABEL_DECLARATION = "labelDeclaration";
  public static final String CONTEXT_NODE_QUERY = "contextNodeQuery";

  public TemplateFragment(SNode node) {
    super(node);
  }

  public MappingLabelDeclaration getLabelDeclaration() {
    return (MappingLabelDeclaration)this.getReferent(MappingLabelDeclaration.class, TemplateFragment.LABEL_DECLARATION);
  }

  public void setLabelDeclaration(MappingLabelDeclaration node) {
    super.setReferent(TemplateFragment.LABEL_DECLARATION, node);
  }

  public TemplateFragment_ContextNodeQuery getContextNodeQuery() {
    return (TemplateFragment_ContextNodeQuery)this.getChild(TemplateFragment_ContextNodeQuery.class, TemplateFragment.CONTEXT_NODE_QUERY);
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
