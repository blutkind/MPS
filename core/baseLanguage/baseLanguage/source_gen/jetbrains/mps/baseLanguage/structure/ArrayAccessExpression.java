package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ArrayAccessExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ArrayAccessExpression";
  public static final String ARRAY = "array";
  public static final String INDEX = "index";

  public ArrayAccessExpression(SNode node) {
    super(node);
  }

  public Expression getArray() {
    return (Expression)this.getChild(Expression.class, ArrayAccessExpression.ARRAY);
  }

  public void setArray(Expression node) {
    super.setChild(ArrayAccessExpression.ARRAY, node);
  }

  public Expression getIndex() {
    return (Expression)this.getChild(Expression.class, ArrayAccessExpression.INDEX);
  }

  public void setIndex(Expression node) {
    super.setChild(ArrayAccessExpression.INDEX, node);
  }


  public static ArrayAccessExpression newInstance(SModel sm, boolean init) {
    return (ArrayAccessExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ArrayAccessExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ArrayAccessExpression newInstance(SModel sm) {
    return ArrayAccessExpression.newInstance(sm, false);
  }

}
