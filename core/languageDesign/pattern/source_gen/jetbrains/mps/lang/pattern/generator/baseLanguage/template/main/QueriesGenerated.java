package jetbrains.mps.lang.pattern.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.CreateRootRuleContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.quotation.structure.Antiquotation_AnnotationLink;
import jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation_AnnotationLink;
import jetbrains.mps.lang.quotation.structure.AbstractAntiquotation;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.lang.pattern.structure.AsPattern_AnnotationLink;
import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.lang.pattern.structure.AsPattern;
import jetbrains.mps.lang.pattern.structure.Pattern;
import jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration;
import java.util.List;
import jetbrains.mps.lang.pattern.structure.ListPattern;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.lang.smodel.behavior.SNodeOperation_Behavior;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration;
import jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;

public class QueriesGenerated {

  public static boolean createRootRule_Condition_1224175726117(final IOperationContext operationContext, final CreateRootRuleContext _context) {
    return ListSequence.fromList(SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.pattern.structure.PatternExpression")).isNotEmpty();
  }

  public static boolean baseMappingRule_Condition_1220012951725(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.pattern.structure.SubstitutionOperation");
  }

  public static Object propertyMacro_GetPropertyValue_1190931376940(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "nodeToMatch_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1190931377077(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyValue");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377087(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyName");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377185(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("propertyName");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377378(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("referentRole");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377528(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("referentRole");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377589(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("childRole");
  }

  public static Object propertyMacro_GetPropertyValue_1190931377601(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode mainNode = _context.getNode().getReferent("mainNode");
    String role = _context.getNode().getProperty("childRole");
    return mainNode.getChildCount(role) + "";
  }

  public static Object propertyMacro_GetPropertyValue_1190931377666(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getParent().getChildren(_context.getNode().getRole_()).indexOf(_context.getNode()) + "";
  }

  public static Object propertyMacro_GetPropertyValue_1190931377684(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "childVar_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1190932035191(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("referentModel");
  }

  public static Object propertyMacro_GetPropertyValue_1190932077903(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getProperty("referentId");
  }

  public static Object propertyMacro_GetPropertyValue_1202825939894(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getNode().getConceptFqName();
  }

  public static Object propertyMacro_GetPropertyValue_1220025335238(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString((_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "patternVarField")), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1224175601049(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "parameter_" + _context.getNode().getId();
  }

  public static Object propertyMacro_GetPropertyValue_1224175601140(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("PatternVar", null);
  }

  public static Object propertyMacro_GetPropertyValue_1224175601183(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("AntiquotationField", null);
  }

  public static Object propertyMacro_GetPropertyValue_1224175601219(final IOperationContext operationContext, final PropertyMacroContext _context) {
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        return true;
      }
    }
    return false;
  }

  public static Object propertyMacro_GetPropertyValue_1224175601347(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString((_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "patternVarField")), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1224175601403(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.createUniqueName("Pattern_", null);
  }

  public static Object referenceMacro_GetReferent_1190931376965(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "matchMethodParameter");
  }

