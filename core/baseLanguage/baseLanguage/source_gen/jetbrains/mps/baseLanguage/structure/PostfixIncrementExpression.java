package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PostfixIncrementExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression";
  public static final String EXPRESSION = "expression";

  public PostfixIncrementExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(Expression.class, PostfixIncrementExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(PostfixIncrementExpression.EXPRESSION, node);
  }


  public static PostfixIncrementExpression newInstance(SModel sm, boolean init) {
    return (PostfixIncrementExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PostfixIncrementExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PostfixIncrementExpression newInstance(SModel sm) {
    return PostfixIncrementExpression.newInstance(sm, false);
  }

}
