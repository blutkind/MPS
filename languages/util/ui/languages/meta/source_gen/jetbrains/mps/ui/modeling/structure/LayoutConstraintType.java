package jetbrains.mps.ui.modeling.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Type;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LayoutConstraintType extends Type {
  public static final String concept = "jetbrains.mps.ui.modeling.structure.LayoutConstraintType";
  public static final String CONSTRAINT_CONCEPT = "constraintConcept";

  public LayoutConstraintType(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConstraintConcept() {
    return (ConceptDeclaration) this.getReferent(ConceptDeclaration.class, LayoutConstraintType.CONSTRAINT_CONCEPT);
  }

  public void setConstraintConcept(ConceptDeclaration node) {
    super.setReferent(LayoutConstraintType.CONSTRAINT_CONCEPT, node);
  }

  public static LayoutConstraintType newInstance(SModel sm, boolean init) {
    return (LayoutConstraintType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ui.modeling.structure.LayoutConstraintType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LayoutConstraintType newInstance(SModel sm) {
    return LayoutConstraintType.newInstance(sm, false);
  }
}
