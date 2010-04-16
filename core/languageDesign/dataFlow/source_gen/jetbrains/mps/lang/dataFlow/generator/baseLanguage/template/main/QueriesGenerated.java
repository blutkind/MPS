package jetbrains.mps.lang.dataFlow.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.core.behavior.INamedConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.ISelector;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_8756503640281003227(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.lang.dataFlow.structure.BaseInstructionOperation");
  }

  public static Object propertyMacro_GetPropertyValue_1206456545048(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(_context.getNode(), "conceptDeclaration", false));
  }

  public static Object propertyMacro_GetPropertyValue_1206456427297(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1207063014986(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), "label", false), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1207063142468(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_1206456619706(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "dataFlowBuilderConstructor");
  }

  public static boolean ifMacro_Condition_3063987229946191549(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "position", true) != null;
  }

  public static boolean ifMacro_Condition_3063987229946254751(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "position", true) != null;
  }

  public static SNode sourceNodeQuery_8756503640281024578(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }

  public static SNode sourceNodeQuery_1206456672226(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "builderBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1215195642591(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "codeFor", true);
  }

  public static SNode sourceNodeQuery_3063987229946191546(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "position", true);
  }

  public static SNode sourceNodeQuery_1206457204137(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "jumpTo", true);
  }

  public static SNode sourceNodeQuery_3063987229946254760(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "position", true);
  }

  public static SNode sourceNodeQuery_1206457232122(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "jumpTo", true);
  }

  public static SNode sourceNodeQuery_1206457018606(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variable", true);
  }

  public static SNode sourceNodeQuery_1206457029675(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variable", true);
  }

  public static SNode sourceNodeQuery_1230548357391(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static SNode sourceNodeQuery_1206457136740(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "relativeTo", true);
  }

  public static SNode sourceNodeQuery_1206457164922(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "relativeTo", true);
  }

  public static SNode sourceNodeQuery_1206535717257(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "emitStatement", true);
  }

  public static SNode sourceNodeQuery_1206957434165(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "tryPart", true);
  }

  public static SNode sourceNodeQuery_1206957448491(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "finallyPart", true);
  }

  public static SNode sourceNodeQuery_1235407415949(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variable", true);
  }

  public static SNode sourceNodeQuery_1235407468435(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "value", true);
  }

  public static SNode sourceNodeQuery_3063987229946254704(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "instruction", true);
  }

  public static SNode sourceNodeQuery_3063987229946254740(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "instruction", true);
  }

  public static SNode sourceNodeQuery_2959643274329985279(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_8756503640280628683(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_7180022869589056777(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_7180022869589078151(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static Iterable sourceNodesQuery_1206456525472(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ListSequence.fromList(SModelOperations.getRoots(_context.getInputModel(), "jetbrains.mps.lang.dataFlow.structure.DataFlowBuilderDeclaration")).sort(new ISelector<SNode, Comparable<?>>() {
      public Comparable<?> select(SNode it) {
        return INamedConcept_Behavior.call_getFqName_1213877404258(SLinkOperations.getTarget(it, "conceptDeclaration", false));
      }
    }, true);
  }
}
