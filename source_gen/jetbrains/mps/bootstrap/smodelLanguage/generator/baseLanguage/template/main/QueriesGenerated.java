package jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.baseLanguage.util.QueriesUtil;
import java.util.List;
import jetbrains.mps.bootstrap.smodelLanguage.SNodeOperation;
import jetbrains.mps.util.NameUtil;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1168911272662(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "creator", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SNodeListCreator");
  }
  public static boolean baseMappingRule_Condition_1168907859731(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkAccess");
  }
  public static boolean baseMappingRule_Condition_1168907918946(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetNewChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168908007520(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_SetTargetOperation");
  }
  public static boolean baseMappingRule_Condition_1168908054750(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Link_DeleteChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168967899174(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation")) {
      return QueriesUtil.opGetParent_reduceDeafult(SLinkOperations.getTarget(node, "nodeOperation", true));
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1168969238044(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetParentOperation")) {
      return QueriesUtil.opGetParent_reduceWhereConceptInList(SLinkOperations.getTarget(node, "nodeOperation", true));
    }
    return false;
  }
  public static boolean baseMappingRule_Condition_1168970436747(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetModelOperation");
  }
  public static boolean baseMappingRule_Condition_1168970493768(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsInstanceOfOperation");
  }
  public static boolean baseMappingRule_Condition_1168970552484(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168972231414(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168972310368(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetNextSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168972310377(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetPrevSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168972373078(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_GetAllSiblingsOperation");
  }
  public static boolean baseMappingRule_Condition_1168974937161(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168974991010(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNewPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975137862(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertNextSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975137871(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_InsertPrevSiblingOperation");
  }
  public static boolean baseMappingRule_Condition_1168975302411(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithNewOperation");
  }
  public static boolean baseMappingRule_Condition_1168975330485(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_ReplaceWithAnotherOperation");
  }
  public static boolean baseMappingRule_Condition_1168975651079(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_DeleteOperation");
  }
  public static boolean baseMappingRule_Condition_1168975694600(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_CopyOperation");
  }
  public static boolean baseMappingRule_Condition_1168975717549(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Node_IsRoleOperation");
  }
  public static boolean baseMappingRule_Condition_1168911621338(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewNodeOperation");
  }
  public static boolean baseMappingRule_Condition_1168912288225(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.Model_CreateNewRootNodeOperation");
  }
  public static boolean baseMappingRule_Condition_1168907791267(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SConceptPropertyAccess");
  }
  public static SNode sourceNodeQuery_1168292579606(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "leftExpression", true);
  }
  public static List sourceNodesQuery_1168293467222(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return (List<SNode>)_QueriesUtil.getNodeOperation_ConceptList_concepts((SNodeOperation)(SLinkOperations.getTarget(node, "nodeOperation", true)));
  }
  public static String propertyMacro_GetPropertyValue_1168294031937(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(node);
  }
  public static boolean baseMappingRule_Condition_1168908168827(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.SLinkListAccess");
  }
  public static boolean baseMappingRule_Condition_1168908199454(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddNewChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168908597278(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_AddChildOperation");
  }
  public static boolean baseMappingRule_Condition_1168908658477(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_InsertChildFirstOperation");
  }
  public static boolean baseMappingRule_Condition_1168908707817(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "nodeOperation", true), "jetbrains.mps.bootstrap.smodelLanguage.structure.LinkList_GetCountOperation");
  }
}
