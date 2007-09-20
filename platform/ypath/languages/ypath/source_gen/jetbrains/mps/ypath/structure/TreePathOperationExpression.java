package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TreePathOperationExpression extends Expression {
  public static final String concept = "jetbrains.mps.ypath.structure.TreePathOperationExpression";
  public static String EXPRESSION = "expression";
  public static String OPERATION = "operation";

  public  TreePathOperationExpression(SNode node) {
    super(node);
  }

  public static TreePathOperationExpression newInstance(SModel sm, boolean init) {
    return (TreePathOperationExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathOperationExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreePathOperationExpression newInstance(SModel sm) {
    return TreePathOperationExpression.newInstance(sm, false);
  }


  public Expression getExpression() {
    return (Expression)this.getChild(TreePathOperationExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(TreePathOperationExpression.EXPRESSION, node);
  }

  public TreePathOperation getOperation() {
    return (TreePathOperation)this.getChild(TreePathOperationExpression.OPERATION);
  }

  public void setOperation(TreePathOperation node) {
    super.setChild(TreePathOperationExpression.OPERATION, node);
  }

}
