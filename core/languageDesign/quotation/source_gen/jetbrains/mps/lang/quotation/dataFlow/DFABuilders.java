package jetbrains.mps.lang.quotation.dataFlow;

/*Generated by MPS */

import jetbrains.mps.lang.dataFlow.DataFlowBuilders;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.quotation.dataFlow.AbstractAntiquotation_DataFlow;
import jetbrains.mps.lang.quotation.dataFlow.Quotation_DataFlow;

public class DFABuilders extends DataFlowBuilders {

  public void install(DataFlowManager manager) {
    manager.register("jetbrains.mps.lang.quotation.structure.AbstractAntiquotation", new AbstractAntiquotation_DataFlow());
    manager.register("jetbrains.mps.lang.quotation.structure.Quotation", new Quotation_DataFlow());
  }

}
