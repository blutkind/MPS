package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.textGen.TraceInfoGenerationUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;
import jetbrains.mps.lang.textGen.behavior.TraceableConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class SingleLineComment_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    TraceInfoGenerationUtil.createPositionInfo(this, node);
    this.appendNewLine();
    this.indentBuffer();
    this.append("// ");
    for (SNode commentPart : SLinkOperations.getTargets(node, "commentPart", true)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), commentPart, this.getSNode());
      this.append(" ");
    }
    TraceInfoGenerationUtil.fillPositionInfo(this, node, TraceableConcept_Behavior.call_getTraceableProperty_3822000666564591088(SNodeOperations.cast(node, "jetbrains.mps.lang.textGen.structure.TraceableConcept")));
  }
}
