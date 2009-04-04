package jetbrains.mps.gtext.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class GConditionalLine_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    if (SPropertyOperations.getBoolean(node, "isSeparate")) {
      this.indentBuffer();
    }
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "item", true)).isNotEmpty()) {
      for(SNode item : SLinkOperations.getTargets(node, "item", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
      }
    }
    if (SPropertyOperations.getBoolean(node, "isSeparate")) {
      this.appendNewLine();
    }
  }

}
