package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class ReplaceEqualsWithEquality_Intention extends BaseIntention implements Intention {
  public ReplaceEqualsWithEquality_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
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
    return "Replace equals() with Equality";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    if (SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name") == null) {
      return false;
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name").equals("equals") && (int) ListSequence.fromList(SLinkOperations.getTargets(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter", true)).count() == 1;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode leftExpr = SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", true);
    SNode rightExpression = ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first();
    SNode equalsExpression = SNodeFactoryOperations.createNewNode("jetbrains.mps.baseLanguage.structure.EqualsExpression", null);
    SLinkOperations.setTarget(equalsExpression, "leftExpression", leftExpr, true);
    SLinkOperations.setTarget(equalsExpression, "rightExpression", rightExpression, true);
    SNodeOperations.replaceWithAnother(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), equalsExpression);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }
}
