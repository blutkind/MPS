package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class LocalStaticFieldReference_TextGen extends SNodeTextGen {
  public void doGenerateText(SNode node) {
    this.append(this.getReferentResolveInfoOrName("variableDeclaration", SNodeOperations.cast(node, "jetbrains.mps.baseLanguage.structure.VariableReference")));
  }
}
