package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.structure.StatementList;

public class CoerceStatement extends Statement {
  public static String PATTERN = "pattern";
  public static String NODE_TO_COERCE = "nodeToCoerce";
  public static String BODY = "body";

  public  CoerceStatement(SNode node) {
    super(node);
  }

  public static CoerceStatement newInstance(SModel sm, boolean init) {
    return (CoerceStatement)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.CoerceStatement", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static CoerceStatement newInstance(SModel sm) {
    return CoerceStatement.newInstance(sm, false);
  }

  public ApplicableNodeCondition getPattern() {
    return (ApplicableNodeCondition)this.getChild(CoerceStatement.PATTERN);
  }
  public void setPattern(ApplicableNodeCondition node) {
    super.setChild(CoerceStatement.PATTERN, node);
  }
  public Expression getNodeToCoerce() {
    return (Expression)this.getChild(CoerceStatement.NODE_TO_COERCE);
  }
  public void setNodeToCoerce(Expression node) {
    super.setChild(CoerceStatement.NODE_TO_COERCE, node);
  }
  public StatementList getBody() {
    return (StatementList)this.getChild(CoerceStatement.BODY);
  }
  public void setBody(StatementList node) {
    super.setChild(CoerceStatement.BODY, node);
  }
}
