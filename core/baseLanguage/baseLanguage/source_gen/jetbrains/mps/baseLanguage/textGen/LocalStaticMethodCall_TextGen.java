package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.textGen.BaseLanguageTextGen;

public class LocalStaticMethodCall_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    BaseLanguageTextGen.methodCall(node, this);
  }

}
