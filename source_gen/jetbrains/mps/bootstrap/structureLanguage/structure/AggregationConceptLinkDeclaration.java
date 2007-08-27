package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AggregationConceptLinkDeclaration extends ConceptLinkDeclaration {

  public  AggregationConceptLinkDeclaration(SNode node) {
    super(node);
  }

  public static AggregationConceptLinkDeclaration newInstance(SModel sm, boolean init) {
    return (AggregationConceptLinkDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.AggregationConceptLinkDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AggregationConceptLinkDeclaration newInstance(SModel sm) {
    return AggregationConceptLinkDeclaration.newInstance(sm, false);
  }

}
