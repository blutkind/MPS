package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class PageOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.PageOperation";
  public static String FROM_ELEMENT = "fromElement";
  public static String TO_ELEMENT = "toElement";

  public  PageOperation(SNode node) {
    super(node);
  }

  public static PageOperation newInstance(SModel sm, boolean init) {
    return (PageOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.PageOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PageOperation newInstance(SModel sm) {
    return PageOperation.newInstance(sm, false);
  }


  public Expression getFromElement() {
    return (Expression)this.getChild(PageOperation.FROM_ELEMENT);
  }

  public void setFromElement(Expression node) {
    super.setChild(PageOperation.FROM_ELEMENT, node);
  }

  public Expression getToElement() {
    return (Expression)this.getChild(PageOperation.TO_ELEMENT);
  }

  public void setToElement(Expression node) {
    super.setChild(PageOperation.TO_ELEMENT, node);
  }

}
