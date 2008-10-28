package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class FilpEqualsIntention_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return true;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Flip equals()";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (SLinkOperations.getTarget(node, "baseMethodDeclaration", false) == null) {
      return false;
    }
    if (SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name") == null) {
      return false;
    }
    return SPropertyOperations.getString(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "name").equals("equals") && SLinkOperations.getCount(SLinkOperations.getTarget(node, "baseMethodDeclaration", false), "parameter") == 1;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode parameter = ListSequence.fromList(SLinkOperations.getTargets(node, "actualArgument", true)).first();
    SNodeOperations.replaceWithAnother(parameter, SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", true));
    SLinkOperations.setTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.DotExpression", false, false), "operand", parameter, true);
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
