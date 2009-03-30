package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PostfixDecrementExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.PostfixDecrementExpression";
  public static final String EXPRESSION = "expression";

  public PostfixDecrementExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(Expression.class, PostfixDecrementExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(PostfixDecrementExpression.EXPRESSION, node);
  }


  public static PostfixDecrementExpression newInstance(SModel sm, boolean init) {
    return (PostfixDecrementExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PostfixDecrementExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PostfixDecrementExpression newInstance(SModel sm) {
    return PostfixDecrementExpression.newInstance(sm, false);
  }

}
