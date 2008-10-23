package jetbrains.mps.lang.smodel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.constraints.structure.ConceptMethodDeclaration;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.structure.Expression;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Node_ConceptMethodCall extends SNodeOperation {
  public static final String concept = "jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall";
  public static final String CONCEPT_METHOD_DECLARATION = "conceptMethodDeclaration";
  public static final String ACTUAL_ARGUMENT = "actualArgument";

  public Node_ConceptMethodCall(SNode node) {
    super(node);
  }

  public ConceptMethodDeclaration getConceptMethodDeclaration() {
    return (ConceptMethodDeclaration)this.getReferent(Node_ConceptMethodCall.CONCEPT_METHOD_DECLARATION);
  }

  public void setConceptMethodDeclaration(ConceptMethodDeclaration node) {
    super.setReferent(Node_ConceptMethodCall.CONCEPT_METHOD_DECLARATION, node);
  }

  public int getActualArgumentsCount() {
    return this.getChildCount(Node_ConceptMethodCall.ACTUAL_ARGUMENT);
  }

  public Iterator<Expression> actualArguments() {
    return this.children(Node_ConceptMethodCall.ACTUAL_ARGUMENT);
  }

  public List<Expression> getActualArguments() {
    return this.getChildren(Node_ConceptMethodCall.ACTUAL_ARGUMENT);
  }

  public void addActualArgument(Expression node) {
    this.addChild(Node_ConceptMethodCall.ACTUAL_ARGUMENT, node);
  }

  public void insertActualArgument(Expression prev, Expression node) {
    this.insertChild(prev, Node_ConceptMethodCall.ACTUAL_ARGUMENT, node);
  }


  public static Node_ConceptMethodCall newInstance(SModel sm, boolean init) {
    return (Node_ConceptMethodCall)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.smodel.structure.Node_ConceptMethodCall", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Node_ConceptMethodCall newInstance(SModel sm) {
    return Node_ConceptMethodCall.newInstance(sm, false);
  }

}
