package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.lang.refactoring.structure.AbstractMoveNodeExpression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MoveNodeToModelExpression extends AbstractMoveNodeExpression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.MoveNodeToModelExpression";

  public MoveNodeToModelExpression(SNode node) {
    super(node);
  }

  public static MoveNodeToModelExpression newInstance(SModel sm, boolean init) {
    return (MoveNodeToModelExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.MoveNodeToModelExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MoveNodeToModelExpression newInstance(SModel sm) {
    return MoveNodeToModelExpression.newInstance(sm, false);
  }

}
