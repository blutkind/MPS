package jetbrains.mps.bash.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReadTestConditionalExpression extends UnaryConditionalExpression {
  public static final String concept = "jetbrains.mps.bash.structure.ReadTestConditionalExpression";

  public ReadTestConditionalExpression(SNode node) {
    super(node);
  }

  public static ReadTestConditionalExpression newInstance(SModel sm, boolean init) {
    return (ReadTestConditionalExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bash.structure.ReadTestConditionalExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReadTestConditionalExpression newInstance(SModel sm) {
    return ReadTestConditionalExpression.newInstance(sm, false);
  }
}
