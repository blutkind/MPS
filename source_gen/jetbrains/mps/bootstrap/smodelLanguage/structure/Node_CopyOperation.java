package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class Node_CopyOperation extends SNodeOperation {

  public  Node_CopyOperation(SNode node) {
    super(node);
  }

  public static Node_CopyOperation newInstance(SModel sm) {
    return (Node_CopyOperation)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.Node_CopyOperation", sm, GlobalScope.getInstance()).getAdapter();
  }
}
