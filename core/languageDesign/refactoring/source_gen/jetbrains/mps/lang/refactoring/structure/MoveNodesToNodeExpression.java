package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.lang.refactoring.structure.AbstractMoveNodesExpression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MoveNodesToNodeExpression extends AbstractMoveNodesExpression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.MoveNodesToNodeExpression";
  public static final String ROLE_IN_TARGET = "roleInTarget";

  public MoveNodesToNodeExpression(SNode node) {
    super(node);
  }

  public Expression getRoleInTarget() {
    return (Expression)this.getChild(Expression.class, MoveNodesToNodeExpression.ROLE_IN_TARGET);
  }

  public void setRoleInTarget(Expression node) {
    super.setChild(MoveNodesToNodeExpression.ROLE_IN_TARGET, node);
  }


  public static MoveNodesToNodeExpression newInstance(SModel sm, boolean init) {
    return (MoveNodesToNodeExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.MoveNodesToNodeExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MoveNodesToNodeExpression newInstance(SModel sm) {
    return MoveNodesToNodeExpression.newInstance(sm, false);
  }

}
