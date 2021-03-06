package jetbrains.mps.lang.editor.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;

public class GenerateMultiLineDefaultEditor_Intention extends BaseIntention implements Intention {
  public GenerateMultiLineDefaultEditor_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration";
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
    return "Generate Default (Statement-like)";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    new DefaultEditorBuilder(node).buildStatementLike();
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.editor.intentions";
  }
}
