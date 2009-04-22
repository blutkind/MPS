package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NotExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.NotExpression";
  public static final String EXPRESSION = "expression";

  public NotExpression(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(Expression.class, NotExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(NotExpression.EXPRESSION, node);
  }


  public static NotExpression newInstance(SModel sm, boolean init) {
    return (NotExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NotExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NotExpression newInstance(SModel sm) {
    return NotExpression.newInstance(sm, false);
  }

}
