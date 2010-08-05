package jetbrains.mps.baseLanguage.math.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class LinearSolveOperation_DataFlow extends DataFlowBuilder {
  public LinearSolveOperation_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "matrix", true));
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "vector", true));
    _context.getBuilder().emitWrite(_context.getNode(), SLinkOperations.getTarget(_context.getNode(), "matrix", true));
  }
}
