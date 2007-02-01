package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.baseLanguage.structure.Expression;

public class LinkList_AddChildOperation extends SNodeOperation {
  public static String PARAMETER = "parameter";

  public  LinkList_AddChildOperation(SNode node) {
    super(node);
  }

  public static LinkList_AddChildOperation newInstance(SModel sm) {
    return (LinkList_AddChildOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.LinkList_AddChildOperation", sm, GlobalScope.getInstance()).getAdapter();
  }

  public Expression getParameter() {
    return (Expression)this.getChild(LinkList_AddChildOperation.PARAMETER);
  }
  public void setParameter(Expression node) {
    super.setChild(LinkList_AddChildOperation.PARAMETER, node);
  }
}
