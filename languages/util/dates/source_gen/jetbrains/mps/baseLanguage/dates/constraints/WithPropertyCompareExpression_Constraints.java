package jetbrains.mps.baseLanguage.dates.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.SNodePointer;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import jetbrains.mps.smodel.constraints.CanBeAParentContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class WithPropertyCompareExpression_Constraints extends BaseConstraintsDescriptor {
  private static SNodePointer canBeParentBreakingPoint = new SNodePointer("r:00000000-0000-4000-0000-011c895903cf(jetbrains.mps.baseLanguage.dates.constraints)", "8931998598488287817");

  public WithPropertyCompareExpression_Constraints() {
    super("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression");
  }

  @Override
  public boolean hasOwnCanBeParentMethod() {
    return true;
  }

  @Override
  public boolean canBeParent(IOperationContext operationContext, SNode node, SNode node1, SNode node2, @Nullable CheckingNodeContext checkingNodeContext) {
    boolean result = static_canBeAParent(operationContext, new CanBeAParentContext(node, node1, node2));

    if (!(result) && checkingNodeContext != null) {
      checkingNodeContext.setBreakingNode(canBeParentBreakingPoint);
    }

    return result;
  }

  public static boolean static_canBeAParent(final IOperationContext operationContext, final CanBeAParentContext _context) {
    if (_context.getLink() == SLinkOperations.findLinkDeclaration("jetbrains.mps.baseLanguage.dates.structure.WithPropertyCompareExpression", "operation")) {
      return SConceptOperations.isSubConceptOf(_context.getChildConcept(), "jetbrains.mps.baseLanguage.structure.BinaryCompareOperation") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.EqualsExpression") || _context.getChildConcept() == SConceptOperations.findConceptDeclaration("jetbrains.mps.baseLanguage.structure.NotEqualsExpression");
    }
    return true;
  }
}
