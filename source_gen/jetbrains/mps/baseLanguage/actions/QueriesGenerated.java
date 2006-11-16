package jetbrains.mps.baseLanguage.actions;

/*Generated by MPS 16.11.2006 13:03:07 */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.types.BaseLanguageTypesUtil;
import jetbrains.mps.baseLanguage.Expression;
import jetbrains.mps.typesystem.TypeCheckerAccess;
import jetbrains.mps.smodel.SModel;

public class QueriesGenerated {

  public static boolean nodeSubstituteActionsBuilder_Precondition_Statement_1154539862600(SNode parentNode, IScope scope, IOperationContext operationContext) {
    SNode parent = SNodeOperations.getParentWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.structure.AbstractLoopStatement","jetbrains.mps.baseLanguage.structure.Closure"}, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.AbstractLoopStatement")) {
      return true;
    }
    parent = SNodeOperations.getParentWhereConceptInList(parentNode, new String[]{"jetbrains.mps.baseLanguage.structure.SwitchStatement"}, false, false);
    if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.SwitchStatement")) {
      return true;
    }
    return false;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_ClassifierType_1158972050511(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "parameter") == 0;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_VariableDeclaration_1158969943216(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    if(SLinkOperations.getTarget(sourceNode, "initializer", true) != null) {
      return false;
    }
    if(SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.FieldDeclaration") || SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration")) {
      return true;
    }
    if(SNodeOperations.isInstanceOf(sourceNode, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration")) {
      SNode parent = SNodeOperations.getParent(sourceNode, null, false, false);
      if(SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement") || SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.ForStatement")) {
        return true;
      }
    }
    return false;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_Expression_1158965431412(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    Object ct = BaseLanguageTypesUtil.tryObtain_Classifier_type((Expression)sourceNode, TypeCheckerAccess.getTypeChecker());
    return ct != null;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_GenericDeclaration_1159200256287(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "typeVariableDeclaration") == 0;
  }
  public static boolean rightTransformHintSubstituteActionsBuilder_Precondition_NewExpression_1159200493867(SNode sourceNode, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(sourceNode, "typeParameter") == 0;
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
  public static void nodeFactory_NodeSetup_NotExpression_1159218040861(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
    }
  }
  public static void nodeFactory_NodeSetup_BinaryOperation_1158797366355(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.BinaryOperation")) {
      SLinkOperations.setTarget(newNode, "leftExpression", SLinkOperations.getTarget(sampleNode, "leftExpression", true), true);
      SLinkOperations.setTarget(newNode, "rightExpression", SLinkOperations.getTarget(sampleNode, "rightExpression", true), true);
    }
  }
  public static void nodeFactory_NodeSetup_ReturnStatement_1158938591702(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.ExpressionStatement")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(SLinkOperations.getTarget(sampleNode, "expression", true)), true);
    }
  }
  public static void nodeFactory_NodeSetup_InstanceMethodDeclaration_1158793299786(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    SLinkOperations.setNewChild(newNode, "returnType", "jetbrains.mps.baseLanguage.structure.VoidType");
  }
  public static void nodeFactory_NodeSetup_ParenthesizedExpression_1158857529259(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
    if(SNodeOperations.isInstanceOf(sampleNode, "jetbrains.mps.baseLanguage.structure.Expression")) {
      SLinkOperations.setTarget(newNode, "expression", SNodeOperations.copyNode(sampleNode), true);
    }
  }
}
