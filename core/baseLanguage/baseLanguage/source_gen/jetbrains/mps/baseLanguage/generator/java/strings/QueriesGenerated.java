package jetbrains.mps.baseLanguage.generator.java.strings;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.generator.template.BaseMappingRuleContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.baseLanguage.behavior.IOperation_Behavior;

public class QueriesGenerated {
  public static boolean baseMappingRule_Condition_1225277059829(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(_context.getNode(), "operation", true), "jetbrains.mps.baseLanguage.structure.BaseStringOperation");
  }

  public static boolean baseMappingRule_Condition_1225277059846(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "trimKind", "leading", "both");
  }

  public static boolean baseMappingRule_Condition_1225277059857(final IOperationContext operationContext, final BaseMappingRuleContext _context) {
    return SPropertyOperations.hasValue(_context.getNode(), "trimKind", "trailing", "both");
  }

  public static boolean ifMacro_Condition_1225277059757(final IOperationContext operationContext, final IfMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "startIndex", true) != null;
  }

  public static SNode sourceNodeQuery_1225277059669(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_1225277059680(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_1326302914272776632(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1326302914272778840(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1326302914272778874(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "leftExpression", true);
  }

  public static SNode sourceNodeQuery_1326302914272778882(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "rightExpression", true);
  }

  public static SNode sourceNodeQuery_1225277059749(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operand", true);
  }

  public static SNode sourceNodeQuery_1225277059768(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "startIndex", true);
  }

  public static SNode sourceNodeQuery_1225277059776(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "endIndex", true);
  }

  public static SNode sourceNodeQuery_1225277059787(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_1225277059798(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_1225277059810(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return IOperation_Behavior.call_getOperand_1213877410070(_context.getNode());
  }

  public static SNode sourceNodeQuery_1225277059823(final IOperationContext operationContext, final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), "operation", true);
  }
}
