package jetbrains.mps.ide.uiLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ReportErrorExpression extends Expression {
  public static final String concept = "jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression";
  public static final String ERROR_TEXT = "errorText";

  public ReportErrorExpression(SNode node) {
    super(node);
  }

  public Expression getErrorText() {
    return (Expression)this.getChild(Expression.class, ReportErrorExpression.ERROR_TEXT);
  }

  public void setErrorText(Expression node) {
    super.setChild(ReportErrorExpression.ERROR_TEXT, node);
  }


  public static ReportErrorExpression newInstance(SModel sm, boolean init) {
    return (ReportErrorExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ide.uiLanguage.structure.ReportErrorExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ReportErrorExpression newInstance(SModel sm) {
    return ReportErrorExpression.newInstance(sm, false);
  }

}
