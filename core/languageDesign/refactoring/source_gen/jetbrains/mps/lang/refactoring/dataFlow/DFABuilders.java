package jetbrains.mps.lang.refactoring.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.refactoring.structure.DeleteFeatureOperation", new DeleteFeatureOperation_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.AbstractMoveExpression", new AbstractMoveExpression_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.ChangeFeatureNameOperation", new ChangeFeatureNameOperation_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.MoveNodeToNodeExpression", new MoveNodeToNodeExpression_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.AskExpression", new AskExpression_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.CustomParameterChooser", new CustomParameterChooser_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.SetValueStatement", new SetValueStatement_DataFlow());
    manager.register("jetbrains.mps.lang.refactoring.structure.ErrorStatement", new ErrorStatement_DataFlow());
  }
}
