package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_GetPrevSiblingsOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingsOperation";

  public  Node_GetPrevSiblingsOperation(SNode node) {
    super(node);
  }

  public static Node_GetPrevSiblingsOperation newInstance(SModel sm, boolean init) {
    return ((Node_GetPrevSiblingsOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingsOperation", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static Node_GetPrevSiblingsOperation newInstance(SModel sm) {
    return Node_GetPrevSiblingsOperation.newInstance(sm, false);
  }

}
