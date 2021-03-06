package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePlusPeriodOperation extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimePlusPeriodOperation";
  public static final String LEFT_VALUE = "leftValue";
  public static final String RIGHT_VALUE = "rightValue";

  public DateTimePlusPeriodOperation(SNode node) {
    super(node);
  }

  public Expression getLeftValue() {
    return (Expression) this.getChild(Expression.class, DateTimePlusPeriodOperation.LEFT_VALUE);
  }

  public void setLeftValue(Expression node) {
    super.setChild(DateTimePlusPeriodOperation.LEFT_VALUE, node);
  }

  public Expression getRightValue() {
    return (Expression) this.getChild(Expression.class, DateTimePlusPeriodOperation.RIGHT_VALUE);
  }

  public void setRightValue(Expression node) {
    super.setChild(DateTimePlusPeriodOperation.RIGHT_VALUE, node);
  }

  public static DateTimePlusPeriodOperation newInstance(SModel sm, boolean init) {
    return (DateTimePlusPeriodOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimePlusPeriodOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePlusPeriodOperation newInstance(SModel sm) {
    return DateTimePlusPeriodOperation.newInstance(sm, false);
  }
}
