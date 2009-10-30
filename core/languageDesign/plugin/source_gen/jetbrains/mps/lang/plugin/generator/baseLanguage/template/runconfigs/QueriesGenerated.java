package jetbrains.mps.lang.plugin.generator.baseLanguage.template.runconfigs;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.classifiers.behavior.ThisClassifierExpression_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.plugin.behavior.RunConfigCreator_Behavior;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.Macros;
import jetbrains.mps.project.IModule;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.plugin.behavior.RunConfigurationTypeDeclaration_Behavior;
import jetbrains.mps.lang.plugin.behavior.RunConfigurationDeclaration_Behavior;
import jetbrains.mps.lang.plugin.behavior.ActionDeclaration_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.typesystem.runtime.HUtil;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_680902548763517194(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(ThisClassifierExpression_Behavior.call_getClassifier_1213877512819(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration") && (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.GetConfigurationIconBlock", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_680902548763517325(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(ThisClassifierExpression_Behavior.call_getClassifier_1213877512819(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration") && (SNodeOperations.getAncestorWhereConceptInList(_context.getNode(), new String[]{"jetbrains.mps.lang.plugin.structure.GetConfigurationIconBlock","jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration"}, false, false) == null);
  }

  public static boolean baseMappingRule_Condition_3452826078638209704(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(ThisClassifierExpression_Behavior.call_getClassifier_1213877512819(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration") && (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.ConfigurationEditorDeclaration", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_7382861867148540167(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference") && (SNodeOperations.getAncestor(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_8294332872984117169(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference") && (SNodeOperations.getAncestor(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_8294332872984918711(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false) != null);
  }

  public static Object propertyMacro_GetPropertyValue_446387597135526855(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6017961579228925652(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_6135182812223258861(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SConceptPropertyOperations.getString(ListSequence.fromList(SLinkOperations.getConceptLinkTargets(RunConfigCreator_Behavior.call_getFunction_5528847031674340387(((SNode)SNodeOperations.getContainingRoot(_context.getNode()))), "applicableConceptFunctionParameter")).first(), "alias");
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674830541(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "caption");
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674901990(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "description");
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674908490(final IOperationContext operationContext, final PropertyMacroContext _context) {
    if (SPropertyOperations.getString(_context.getNode(), "iconPath").startsWith(Macros.MPS_HOME)) {
      _context.showWarningMessage(_context.getNode(), "Icon path is stored relative to project home. This may not work in builds (packaged).");
    }
    return SPropertyOperations.getString(_context.getNode(), "iconPath").replaceAll("\\\\", "\\\\\\\\");
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674908516(final IOperationContext operationContext, final PropertyMacroContext _context) {
    IModule module = ((TemplateQueryContext)_context).getGenerator().getGeneratorSessionContext().getInvocationContext().getModule();
    return (module == null ?
      null :
      module.getModuleFqName()
    );
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674908563(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674946761(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationTypeDeclaration_Behavior.call_getGeneratedName_7840798570674947566(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674951685(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationDeclaration_Behavior.call_getGeneratedFactoryName_7840798570674951628(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7840798570674954473(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return RunConfigurationDeclaration_Behavior.call_getGeneratedName_7840798570674951656(_context.getNode());
  }

  public static Object propertyMacro_GetPropertyValue_7840798570675189135(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ActionDeclaration_Behavior.call_getGeneratedClassFQName_1213877371952(SLinkOperations.getTarget(_context.getNode(), "action", false));
  }

  public static Object propertyMacro_GetPropertyValue_7840798570675189145(final IOperationContext operationContext, final PropertyMacroContext _context) {
    SModel actionModel = SNodeOperations.getModel(SLinkOperations.getTarget(_context.getNode(), "action", false));
    SModel referenceModel = SNodeOperations.getModel(_context.getNode());
    SModel originalModel = (actionModel == referenceModel ?
      _context.getOriginalInputModel() :
      actionModel
    );
    return originalModel.getModelDescriptor().getModule().getModuleFqName();
  }

  public static Object referenceMacro_GetReferent_122179271028795198(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "rcType", false), "map_ConfigTypeClass");
  }

  public static Object referenceMacro_GetReferent_122179271028796582(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "runConfig", false), "configType", false), "map_ConfigTypeClass");
  }

  public static Object referenceMacro_GetReferent_122179271028796598(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "runConfig", false), "configType", false), "map_ConfigTypeClass");
  }

  public static Object referenceMacro_GetReferent_446387597135526744(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "rcType", false), "map_ConfigTypeClass");
  }

  public static Object referenceMacro_GetReferent_446387597135526757(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode typeNode = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "target", true));
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(typeNode, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false);
  }

  public static Object referenceMacro_GetReferent_446387597135526769(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode typeNode = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "target", true));
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(typeNode, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false);
  }

  public static Object referenceMacro_GetReferent_446387597135526789(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode typeNode = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(_context.getNode(), "target", true));
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(typeNode, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false);
  }

  public static Object referenceMacro_GetReferent_446387597135550933(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "concept", false) == null ?
      SLinkOperations.getTarget(new _Quotations.QuotationClass_0().createNode(), "concept", false) :
      SLinkOperations.getTarget(_context.getNode(), "concept", false)
    );
  }

  public static Object referenceMacro_GetReferent_2751171488135057072(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_4351631783611294035(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_4351631783611294071(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_4351631783611294090(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false);
  }

  public static Object referenceMacro_GetReferent_5447563960349298683(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode oldCreatorClass = _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigCreator", false, false), "map_OldConfigCreatorClass");
    if ((oldCreatorClass != null)) {
      return oldCreatorClass;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.UniversalRunConfigCreator", false, false), "map_ConfigCreatorClass");
  }

  public static Object referenceMacro_GetReferent_5447563960349298714(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode oldCreatorClass = _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigCreator", false, false), "map_OldConfigCreatorClass");
    if ((oldCreatorClass != null)) {
      return oldCreatorClass;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.UniversalRunConfigCreator", false, false), "map_ConfigCreatorClass");
  }

  public static Object referenceMacro_GetReferent_5528847031674334455(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return RunConfigCreator_Behavior.call_getCreatorTypeParameter_5528847031674330314(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_5528847031674340374(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return RunConfigCreator_Behavior.call_getCreatorTypeParameter_5528847031674330314(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_5528847031674340381(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return RunConfigCreator_Behavior.call_getCreatorTypeParameter_5528847031674330314(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_5528847031674365850(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode creatorNode = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigCreator", false, false);
    if ((creatorNode != null)) {
      return RunConfigCreator_Behavior.call_getCreatorTypeParameter_5528847031674330314(creatorNode);
    }
    SNode typeNode = TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.UniversalRunConfigCreator", false, false), "target", true));
    return SLinkOperations.getTarget(TypeChecker.getInstance().getRuntimeSupport().coerce_(typeNode, HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ClassifierType"), true), "classifier", false);
  }

  public static Object referenceMacro_GetReferent_6707043251018967862(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false), "map_SettingsEditor");
  }

  public static Object referenceMacro_GetReferent_7382861867148540640(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "map_PersistentProperty");
  }

  public static Object referenceMacro_GetReferent_7603318568954580210(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return RunConfigCreator_Behavior.call_getCreatorTypeParameter_5528847031674330314(_context.getNode());
  }

  public static Object referenceMacro_GetReferent_7840798570674946672(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "map_FactoryConstructor");
  }

  public static Object referenceMacro_GetReferent_7840798570674952471(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "map_ConfigConstructor");
  }

  public static Object referenceMacro_GetReferent_7974234327424529467(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "runConfig", false), "map_ConfigClass");
  }

  public static Object referenceMacro_GetReferent_8294332872984122924(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "map_PersistentProperty");
  }

  public static Object referenceMacro_GetReferent_8294332872984607864(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.cast(ThisClassifierExpression_Behavior.call_getClassifier_1213877512819(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration"), "map_ConfigClass");
  }

  public static Object referenceMacro_GetReferent_9068086904326281899(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    SNode oldCreatorClass = _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.RunConfigCreator", false, false), "map_OldConfigCreatorClass");
    if ((oldCreatorClass != null)) {
      return oldCreatorClass;
    }
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.UniversalRunConfigCreator", false, false), "map_ConfigCreatorClass");
  }

  public static Object referenceMacro_GetReferent_9068086904326285594(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), "property", false), "map_PersistentProperty");
  }

  public static boolean ifMacro_Condition_4418372807722341507(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "configName", true) != null);
  }

  public static boolean ifMacro_Condition_5235140547387554339(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "suggestedName", true) != null);
  }

  public static boolean ifMacro_Condition_5235140547387554343(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "suggestedName", true) != null);
  }

  public static boolean ifMacro_Condition_6707043251019108517(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "resetBlock", true) != null);
  }

  public static boolean ifMacro_Condition_6707043251019108547(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "applyBlock", true) != null);
  }

  public static boolean ifMacro_Condition_6707043251019108600(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "disposeBlock", true) != null);
  }

  public static boolean ifMacro_Condition_7840798570674908544(final IOperationContext operationContext, final IfMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "iconPath") != null;
  }

  public static boolean ifMacro_Condition_8294332872984122874(final IOperationContext operationContext, final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), "iconBlock", true) != null);
  }

  public static boolean ifMacro_Condition_8821770403474041673(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "checkBlock", true) != null;
  }

  public static boolean ifMacro_Condition_8901044928163425520(final IOperationContext operationContext, final IfMacroContext _context) {
    if (SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType")) {
      if (!(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "type", true), "jetbrains.mps.baseLanguage.structure.ClassifierType"), "classifier", false), "jetbrains.mps.baseLanguage.structure.EnumClass"))) {
        return true;
      }
    }
    return false;
  }

  public static SNode sourceNodeQuery_90909550749889565(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "disposeBlock", true);
  }

  public static SNode sourceNodeQuery_446387597135526817(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "createBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_446387597135550859(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "target", true);
  }

  public static SNode sourceNodeQuery_1105312746397538781(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SNodeOperations.copyNode(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "editor", true)));
  }

  public static SNode sourceNodeQuery_4418372807722341496(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "configName", true);
  }

  public static SNode sourceNodeQuery_5235140547387557608(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "suggestedName", true);
  }

  public static SNode sourceNodeQuery_5447563960349298753(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(RunConfigCreator_Behavior.call_getFunction_5528847031674340387(_context.getNode()), "body", true);
  }

  public static SNode sourceNodeQuery_5528847031674365840(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "contextItem", true);
  }

  public static SNode sourceNodeQuery_6483235410534828656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "command", true);
  }

  public static SNode sourceNodeQuery_6586153900349333382(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "actions", true);
  }

  public static SNode sourceNodeQuery_6707043251019108530(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "resetBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_6707043251019108560(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "applyBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_6707043251019108583(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "editor", true);
  }

  public static SNode sourceNodeQuery_6707043251019108613(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "editor", true), "disposeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_7382861867148540655(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_7840798570675188757(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "executeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_7840798570675189676(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "processHandler", true);
  }

  public static SNode sourceNodeQuery_7840798570675189708(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "consoleComponent", true);
  }

  public static SNode sourceNodeQuery_8294332872984074416(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "iconBlock", true);
  }

  public static SNode sourceNodeQuery_8294332872985085200(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_8821770403474041647(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "checkBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_8821770403474041737(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "error", true);
  }

  public static SNode sourceNodeQuery_9061443648117888919(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "process", true);
  }

  public static SNode sourceNodeQuery_9068086904326285561(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "propertyValue", true);
  }

  public static Iterable sourceNodesQuery_7382861867148541769(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_7840798570674946693(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration")).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, "configType", false) == _context.getNode();
      }
    });
  }

  public static Iterable sourceNodesQuery_7840798570675189183(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "actualParameter", true);
  }

  public static Iterable sourceNodesQuery_7840798570675189192(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "action", true);
  }

  public static Iterable sourceNodesQuery_8901044928163425516(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

  public static Iterable sourceNodesQuery_9068086904326285565(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }
}
