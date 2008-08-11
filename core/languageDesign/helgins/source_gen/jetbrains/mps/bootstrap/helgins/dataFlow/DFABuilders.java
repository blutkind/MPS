package jetbrains.mps.bootstrap.helgins.dataFlow;

/*Generated by MPS */

import jetbrains.mps.dataFlow.DataFlowBuilders;
import jetbrains.mps.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.bootstrap.helgins.structure.AbstractCheckingRule", new AbstractCheckingRule_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.AbstractSubtypingRule", new AbstractSubtypingRule_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.IsSubtypeExpression", new IsSubtypeExpression_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeReference", new ApplicableNodeReference_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.ApplicableNodeCondition", new ApplicableNodeCondition_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.AssertStatement", new AssertStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.ReportErrorStatement", new ReportErrorStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.TypeOfExpression", new TypeOfExpression_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.AbstractEquationStatement", new AbstractEquationStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.NormalTypeClause", new NormalTypeClause_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.TypeVarDeclaration", new TypeVarDeclaration_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.TypeVarReference", new TypeVarReference_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.InequationReplacementRule", new InequationReplacementRule_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.ComparisonRule", new ComparisonRule_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.PatternCondition", new PatternCondition_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.CoerceStatement", new CoerceStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.WhenConcreteStatement", new WhenConcreteStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.MultipleForeachLoop", new MultipleForeachLoop_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.ImmediateSupertypesExpression", new ImmediateSupertypesExpression_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.MatchStatement", new MatchStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.MatchStatementItem", new MatchStatementItem_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.GivetypeStatement", new GivetypeStatement_DataFlow());
    manager.register("jetbrains.mps.bootstrap.helgins.structure.CoerceExpression", new CoerceExpression_DataFlow());
  }

}
