package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class Link_DeleteChildOperation extends SNodeOperation {

  public  Link_DeleteChildOperation(SNode node) {
    super(node);
  }

  public static Link_DeleteChildOperation newInstance(SModel sm) {
    return (Link_DeleteChildOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Link_DeleteChildOperation", sm, GlobalScope.getInstance()).getAdapter();
  }
}
