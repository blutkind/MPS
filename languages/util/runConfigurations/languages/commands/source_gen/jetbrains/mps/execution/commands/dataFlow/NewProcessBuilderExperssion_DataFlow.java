package jetbrains.mps.execution.commands.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.lang.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class NewProcessBuilderExperssion_DataFlow extends DataFlowBuilder {
  public NewProcessBuilderExperssion_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    for (SNode part : ListSequence.fromList(SLinkOperations.getTargets(_context.getNode(), "commandPart", true))) {
      _context.getBuilder().build((SNode) part);
    }
    _context.getBuilder().build((SNode) SLinkOperations.getTarget(_context.getNode(), "workingDirectory", true));
  }
}
