package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_IsNullOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_IsNullOperation";

  public Node_IsNullOperation(SNode node) {
    super(node);
  }

  public static Node_IsNullOperation newInstance(SModel sm, boolean init) {
    return (Node_IsNullOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_IsNullOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_IsNullOperation newInstance(SModel sm) {
    return Node_IsNullOperation.newInstance(sm, false);
  }

}
