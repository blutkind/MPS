package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class ReturnStatement extends Statement {
  public static String EXPRESSION = "expression";

  public  ReturnStatement(SNode node) {
    super(node);
  }

  public static ReturnStatement newInstance(SModel sm) {
    return (ReturnStatement)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ReturnStatement", sm, GlobalScope.getInstance()).getAdapter();
  }

  public Expression getExpression() {
    return (Expression)this.getChild(ReturnStatement.EXPRESSION);
  }
  public void setExpression(Expression node) {
    super.setChild(ReturnStatement.EXPRESSION, node);
  }
}
