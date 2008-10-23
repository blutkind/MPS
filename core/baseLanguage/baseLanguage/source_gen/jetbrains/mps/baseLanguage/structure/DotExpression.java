package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DotExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.DotExpression";
  public static final String OPERAND = "operand";
  public static final String OPERATION = "operation";

  public DotExpression(SNode node) {
    super(node);
  }

  public Expression getOperand() {
    return (Expression)this.getChild(DotExpression.OPERAND);
  }

  public void setOperand(Expression node) {
    super.setChild(DotExpression.OPERAND, node);
  }

  public IOperation getOperation() {
    return (IOperation)this.getChild(DotExpression.OPERATION);
  }

  public void setOperation(IOperation node) {
    super.setChild(DotExpression.OPERATION, node);
  }


  public static DotExpression newInstance(SModel sm, boolean init) {
    return (DotExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.DotExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DotExpression newInstance(SModel sm) {
    return DotExpression.newInstance(sm, false);
  }

}
