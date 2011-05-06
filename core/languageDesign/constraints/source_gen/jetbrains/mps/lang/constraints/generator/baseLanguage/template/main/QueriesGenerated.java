package jetbrains.mps.lang.constraints.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.behaviour.BehaviorConstants;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.kernel.model.SModelUtil;
import jetbrains.mps.lang.constraints.behavior.ConstraintFunction_ReferentSearchScope_Factory_Behavior;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.DataTypeDeclaration_Behavior;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import java.util.Set;
import java.util.HashSet;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.smodel.SModelReference;
import jetbrains.mps.smodel.SNodeId;

public class QueriesGenerated {
  public static Object propertyMacro_GetPropertyValue_1213106242798(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1213106765283(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_CHILD_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1213106765314(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_PARENT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_1227085912913(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_A_ROOT_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_7855321458717409144(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return BehaviorConstants.CAN_BE_AN_ANCESTOR_METHOD_NAME;
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664512993(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true) != null;
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664592487(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return NameUtil.nodeFQName(SLinkOperations.getTarget(_context.getNode(), "concept", false));
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664595687(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SNode concept = ((SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false) != null) ?
      SLinkOperations.getTarget(_context.getNode(), "defaultConcreteConcept", false) :
      SLinkOperations.getTarget(_context.getNode(), "concept", false)
    );
    return NameUtil.nodeFQName(concept);
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664632734(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664632747(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true).getId();
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664636418(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_3043699116664636433(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true).getId();
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979134456(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979134471(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true).getId();
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979134550(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979134565(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true).getId();
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979187694(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979187902(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_2208901195979188035(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "applicableProperty", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6971625110309027564(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_5979740912231476214(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SModelUtil.getGenuineLinkRole(SLinkOperations.getTarget(_context.getNode(), "applicableLink", false));
  }

  public static Object propertyMacro_GetPropertyValue_5979740912231476107(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalInputModel().getSModelReference().toString();
  }

  public static Object propertyMacro_GetPropertyValue_5979740912231476120(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return _context.getOriginalCopiedInputNode((ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_isValidatorGenerated_522233044824082130(((SNode) _context.getVariable("factory"))) ?
      ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_getValidator_2990203945683058946(((SNode) _context.getVariable("factory"))) :
      ((SNode) _context.getVariable("factory"))
    )).getId();
  }

  public static Object referenceMacro_GetReferent_1198586190309(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode propertyConstraint = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.constraints.structure.NodePropertyConstraint", false, false);
    SNode property = SLinkOperations.getTarget(propertyConstraint, "applicableProperty", false);
    SNode dataType = SLinkOperations.getTarget(property, "dataType", false);
    if (dataType == null) {
      return null;
    }
    SNode bltype = DataTypeDeclaration_Behavior.call_toBaseLanguageType_1213877229718(dataType);
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.IntegerType")) {
      return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a5a32().createNode(), "baseMethodDeclaration", false);
    }
    if (SNodeOperations.isInstanceOf(bltype, "jetbrains.mps.baseLanguage.structure.BooleanType")) {
      return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a0a6a32().createNode(), "baseMethodDeclaration", false);
    }
    return SLinkOperations.getTarget(new QueriesGenerated.QuotationClass_x583g4_a0a7a32().createNode(), "baseMethodDeclaration", false);
  }

  public static boolean ifMacro_Condition_1213106765274(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null;
  }

  public static boolean ifMacro_Condition_1213106765305(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null;
  }

  public static boolean ifMacro_Condition_1227085790509(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null);
  }

  public static boolean ifMacro_Condition_7852712695066963272(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979101044(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeChild", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979133678(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979134486(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeParent", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979134580(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979195835(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979195871(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertySetter", true) != null);
  }

  public static boolean ifMacro_Condition_2208901195979195900(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true) != null);
  }

  public static boolean ifMacro_Condition_6971625110309094112(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "keepsReference", true) == null);
  }

  public static boolean ifMacro_Condition_6971625110309094132(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "keepsReference", true) != null);
  }

  public static boolean ifMacro_Condition_6971625110309027607(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true) != null);
  }

  public static boolean ifMacro_Condition_487837143243401814(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "defaultScope", true) != null);
  }

  public static boolean ifMacro_Condition_5979740912231475953(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_5979740912231475969(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("presentation")) != null);
  }

  public static boolean ifMacro_Condition_2185712519096063837(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("factory")) != null);
  }

  public static boolean ifMacro_Condition_5979740912231476080(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("factory")) != null) && ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_isValidatorGenerated_522233044824082130(((SNode) _context.getVariable("factory")));
  }

  public static boolean ifMacro_Condition_2185712519096101731(final IOperationContext operationContext, final IfMacroContext _context) {
    return (((SNode) _context.getVariable("factory")) != null);
  }

  public static SNode sourceNodeQuery_1213106765261(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeChild", true), "body", true);
  }

  public static SNode sourceNodeQuery_1213106765292(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeParent", true), "body", true);
  }

  public static SNode sourceNodeQuery_1227085938282(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeRoot", true), "body", true);
  }

  public static SNode sourceNodeQuery_4581029622790076870(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "canBeAncestor", true), "body", true);
  }

  public static SNode sourceNodeQuery_3043699116664545625(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    if (SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true) != null) {
      return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "alternativeIcon", true), "body", true);
    } else {
      return new QueriesGenerated.QuotationClass_x583g4_a0a0a0a84().createNode();
    }
  }

  public static SNode sourceNodeQuery_2208901195979187854(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyGetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_2208901195979187984(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertySetter", true), "body", true);
  }

  public static SNode sourceNodeQuery_2208901195979188116(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "propertyValidator", true), "body", true);
  }

  public static SNode sourceNodeQuery_6971625110309094079(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "referentSetHandler", true), "body", true);
  }

  public static SNode sourceNodeQuery_6971625110309094123(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "keepsReference", true), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231422679(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(((SNode) _context.getVariable("presentation")), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231476010(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(((SNode) _context.getVariable("factory")), "body", true);
  }

  public static SNode sourceNodeQuery_5979740912231476063(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(ConstraintFunction_ReferentSearchScope_Factory_Behavior.call_getValidator_2990203945683058946(((SNode) _context.getVariable("factory"))), "body", true);
  }

  public static Object templateArgumentQuery_5979740912231480366(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_5979740912231480383(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "defaultScope", true), "presentation", true);
  }

  public static Object templateArgumentQuery_5979740912231481080(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "searchScopeFactory", true);
  }

  public static Object templateArgumentQuery_5979740912231481084(final IOperationContext operationContext, final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "presentation", true);
  }

  public static Iterable sourceNodesQuery_2208901195979187652(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_2208901195979187945(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_2208901195979188078(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_6971625110309027600(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "referent", true);
  }

  public static Iterable sourceNodesQuery_5979740912231476303(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "referent", true);
  }

  public static class QuotationClass_x583g4_a0a0a5a32 {
    public QuotationClass_x583g4_a0a0a5a32() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getInteger(java.lang.String):int")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a6a32 {
    public QuotationClass_x583g4_a0a0a6a32() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getBoolean(java.lang.String):boolean")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a7a32 {
    public QuotationClass_x583g4_a0a7a32() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StaticMethodCall", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_2 = quotedNode_1;
        quotedNode1_2.addReference(SReference.create("classConcept", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations")));
        quotedNode1_2.addReference(SReference.create("baseMethodDeclaration", quotedNode1_2, SModelReference.fromString("f:java_stub#37a3367b-1fb2-44d8-aa6b-18075e74e003#jetbrains.mps.lang.smodel.generator.smodelAdapter(jetbrains.mps.lang.smodel.generator.smodelAdapter@java_stub)"), SNodeId.fromString("~SPropertyOperations.getString(java.lang.String):java.lang.String")));
        result = quotedNode1_2;
      }
      return result;
    }
  }

  public static class QuotationClass_x583g4_a0a0a0a84 {
    public QuotationClass_x583g4_a0a0a0a84() {
    }

    public SNode createNode() {
      SNode result = null;
      Set<SNode> _parameterValues_129834374 = new HashSet<SNode>();
      SNode quotedNode_1 = null;
      SNode quotedNode_2 = null;
      SNode quotedNode_3 = null;
      {
        quotedNode_1 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.StatementList", null, GlobalScope.getInstance(), false);
        SNode quotedNode1_4 = quotedNode_1;
        {
          quotedNode_2 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ReturnStatement", null, GlobalScope.getInstance(), false);
          SNode quotedNode1_5 = quotedNode_2;
          {
            quotedNode_3 = SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.NullLiteral", null, GlobalScope.getInstance(), false);
            SNode quotedNode1_6 = quotedNode_3;
            quotedNode_2.addChild("expression", quotedNode1_6);
          }
          quotedNode_1.addChild("statement", quotedNode1_5);
        }
        result = quotedNode1_4;
      }
      return result;
    }
  }
}
