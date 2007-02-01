package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.core.structure.BaseConcept;

public class AggregationConceptLink extends ConceptLink {
  public static String TARGET = "target";

  public  AggregationConceptLink(SNode node) {
    super(node);
  }

  public static AggregationConceptLink newInstance(SModel sm) {
    return (AggregationConceptLink)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.AggregationConceptLink", sm, GlobalScope.getInstance()).getAdapter();
  }

  public BaseConcept getTarget() {
    return (BaseConcept)this.getChild(AggregationConceptLink.TARGET);
  }
  public void setTarget(BaseConcept node) {
    super.setChild(AggregationConceptLink.TARGET, node);
  }
  public AggregationConceptLinkDeclaration getAggregationConceptLinkDeclaration() {
    return (AggregationConceptLinkDeclaration)this.getConceptLinkDeclaration();
  }
  public void setAggregationConceptLinkDeclaration(AggregationConceptLinkDeclaration node) {
    this.setConceptLinkDeclaration(node);
  }
}
