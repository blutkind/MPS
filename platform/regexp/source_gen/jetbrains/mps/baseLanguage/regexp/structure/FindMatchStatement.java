package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FindMatchStatement extends Statement implements RegexpUsingConstruction {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.FindMatchStatement";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPR = "expr";
  public static final String BODY = "body";
  public static final String REGEXP = "regexp";

  public FindMatchStatement(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(FindMatchStatement.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(FindMatchStatement.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(FindMatchStatement.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(FindMatchStatement.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(FindMatchStatement.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(FindMatchStatement.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpr() {
    return (Expression)this.getChild(Expression.class, FindMatchStatement.EXPR);
  }

  public void setExpr(Expression node) {
    super.setChild(FindMatchStatement.EXPR, node);
  }

  public StatementList getBody() {
    return (StatementList)this.getChild(StatementList.class, FindMatchStatement.BODY);
  }

  public void setBody(StatementList node) {
    super.setChild(FindMatchStatement.BODY, node);
  }

  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(RegexpExpression.class, FindMatchStatement.REGEXP);
  }

  public void setRegexp(RegexpExpression node) {
    super.setChild(FindMatchStatement.REGEXP, node);
  }


  public static FindMatchStatement newInstance(SModel sm, boolean init) {
    return (FindMatchStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.FindMatchStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FindMatchStatement newInstance(SModel sm) {
    return FindMatchStatement.newInstance(sm, false);
  }

}
