package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.baseLanguage.constraints.BreakStatement_Behavior;

public class BreakStatement_DataFlow extends DataFlowBuilder {

  public  BreakStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    if ((BreakStatement_Behavior.call_getLoop_1206464967689(_context.getNode()) != null)) {
      _context.getBuilder().emitJump(_context.getBuilder().after(BreakStatement_Behavior.call_getLoop_1206464967689(_context.getNode())));
    } else
    {
      _context.getBuilder().emitNop();
    }
  }

}
