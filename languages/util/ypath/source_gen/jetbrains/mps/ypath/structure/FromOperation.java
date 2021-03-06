package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FromOperation extends TreePathOperation {
  public static final String concept = "jetbrains.mps.ypath.structure.FromOperation";
  public static final String FROM_EXPRESSION = "fromExpression";

  public FromOperation(SNode node) {
    super(node);
  }

  public Expression getFromExpression() {
    return (Expression) this.getChild(Expression.class, FromOperation.FROM_EXPRESSION);
  }

  public void setFromExpression(Expression node) {
    super.setChild(FromOperation.FROM_EXPRESSION, node);
  }

  public static FromOperation newInstance(SModel sm, boolean init) {
    return (FromOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.FromOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FromOperation newInstance(SModel sm) {
    return FromOperation.newInstance(sm, false);
  }
}
