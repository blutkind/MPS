package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class AbstractEquationStatement extends Statement {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.AbstractEquationStatement";
  public static String CHECK_ONLY = "checkOnly";
  public static String LEFT_EXPRESSION = "leftExpression";
  public static String RIGHT_EXPRESSION = "rightExpression";
  public static String NODE_TO_CHECK = "nodeToCheck";
  public static String ERROR_STRING = "errorString";

  public  AbstractEquationStatement(SNode node) {
    super(node);
  }

  public static AbstractEquationStatement newInstance(SModel sm, boolean init) {
    return (AbstractEquationStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.AbstractEquationStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AbstractEquationStatement newInstance(SModel sm) {
    return AbstractEquationStatement.newInstance(sm, false);
  }


  public boolean getCheckOnly() {
    return this.getBooleanProperty(AbstractEquationStatement.CHECK_ONLY);
  }

  public void setCheckOnly(boolean value) {
    this.setBooleanProperty(AbstractEquationStatement.CHECK_ONLY, value);
  }

  public TypeClause getLeftExpression() {
    return (TypeClause)this.getChild(AbstractEquationStatement.LEFT_EXPRESSION);
  }

  public void setLeftExpression(TypeClause node) {
    super.setChild(AbstractEquationStatement.LEFT_EXPRESSION, node);
  }

  public TypeClause getRightExpression() {
    return (TypeClause)this.getChild(AbstractEquationStatement.RIGHT_EXPRESSION);
  }

  public void setRightExpression(TypeClause node) {
    super.setChild(AbstractEquationStatement.RIGHT_EXPRESSION, node);
  }

  public Expression getNodeToCheck() {
    return (Expression)this.getChild(AbstractEquationStatement.NODE_TO_CHECK);
  }

  public void setNodeToCheck(Expression node) {
    super.setChild(AbstractEquationStatement.NODE_TO_CHECK, node);
  }

  public Expression getErrorString() {
    return (Expression)this.getChild(AbstractEquationStatement.ERROR_STRING);
  }

  public void setErrorString(Expression node) {
    super.setChild(AbstractEquationStatement.ERROR_STRING, node);
  }

}
