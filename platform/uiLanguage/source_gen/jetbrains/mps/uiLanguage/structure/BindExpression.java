package jetbrains.mps.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.smodel.SNode;

public class BindExpression extends Expression {
  public static final String concept = "jetbrains.mps.uiLanguage.structure.BindExpression";
  public static String EXPRESSION = "expression";

  public BindExpression(SNode node) {
    super(node);
  }

  public static BindExpression newInstance(SModel sm, boolean init) {
    return (BindExpression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.uiLanguage.structure.BindExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BindExpression newInstance(SModel sm) {
    return BindExpression.newInstance(sm, false);
  }


  public Expression getExpression() {
    return (Expression) this.getChild(BindExpression.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(BindExpression.EXPRESSION, node);
  }

}
