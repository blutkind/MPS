package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetNextSiblingsOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingsOperation";

  public  Node_GetNextSiblingsOperation(SNode node) {
    super(node);
  }

  public static Node_GetNextSiblingsOperation newInstance(SModel sm, boolean init) {
    return ((Node_GetNextSiblingsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingsOperation", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static Node_GetNextSiblingsOperation newInstance(SModel sm) {
    return Node_GetNextSiblingsOperation.newInstance(sm, false);
  }

}
