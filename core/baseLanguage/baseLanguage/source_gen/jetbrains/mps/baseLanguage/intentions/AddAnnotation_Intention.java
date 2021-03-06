package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.HasAnnotation_Behavior;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class AddAnnotation_Intention extends BaseIntention implements Intention {
  public AddAnnotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.HasAnnotation";
  }

  public boolean isParameterized() {
    return false;
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Add Annotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (ListSequence.fromList(SLinkOperations.getTargets(node, "annotation", true)).isNotEmpty()) {
      return false;
    }
    if (!(HasAnnotation_Behavior.call_canBeAnnotated_1233076312117(node))) {
      return false;
    }
    SNode selectedNode = editorContext.getSelectedNode();
    if (selectedNode == node) {
      return true;
    }
    return ListSequence.fromList(HasAnnotation_Behavior.call_getChildrenToDisplayIntention_4025276038182319200(node)).contains(selectedNode);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode annotationInstance = SNodeFactoryOperations.addNewChild(node, "annotation", "jetbrains.mps.baseLanguage.structure.AnnotationInstance");
    editorContext.selectWRTFocusPolicy(annotationInstance);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
