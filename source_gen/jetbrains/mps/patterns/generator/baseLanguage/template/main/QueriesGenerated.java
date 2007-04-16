package jetbrains.mps.patterns.generator.baseLanguage.template.main;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.helgins.structure.Antiquotation;
import jetbrains.mps.bootstrap.helgins.structure.Antiquotation_AnnotationLink;
import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptDeclaration;
import jetbrains.mps.smodel.BaseAdapter;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.helgins.structure.ReferenceAntiquotation;
import jetbrains.mps.bootstrap.helgins.structure.ReferenceAntiquotation_AnnotationLink;
import jetbrains.mps.patterns.structure.AsPattern_AnnotationLink;
import jetbrains.mps.patterns.structure.AsPattern;
import jetbrains.mps.patterns.structure.Pattern;
import jetbrains.mps.patterns.structure.PatternVariableDeclaration;
import java.util.List;
import jetbrains.mps.patterns.structure.ListPattern;
import java.util.ArrayList;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration;
import jetbrains.mps.patterns.structure.LinkPatternVariableDeclaration;
import jetbrains.mps.smodel.SReference;

public class QueriesGenerated {

  public static String propertyMacro_GetPropertyValue_1176737392657(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "parameter_" + node.getId();
  }
  public static String propertyMacro_GetPropertyValue_1174811358972(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "PatternVar_" + node.getId();
  }
  public static String propertyMacro_GetPropertyValue_1176737323510(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "AntiquotationField_" + node.getId();
  }
  public static String propertyMacro_GetPropertyValue_1174811055861(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.getGeneratorSessionContext().createUniqueName("Pattern_");
  }
  public static String propertyMacro_GetPropertyValue_1174823343924(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "nodeToMatch_" + node.getId();
  }
  public static String propertyMacro_GetPropertyValue_1174820293524(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("propertyValue");
  }
  public static String propertyMacro_GetPropertyValue_1174820316054(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("propertyName");
  }
  public static String propertyMacro_GetPropertyValue_1174820511130(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("propertyName");
  }
  public static String propertyMacro_GetPropertyValue_1174906743818(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("referentRole");
  }
  public static String propertyMacro_GetPropertyValue_1174906675670(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("referentModel");
  }
  public static String propertyMacro_GetPropertyValue_1174906425197(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("targetInfo");
  }
  public static String propertyMacro_GetPropertyValue_1174906306924(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("isExternalInfo");
  }
  public static String propertyMacro_GetPropertyValue_1174906782393(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("referentRole");
  }
  public static String propertyMacro_GetPropertyValue_1174903629960(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("referentRole");
  }
  public static String propertyMacro_GetPropertyValue_1174826611348(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getProperty("childRole");
  }
  public static String propertyMacro_GetPropertyValue_1174827696302(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode mainNode = node.getReferent("mainNode");
    String role = node.getProperty("childRole");
    return mainNode.getChildCount(role) + "";
  }
  public static String propertyMacro_GetPropertyValue_1174828161687(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return node.getParent().getChildren(node.getRole_()).indexOf(node) + "";
  }
  public static String propertyMacro_GetPropertyValue_1174827615903(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "childVar_" + node.getId();
  }
  public static SNode referenceMacro_GetReferent_1176737467861(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(node, "antiquotations").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1176737471291(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(node, "antiquotationParameters").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174823842615(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(SNodeOperations.getParent(node, null, false, false), "matchMethodParameter").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174824244245(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(node, "childVar").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1176737721511(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    Antiquotation antiquotation = Antiquotation_AnnotationLink.getAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)));
    return generator.findNodeBuilderForSource(antiquotation.getNode(), "antiquotations").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174812340844(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SModelUtil_new.getAdapterClassConceptForConceptDeclaration((ConceptDeclaration)BaseAdapter.fromNode(SNodeOperations.getConceptDeclaration(node)), GlobalScope.getInstance()).getNode();
  }
  public static SNode referenceMacro_GetReferent_1174820532447(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String propertyName = node.getProperty("propertyName");
    SNode mainNode = node.getReferent("mainNode");
    SNode propertyPattern = mainNode.getPropertyAttribute(propertyName);
    return generator.findNodeBuilderForSource(propertyPattern, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1176737751209(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String refRole = node.getProperty("referentRole");
    ReferenceAntiquotation refAntiq = ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), refRole);
    return generator.findNodeBuilderForSource(refAntiq.getNode(), "antiquotations").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174903629930(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String referentRole = node.getProperty("referentRole");
    SNode mainNode = node.getReferent("mainNode");
    SNode linkPattern = mainNode.getLinkAttribute(referentRole);
    return generator.findNodeBuilderForSource(linkPattern, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174829805023(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(SNodeOperations.getParent(node, null, false, false), "nodeToMatch").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174901525140(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = node.getAttribute();
    return generator.findNodeBuilderForSource(attribute, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174909796960(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = node.getAttribute();
    return generator.findNodeBuilderForSource(attribute, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174909927153(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = node.getAttribute();
    return generator.findNodeBuilderForSource(attribute, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174909759055(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern(((BaseConcept)SNodeOperations.getAdapter(node))));
    return generator.findNodeBuilderForSource(attribute, "patternVarField").getTargetNode();
  }
  public static SNode referenceMacro_GetReferent_1174909655556(SNode node, SNode templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return generator.findNodeBuilderForSource(SNodeOperations.getParent(node, null, false, false), "nodeToMatch").getTargetNode();
  }
  public static boolean ifMacro_Condition_1174824018407(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return true;
  }
  public static boolean ifMacro_Condition_1174829755195(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return true;
  }
  public static boolean ifMacro_Condition_1174823958211(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return false;
  }
  public static boolean ifMacro_Condition_1174823869685(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) == SNodeOperations.getAncestor(node, "jetbrains.mps.patterns.structure.PatternExpression", false, false);
  }
  public static boolean ifMacro_Condition_1174824182938(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SNodeOperations.getParent(node, null, false, false) != SNodeOperations.getAncestor(node, "jetbrains.mps.patterns.structure.PatternExpression", false, false);
  }
  public static boolean ifMacro_Condition_1176732030280(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return Antiquotation_AnnotationLink.getAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node))) != null;
  }
  public static boolean ifMacro_Condition_1176736069371(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String refRole = node.getProperty("referentRole");
    return ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), refRole) == null;
  }
  public static boolean ifMacro_Condition_1176736075781(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String refRole = node.getProperty("referentRole");
    return ReferenceAntiquotation_AnnotationLink.getReferenceAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node)), refRole) != null;
  }
  public static boolean ifMacro_Condition_1174827615898(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return true;
  }
  public static boolean ifMacro_Condition_1174901500663(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = node.getAttribute();
    return attribute == null || attribute.getAdapter() instanceof AsPattern || !(attribute.getAdapter() instanceof Pattern);
  }
  public static boolean ifMacro_Condition_1174901525155(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return BaseAdapter.isInstance(node.getAttribute(), PatternVariableDeclaration.class);
  }
  public static boolean ifMacro_Condition_1174908349013(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String childRole_ = node.getProperty("childRole");
    SNode mainNode = node.getReferent("mainNode");
    List<SNode> children = mainNode.getChildren(childRole_);
    SNode attribute = children.get(0).getAttribute();
    return !(BaseAdapter.isInstance(attribute, ListPattern.class));
  }
  public static boolean ifMacro_Condition_1174909690038(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return true;
  }
  public static boolean ifMacro_Condition_1174909725929(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode attribute = node.getAttribute();
    return attribute == null || attribute.getAdapter() instanceof AsPattern || !(attribute.getAdapter() instanceof Pattern);
  }
  public static boolean ifMacro_Condition_1174909927168(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return BaseAdapter.isInstance(node.getAttribute(), PatternVariableDeclaration.class);
  }
  public static boolean ifMacro_Condition_1174909058836(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    String childRole_ = node.getProperty("childRole");
    SNode mainNode = node.getReferent("mainNode");
    List<SNode> children = mainNode.getChildren(childRole_);
    SNode attribute = BaseAdapter.fromAdapter(AsPattern_AnnotationLink.getAsPattern((BaseConcept)children.get(0).getAdapter()));
    return BaseAdapter.isInstance(attribute, ListPattern.class);
  }
  public static boolean ifMacro_Condition_1176735205259(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return Antiquotation_AnnotationLink.getAntiquotation((BaseConcept)((BaseConcept)SNodeOperations.getAdapter(node))) == null;
  }
  public static List sourceNodesQuery_1176737411271(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    for(SNode child : SNodeOperations.getDescendants(node, null)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.bootstrap.helgins.structure.AbstractAntiquotation")) {
        result.add(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }
  public static List sourceNodesQuery_1176737399740(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    for(SNode child : SNodeOperations.getDescendants(node, null)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.bootstrap.helgins.structure.AbstractAntiquotation")) {
        result.add(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }
  public static List sourceNodesQuery_1174811353234(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    result.addAll(SNodeOperations.getDescendants(node, "jetbrains.mps.patterns.structure.PatternVariableDeclaration"));
    result.addAll(SNodeOperations.getDescendants(node, "jetbrains.mps.patterns.structure.LinkPatternVariableDeclaration"));
    result.addAll(SNodeOperations.getDescendants(node, "jetbrains.mps.patterns.structure.PropertyPatternVariableDeclaration"));
    result.addAll(SNodeOperations.getDescendants(node, "jetbrains.mps.patterns.structure.AsPattern"));
    return result;
  }
  public static List sourceNodesQuery_1176737298135(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    for(SNode child : SNodeOperations.getDescendants(node, null)) {
      if(SNodeOperations.isInstanceOf(child, "jetbrains.mps.bootstrap.helgins.structure.AbstractAntiquotation")) {
        result.add(SLinkOperations.getTarget(child, "expression", true));
      }
    }
    return result;
  }
  public static List sourceNodesQuery_1174819769541(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    SModel model = generator.getTargetModel();
    for(String propertyName : node.getPropertyNames()) {
      if(BaseAdapter.isInstance(node.getPropertyAttribute(propertyName), PropertyPatternVariableDeclaration.class)) {
        continue;
      }
      String propertyValue = node.getProperty(propertyName);
      SNode propertyNode = BaseConcept.newInstance(model).getNode();
      propertyNode.setProperty("propertyName", propertyName);
      propertyNode.setProperty("propertyValue", propertyValue);
      result.add(propertyNode);
    }
    return result;
  }
  public static List sourceNodesQuery_1174820404943(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    SModel model = generator.getTargetModel();
    for(String propertyName : node.getPropertyNames()) {
      if(BaseAdapter.isInstance(node.getPropertyAttribute(propertyName), PropertyPatternVariableDeclaration.class)) {
        SNode propertyNode = BaseConcept.newInstance(model).getNode();
        propertyNode.setProperty("propertyName", propertyName);
        propertyNode.setReferent("mainNode", node);
        result.add(propertyNode);
      }
    }
    return result;
  }
  public static List sourceNodesQuery_1174905624103(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    SModel model = generator.getTargetModel();
    for(String referentRole : node.getReferenceRoles()) {
      if(BaseAdapter.isInstance(node.getLinkAttribute(referentRole), LinkPatternVariableDeclaration.class)) {
        continue;
      }
      SReference reference = node.getReference(referentRole);
      SNode referenceNode = BaseConcept.newInstance(model).getNode();
      referenceNode.setProperty("referentRole", referentRole);
      referenceNode.setProperty("referentModel", reference.getTargetModelUID().toString());
      boolean isExternalInfo = false;
      String targetInfo = "";
      String extResolveInfo = reference.getExtResolveInfo();
      if(extResolveInfo != null) {
        targetInfo = extResolveInfo;
        isExternalInfo = true;
      } else 
      {
        targetInfo = reference.getTargetNodeId();
      }
      referenceNode.setProperty("targetInfo", targetInfo);
      referenceNode.setProperty("isExternalInfo", isExternalInfo + "");
      result.add(referenceNode);
    }
    return result;
  }
  public static List sourceNodesQuery_1174903629967(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList();
    SModel model = generator.getTargetModel();
    for(String referentRole : node.getReferenceRoles()) {
      if(BaseAdapter.isInstance(node.getLinkAttribute(referentRole), LinkPatternVariableDeclaration.class)) {
        SNode linkNode = BaseConcept.newInstance(model).getNode();
        linkNode.setProperty("referentRole", referentRole);
        linkNode.setReferent("mainNode", node);
        result.add(linkNode);
      }
    }
    return result;
  }
  public static List sourceNodesQuery_1174827642254(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode mainNode = node.getReferent("mainNode");
    String role = node.getProperty("childRole");
    return mainNode.getChildren(role);
  }
  public static List sourceNodesQuery_1174909115493(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    SNode mainNode = node.getReferent("mainNode");
    String role = node.getProperty("childRole");
    result.add(mainNode.getChildren(role).get(0));
    return result;
  }
  public static List sourceNodesQuery_1174824306211(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> result = new ArrayList<SNode>();
    SModel model = generator.getTargetModel();
    ConceptDeclaration concept = node.getConceptDeclarationAdapter();
    for(String childRole : node.getChildRoles()) {
      SNode childRoleNode = BaseConcept.newInstance(model).getNode();
      childRoleNode.setProperty("childRole", childRole);
      childRoleNode.setReferent("childLinkDeclaration", SModelUtil_new.findLinkDeclaration(concept, childRole).getNode());
      childRoleNode.setReferent("mainNode", node);
      result.add(childRoleNode);
    }
    return result;
  }
  public static SNode sourceNodeQuery_1174830361094(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTarget(node, "patternNode", true);
  }
}
