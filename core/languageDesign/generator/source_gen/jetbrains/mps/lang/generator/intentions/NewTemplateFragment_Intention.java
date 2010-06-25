package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.generator.editor.QueriesUtil;

public class NewTemplateFragment_Intention extends BaseIntention implements Intention {
  public NewTemplateFragment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
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
    return "Create Template Fragment";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    if (SNodeOperations.getAncestorWhereConceptInList(node, new String[]{"jetbrains.mps.lang.generator.structure.TemplateDeclaration", "jetbrains.mps.lang.generator.structure.InlineTemplateWithContext_RuleConsequence"}, false, false) == null) {
      return false;
    }
    if (ListSequence.fromList(SNodeOperations.getAncestors(node, null, false)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SNodeOperations.isAttribute(it);
      }
    }).isNotEmpty()) {
      return false;
    }
    if (QueriesUtil.isInsideTemplateFragment(node)) {
      return false;
    }
    return true;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode applyToNode = ListSequence.fromList(SNodeOperations.getAncestors(node, null, true)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return !(SNodeOperations.isAttribute(it));
      }
    }).first();
    QueriesUtil.createTemplateFragment(applyToNode);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }
}
