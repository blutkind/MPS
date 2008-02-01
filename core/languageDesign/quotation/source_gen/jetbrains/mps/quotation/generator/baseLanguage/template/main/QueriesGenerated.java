package jetbrains.mps.quotation.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.StatementList;
import jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement;
import jetbrains.mps.generator.template.IfMacroContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.quotation.structure.PropertyAntiquotation_AnnotationLink;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.quotation.structure.ReferenceAntiquotation_AnnotationLink;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.ListOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.smodel.INodeAdapter;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1196351886658(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null;
  }

  public static Object propertyMacro_GetPropertyValue_1196351886765(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getConceptFqName();
  }

  public static Object propertyMacro_GetPropertyValue_1201868689728(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode1_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1196351886787(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyName");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886795(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyValue");
  }

  public static Object propertyMacro_GetPropertyValue_1196871487518(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return AttributesRolesUtil.getPropertyNameFromPropertyAttributeRole(_context.getNode().getRole_());
  }

  public static Object propertyMacro_GetPropertyValue_1196351886850(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("role");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886860(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("targetModel");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886869(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("targetNodeId");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886945(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return AttributesRolesUtil.getLinkRoleFromLinkAttributeRole(_context.getNode().getRole_());
  }

  public static Object propertyMacro_GetPropertyValue_1196351887148(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1201868659573(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode1_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1196860193017(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887499(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1201866124841(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1201866023916(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("role");
  }

  public static Object propertyMacro_GetPropertyValue_1196351887859(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "parameter_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887869(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getGenerator().getGeneratorSessionContext().createUniqueName("QuotationClass_");
  }

  public static Object referenceMacro_GetReferent_1196351886638(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1201868926381(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1201870201455(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1197034040799(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = _context.getNode();
    if(antiquotation == null) {
      return null;
    }
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351886954(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = _context.getNode();
    if(antiquotation == null) {
      return null;
    }
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351887055(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode parentTargetNode = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(_context.getNode(), null, false, false), "quotationClass");
    ClassConcept quotationClass = (ClassConcept)BaseAdapter.fromNode(parentTargetNode);
    InstanceMethodDeclaration methodDecl = quotationClass.getMethods().get(0);
    StatementList statementList = methodDecl.getBody();
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static Object referenceMacro_GetReferent_1196351887115(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(_context.getNode(), null, false, false), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1201868923347(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1196351887203(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for(SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation")) {
        antiquotation = child;
        break;
      }
    }
    if(antiquotation == null) {
      return null;
    }
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1201870241921(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1196860200838(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode parentTargetNode = _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(_context.getNode(), null, false, false), "quotationClass");
    ClassConcept quotationClass = (ClassConcept)BaseAdapter.fromNode(parentTargetNode);
    InstanceMethodDeclaration methodDecl = quotationClass.getMethods().get(0);
    StatementList statementList = methodDecl.getBody();
    LocalVariableDeclarationStatement lvs = (LocalVariableDeclarationStatement)statementList.getStatements().get(0);
    return BaseAdapter.fromAdapter(lvs.getLocalVariableDeclaration());
  }

  public static Object referenceMacro_GetReferent_1196860192984(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(_context.getNode(), null, false, false), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1196351887411(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for(SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        antiquotation = child;
        break;
      }
    }
    if(antiquotation == null) {
      return null;
    }
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351887466(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(SNodeOperations.getParent(_context.getNode(), null, false, false), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1201868277247(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode().getReferent("sourceNode"), "nodeVariable");
  }

  public static Object referenceMacro_GetReferent_1201866023924(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SNode)_context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode().getReferent("targetNode"), "nodeVariable");
  }

  public static boolean ifMacro_Condition_1196351886745(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351886753(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351887100(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode(), null, false, false) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887155(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode(), null, false, false) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887167(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        return false;
      }
    }
    return true;
  }

  public static boolean ifMacro_Condition_1196860200883(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode(), null, false, false) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196860193035(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode(), null, false, false) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887377(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.Antiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static boolean ifMacro_Condition_1196351887517(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode(), null, false, false) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887529(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for(SNode child : children) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.ListAntiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static boolean ifMacro_Condition_1201869852241(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static SNode sourceNodeQuery_1196351886722(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_1196351886773(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196860193027(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196351887509(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false);
  }

  public static SNode sourceNodeQuery_1196351887805(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
  }

  public static List sourceNodesQuery_1196351886675(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList();
    if(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null) {
      result.add(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true));
    }
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation")) {
        SNode antiqExpression = SLinkOperations.getTarget(child, "expression", true);
        result.add(antiqExpression);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886802(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SModel model = _context.getGenerator().getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(String property : _context.getNode().getPropertyNames()) {
      if(PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode())), property) != null) {
        continue;
      }
      SNode propertyNode = BaseConcept.newInstance(model).getNode();
      propertyNode.setProperty("propertyName", property);
      propertyNode.setProperty("propertyValue", _context.getNode().getProperty(property));
      result.add(propertyNode);
    }
    return result;
  }

  public static List sourceNodesQuery_1196871487533(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SModel model = _context.getGenerator().getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(String property : _context.getNode().getPropertyNames()) {
      BaseAdapter attribute = PropertyAntiquotation_AnnotationLink.getPropertyAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode())), property);
      if(attribute != null) {
        result.add(attribute.getNode());
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886876(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SModel model = _context.getGenerator().getTargetModel();
    List<SNode> result = new ArrayList<SNode>();
    for(SReference reference : _context.getNode().getReferences()) {
      if(ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode())), reference.getRole()) != null) {
        continue;
      }
      SNode targetNode = reference.getTargetNode();
      if(SNodeOperations.getAncestor(targetNode, "jetbrains.mps.quotation.structure.Quotation", false, false) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.quotation.structure.Quotation", false, false)) {
        continue;
      }
      SNode referenceNode = BaseConcept.newInstance(model).getNode();
      referenceNode.setProperty("targetModel", reference.getTargetModelUID().toString());
      referenceNode.setProperty("role", reference.getRole());
      referenceNode.setProperty("targetNodeId", targetNode.getSNodeId().toString());
      result.add(referenceNode);
    }
    return result;
  }

  public static List sourceNodesQuery_1196351886984(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(String refRole : _context.getNode().getReferenceRoles()) {
      BaseAdapter attribute = ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode())), refRole);
      if(attribute != null) {
        result.add(attribute.getNode());
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1196351887023(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if(!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation"))) {
        result.add(child);
      }
    }
    return result;
  }

  public static List sourceNodesQuery_1201869846065(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode root = SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> frontier = new ArrayList<SNode>();
    ListOperations.addElement(result, root);
    ListOperations.addElement(frontier, root);
    List<SNode> newFrontier = new ArrayList<SNode>();
    while(!(SequenceOperations.isEmpty(frontier))) {
      for(SNode node : frontier) {
        for(SNode child : SNodeOperations.getChildren(node)) {
          if(!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation"))) {
            ListOperations.addElement(result, child);
            ListOperations.addElement(newFrontier, child);
          }
        }
      }
      frontier = newFrontier;
      newFrontier = new ArrayList<SNode>();
    }
    return result;
  }

  public static List sourceNodesQuery_1201866023937(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode root = SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> frontier = new ArrayList<SNode>();
    SModel model = _context.getGenerator().getTargetModel();
    ListOperations.addElement(frontier, root);
    List<SNode> newFrontier = new ArrayList<SNode>();
    while(!(SequenceOperations.isEmpty(frontier))) {
      for(SNode node : frontier) {
        for(SNode child : SNodeOperations.getChildren(node)) {
          if(!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation"))) {
            for(SReference reference : child.getReferences()) {
              if(ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((INodeAdapter)SNodeOperations.getAdapter(child)), reference.getRole()) != null) {
                continue;
              }
              SNode targetNode = reference.getTargetNode();
              if(SNodeOperations.getAncestor(targetNode, "jetbrains.mps.quotation.structure.Quotation", false, false) == SNodeOperations.getAncestor(child, "jetbrains.mps.quotation.structure.Quotation", false, false)) {
                SNode referenceNode = BaseConcept.newInstance(model).getNode();
                referenceNode.setProperty("role", reference.getRole());
                referenceNode.setReferent("targetNode", targetNode);
                referenceNode.setReferent("sourceNode", child);
                ListOperations.addElement(result, referenceNode);
              }
            }
            ListOperations.addElement(newFrontier, child);
          }
        }
      }
      frontier = newFrontier;
      newFrontier = new ArrayList<SNode>();
    }
    return result;
  }

  public static List sourceNodesQuery_1196351887816(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    if(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null) {
      result.add(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true));
    }
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.quotation.structure.AbstractAntiquotation")) {
        result.add(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }

}
