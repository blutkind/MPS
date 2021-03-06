package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_IsInstanceOfOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation";
  public static final String CONCEPT_ARGUMENT = "conceptArgument";

  public Node_IsInstanceOfOperation(SNode node) {
    super(node);
  }

  public IRefConceptArg getConceptArgument() {
    return (IRefConceptArg) this.getChild(IRefConceptArg.class, Node_IsInstanceOfOperation.CONCEPT_ARGUMENT);
  }

  public void setConceptArgument(IRefConceptArg node) {
    super.setChild(Node_IsInstanceOfOperation.CONCEPT_ARGUMENT, node);
  }

  public static Node_IsInstanceOfOperation newInstance(SModel sm, boolean init) {
    return (Node_IsInstanceOfOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_IsInstanceOfOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_IsInstanceOfOperation newInstance(SModel sm) {
    return Node_IsInstanceOfOperation.newInstance(sm, false);
  }
}
