package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BinaryOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class EqualsStructurallyExpression extends BinaryOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.EqualsStructurallyExpression";

  public EqualsStructurallyExpression(SNode node) {
    super(node);
  }

  public static EqualsStructurallyExpression newInstance(SModel sm, boolean init) {
    return (EqualsStructurallyExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.EqualsStructurallyExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static EqualsStructurallyExpression newInstance(SModel sm) {
    return EqualsStructurallyExpression.newInstance(sm, false);
  }
}
