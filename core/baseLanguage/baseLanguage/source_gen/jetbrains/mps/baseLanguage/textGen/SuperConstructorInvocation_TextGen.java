package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SuperConstructorInvocation_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.createPositionInfo(this, node);
    }
    this.appendNewLine();
    this.indentBuffer();
    this.append("super(");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).isNotEmpty()) {
      for (SNode item : SLinkOperations.getTargets(node, "actualArgument", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(");");
    if (getBuffer().hasPositionsSupport()) {
      TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.TraceableConcept")));
    }
  }
}
