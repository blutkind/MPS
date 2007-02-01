package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;

public class NodeDefaultSearchScope extends BaseConcept {
  public static String DESCRIPTION = "description";
  public static String SEARCH_SCOPE_CAN_CREATE = "searchScopeCanCreate";
  public static String SEARCH_SCOPE_FACTORY = "searchScopeFactory";
  public static String REFERENT_CONCEPT = "referentConcept";

  public  NodeDefaultSearchScope(SNode node) {
    super(node);
  }

  public static NodeDefaultSearchScope newInstance(SModel sm) {
    return (NodeDefaultSearchScope)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.NodeDefaultSearchScope", sm, GlobalScope.getInstance()).getAdapter();
  }

  public String getDescription() {
    return this.getProperty(NodeDefaultSearchScope.DESCRIPTION);
  }
  public void setDescription(String value) {
    this.setProperty(NodeDefaultSearchScope.DESCRIPTION, value);
  }
  public ConstraintFunction_ReferentSearchScope_CanCreate getSearchScopeCanCreate() {
    return (ConstraintFunction_ReferentSearchScope_CanCreate)this.getChild(NodeDefaultSearchScope.SEARCH_SCOPE_CAN_CREATE);
  }
  public void setSearchScopeCanCreate(ConstraintFunction_ReferentSearchScope_CanCreate node) {
    super.setChild(NodeDefaultSearchScope.SEARCH_SCOPE_CAN_CREATE, node);
  }
  public ConstraintFunction_ReferentSearchScope_Factory getSearchScopeFactory() {
    return (ConstraintFunction_ReferentSearchScope_Factory)this.getChild(NodeDefaultSearchScope.SEARCH_SCOPE_FACTORY);
  }
  public void setSearchScopeFactory(ConstraintFunction_ReferentSearchScope_Factory node) {
    super.setChild(NodeDefaultSearchScope.SEARCH_SCOPE_FACTORY, node);
  }
  public ConceptDeclaration getReferentConcept() {
    return (ConceptDeclaration)this.getReferent(NodeDefaultSearchScope.REFERENT_CONCEPT);
  }
  public void setReferentConcept(ConceptDeclaration node) {
    super.setReferent(NodeDefaultSearchScope.REFERENT_CONCEPT, node);
  }
}
