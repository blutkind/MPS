package jetbrains.mps.lang.plugin.generator.baseLanguage.template.runconfigs;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.Macros;
import jetbrains.mps.project.IModule;
import jetbrains.mps.generator.template.TemplateQueryContext;
import jetbrains.mps.lang.plugin.behavior.RunConfigurationTypeDeclaration_Behavior;
import jetbrains.mps.lang.plugin.behavior.RunConfigurationDeclaration_Behavior;
import jetbrains.mps.lang.plugin.behavior.ActionDeclaration_Behavior;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class QueriesGenerated {

  public static boolean baseMappingRule_Condition_8294332872984075972(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.lang.plugin.structure.GetConfigurationIconBlock", false, false) != null);
  }

  public static boolean baseMappingRule_Condition_8294332872984117169(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference") && (SNodeOperations.getAncestor(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration", false, false) != null);
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

  public static Object referenceMacro_GetReferent_7840798570674946672(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "map_FactoryConstructor");
  }

  public static Object referenceMacro_GetReferent_7840798570674952471(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "map_ConfigConstructor");
  }

  public static Object referenceMacro_GetReferent_8294332872984122924(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SNodeOperations.cast(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.plugin.structure.PersistentPropertyReference"), "member", false), "map_PersistentProperty");
  }

  public static boolean ifMacro_Condition_2637335201204785421(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "disposeBlock", true) != null;
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

  public static SNode sourceNodeQuery_7840798570675188757(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "executeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_7840798570675189676(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "processHandler", true);
  }

  public static SNode sourceNodeQuery_7840798570675189708(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "consoleComponent", true);
  }

  public static SNode sourceNodeQuery_7840798570675189719(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "disposeBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_8294332872984074416(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "iconBlock", true);
  }

  public static SNode sourceNodeQuery_8821770403474041647(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "checkBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_8821770403474041737(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "error", true);
  }

  public static Iterable sourceNodesQuery_7840798570674946693(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(SNodeOperations.getModel(_context.getNode()), "jetbrains.mps.lang.plugin.structure.RunConfigurationDeclaration")).where(new IWhereFilter <SNode>() {

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

  public static Iterable sourceNodesQuery_8294332872984122864(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "property", true);
  }

}
