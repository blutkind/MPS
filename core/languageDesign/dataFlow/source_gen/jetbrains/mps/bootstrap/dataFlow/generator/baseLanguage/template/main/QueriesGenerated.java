package jetbrains.mps.bootstrap.dataFlow.generator.baseLanguage.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.constraints.INamedConcept_Behavior;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import java.util.List;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SModelOperations;

public class QueriesGenerated {

  public static Object propertyMacro_GetPropertyValue_1206456427297(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1206456545048(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return INamedConcept_Behavior.call_getFqName_1184686272576(SLinkOperations.getTarget(_context.getNode(), "conceptDeclaration", false));
  }

  public static Object referenceMacro_GetReferent_1206456619706(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getGenerator().findOutputNodeByInputNodeAndMappingName(_context.getNode(), "dataFlowBuilderConstructor");
  }

  public static SNode sourceNodeQuery_1206456672226(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), "builderBlock", true), "body", true);
  }

  public static SNode sourceNodeQuery_1206456871850(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "codeFor", true);
  }

  public static SNode sourceNodeQuery_1206457018606(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variable", true);
  }

  public static SNode sourceNodeQuery_1206457029675(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "variable", true);
  }

  public static SNode sourceNodeQuery_1206457136740(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "relativeTo", true);
  }

  public static SNode sourceNodeQuery_1206457164922(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "relativeTo", true);
  }

  public static SNode sourceNodeQuery_1206457204137(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "jumpTo", true);
  }

  public static SNode sourceNodeQuery_1206457232122(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "jumpTo", true);
  }

  public static SNode sourceNodeQuery_1206535717257(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "emitStatement", true);
  }

  public static List sourceNodesQuery_1206456525472(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.getRoots(_context.getSourceModel(), "jetbrains.mps.bootstrap.dataFlow.structure.DataFlowBuilderDeclaration");
  }

}
