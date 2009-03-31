package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpUsingConstruction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.regexp.structure.RegexpExpression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SplitExpression extends Expression implements RegexpUsingConstruction {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.SplitExpression";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPR = "expr";
  public static final String REGEXP = "regexp";

  public SplitExpression(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(SplitExpression.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(SplitExpression.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(SplitExpression.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(SplitExpression.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(SplitExpression.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(SplitExpression.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpr() {
    return (Expression)this.getChild(Expression.class, SplitExpression.EXPR);
  }

  public void setExpr(Expression node) {
    super.setChild(SplitExpression.EXPR, node);
  }

  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(RegexpExpression.class, SplitExpression.REGEXP);
  }

  public void setRegexp(RegexpExpression node) {
    super.setChild(SplitExpression.REGEXP, node);
  }


  public static SplitExpression newInstance(SModel sm, boolean init) {
    return (SplitExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.SplitExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SplitExpression newInstance(SModel sm) {
    return SplitExpression.newInstance(sm, false);
  }

}
