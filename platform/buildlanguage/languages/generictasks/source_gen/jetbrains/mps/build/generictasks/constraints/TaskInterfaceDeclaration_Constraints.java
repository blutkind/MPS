package jetbrains.mps.build.generictasks.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.constraints.CanBeARootContext;
import jetbrains.mps.build.generictasks.behavior.TaskDeclaration_Behavior;

public class TaskInterfaceDeclaration_Constraints {

  public static boolean canBeARoot(final IOperationContext operationContext, final CanBeARootContext _context) {
    return TaskDeclaration_Behavior.isInGeneratedModels_1445805690439864419(operationContext);
  }

}
