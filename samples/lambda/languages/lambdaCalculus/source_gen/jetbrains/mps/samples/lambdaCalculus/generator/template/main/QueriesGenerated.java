package jetbrains.mps.samples.lambdaCalculus.generator.template.main;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.samples.lambdaCalculus.behavior.LambdaApplication_Behavior;
import jetbrains.mps.samples.lambdaCalculus.behavior.LambdaExpression_Behavior;
import jetbrains.mps.samples.lambdaCalculus.behavior.AbstractionVarRef_Behavior;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.samples.lambdaCalculus.behavior.LambdaAbstraction_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_391739495267627132(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (SNodeOperations.getParent(_context.getNode()) == null);
  }

  public static boolean baseMappingRule_Condition_1308935328408191088(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(LambdaApplication_Behavior.call_isFullApplication_1308935328408190838(LambdaExpression_Behavior.call_getOuterApplication_1308935328408190993(_context.getNode())));
  }

  public static boolean baseMappingRule_Condition_1823182225212631178(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(LambdaApplication_Behavior.call_isFullApplication_1308935328408190838(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_3851847705188473146(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return AbstractionVarRef_Behavior.call_isInFull_3851847705188496532(_context.getNode());
  }

  public static boolean baseMappingRule_Condition_3851847705188496572(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return !(AbstractionVarRef_Behavior.call_isInFull_3851847705188496532(_context.getNode()));
  }

  public static boolean baseMappingRule_Condition_5066394162984555366(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return (LambdaApplication_Behavior.call_isFullApplication_1308935328408190838(_context.getNode()));
  }

  public static Object propertyMacro_GetPropertyValue_391739495267627152(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_1041455816041074099(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_1308935328408191151(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return ListSequence.fromList(LambdaAbstraction_Behavior.call_getVariables_5066394162984559815(_context.getNode())).count();
  }

  public static Object propertyMacro_GetPropertyValue_1888188276221892626(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "value");
  }

  public static Object propertyMacro_GetPropertyValue_5066394162984555306(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return "lambdaAbstr_" + SLinkOperations.getTarget(_context.getNode(), "function", true).getId();
  }

  public static Object propertyMacro_GetPropertyValue_5066394162984555333(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object propertyMacro_GetPropertyValue_7391442976966625678(final IOperationContext operationContext, final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), "name");
  }

  public static Object referenceMacro_GetReferent_3851847705188495946(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabelAndOutputNode(SLinkOperations.getTarget(_context.getNode(), "variable", false), _context.getOutputNode(), "parameterFromVar"), "jetbrains.mps.baseLanguage.structure.LocalVariableDeclaration");
  }

  public static Object referenceMacro_GetReferent_4247542765074851541(final IOperationContext operationContext, final ReferenceMacroContext _context) {
    return SNodeOperations.cast(_context.getOutputNodeByInputNodeAndMappingLabelAndOutputNode(SLinkOperations.getTarget(_context.getNode(), "variable", false), _context.getOutputNode(), "parameterFromVar"), "jetbrains.mps.baseLanguage.structure.ParameterDeclaration");
  }

  public static boolean ifMacro_Condition_2139732018515881330(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static boolean ifMacro_Condition_4247542765074851548(final IOperationContext operationContext, final IfMacroContext _context) {
    return true;
  }

  public static SNode sourceNodeQuery_14027134441518111(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_391739495267627127(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "expression", true);
  }

  public static SNode sourceNodeQuery_391739495267927117(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_391739495267927128(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_1308935328408191185(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return LambdaAbstraction_Behavior.call_getInnerBody_5066394162984540354(_context.getNode());
  }

  public static SNode sourceNodeQuery_1752280634427337342(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_1752280634427358713(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_1752280634427358729(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_1752280634427365219(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_1752280634427365227(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_1752280634427365235(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_1888188276221892656(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "right", true);
  }

  public static SNode sourceNodeQuery_1888188276221892667(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "left", true);
  }

  public static SNode sourceNodeQuery_3777111214477850524(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "expressions", true)).last();
  }

  public static SNode sourceNodeQuery_5066394162984555303(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return LambdaAbstraction_Behavior.call_getInnerBody_5066394162984540354(LambdaApplication_Behavior.call_getLambdaAbstraction_4976946798230781575(_context.getNode()));
  }

  public static SNode sourceNodeQuery_5066394162984555330(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_5066394162984555342(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static SNode sourceNodeQuery_5066394162984559790(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(LambdaAbstraction_Behavior.call_getInnerBody_5066394162984540354(LambdaApplication_Behavior.call_getLambdaAbstraction_4976946798230781575(_context.getNode())));
  }

  public static SNode sourceNodeQuery_7310424396274146308(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_7310424396274146326(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return TypeChecker.getInstance().getTypeOf(_context.getNode());
  }

  public static SNode sourceNodeQuery_7723251419685498927(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "function", true);
  }

  public static SNode sourceNodeQuery_7723251419685498943(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return _context.getNode();
  }

  public static Iterable sourceNodesQuery_5066394162984555314(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return LambdaAbstraction_Behavior.call_getVariables_5066394162984559815(LambdaApplication_Behavior.call_getLambdaAbstraction_4976946798230781575(_context.getNode()));
  }

  public static Iterable sourceNodesQuery_5066394162984555338(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return LambdaApplication_Behavior.call_getArguments_5066394162984555451(_context.getNode());
  }

  public static Iterable sourceNodesQuery_7310424396274146340(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return LambdaAbstraction_Behavior.call_getVariables_5066394162984559815(_context.getNode());
  }

  public static Iterable sourceNodesQuery_7723251419685498936(final IOperationContext operationContext, final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getTargets(_context.getNode(), "argument", true);
  }
}
