package jetbrains.mps.baseLanguage.builders.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;

public class DFABuilders extends DataFlowBuilders {
  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.baseLanguage.builders.structure.AsBuilderStatement", new AsBuilderStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.builders.structure.BeanPropertyBuilder", new BeanPropertyBuilder_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.builders.structure.BuilderCreator", new BuilderCreator_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.builders.structure.BuilderStatement", new BuilderStatement_DataFlow());
    manager.register("jetbrains.mps.baseLanguage.builders.structure.SimpleBuilderPropertyBuilder", new SimpleBuilderPropertyBuilder_DataFlow());
  }
}
