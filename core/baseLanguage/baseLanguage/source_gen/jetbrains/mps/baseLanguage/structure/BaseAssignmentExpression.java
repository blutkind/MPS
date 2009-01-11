package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseAssignmentExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression";
  public static final String L_VALUE = "lValue";
  public static final String R_VALUE = "rValue";

  public BaseAssignmentExpression(SNode node) {
    super(node);
  }

  public Expression getLValue() {
    return (Expression)this.getChild(Expression.class, BaseAssignmentExpression.L_VALUE);
  }

  public void setLValue(Expression node) {
    super.setChild(BaseAssignmentExpression.L_VALUE, node);
  }

  public Expression getRValue() {
    return (Expression)this.getChild(Expression.class, BaseAssignmentExpression.R_VALUE);
  }

  public void setRValue(Expression node) {
    super.setChild(BaseAssignmentExpression.R_VALUE, node);
  }


  public static BaseAssignmentExpression newInstance(SModel sm, boolean init) {
    return (BaseAssignmentExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BaseAssignmentExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseAssignmentExpression newInstance(SModel sm) {
    return BaseAssignmentExpression.newInstance(sm, false);
  }

}
