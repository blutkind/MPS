package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;

public class ThrowStatement_DataFlow extends DataFlowBuilder {

  public  ThrowStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().emitRet();
  }

}
