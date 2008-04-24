package jetbrains.mps.baseLanguage.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilder;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.dataFlow.DataFlowBuilderContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.constraints.ElsifClause_Behavior;

public class ElsifClause_DataFlow extends DataFlowBuilder {

  public ElsifClause_DataFlow() {
  }

  public void build(final IOperationContext operationContext, final DataFlowBuilderContext _context) {
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "condition", true));
    _context.getBuilder().emitIfJump(_context.getBuilder().after(_context.getNode()));
    _context.getBuilder().build(SLinkOperations.getTarget(_context.getNode(), "statementList", true));
    _context.getBuilder().emitJump(_context.getBuilder().after(ElsifClause_Behavior.call_getIfStatement_1206536734450(_context.getNode())));
  }

}
