package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BinaryOperation extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.BinaryOperation";
  public static final String CPR_Priority = "priority";
  public static final String RIGHT_EXPRESSION = "rightExpression";
  public static final String LEFT_EXPRESSION = "leftExpression";

  public BinaryOperation(SNode node) {
    super(node);
  }

  public Expression getRightExpression() {
    return (Expression)this.getChild(BinaryOperation.RIGHT_EXPRESSION);
  }

  public void setRightExpression(Expression node) {
    super.setChild(BinaryOperation.RIGHT_EXPRESSION, node);
  }

  public Expression getLeftExpression() {
    return (Expression)this.getChild(BinaryOperation.LEFT_EXPRESSION);
  }

  public void setLeftExpression(Expression node) {
    super.setChild(BinaryOperation.LEFT_EXPRESSION, node);
  }


  public static BinaryOperation newInstance(SModel sm, boolean init) {
    return (BinaryOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.BinaryOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BinaryOperation newInstance(SModel sm) {
    return BinaryOperation.newInstance(sm, false);
  }

}
