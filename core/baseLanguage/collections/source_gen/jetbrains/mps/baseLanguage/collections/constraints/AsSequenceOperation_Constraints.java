package jetbrains.mps.baseLanguage.collections.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.typesystem.runtime.HUtil;

public class AsSequenceOperation_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    SNode operandType = TypeChecker.getInstance().getRuntimeSupport().coerce_(TypeChecker.getInstance().getTypeOf(SLinkOperations.getTarget(SNodeOperations.as(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true)), HUtil.createMatchingPatternByConceptFQName("jetbrains.mps.baseLanguage.structure.ArrayType"), false);
    return (operandType != null);
  }
}
