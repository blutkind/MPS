package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.textGen.behavior.ScopeConcept_Behavior;

public class PlaceholderMethodDeclaration_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    TraceInfoGenerationUtil.createPositionInfo(this, node);
    TraceInfoGenerationUtil.createScopeInfo(this, node);
    this.appendNewLine();
    TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.TraceableConcept")));
    TraceInfoGenerationUtil.fillScopeInfo(this, node, ScopeConcept_Behavior.call_getScopeVariables_3822000666564591100(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.ScopeConcept")));
  }
}
