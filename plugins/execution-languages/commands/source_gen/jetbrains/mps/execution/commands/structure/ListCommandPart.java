package jetbrains.mps.execution.commands.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListCommandPart extends ProcessBuilderCommandPart {
  public static final String concept = "jetbrains.mps.execution.commands.structure.ListCommandPart";
  public static final String LIST = "list";
  public static final String SEPARATOR = "separator";
  public static final String ITEMS = "items";

  public ListCommandPart(SNode node) {
    super(node);
  }

  public Expression getList() {
    return (Expression) this.getChild(Expression.class, ListCommandPart.LIST);
  }

  public void setList(Expression node) {
    super.setChild(ListCommandPart.LIST, node);
  }

  public Expression getSeparator() {
    return (Expression) this.getChild(Expression.class, ListCommandPart.SEPARATOR);
  }

  public void setSeparator(Expression node) {
    super.setChild(ListCommandPart.SEPARATOR, node);
  }

  public int getItemsesCount() {
    return this.getChildCount(ListCommandPart.ITEMS);
  }

  public Iterator<Expression> itemses() {
    return this.children(Expression.class, ListCommandPart.ITEMS);
  }

  public List<Expression> getItemses() {
    return this.getChildren(Expression.class, ListCommandPart.ITEMS);
  }

  public void addItems(Expression node) {
    this.addChild(ListCommandPart.ITEMS, node);
  }

  public void insertItems(Expression prev, Expression node) {
    this.insertChild(prev, ListCommandPart.ITEMS, node);
  }

  public static ListCommandPart newInstance(SModel sm, boolean init) {
    return (ListCommandPart) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.execution.commands.structure.ListCommandPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListCommandPart newInstance(SModel sm) {
    return ListCommandPart.newInstance(sm, false);
  }
}
