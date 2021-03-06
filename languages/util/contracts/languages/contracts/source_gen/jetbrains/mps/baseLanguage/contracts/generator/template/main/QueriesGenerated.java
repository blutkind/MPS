package jetbrains.mps.baseLanguage.contracts.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.baseLanguage.contracts.generator.template.utils.ContractsUtils;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.generator.template.TemplateFragmentContext;
import jetbrains.mps.generator.template.WeavingMappingRuleContext;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1399727060253225522(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return ContractsUtils.needProcessing(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_2203155934612649981(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    SNode nodeParent = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    SNode linkParent = SNodeOperations.getAncestor(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    return (nodeParent != null) && (linkParent != null) && nodeParent != linkParent;
  }

  public static Object propertyMacro_GetPropertyValue_3202170141028834579(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ContractsUtils.makeResultName(SPropertyOperations.getString(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_2348361366766891596(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ContractsUtils.makeImplName(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object propertyMacro_GetPropertyValue_2348361366767435032(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ContractsUtils.makeResultName(SPropertyOperations.getString(_context.getNode(), "name"));
  }

  public static Object referenceMacro_GetReferent_2348361366767435020(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getNode();
  }

  public static Object referenceMacro_GetReferent_6028515029312807637(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getNode();
  }

  public static Object referenceMacro_GetReferent_2348361366767539960(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return _context.getNode();
  }

  public static boolean ifMacro_Condition_2348361366767435045(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"));
  }

  public static boolean ifMacro_Condition_2348361366767539974(final IOperationContext operationContext, final IfMacroContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType");
  }

  public static boolean ifMacro_Condition_2348361366767435996(final IOperationContext operationContext, final IfMacroContext _context) {
    return !(SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "returnType", true), "jetbrains.mps.baseLanguage.structure.VoidType"));
  }

  public static SNode sourceNodeQuery_2203155934612650020(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    SNode nodeParent = SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    SNode linkParent = SNodeOperations.getAncestor(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false);
    int declarationNum = ListSequence.fromList(SLinkOperations.getTargets(linkParent, "parameter", true)).indexOf(SLinkOperations.getTarget(_context.getNode(), "variableDeclaration", false));
    SNode clone = SNodeOperations.copyNode(_context.getNode());
    SLinkOperations.setTarget(clone, "variableDeclaration", ListSequence.fromList(SLinkOperations.getTargets(nodeParent, "parameter", true)).getElement(declarationNum), false);
    return clone;
  }

  public static SNode sourceNodeQuery_3202170141028834560(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(SNodeOperations.getAncestor(_context.getNode(), "jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration", false, false), "returnType", true);
  }

  public static SNode sourceNodeQuery_2348361366766716193(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "returnType", true);
  }

  public static SNode sourceNodeQuery_2348361366766892510(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "body", true);
  }

  public static SNode sourceNodeQuery_2348361366767161082(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_2348361366767435009(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "returnType", true);
  }

  public static SNode sourceNodeQuery_2348361366767435966(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_2329648364425741780(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.structure.ThisExpression", null);
  }

  public static Iterable sourceNodesQuery_2348361366766716197(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_2348361366766752166(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeVariableDeclaration", true);
  }

  public static Iterable sourceNodesQuery_2348361366767161063(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ContractsUtils.getFilteredConditions(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.contracts.structure.Precondition"));
  }

  public static Iterable sourceNodesQuery_2348361366767435025(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_6028515029312835222(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeVariableDeclaration", true);
  }

  public static Iterable sourceNodesQuery_2348361366767539965(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "parameter", true);
  }

  public static Iterable sourceNodesQuery_2348361366767645963(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "typeVariableDeclaration", true);
  }

  public static Iterable sourceNodesQuery_2348361366767435973(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return ContractsUtils.getFilteredConditions(_context.getNode(), SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.contracts.structure.Postcondition"));
  }

  public static SNode templateFragment_ContextNodeQuery_2348361366767025875(final IOperationContext operationContext, final TemplateFragmentContext _context) {
    return _context.getCopiedOutputNodeForInputNode(_context.getNode());
  }

  public static SNode weaving_MappingRule_ContextNodeQuery_1399727060253204128(final IOperationContext opereationContext, final WeavingMappingRuleContext _context) {
    return _context.getCopiedOutputNodeForInputNode(SNodeOperations.getParent(_context.getNode()));
  }
}
