package jetbrains.mps.baseLanguage.textGen;

/*Generated by MPS */

import jetbrains.mps.textGen.SNodeTextGen;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.textGen.TextGenManager;

public class ConstructorDeclaration_TextGen extends SNodeTextGen {

  public void doGenerateText(SNode node) {
    SNode declaringClass = SNodeOperations.cast(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ClassConcept");
    this.appendNewLine();
    BaseLanguageTextGen.annotations(node, this);
    if (!(SNodeOperations.isInstanceOf(declaringClass, "jetbrains.mps.baseLanguage.structure.EnumClass"))) {
      BaseLanguageTextGen.visibilityWithIndent(SLinkOperations.getTarget(node, "visibility", true), this);
    } else
    {
      this.indentBuffer();
    }
    assert declaringClass != null;
    this.append(SPropertyOperations.getString(declaringClass, "name"));
    this.append("(");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).isNotEmpty()) {
      for(SNode item : SLinkOperations.getTargets(node, "parameter", true)) {
        TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
        if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "parameter", true)).last()) {
          this.append(", ");
        }
      }
    }
    this.append(")");
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
      this.append(" throws ");
      if (ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).isNotEmpty()) {
        for(SNode item : SLinkOperations.getTargets(node, "throwsItem", true)) {
          TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), item, this.getSNode());
          if (item != ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).last()) {
            this.append(", ");
          }
        }
      }
    }
    this.append(" {");
    this.increaseDepth();
    if ((SLinkOperations.getTarget(node, "body", true) != null)) {
      TextGenManager.instance().appendNodeText(this.getContext(), this.getBuffer(), SLinkOperations.getTarget(node, "body", true), this.getSNode());
    }
    this.decreaseDepth();
    this.appendNewLine();
    this.appendWithIndent("}");
  }

}
