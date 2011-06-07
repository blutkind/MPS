package jetbrains.mps.lang.quotation.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.quotation.generator.baseLanguage.template.util.QuotationUtil;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.generator.template.IfMacroContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import java.util.Collections;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.generator.runtime.TemplateModel;
import jetbrains.mps.generator.runtime.TemplateModule;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1196351886658(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null;
  }

  public static Object propertyMacro_GetPropertyValue_937236280924642859(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode_" + QuotationUtil.genQuotationNodeId(_context, _context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_937236280924642984(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("role");
  }

  public static Object propertyMacro_GetPropertyValue_937236280924643241(final IOperationContext operationContext, final PropertyMacroContext _context) {
    //  the 'node' expression may have been already mapped and unique name created for it 
    String uniqName = (String) _context.getTransientObject("parameterFromExpressions_" + _context.getNode().getId());
    uniqName = (uniqName != null ?
      uniqName :
      "parameter_" + QuotationUtil.genQuotationNodeId(_context, _context.getNode())
    );
    _context.putTransientObject("parameterFromExpressions_" + _context.getNode().getId(), uniqName);
    return uniqName;
  }

  public static Object propertyMacro_GetPropertyValue_1196351886765(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getConceptFqName();
  }

  public static Object propertyMacro_GetPropertyValue_1201868689728(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode1_" + QuotationUtil.genQuotationNodeId(_context, _context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1196351886787(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyName");
  }

  public static Object propertyMacro_GetPropertyValue_1196351886795(final IOperationContext operationContext, final PropertyMacroContext _context) {
    String value = _context.getNode().getProperty("propertyValue");
    return NameUtil.escapeString(value);
  }

  public static Object propertyMacro_GetPropertyValue_1196871487518(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return AttributeOperations.getPropertyName(_context.getNode());
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
    return AttributeOperations.getLinkRole(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1196351887148(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1525847198352014987(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "quotedNode1_" + QuotationUtil.genQuotationNodeId(_context, _context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_1196860193017(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object propertyMacro_GetPropertyValue_1196351887499(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getRole_();
  }

  public static Object referenceMacro_GetReferent_1196351886638(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_937236280924642969(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode().getReferent("sourceNode"), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_937236280924642994(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode().getReferent("targetNode"), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1201868926381(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1201870201455(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1197034040799(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
    SNode antiquotation = SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.quotation.structure.PropertyAntiquotation");
    if (antiquotation == null) {
      return null;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351886954(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
    SNode antiquotation = SNodeOperations.cast(_context.getNode(), "jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation");
    if (antiquotation == null) {
      return null;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351887055(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode parentTargetNode = _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "quotationClass");
    SNode method = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parentTargetNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).first();
    SNode varDeclStmt = SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
    return SLinkOperations.getTarget(varDeclStmt, "localVariableDeclaration", true);
  }

  public static Object referenceMacro_GetReferent_1196351887115(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1201868923347(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1196351887203(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for (SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.Antiquotation")) {
        antiquotation = SNodeOperations.cast(child, "jetbrains.mps.lang.quotation.structure.Antiquotation");
        break;
      }
    }
    if (antiquotation == null) {
      return null;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_473655348865090435(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1525847198352075387(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false), "map"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1525847198352014965(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1525847198352096750(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false), "map"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1525847198352015013(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1525847198352015051(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1196860200838(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode parentTargetNode = _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "quotationClass");
    SNode method = ListSequence.fromList(SLinkOperations.getTargets(SNodeOperations.cast(parentTargetNode, "jetbrains.mps.baseLanguage.structure.ClassConcept"), "method", true)).first();
    SNode varDeclStmt = SNodeOperations.cast(ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(method, "body", true), "statement", true)).first(), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclarationStatement");
    return SLinkOperations.getTarget(varDeclStmt, "localVariableDeclaration", true);
  }

  public static Object referenceMacro_GetReferent_1196860192984(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_1196351887411(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode quotation = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
    SNode antiquotation = null;
    for (SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
        antiquotation = SNodeOperations.cast(child, "jetbrains.mps.lang.quotation.structure.ListAntiquotation");
        break;
      }
    }
    if (antiquotation == null) {
      return null;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(antiquotation, "expression", true), "parametersFromExpressions");
  }

  public static Object referenceMacro_GetReferent_1196351887466(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "nodeVariable"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static boolean ifMacro_Condition_937236280924642852(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_937236280924642867(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1419698836134220561(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1196351886745(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351886753(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1196351887100(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887155(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887167(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for (SNode child : children) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.Antiquotation") || SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
        return false;
      }
    }
    return true;
  }

  public static boolean ifMacro_Condition_1196860200883(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196860193035(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887377(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for (SNode child : children) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.Antiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static boolean ifMacro_Condition_1196351887517(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static boolean ifMacro_Condition_1196351887529(final IOperationContext operationContext, final IfMacroContext _context) {
    List<SNode> children = SNodeOperations.getChildren(_context.getNode());
    for (SNode child : children) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static SNode sourceNodeQuery_9181472308624882685(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_937236280924642959(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
  }

  public static SNode sourceNodeQuery_4462183154303727939(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false);
  }

  public static Iterable sourceNodesQuery_9181472308624882635(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    if (SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true));
    }
    for (SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false, new String[]{})) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        SNode antiqExpression = SLinkOperations.getTarget(SNodeOperations.cast(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation"), "expression", true);
        ListSequence.fromList(result).addElement(antiqExpression);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_937236280924642874(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode root = SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> frontier = new ArrayList<SNode>();
    ListSequence.fromList(result).addElement(root);
    ListSequence.fromList(frontier).addElement(root);
    List<SNode> newFrontier = new ArrayList<SNode>();
    while (ListSequence.fromList(frontier).isNotEmpty()) {
      for (SNode node : frontier) {
        for (SNode child : SNodeOperations.getChildren(node)) {
          if (!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation"))) {
            ListSequence.fromList(result).addElement(child);
            ListSequence.fromList(newFrontier).addElement(child);
          }
        }
      }
      frontier = newFrontier;
      newFrontier = new ArrayList<SNode>();
    }
    return result;
  }

  public static Iterable sourceNodesQuery_937236280924643007(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode root = SLinkOperations.getTarget(_context.getNode(), "quotedNode", true);
    List<SNode> result = new ArrayList<SNode>();
    List<SNode> frontier = new ArrayList<SNode>();
    ListSequence.fromList(frontier).addElement(root);
    List<SNode> newFrontier = new ArrayList<SNode>();
    while (ListSequence.fromList(frontier).isNotEmpty()) {
      for (SNode node : frontier) {
        for (SNode child : SNodeOperations.getChildren(node)) {
          if (!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation"))) {
            for (SReference reference : child.getReferences()) {
              if (AttributeOperations.getAttribute(child, new IAttributeDescriptor.LinkAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation"), reference.getRole())) != null || AttributeOperations.getAttribute(child, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.Antiquotation"))) != null) {
                continue;
              }
              boolean hasAntiquotation = false;
              for (SNode grandChild : SNodeOperations.getChildren(child)) {
                if (SNodeOperations.isInstanceOf(grandChild, "jetbrains.mps.lang.quotation.structure.Antiquotation") || SNodeOperations.isInstanceOf(grandChild, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
                  hasAntiquotation = true;
                  break;
                }
              }
              if (hasAntiquotation) {
                continue;
              }
              SNode targetNode = reference.getTargetNode();
              if (SNodeOperations.getAncestor(targetNode, "jetbrains.mps.lang.quotation.structure.Quotation", false, false) == SNodeOperations.getAncestor(child, "jetbrains.mps.lang.quotation.structure.Quotation", false, false)) {
                SNode referenceNode = SModelOperations.createNewNode(_context.getOutputModel(), "jetbrains.mps.lang.core.structure.BaseConcept", null);
                referenceNode.setProperty("role", reference.getRole());
                referenceNode.setReferent("targetNode", targetNode);
                referenceNode.setReferent("sourceNode", child);
                ListSequence.fromList(result).addElement(referenceNode);
              }
            }
            ListSequence.fromList(newFrontier).addElement(child);
          }
        }
      }
      frontier = newFrontier;
      newFrontier = new ArrayList<SNode>();
    }
    return result;
  }

  public static Iterable sourceNodesQuery_937236280924643195(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    if (SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true) != null) {
      ListSequence.fromList(result).addElement(SLinkOperations.getTarget(_context.getNode(), "modelToCreate", true));
    }
    for (SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false, new String[]{})) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(SNodeOperations.cast(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation"), "expression", true));
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1196351886802(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<String> propertyNames = ListSequence.fromListWithValues(new ArrayList<String>(), _context.getNode().getPropertyNames());
    Collections.sort(propertyNames);
    for (String property : propertyNames) {
      if (AttributeOperations.getAttribute(_context.getNode(), new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.PropertyAntiquotation"), property)) != null) {
        continue;
      }
      SNode propertyNode = SModelOperations.createNewNode(_context.getOutputModel(), "jetbrains.mps.lang.core.structure.BaseConcept", null);
      propertyNode.setProperty("propertyName", property);
      propertyNode.setProperty("propertyValue", _context.getNode().getProperty(property));
      ListSequence.fromList(result).addElement(propertyNode);
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1196871487533(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<String> propertyNames = ListSequence.fromListWithValues(new ArrayList<String>(), _context.getNode().getPropertyNames());
    Collections.sort(propertyNames);
    for (String property : propertyNames) {
      SNode attribute = AttributeOperations.getAttribute(_context.getNode(), new IAttributeDescriptor.PropertyAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.PropertyAntiquotation"), property));
      if (attribute != null) {
        ListSequence.fromList(result).addElement(attribute);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1196351886876(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for (SReference reference : _context.getNode().getReferences()) {
      if (AttributeOperations.getAttribute(_context.getNode(), new IAttributeDescriptor.LinkAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation"), reference.getRole())) != null) {
        continue;
      }
      SNode targetNode = reference.getTargetNode();
      if (SNodeOperations.getAncestor(targetNode, "jetbrains.mps.lang.quotation.structure.Quotation", false, false) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.quotation.structure.Quotation", false, false)) {
        continue;
      }
      SNode referenceNode = SModelOperations.createNewNode(_context.getOutputModel(), "jetbrains.mps.lang.core.structure.BaseConcept", null);
      referenceNode.setProperty("targetModel", reference.getTargetSModelReference().toString());
      referenceNode.setProperty("role", reference.getRole());
      if (targetNode != null) {
        referenceNode.setProperty("targetNodeId", targetNode.getSNodeId().toString());
      }
      ListSequence.fromList(result).addElement(referenceNode);
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1196351886984(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    List<String> refRoles = ListSequence.fromList(new ArrayList<String>());
    ListSequence.fromList(refRoles).addSequence(SetSequence.fromSet(_context.getNode().getReferenceRoles()));
    Collections.sort(refRoles);
    for (String refRole : refRoles) {
      SNode attribute = AttributeOperations.getAttribute(_context.getNode(), new IAttributeDescriptor.LinkAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation"), refRole));
      if (attribute != null) {
        ListSequence.fromList(result).addElement(attribute);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1196351887023(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for (SNode child : SNodeOperations.getChildren(_context.getNode())) {
      if (!(SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation"))) {
        ListSequence.fromList(result).addElement(child);
      }
    }
    return result;
  }

  public static TemplateModel getDescriptor(TemplateModule module) {
    return new TemplateModelImpl(module);
  }
}
