package jetbrains.mps.baseLanguage.collections.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;

public class HashMapCreator_DataFlow extends DataFlowBuilder {

  public HashMapCreator_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    if ((SLinkOperations.getTarget(_context.getNode(), "initializer", true) != null)) {
      _context.getBuilder().build((SNode)SLinkOperations.getTarget(_context.getNode(), "initializer", true));
    }
  }

}
