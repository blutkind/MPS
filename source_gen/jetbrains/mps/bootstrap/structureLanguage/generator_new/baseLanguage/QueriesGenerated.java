package jetbrains.mps.bootstrap.structureLanguage.generator_new.baseLanguage;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ITemplateGenerator;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.PropertySupport;
import jetbrains.mps.bootstrap.structureLanguage.structure.PrimitiveDataTypeDeclaration;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.bootstrap.structureLanguage.generator_new.util.QueriesUtil;
import java.util.List;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.ICursor;
import jetbrains.mps.baseLanguage.ext.collections.internal.CursorFactory;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_1167266219124(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode type = SLinkOperations.getTarget(node, "memberDataType", false);
    return PropertySupport.isString(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(type)));
  }

  public static boolean baseMappingRule_Condition_1167266685049(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode type = SLinkOperations.getTarget(node, "memberDataType", false);
    return PropertySupport.isBoolean(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(type)));
  }

  public static boolean baseMappingRule_Condition_1167266687532(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    SNode type = SLinkOperations.getTarget(node, "memberDataType", false);
    return PropertySupport.isInteger(((PrimitiveDataTypeDeclaration)SNodeOperations.getAdapter(type)));
  }

  public static boolean baseMappingRule_Condition_1167267315256(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.hasValue(node, "name", "AttributeConcept");
  }

  public static boolean baseMappingRule_Condition_1169582607456(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "propertyDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169582607528(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "propertyDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169582607585(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "propertyDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169582607642(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "propertyDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169582939030(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "linkDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169583297029(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "linkDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169591070445(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "linkDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169592290031(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "linkDeclaration") > 0;
    return b1 || b2;
  }

  public static boolean baseMappingRule_Condition_1169592375050(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    boolean b1 = SLinkOperations.getCount(node, "implements") > 0;
    boolean b2 = SLinkOperations.getCount(node, "linkDeclaration") > 0;
    return b1 || b2;
  }

  public static Object propertyMacro_GetPropertyValue_1170239141486(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.nodeFQName(SNodeOperations.getConceptDeclaration(node));
  }

  public static Object propertyMacro_GetPropertyValue_1168020996282(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1168020858179(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "CPR_" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1168021031848(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1168020946114(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "CLNK_" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1168019908729(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1169581753467(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "get" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1169581814828(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "set" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1169581703461(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1169581811302(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.toConstantName(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1174698175154(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "externalValue");
  }

  public static Object propertyMacro_GetPropertyValue_1174698110415(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1174698054118(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1174697681347(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "constraint");
  }

  public static Object propertyMacro_GetPropertyValue_1174696429121(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name") + "_PropertySupport";
  }

  public static Object propertyMacro_GetPropertyValue_1169755844288(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "role");
  }

  public static Object propertyMacro_GetPropertyValue_1169755781139(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.toConstantName(SPropertyOperations.getString(node, "role"));
  }

  public static Object propertyMacro_GetPropertyValue_1169758290216(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    if(QueriesUtil.AL_isSingular(node)) {
      return "set" + NameUtil.capitalize(SPropertyOperations.getString(node, "role"));
    }
    return "add" + NameUtil.capitalize(SPropertyOperations.getString(node, "role"));
  }

  public static Object propertyMacro_GetPropertyValue_1169755707217(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return NameUtil.capitalize(SPropertyOperations.getString(node, "role")) + "_AnnotationLink";
  }

  public static Object propertyMacro_GetPropertyValue_1170173405392(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170173405408(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "CPR_" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1170173405421(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static Object propertyMacro_GetPropertyValue_1170173405437(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return "CLNK_" + NameUtil.capitalize(SPropertyOperations.getString(node, "name"));
  }

  public static Object propertyMacro_GetPropertyValue_1169126625179(SNode node, String templateValue, SNode templateNode, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.getString(node, "name");
  }

  public static SNode referenceMacro_GetReferent_1169130026119(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return _QueriesUtil.extendedInterfaceConcept_generatedInterface(node, templateNode, generator);
  }

  public static SNode referenceMacro_GetReferent_1168020518409(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return _QueriesUtil.extendedConcept_generatedClass(node, templateNode, generator);
  }

  public static SNode referenceMacro_GetReferent_1169128252878(SNode node, SNode templateNode, SNode outputNode, SModel sourceModel, ITemplateGenerator generator) {
    return _QueriesUtil.extendedInterfaceConcept_generatedInterface(node, templateNode, generator);
  }

  public static boolean ifMacro_Condition_1169758775014(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isSingular(node);
  }

  public static boolean ifMacro_Condition_1169758852353(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isPlural(node);
  }

  public static boolean ifMacro_Condition_1169755885217(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.hasValue(node, "stereotype", "node", "node");
  }

  public static boolean ifMacro_Condition_1169756756933(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isNodeStereotypeAndSingular(node);
  }

  public static boolean ifMacro_Condition_1169756892981(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isNodeStereotypeAndPlural(node);
  }

  public static boolean ifMacro_Condition_1169758908113(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isSingular(node);
  }

  public static boolean ifMacro_Condition_1169758921200(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isPlural(node);
  }

  public static boolean ifMacro_Condition_1169756449482(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.hasValue(node, "stereotype", "property", "node");
  }

  public static boolean ifMacro_Condition_1169757005015(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isPropertyStereotypeAndSingular(node);
  }

  public static boolean ifMacro_Condition_1169757018379(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isPropertyStereotypeAndPlural(node);
  }

  public static boolean ifMacro_Condition_1169758945100(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isSingular(node);
  }

  public static boolean ifMacro_Condition_1169758933189(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isPlural(node);
  }

  public static boolean ifMacro_Condition_1169756475519(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SPropertyOperations.hasValue(node, "stereotype", "link", "node");
  }

  public static boolean ifMacro_Condition_1169757197199(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isLinkStereotypeAndSingular(node);
  }

  public static boolean ifMacro_Condition_1169757149991(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return QueriesUtil.AL_isLinkStereotypeAndPlural(node);
  }

  public static boolean ifMacro_Condition_1173128500049(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getCount(node, "extends") == 0;
  }

  public static List sourceNodesQuery_1169129983235(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "implements", true);
  }

  public static List sourceNodesQuery_1167954157081(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "conceptPropertyDeclaration", true);
  }

  public static List sourceNodesQuery_1168019837671(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "conceptLinkDeclaration", true);
  }

  public static List sourceNodesQuery_1174698255353(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "member", true);
  }

  public static List sourceNodesQuery_1174700250815(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "member", true);
  }

  public static List sourceNodesQuery_1174700303502(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "member", true);
  }

  public static List sourceNodesQuery_1170173405399(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "conceptPropertyDeclaration", true);
  }

  public static List sourceNodesQuery_1170173405428(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "conceptLinkDeclaration", true);
  }

  public static List sourceNodesQuery_1169127967850(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SLinkOperations.getTargets(node, "extends", true);
  }

  public static List sourceNodesQuery_1169582607427(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all string-type-properties from implemented interfaces
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper(null, null)));
  }

  public static List sourceNodesQuery_1169582607484(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all boolean-type-properties from implemented interfaces
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper1(null, null)));
  }

  public static List sourceNodesQuery_1169582607556(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all integer-type-properties from implemented interfaces
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper2(null, null)));
  }

  public static List sourceNodesQuery_1169582607613(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all enum-type-properties from implemented interfaces
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper3(null, null)));
  }

  public static List sourceNodesQuery_1169582939001(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all reference links with cardinality=1 and no specialization
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper4(null, null)));
  }

  public static List sourceNodesQuery_1169583297000(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all reference links with cardinality=1 and specialization
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper5(null, null)));
  }

  public static List sourceNodesQuery_1169591070416(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all aggregation links with cardinality:1 and no specialization
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper6(null, null)));
  }

  public static List sourceNodesQuery_1169592290002(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all aggregation links with cardinality:1 and specialization
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper7(null, null)));
  }

  public static List sourceNodesQuery_1169592375021(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    List<SNode> concepts = QueriesUtil.conceptAndItsInterfaces(node);
    // all aggregation links with cardinality:n and no specialization
    return SequenceOperations.toList(SequenceOperations.map(concepts, new zMapper8(null, null)));
  }

  public static List sourceNodesQuery_1169751054593(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "propertyDeclaration", true), new zPredicate(null, null)));
  }

  public static List sourceNodesQuery_1169751903568(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "propertyDeclaration", true), new zPredicate1(null, null)));
  }

  public static List sourceNodesQuery_1169751987220(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "propertyDeclaration", true), new zPredicate2(null, null)));
  }

  public static List sourceNodesQuery_1169752052157(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "propertyDeclaration", true), new zPredicate3(null, null)));
  }

  public static List sourceNodesQuery_1169752120196(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "linkDeclaration", true), new zPredicate4(null, null)));
  }

  public static List sourceNodesQuery_1169753230932(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "linkDeclaration", true), new zPredicate5(null, null)));
  }

  public static List sourceNodesQuery_1169753275330(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "linkDeclaration", true), new zPredicate6(null, null)));
  }

  public static List sourceNodesQuery_1169753367103(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "linkDeclaration", true), new zPredicate7(null, null)));
  }

  public static List sourceNodesQuery_1169753422079(SNode node, SModel sourceModel, ITemplateGenerator generator, IScope scope, IOperationContext operationContext) {
    return SequenceOperations.toList(SequenceOperations.where(SLinkOperations.getTargets(node, "linkDeclaration", true), new zPredicate8(null, null)));
  }

  public static SNode mapSrcMacro_mapper_1178978044712(SNode node, SNode parentOutputNode, ITemplateGenerator generator) {
    SNode enumDataType = SNodeOperations.getParent(node, null, false, false);
    String internalValue = SPropertyOperations.getString(node, "internalValue");
    SNode memberDataType = SLinkOperations.getTarget(enumDataType, "memberDataType", false);
    SNode targetInternalValueExpression = null;
    SModel targetModel = generator.getTargetModel();
    if(SPropertyOperations.hasValue(memberDataType, "name", "string")) {
      if(internalValue == null) {
        targetInternalValueExpression = SModelOperations.createNewNode(targetModel, "jetbrains.mps.baseLanguage.structure.NullLiteral", null);
      } else
      {
        targetInternalValueExpression = SModelOperations.createNewNode(targetModel, "jetbrains.mps.baseLanguage.structure.StringLiteral", null);
        SPropertyOperations.set(targetInternalValueExpression, "value", internalValue);
      }
    } else
    if(SPropertyOperations.hasValue(memberDataType, "name", "boolean")) {
      targetInternalValueExpression = SModelOperations.createNewNode(targetModel, "jetbrains.mps.baseLanguage.structure.BooleanConstant", null);
      if(internalValue == null) {
        SPropertyOperations.set(targetInternalValueExpression, "value", "" + (true));
      } else
      {
        SPropertyOperations.set(targetInternalValueExpression, "value", "" + (Boolean.parseBoolean(internalValue)));
      }
    } else
    if(SPropertyOperations.hasValue(memberDataType, "name", "integer")) {
      targetInternalValueExpression = SModelOperations.createNewNode(targetModel, "jetbrains.mps.baseLanguage.structure.IntegerConstant", null);
      if(internalValue == null) {
        SPropertyOperations.set(targetInternalValueExpression, "value", "" + (0));
      } else
      {
        SPropertyOperations.set(targetInternalValueExpression, "value", "" + (Integer.parseInt(internalValue)));
      }
    }
    if((targetInternalValueExpression == null)) {
      generator.showErrorMessage(enumDataType, "Can't generate value for type " + SPropertyOperations.getString(memberDataType, "name"));
    }
    return targetInternalValueExpression;
  }

  public static SNode templateFragment_ContextNodeQuery_1184375448947(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    List<SNode> methods = SLinkOperations.getTargets(mainContextNode, "method", true);
    {
      ICursor<SNode> _zCursor9 = CursorFactory.createCursor(methods);
      try {
        while(_zCursor9.moveToNext()) {
          SNode method = _zCursor9.getCurrent();
          if("getValueAsString".equals(SPropertyOperations.getString(method, "name"))) {
            return SLinkOperations.getTarget(method, "body", true);
          }
        }
      } finally {
        _zCursor9.release();
      }
    }
    return null;
  }

  public static SNode templateFragment_ContextNodeQuery_1184375942612(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    List<SNode> methods = SLinkOperations.getTargets(mainContextNode, "method", true);
    {
      ICursor<SNode> _zCursor10 = CursorFactory.createCursor(methods);
      try {
        while(_zCursor10.moveToNext()) {
          SNode method = _zCursor10.getCurrent();
          if("getValueAsString".equals(SPropertyOperations.getString(method, "name"))) {
            return SLinkOperations.getTarget(method, "body", true);
          }
        }
      } finally {
        _zCursor10.release();
      }
    }
    return null;
  }

  public static SNode templateFragment_ContextNodeQuery_1184375906184(SNode node, SNode mainContextNode, ITemplateGenerator generator) {
    List<SNode> methods = SLinkOperations.getTargets(mainContextNode, "method", true);
    {
      ICursor<SNode> _zCursor11 = CursorFactory.createCursor(methods);
      try {
        while(_zCursor11.moveToNext()) {
          SNode method = _zCursor11.getCurrent();
          if("getValueAsString".equals(SPropertyOperations.getString(method, "name"))) {
            return SLinkOperations.getTarget(method, "body", true);
          }
        }
      } finally {
        _zCursor11.release();
      }
    }
    return null;
  }

}
