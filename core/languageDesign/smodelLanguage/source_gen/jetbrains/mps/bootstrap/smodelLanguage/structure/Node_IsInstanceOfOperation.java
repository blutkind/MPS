package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.AbstractConceptDeclaration;

public class Node_IsInstanceOfOperation extends SNodeOperation {
  public static final String concept = "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation";
  public static String CONCEPT_ARGUMENT = "conceptArgument";
  public static String CONCEPT = "concept";

  public  Node_IsInstanceOfOperation(SNode node) {
    super(node);
  }

  public static Node_IsInstanceOfOperation newInstance(SModel sm, boolean init) {
    return ((Node_IsInstanceOfOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static Node_IsInstanceOfOperation newInstance(SModel sm) {
    return Node_IsInstanceOfOperation.newInstance(sm, false);
  }


  public RefConcept_Abstract getConceptArgument() {
    return ((RefConcept_Abstract)this.getChild(Node_IsInstanceOfOperation.CONCEPT_ARGUMENT));
  }

  public void setConceptArgument(RefConcept_Abstract node) {
    super.setChild(Node_IsInstanceOfOperation.CONCEPT_ARGUMENT, node);
  }

  public AbstractConceptDeclaration getConcept() {
    return ((AbstractConceptDeclaration)this.getReferent(Node_IsInstanceOfOperation.CONCEPT));
  }

  public void setConcept(AbstractConceptDeclaration node) {
    super.setReferent(Node_IsInstanceOfOperation.CONCEPT, node);
  }

}
