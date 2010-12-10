package jetbrains.mps.make.script.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.make.script.structure.BeginWorkStatement", new BeginWorkStatement_DataFlow());
    manager.register("jetbrains.mps.make.script.structure.DoneWorkStatement", new DoneWorkStatement_DataFlow());
    manager.register("jetbrains.mps.make.script.structure.OutputResources", new OutputResources_DataFlow());
    manager.register("jetbrains.mps.make.script.structure.ResultStatement", new ResultStatement_DataFlow());
  }
}
