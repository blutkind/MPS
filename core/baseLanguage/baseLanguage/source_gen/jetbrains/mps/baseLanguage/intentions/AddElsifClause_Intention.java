package jetbrains.mps.baseLanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;

public class AddElsifClause_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.IfStatement";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "add elsif clause";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "elsifClauses", true)).isEmpty();
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SLinkOperations.addNewChild(node, "elsifClauses", "jetbrains.mps.baseLanguage.structure.ElsifClause");
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.intentions";
  }

}
