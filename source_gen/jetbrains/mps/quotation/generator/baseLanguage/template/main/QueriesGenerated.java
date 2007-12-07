package jetbrains.mps.quotation.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement;
import java.util.List;
import java.util.ArrayList;
import jetbrains.mps.quotation.structure.PropertyAntiquotation_AnnotationLink;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.quotation.structure.ReferenceAntiquotation_AnnotationLink;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1196351886658(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "modelToCreate", true) != null;
  }

  public static Object propertyMacro_GetPropertyValue_1196351886734(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "quotedNode_" + node.getId();
  }

  public static Object propertyMacro_GetPropertyValue_1196351886765(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getConceptFqName();
  }

  public static Object propertyMacro_GetPropertyValue_1196351886787(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("propertyName");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886795(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("propertyValue");
  }

  public static Object propertyMacro_GetPropertyValue_1196871487518(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(node.getRole_());
  }

  public static Object propertyMacro_GetPropertyValue_1196351886850(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("role");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886860(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("targetModel");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886869(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("targetNodeId");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886945(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(node.getRole_());
  }

  public static Object propertyMacro_GetPropertyValue_1196351887148(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1196860193017(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887499(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887859(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "parameter_" + node.getId();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887869(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("QuotationClass_");
  }

  public static SNode referenceMacro_GetReferent_1196351886638(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(node, "modelToCreate", true), "parametersFromExpressions");
  }

  public static SNode referenceMacro_GetReferent_1197034040799(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode quotation = SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = node;
    if(antiquotation == null) {
      return null;
    }
    return generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static SNode referenceMacro_GetReferent_1196351886954(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode quotation = SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = node;
    if(antiquotation == null) {
      return null;
    }
    return generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static SNode referenceMacro_GetReferent_1196351887055(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode parentTargetNode = generator.findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(node, null, false, false), "quotationClass");
    ClassConcept quotationClass = (ClassConcept)BaseAdapter.fromNode(parentTargetNode);
    InstanceMethodDeclaration methodDecl = quotationClass.getMethods().get(0);
    StatementList statementList = methodDecl.getBody();
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static SNode referenceMacro_GetReferent_1196351887115(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode parentTargetNode = generator.findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(node, null, false, false), "nodeCreatorForQuotedNode");
    StatementList statementList = (StatementList)BaseAdapter.fromNode(parentTargetNode);
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static SNode referenceMacro_GetReferent_1196351887203(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode quotation = SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for(SNode child : SNodeOperations.getChildren(node)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation")) {
        antiquotation = child;
        break;
      }
    }
    if(antiquotation == null) {
      return null;
    }
    return generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static SNode referenceMacro_GetReferent_1196860200838(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode parentTargetNode = generator.findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(node, null, false, false), "quotationClass");
    ClassConcept quotationClass = (ClassConcept)BaseAdapter.fromNode(parentTargetNode);
    InstanceMethodDeclaration methodDecl = quotationClass.getMethods().get(0);
    StatementList statementList = methodDecl.getBody();
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static SNode referenceMacro_GetReferent_1196860192984(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode parentTargetNode = generator.findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(node, null, false, false), "nodeCreatorForQuotedNode");
    StatementList statementList = (StatementList)BaseAdapter.fromNode(parentTargetNode);
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static SNode referenceMacro_GetReferent_1196351887411(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode quotation = SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for(SNode child : SNodeOperations.getChildren(node)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        antiquotation = child;
        break;
      }
    }
    if(antiquotation == null) {
      return null;
    }
    return generator.findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static SNode referenceMacro_GetReferent_1196351887466(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    SNode parentTargetNode = generator.findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(node, null, false, false), "nodeCreatorForQuotedNode");
    StatementList statementList = (StatementList)BaseAdapter.fromNode(parentTargetNode);
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static boolean ifMacro_Condition_1196351886745(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351886753(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351887100(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) == SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887155(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) != SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887167(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> children = SNodeOperations.getChildren(node);
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        return false;
      }
    }
    return true;
  }

  public static boolean ifMacro_Condition_1196860200883(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) == SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196860193035(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) != SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887377(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> children = SNodeOperations.getChildren(node);
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static boolean ifMacro_Condition_1196351887517(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) != SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887529(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> children = SNodeOperations.getChildren(node);
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static List sourceNodesQuery_1196351886675(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    if(SLinkOperations.getTarget(node, "modelToCreate", true) != null) {
      result.add(SLinkOperations.getTarget(node, "modelToCreate", true));
    }
    for(SNode child : SNodeOperations.getDescendants(node, null, false)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation")) {
        SNode antiqExpression = SLinkOperations.getTarget(child, "expression", true);
        result.add(antiqExpression);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886802(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SModel model = generator.getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(String property : node.getPropertyNames()) {
      if(PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), property) != null) {
        continue;
      }
      SNode propertyNode = BaseConcept.newInstance(model).getNode();
      propertyNode.setProperty("propertyName", property);
      propertyNode.setProperty("propertyValue", node.getProperty(property));
      result.add(propertyNode);
    }
    return result;
  }

  public static List sourceNodesQuery_1196871487533(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SModel model = generator.getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(String property : node.getPropertyNames()) {
      BaseAdapter attribute = PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), property);
      if(attribute != null) {
        result.add(attribute.getNode());
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886876(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SModel model = generator.getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(SReference reference : node.getReferences()) {
      if(ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), reference.getRole()) != null) {
        continue;
      }
      SNode referenceNode = BaseConcept.newInstance(model).getNode();
      referenceNode.setProperty("targetModel", reference.getTargetModelUID().toString());
      referenceNode.setProperty("role", reference.getRole());
      referenceNode.setProperty("targetNodeId", reference.getTargetNode().getSNodeId().toString());
      result.add(referenceNode);
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886984(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    for(String refRole : node.getReferenceRoles()) {
      BaseAdapter attribute = ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), refRole);
      if(attribute != null) {
        result.add(attribute.getNode());
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351887023(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode child : SNodeOperations.getChildren(node)) {
      if(!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation"))) {
        result.add(child);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351887816(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    if(SLinkOperations.getTarget(node, "modelToCreate", true) != null) {
      result.add(SLinkOperations.getTarget(node, "modelToCreate", true));
    }
    for(SNode child : SNodeOperations.getDescendants(node, null, false)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation")) {
        result.add(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }

  public static SNode sourceNodeQuery_1196351886722(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node;
  }

  public static SNode sourceNodeQuery_1196351886773(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196860193027(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196351887509(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getAncestor(node, "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196351887805(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "quotedNode", true);
  }

}
