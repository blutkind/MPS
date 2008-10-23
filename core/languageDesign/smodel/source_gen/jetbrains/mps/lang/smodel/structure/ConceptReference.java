package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.ConceptReference";
  public static final String CONCEPT = "concept";

  public ConceptReference(SNode node) {
    super(node);
  }

  public AbstractConceptDeclaration getConcept() {
    return (AbstractConceptDeclaration)this.getReferent(ConceptReference.CONCEPT);
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(ConceptReference.CONCEPT, node);
  }


  public static ConceptReference newInstance(SModel sm, boolean init) {
    return (ConceptReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.ConceptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptReference newInstance(SModel sm) {
    return ConceptReference.newInstance(sm, false);
  }

}
