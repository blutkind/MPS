package jetbrains.mps.baseLanguageInternal.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.textGen.TextGenManager;

public class InternalClassifierType_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    String fqClassName = SPropertyOperations.getString(node, "fqClassName");
    BaseLangInternal.className(fqClassName, this);
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      this.append("<");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
            this.append(", ");
          }
        }
      }
      this.append(">");
    }
  }

}
