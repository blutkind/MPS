package jetbrains.mps.baseLanguage.collections.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class add_init_values_Intention extends BaseIntention implements Intention {
  public add_init_values_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.collections.structure.AbstractContainerCreator";
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
    return "Add Init Values";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "initValue", true)).count() == 0 && (SLinkOperations.getTarget(node, "copyFrom", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.addNewChild(node, "initValue", "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.collections.intentions";
  }
}