  public static Object referenceMacro_GetReferent_1190931376991(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "childVar");
  }

  public static Object referenceMacro_GetReferent_1190931377016(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode antiquotation = _context.getNode().getAttribute(Antiquotation_AnnotationLink.ANTIQUOTATION);
    return _context.getOutputNodeByInputNodeAndMappingLabel(antiquotation, "antiquotations");
  }

  public static Object referenceMacro_GetReferent_1190931377156(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    String propertyName = _context.getNode().getProperty("propertyName");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    SNode propertyPattern = mainNode.getPropertyAttribute(propertyName);
    return _context.getOutputNodeByInputNodeAndMappingLabel(propertyPattern, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377315(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    String refRole = _context.getNode().getProperty("referentRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    SNode refAntiq = mainNode.getLinkAttribute(ReferenceAntiquotation_AnnotationLink.REFERENCE_ANTIQUOTATION, refRole);
    return _context.getOutputNodeByInputNodeAndMappingLabel(refAntiq.getChild(AbstractAntiquotation.EXPRESSION), "antiquotations");
  }

  public static Object referenceMacro_GetReferent_1190931377499(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    String referentRole = _context.getNode().getProperty("referentRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    SNode linkPattern = mainNode.getLinkAttribute(referentRole);
    return _context.getOutputNodeByInputNodeAndMappingLabel(linkPattern, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377635(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377654(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "nodeToMatch");
  }

  public static Object referenceMacro_GetReferent_1190931377722(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377736(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "childVar");
  }

  public static Object referenceMacro_GetReferent_1190931377817(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode()))));
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377842(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377894(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377920(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(_context.getNode()))));
    return _context.getOutputNodeByInputNodeAndMappingLabel(attribute, "patternVarField");
  }

  public static Object referenceMacro_GetReferent_1190931377941(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getParent(_context.getNode()), "nodeToMatch");
  }

  public static Object referenceMacro_GetReferent_1220012287427(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets((_context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "pattern", true), "patternClass")), "constructor", true)).first();
  }

  public static Object referenceMacro_GetReferent_1224175600997(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "antiquotations");
  }

  public static Object referenceMacro_GetReferent_1224175601006(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "antiquotationParameters");
  }

  public static Object referenceMacro_GetReferent_1224175601261(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "patternVarField"));
  }

  public static Object referenceMacro_GetReferent_1224175601273(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "patternVarField"));
  }

  public static Object referenceMacro_GetReferent_1224175601334(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (_context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "patternVarField"));
  }

  public static boolean ifMacro_Condition_1190931376948(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1190931376956(final IOperationContext operationContext, final IfMacroContext _context) {
    return false;
  }

  public static boolean ifMacro_Condition_1190931376975(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) == SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PatternExpression", false, false);
  }

  public static boolean ifMacro_Condition_1190931376999(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.getParent(_context.getNode()) != SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PatternExpression", false, false);
  }

  public static boolean ifMacro_Condition_1190931377036(final IOperationContext operationContext, final IfMacroContext _context) {
    return _context.getNode().getAttribute(Antiquotation_AnnotationLink.ANTIQUOTATION) != null;
  }

  public static boolean ifMacro_Condition_1190931377347(final IOperationContext operationContext, final IfMacroContext _context) {
    String refRole = _context.getNode().getProperty("referentRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    return mainNode.getLinkAttribute(ReferenceAntiquotation_AnnotationLink.REFERENCE_ANTIQUOTATION, refRole) != null;
  }

  public static boolean ifMacro_Condition_1190931377679(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1190931377695(final IOperationContext operationContext, final IfMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return attribute == null || attribute.getAdapter() instanceof AsPattern || !(attribute.getAdapter() instanceof Pattern);
  }

  public static boolean ifMacro_Condition_1190931377744(final IOperationContext operationContext, final IfMacroContext _context) {
    return BaseAdapter.isInstance(_context.getNode().getAttribute(), PatternVariableDeclaration.class);
  }

  public static boolean ifMacro_Condition_1190931377771(final IOperationContext operationContext, final IfMacroContext _context) {
    String childRole_ = _context.getNode().getProperty("childRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    List<SNode> children = mainNode.getChildren(childRole_);
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern((BaseConcept)ListSequence.fromList(children).getElement(0).getAdapter()));
    return !(BaseAdapter.isInstance(attribute, ListPattern.class));
  }

  public static boolean ifMacro_Condition_1190931377858(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1190931377867(final IOperationContext operationContext, final IfMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return attribute == null || attribute.getAdapter() instanceof AsPattern || !(attribute.getAdapter() instanceof Pattern);
  }

  public static boolean ifMacro_Condition_1190931377908(final IOperationContext operationContext, final IfMacroContext _context) {
    return BaseAdapter.isInstance(_context.getNode().getAttribute(), PatternVariableDeclaration.class);
  }

  public static boolean ifMacro_Condition_1190931377983(final IOperationContext operationContext, final IfMacroContext _context) {
    String childRole_ = _context.getNode().getProperty("childRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    List<SNode> children = mainNode.getChildren(childRole_);
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern((BaseConcept)ListSequence.fromList(children).getElement(0).getAdapter()));
    return BaseAdapter.isInstance(attribute, ListPattern.class);
  }

  public static boolean ifMacro_Condition_1190931378075(final IOperationContext operationContext, final IfMacroContext _context) {
    return _context.getNode().getAttribute(Antiquotation_AnnotationLink.ANTIQUOTATION) == null;
  }

  public static boolean ifMacro_Condition_1190931671231(final IOperationContext operationContext, final IfMacroContext _context) {
    String refRole = _context.getNode().getProperty("referentRole");
    SNode mainNode = _context.getNode().getReferent("mainNode");
    return mainNode.getLinkAttribute(ReferenceAntiquotation_AnnotationLink.REFERENCE_ANTIQUOTATION, refRole) == null;
  }

  public static boolean ifMacro_Condition_1197652523288(final IOperationContext operationContext, final IfMacroContext _context) {
    SNode attribute = _context.getNode().getAttribute();
    return attribute != null;
  }

  public static boolean ifMacro_Condition_1224175601092(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_1224175601207(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static SNode sourceNodeQuery_1220012125646(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperation_Behavior.call_getLeftExpression_1213877508894(_context.getNode());
  }

  public static SNode sourceNodeQuery_1220012951719(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_1220015694051(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_1220025432702(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(TypeChecker.getInstance().getTypeOf(_context.getNode()));
  }

  public static SNode sourceNodeQuery_1224175601196(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "patternNode", true);
  }

  public static Iterable sourceNodesQuery_1190931377097(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList();
    SModel model = _context.getOutputModel();
    for(String propertyName : _context.getNode().getPropertyNames()) {
      if (BaseAdapter.isInstance(_context.getNode().getPropertyAttribute(propertyName), PropertyPatternVariableDeclaration.class)) {
        continue;
      }
      String propertyValue = _context.getNode().getProperty(propertyName);
      SNode propertyNode = BaseConcept.newInstance(model).getNode();
      propertyNode.setProperty("propertyName", propertyName);
      propertyNode.setProperty("propertyValue", propertyValue);
      ListSequence.fromList(result).addElement(propertyNode);
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1190931377192(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList();
    SModel model = _context.getOutputModel();
    for(String propertyName : _context.getNode().getPropertyNames()) {
      if (BaseAdapter.isInstance(_context.getNode().getPropertyAttribute(propertyName), PropertyPatternVariableDeclaration.class)) {
        SNode propertyNode = BaseConcept.newInstance(model).getNode();
        propertyNode.setProperty("propertyName", propertyName);
        propertyNode.setReferent("mainNode", _context.getNode());
        ListSequence.fromList(result).addElement(propertyNode);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1190931377388(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList();
    SModel model = _context.getOutputModel();
    for(String referentRole : _context.getNode().getReferenceRoles()) {
      if (BaseAdapter.isInstance(_context.getNode().getLinkAttribute(referentRole), LinkPatternVariableDeclaration.class)) {
        continue;
      }
      SNode referenceNode = BaseConcept.newInstance(model).getNode();
      SNode referent = _context.getNode().getReferent(referentRole);
      referenceNode.setProperty("referentRole", referentRole);
      referenceNode.setProperty("referentModel", referent.getModel().getSModelReference().toString());
      referenceNode.setProperty("referentId", referent.getId());
      referenceNode.setReferent("mainNode", _context.getNode());
      ListSequence.fromList(result).addElement(referenceNode);
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1190931377535(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList();
    SModel model = _context.getOutputModel();
    for(String referentRole : _context.getNode().getReferenceRoles()) {
      if (BaseAdapter.isInstance(_context.getNode().getLinkAttribute(referentRole), LinkPatternVariableDeclaration.class)) {
        SNode linkNode = BaseConcept.newInstance(model).getNode();
        linkNode.setProperty("referentRole", referentRole);
        linkNode.setReferent("mainNode", _context.getNode());
        ListSequence.fromList(result).addElement(linkNode);
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1190931377752(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    SNode mainNode = _context.getNode().getReferent("mainNode");
    String role = _context.getNode().getProperty("childRole");
    return mainNode.getChildren(role);
  }

  public static Iterable sourceNodesQuery_1190931377952(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SNode mainNode = _context.getNode().getReferent("mainNode");
    String role = _context.getNode().getProperty("childRole");
    ListSequence.fromList(result).addElement(mainNode.getChildren(role).get(0));
    return result;
  }

  public static Iterable sourceNodesQuery_1190931378020(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    SModel model = _context.getOutputModel();
    for(String childRole : _context.getNode().getChildRoles()) {
      SNode childRoleNode = BaseConcept.newInstance(model).getNode();
      childRoleNode.setProperty("childRole", childRole);
      childRoleNode.setReferent("childLinkDeclaration", AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(_context.getNode()), childRole));
      childRoleNode.setReferent("mainNode", _context.getNode());
      ListSequence.fromList(result).addElement(childRoleNode);
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1220012189126(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "substitutionItem", true);
  }

  public static Iterable sourceNodesQuery_1224175601014(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1224175601059(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1224175601101(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", false)));
    return result;
  }

  public static Iterable sourceNodesQuery_1224175601150(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    for(SNode child : SNodeOperations.getDescendants(_context.getNode(), null, false)) {
      if (SNodeOperations.isInstanceOf(child, "jetbrains.mps.lang.quotation.structure.AbstractAntiquotation")) {
        ListSequence.fromList(result).addElement(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }

  public static Iterable sourceNodesQuery_1224175601284(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", false)));
    return result;
  }

  public static Iterable sourceNodesQuery_1224175601361(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    List<SNode> result = new ArrayList<SNode>();
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.LinkPatternVariableDeclaration", false)));
    ListSequence.fromList(result).addSequence(ListSequence.fromList(SNodeOperations.getDescendants(_context.getNode(), "jetbrains.mps.lang.pattern.structure.PropertyPatternVariableDeclaration", false)));
    return result;
  }

  public static Iterable sourceNodesQuery_1224175611713(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getNodes(_context.getInputModel(), "jetbrains.mps.lang.pattern.structure.PatternExpression");
  }

}
