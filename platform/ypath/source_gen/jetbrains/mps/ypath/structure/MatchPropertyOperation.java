package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MatchPropertyOperation extends MatchKindOperation {
  public static final String concept = "jetbrains.mps.ypath.structure.MatchPropertyOperation";
  public static final String PROPERTY = "property";
  public static final String MATCH_EXPRESSION = "matchExpression";

  public MatchPropertyOperation(SNode node) {
    super(node);
  }

  public TreeNodeKindProperty getProperty() {
    return (TreeNodeKindProperty)this.getReferent(TreeNodeKindProperty.class, MatchPropertyOperation.PROPERTY);
  }

  public void setProperty(TreeNodeKindProperty node) {
    super.setReferent(MatchPropertyOperation.PROPERTY, node);
  }

  public Expression getMatchExpression() {
    return (Expression)this.getChild(Expression.class, MatchPropertyOperation.MATCH_EXPRESSION);
  }

  public void setMatchExpression(Expression node) {
    super.setChild(MatchPropertyOperation.MATCH_EXPRESSION, node);
  }


  public static MatchPropertyOperation newInstance(SModel sm, boolean init) {
    return (MatchPropertyOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.MatchPropertyOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MatchPropertyOperation newInstance(SModel sm) {
    return MatchPropertyOperation.newInstance(sm, false);
  }

}
