package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class Node_GetPrevSiblingsOperation extends SNodeOperation {

  public  Node_GetPrevSiblingsOperation(SNode node) {
    super(node);
  }

  public static Node_GetPrevSiblingsOperation newInstance(SModel sm) {
    return (Node_GetPrevSiblingsOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_GetPrevSiblingsOperation", sm, GlobalScope.getInstance()).getAdapter();
  }
}
