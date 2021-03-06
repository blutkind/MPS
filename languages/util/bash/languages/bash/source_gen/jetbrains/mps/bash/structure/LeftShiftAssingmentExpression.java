package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LeftShiftAssingmentExpression extends BaseAssingmentExpression {
  public static final String concept = "jetbrains.mps.bash.structure.LeftShiftAssingmentExpression";

  public LeftShiftAssingmentExpression(SNode node) {
    super(node);
  }

  public static LeftShiftAssingmentExpression newInstance(SModel sm, boolean init) {
    return (LeftShiftAssingmentExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.LeftShiftAssingmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LeftShiftAssingmentExpression newInstance(SModel sm) {
    return LeftShiftAssingmentExpression.newInstance(sm, false);
  }
}
