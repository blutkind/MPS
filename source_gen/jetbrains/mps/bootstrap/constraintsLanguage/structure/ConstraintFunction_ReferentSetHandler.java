package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ConstraintFunction_ReferentSetHandler extends ConceptFunction {

  public  ConstraintFunction_ReferentSetHandler(SNode node) {
    super(node);
  }

  public static ConstraintFunction_ReferentSetHandler newInstance(SModel sm) {
    return (ConstraintFunction_ReferentSetHandler)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConstraintFunction_ReferentSetHandler", sm, GlobalScope.getInstance()).getAdapter();
  }
}
