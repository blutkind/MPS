package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.generator.structure.Generator_Language;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;

public class AttachMappingLabel_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.lang.core.structure.BaseConcept";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public boolean isAvailableInChildNodes() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    //  attach new or exiting label to node in template.
    //  if node is annotated with macro or template fragment, then label is added to macro or TF,
    //  otherwise new labeled MAP_SRC macro is created.
    return "Attach mapping label";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(BaseConcept_Behavior.call_isInTemplates_1213877396627(node))) {
      return false;
    }
    //  not an element form generator language
    if (node.getNodeLanguage() == Generator_Language.get()) {
      return false;
    }
    //  not inside macro
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.AbstractMacro", false, false) != null) {
      return false;
    }
    //  in root template - ok
    if (SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true) != null) {
      return true;
    }
    //  in in-line template - ok
    if (SNodeOperations.getAncestor(node, "jetbrains.mps.lang.generator.structure.InlineTemplate_RuleConsequence", false, false) != null) {
      return true;
    }
    //  in template fragment - ok
    if (SNodeOperations.isInstanceOf(SNodeOperations.getContainingRoot(node), "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
      return ListSequence.fromList(SNodeOperations.getAncestors(node, null, true)).findFirst(new IWhereFilter <SNode>() {

        public boolean accept(SNode it) {
          return SLinkOperations.getTarget(it, AttributesRolesUtil.childRoleFromAttributeRole("templateFragment"), true) != null;
        }

      }) != null;
    }
    return false;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

}
