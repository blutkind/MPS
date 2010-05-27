package jetbrains.mps.lang.plugin.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.constraints.CanBeAParentContext;

public class AddStatement_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.getAncestorWhereConceptInList(_context.getParentNode(), new String[]{"jetbrains.mps.lang.plugin.structure.BuildGroupBlock", "jetbrains.mps.lang.plugin.structure.UpdateGroupFunction"}, true, false) != null;
  }

  public static boolean canBeAParent(final IOperationContext operationContext, final CanBeAParentContext _context) {
    return !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.plugin.structure.ActionGroupDeclaration")) && !(SNodeOperations.isInstanceOf(_context.getNode(), "jetbrains.mps.lang.plugin.structure.GroupAnchor"));
  }
}
