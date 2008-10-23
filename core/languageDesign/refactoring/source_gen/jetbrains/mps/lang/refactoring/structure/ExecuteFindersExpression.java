package jetbrains.mps.lang.refactoring.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ExecuteFindersExpression extends Expression {
  public static final String concept = "jetbrains.mps.lang.refactoring.structure.ExecuteFindersExpression";
  public static final String SEARCH_NODE = "searchNode";
  public static final String SEARCH_SCOPE = "searchScope";
  public static final String FINDERS = "finders";

  public ExecuteFindersExpression(SNode node) {
    super(node);
  }

  public Expression getSearchNode() {
    return (Expression)this.getChild(ExecuteFindersExpression.SEARCH_NODE);
  }

  public void setSearchNode(Expression node) {
    super.setChild(ExecuteFindersExpression.SEARCH_NODE, node);
  }

  public Expression getSearchScope() {
    return (Expression)this.getChild(ExecuteFindersExpression.SEARCH_SCOPE);
  }

  public void setSearchScope(Expression node) {
    super.setChild(ExecuteFindersExpression.SEARCH_SCOPE, node);
  }

  public int getFindersesCount() {
    return this.getChildCount(ExecuteFindersExpression.FINDERS);
  }

  public Iterator<FinderReference> finderses() {
    return this.children(ExecuteFindersExpression.FINDERS);
  }

  public List<FinderReference> getFinderses() {
    return this.getChildren(ExecuteFindersExpression.FINDERS);
  }

  public void addFinders(FinderReference node) {
    this.addChild(ExecuteFindersExpression.FINDERS, node);
  }

  public void insertFinders(FinderReference prev, FinderReference node) {
    this.insertChild(prev, ExecuteFindersExpression.FINDERS, node);
  }


  public static ExecuteFindersExpression newInstance(SModel sm, boolean init) {
    return (ExecuteFindersExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.refactoring.structure.ExecuteFindersExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ExecuteFindersExpression newInstance(SModel sm) {
    return ExecuteFindersExpression.newInstance(sm, false);
  }

}
