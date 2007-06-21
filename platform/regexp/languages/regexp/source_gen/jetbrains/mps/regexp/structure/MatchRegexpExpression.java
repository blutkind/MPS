package jetbrains.mps.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchRegexpExpression extends Expression implements RegexpUsingConstruction {
  public static String INPUT_EXPRESSION = "inputExpression";
  public static String REGEXP = "regexp";

  public  MatchRegexpExpression(SNode node) {
    super(node);
  }

  public static MatchRegexpExpression newInstance(SModel sm, boolean init) {
    return (MatchRegexpExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.MatchRegexpExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static MatchRegexpExpression newInstance(SModel sm) {
    return MatchRegexpExpression.newInstance(sm, false);
  }

  public Expression getInputExpression() {
    return (Expression)this.getChild(MatchRegexpExpression.INPUT_EXPRESSION);
  }
  public void setInputExpression(Expression node) {
    super.setChild(MatchRegexpExpression.INPUT_EXPRESSION, node);
  }
  public RegexpExpression getRegexp() {
    return (RegexpExpression)this.getChild(MatchRegexpExpression.REGEXP);
  }
  public void setRegexp(RegexpExpression node) {
    super.setChild(MatchRegexpExpression.REGEXP, node);
  }
}
