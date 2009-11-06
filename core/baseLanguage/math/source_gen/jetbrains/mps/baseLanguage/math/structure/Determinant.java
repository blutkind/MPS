package jetbrains.mps.baseLanguage.math.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Determinant extends MathFuncExpression {
  public static final String concept = "jetbrains.mps.baseLanguage.math.structure.Determinant";

  public Determinant(SNode node) {
    super(node);
  }

  public static Determinant newInstance(SModel sm, boolean init) {
    return (Determinant)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.math.structure.Determinant", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Determinant newInstance(SModel sm) {
    return Determinant.newInstance(sm, false);
  }
}
