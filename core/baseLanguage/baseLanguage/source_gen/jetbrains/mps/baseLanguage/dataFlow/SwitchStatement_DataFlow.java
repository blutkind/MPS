package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.SNode;

public class SwitchStatement_DataFlow extends DataFlowBuilder {

  public  SwitchStatement_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "expression", true));
    for(SNode switchCase : SLinkOperations.getTargets(_context.getNode(), "case", true)) {
      _context.getBuilder().emitIfJump(_context.getBuilder().before(switchCase));
    }
    _context.getBuilder().emitIfJump(_context.getBuilder().before(SLinkOperations.getTarget(_context.getNode(), "defaultBlock", true)));
    for(SNode switchCase : SLinkOperations.getTargets(_context.getNode(), "case", true)) {
      _context.getBuilder().build(switchCase);
    }
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "defaultBlock", true));
  }

}
