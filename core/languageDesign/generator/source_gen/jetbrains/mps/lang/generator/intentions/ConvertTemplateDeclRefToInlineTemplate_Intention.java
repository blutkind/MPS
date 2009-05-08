package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import javax.swing.JOptionPane;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class ConvertTemplateDeclRefToInlineTemplate_Intention extends BaseIntention {

  public ConvertTemplateDeclRefToInlineTemplate_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.TemplateDeclarationReference";
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
    return "Convert to Inline Template";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SLinkOperations.getTarget(node, "template", false) != null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    List<SNode> TFs = SNodeOperations.getDescendants(SLinkOperations.getTarget(SLinkOperations.getTarget(node, "template", false), "contentNode", true), "jetbrains.mps.lang.generator.structure.TemplateFragment", true);
    if (ListSequence.fromList(TFs).count() == 0) {
      JOptionPane.showMessageDialog(null, "No fragments found");
      return;
    }
    if (ListSequence.fromList(TFs).count() > 1) {
      JOptionPane.showMessageDialog(null, "Too many fragments");
      return;
    }
    // ------
    SNode oldTemplate = SLinkOperations.getTarget(node, "template", false);
    SNode fragmentToSet = SNodeOperations.copyNode(SNodeOperations.getParent(ListSequence.fromList(TFs).first()));
    SNode TFtoDelete = SLinkOperations.getTarget(fragmentToSet, AttributesRolesUtil.childRoleFromAttributeRole("templateFragment"), true);
    SNodeOperations.deleteNode(TFtoDelete);
    SNode inlineTemplate = SNodeOperations.replaceWithNewChild(node, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence");
    SLinkOperations.setTarget(inlineTemplate, "templateNode", fragmentToSet, true);
    // ------
    int option = JOptionPane.showConfirmDialog(null, "Delete old template?", "", JOptionPane.YES_NO_OPTION);
    if (option == JOptionPane.YES_OPTION) {
      SNodeOperations.deleteNode(oldTemplate);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

}
