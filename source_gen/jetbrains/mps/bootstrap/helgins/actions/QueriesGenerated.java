package jetbrains.mps.bootstrap.helgins.actions;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static void nodeFactory_NodeSetup_AbstractEquationStatement_1174664649251(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.bootstrap.helgins.structure.AbstractEquationStatement")) {
      SLinkOperations.setTarget(newNode, "leftExpression", SLinkOperations.getTarget(sampleNode, "leftExpression", true), true);
      SLinkOperations.setTarget(newNode, "rightExpression", SLinkOperations.getTarget(sampleNode, "rightExpression", true), true);
      SLinkOperations.setTarget(newNode, "nodeToCheck", SLinkOperations.getTarget(sampleNode, "nodeToCheck", true), true);
    }
  }
  public static void nodeFactory_NodeSetup_IsSubtypeExpression_1177408248540(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression")) {
      SLinkOperations.setTarget(newNode, "subtypeExpression", SLinkOperations.getTarget(sampleNode, "subtypeExpression", true), true);
      SLinkOperations.setTarget(newNode, "supertypeExpression", SLinkOperations.getTarget(sampleNode, "supertypeExpression", true), true);
    }
  }
}
