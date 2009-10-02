package jetbrains.mps.lang.refactoring.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class ContextMemberOperation_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.isInstanceOf(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression") && SNodeOperations.isInstanceOf(SLinkOperations.getTarget(SNodeOperations.cast(_context.getParentNode(), "jetbrains.mps.baseLanguage.structure.DotExpression"), "operand", true), "jetbrains.mps.lang.refactoring.structure.RefactoringContext_ConceptFunctionParameter");
  }
}
