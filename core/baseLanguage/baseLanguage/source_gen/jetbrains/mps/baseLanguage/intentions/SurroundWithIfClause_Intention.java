package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.SurroundWithIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.typesystem.inference.TypeChecker;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;

public class SurroundWithIfClause_Intention extends SurroundWithIntention implements Intention {
  public SurroundWithIfClause_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.Expression";
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
    return "if (expr) {...}";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return editorContext.getSelectedNodes().size() == 1 && SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.ExpressionStatement") && SNodeOperations.isInstanceOf(TypeChecker.getInstance().getTypeOf(node), "jetbrains.mps.baseLanguage.structure.BooleanType");
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode ifStatement = SNodeOperations.replaceWithNewChild(SNodeOperations.getParent(node), "jetbrains.mps.baseLanguage.structure.IfStatement");
    SLinkOperations.setTarget(ifStatement, "condition", node, true);
    SLinkOperations.removeAllChildren(SLinkOperations.getTarget(ifStatement, "ifTrue", true), "statement");
    editorContext.select(SLinkOperations.getTarget(ifStatement, "ifTrue", true));
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
