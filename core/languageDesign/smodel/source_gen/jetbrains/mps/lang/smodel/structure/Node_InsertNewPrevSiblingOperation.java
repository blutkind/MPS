package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.structure.structure.ConceptDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_InsertNewPrevSiblingOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation";
  public static final String CONCEPT = "concept";

  public Node_InsertNewPrevSiblingOperation(SNode node) {
    super(node);
  }

  public ConceptDeclaration getConcept() {
    return (ConceptDeclaration)this.getReferent(ConceptDeclaration.class, Node_InsertNewPrevSiblingOperation.CONCEPT);
  }

  public void setConcept(ConceptDeclaration node) {
    super.setReferent(Node_InsertNewPrevSiblingOperation.CONCEPT, node);
  }


  public static Node_InsertNewPrevSiblingOperation newInstance(SModel sm, boolean init) {
    return (Node_InsertNewPrevSiblingOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_InsertNewPrevSiblingOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_InsertNewPrevSiblingOperation newInstance(SModel sm) {
    return Node_InsertNewPrevSiblingOperation.newInstance(sm, false);
  }

}
