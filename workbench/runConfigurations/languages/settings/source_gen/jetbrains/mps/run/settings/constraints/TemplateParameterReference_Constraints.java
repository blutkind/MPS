package jetbrains.mps.run.settings.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeAChildContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class TemplateParameterReference_Constraints {
  public static boolean canBeAChild(final IOperationContext operationContext, final CanBeAChildContext _context) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(_context.getParentNode()), "jetbrains.mps.run.settings.structure.PersistentConfigurationTemplate");
  }
}
