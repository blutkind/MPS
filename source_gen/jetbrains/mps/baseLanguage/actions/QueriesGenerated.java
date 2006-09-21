package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS Sep 21, 2006 5:59:25 PM */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1154539862600(SNode parentNode, IOperationContext operationContext) {
    SNode parent = SNodeOperations.getParentWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement","jetbrains.mps.baseLanguage.structure.Closure"}, false, false);
    return SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement");
  }
  public static void nodeFactory_NodeSetup_ParenthesizedExpression_1158857529259(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
    }
  }
  public static void nodeFactory_NodeSetup_CastExpression_1158871408598(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
      if(sampleNode != null) {
        SNode castType = CastExpression_FactoryUtil.computeCastType(sampleNode);
        SLinkOperations.setTarget(newNode, "type", castType, true);
      }
    }
  }
  public static void nodeFactory_NodeSetup_InstanceMethodDeclaration_1158793299786(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SLinkOperations.setNewChild(newNode, "returnType", "jetbrains.mps.baseLanguage.structure.VoidType");
  }
  public static void nodeFactory_NodeSetup_BinaryOperation_1158797366355(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) {
      SLinkOperations.setTarget(newNode, "leftExpression", SLinkOperations.getTarget(sampleNode, "leftExpression", true), true);
      SLinkOperations.setTarget(newNode, "rightExpression", SLinkOperations.getTarget(sampleNode, "rightExpression", true), true);
    }
  }
}
