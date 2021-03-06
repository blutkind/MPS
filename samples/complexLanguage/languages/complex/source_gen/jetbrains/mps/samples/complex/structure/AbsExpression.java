package jetbrains.mps.samples.complex.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AbsExpression extends SingleComplexExpression {
  public static final String concept = "jetbrains.mps.samples.complex.structure.AbsExpression";

  public AbsExpression(SNode node) {
    super(node);
  }

  public static AbsExpression newInstance(SModel sm, boolean init) {
    return (AbsExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.complex.structure.AbsExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbsExpression newInstance(SModel sm) {
    return AbsExpression.newInstance(sm, false);
  }
}
