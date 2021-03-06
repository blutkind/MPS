package jetbrains.mps.lang.dataFlow.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class RemoveMayBeUnreachable_Intention extends BaseIntention implements Intention {
  public RemoveMayBeUnreachable_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.dataFlow.structure.EmitStatement";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Remove May Be Unreachable";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.lang.dataFlow.structure.EmitMayBeUnreachable");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNodeOperations.replaceWithAnother(SNodeOperations.getParent(node), node);
    editorContext.select(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.dataFlow.intentions";
  }
}
