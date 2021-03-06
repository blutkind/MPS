package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TreePathAdapterExpression extends Expression {
  public static final String concept = "jetbrains.mps.ypath.structure.TreePathAdapterExpression";
  public static final String TREEPATH_ASPECT = "treepathAspect";
  public static final String EXPRESSION = "expression";

  public TreePathAdapterExpression(SNode node) {
    super(node);
  }

  public TreePathAspect getTreepathAspect() {
    return (TreePathAspect) this.getReferent(TreePathAspect.class, TreePathAdapterExpression.TREEPATH_ASPECT);
  }

  public void setTreepathAspect(TreePathAspect node) {
    super.setReferent(TreePathAdapterExpression.TREEPATH_ASPECT, node);
  }

  public Expression getExpression() {
    return (Expression) this.getChild(Expression.class, TreePathAdapterExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(TreePathAdapterExpression.EXPRESSION, node);
  }

  public static TreePathAdapterExpression newInstance(SModel sm, boolean init) {
    return (TreePathAdapterExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TreePathAdapterExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TreePathAdapterExpression newInstance(SModel sm) {
    return TreePathAdapterExpression.newInstance(sm, false);
  }
}
