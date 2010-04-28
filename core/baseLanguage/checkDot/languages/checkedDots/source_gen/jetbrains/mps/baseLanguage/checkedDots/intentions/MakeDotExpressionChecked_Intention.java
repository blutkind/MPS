package jetbrains.mps.baseLanguage.checkedDots.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class MakeDotExpressionChecked_Intention extends BaseIntention implements Intention {
  public MakeDotExpressionChecked_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.DotExpression";
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
    return "Make Dot Expression Checked";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return !(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression"));
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode checkedDot = SConceptOperations.createNewNode("jetbrains.mps.baseLanguage.checkedDots.structure.CheckedDotExpression", null);
    SLinkOperations.setTarget(checkedDot, "operand", SLinkOperations.getTarget(node, "operand", true), true);
    SLinkOperations.setTarget(checkedDot, "operation", SLinkOperations.getTarget(node, "operation", true), true);
    SNodeOperations.replaceWithAnother(node, checkedDot);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.checkedDots.intentions";
  }
}
