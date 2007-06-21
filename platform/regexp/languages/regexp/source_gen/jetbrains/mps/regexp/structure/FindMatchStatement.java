package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.StatementList;

public class FindMatchStatement extends Statement implements RegexpUsingConstruction {
  public static String EXPR = "expr";
  public static String BODY = "body";
  public static String REGEXP = "regexp";

  public  FindMatchStatement(SNode node) {
    super(node);
  }

  public static FindMatchStatement newInstance(SModel sm, boolean init) {
    return (FindMatchStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.FindMatchStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static FindMatchStatement newInstance(SModel sm) {
    return FindMatchStatement.newInstance(sm, false);
  }

  public Expression getExpr() {
    return (Expression)this.getChild(FindMatchStatement.EXPR);
  }
  public void setExpr(Expression node) {
    super.setChild(FindMatchStatement.EXPR, node);
  }
  public StatementList getBody() {
    return (StatementList)this.getChild(FindMatchStatement.BODY);
  }
  public void setBody(StatementList node) {
    super.setChild(FindMatchStatement.BODY, node);
  }
  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(FindMatchStatement.REGEXP);
  }
  public void setRegexp(RegexpExpression node) {
    super.setChild(FindMatchStatement.REGEXP, node);
  }
}
