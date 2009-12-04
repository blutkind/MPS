package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.behavior.IfStatement_Behavior;

public class ConvertElseToElseIf_Intention extends BaseIntention implements Intention {
  public ConvertElseToElseIf_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
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
    return "Convert Else Block to Else If";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "ifFalseStatement", true) != null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    IfStatement_Behavior.call_convertElseToElseIf_1217845914183(node);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
