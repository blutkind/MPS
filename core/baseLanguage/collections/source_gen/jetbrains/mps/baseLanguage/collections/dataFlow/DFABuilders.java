package jetbrains.mps.baseLanguage.collections.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ForEachStatement", new ForEachStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.WhereOperation", new WhereOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddAllElementsOperation", new AddAllElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.MapElement", new MapElement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ContainsOperation", new ContainsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.GetIndexOfOperation", new GetIndexOfOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.BinaryOperation", new BinaryOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ForEachVariableReference", new ForEachVariableReference_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.ListCreatorWithInit", new ListCreatorWithInit_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.PageOperation", new PageOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveAllElementsOperation", new RemoveAllElementsOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.RemoveElementOperation", new RemoveElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.SkipOperation", new SkipOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.TakeOperation", new TakeOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.AddElementOperation", new AddElementOperation_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.collections.structure.GetElementOperation", new GetElementOperation_DataFlow());
  }

}
