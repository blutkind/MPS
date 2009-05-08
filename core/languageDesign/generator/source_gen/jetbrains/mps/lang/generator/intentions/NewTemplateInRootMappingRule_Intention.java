package jetbrains.mps.lang.generator.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.nodeEditor.CreateFromUsageUtil;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.Condition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.util.Setter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class NewTemplateInRootMappingRule_Intention extends BaseIntention {

  public NewTemplateInRootMappingRule_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.generator.structure.Root_MappingRule";
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
    return "New Root Template";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return SLinkOperations.getTarget(node, "template", false) == null;
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    final Wrappers._T<String> name = new Wrappers._T<String>(CreateFromUsageUtil.getText(editorContext));
    if (name.value == null || name.value.length() == 0) {
      name.value = "map_" + SPropertyOperations.getString(SLinkOperations.getTarget(node, "applicableConcept", false), "name");
    }
    final SNode rule = node;
    CreateFromUsageUtil.showCreateNewRootMenu(editorContext, new Condition <SNode>() {

      public boolean met(SNode c) {
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.TemplateSwitch")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.MappingConfiguration")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.TemplateDeclaration")) {
          return false;
        }
        if (SConceptOperations.isExactly(c, "jetbrains.mps.lang.generator.structure.MappingScript")) {
          return false;
        }
        return true;
      }
    }, new Setter <SNode>() {

      public void set(SNode root) {
        if (!(SNodeOperations.isInstanceOf(root, "jetbrains.mps.lang.core.structure.INamedConcept"))) {
          return;
        }
        SPropertyOperations.set(SNodeOperations.cast(root, "jetbrains.mps.lang.core.structure.INamedConcept"), "name", name.value);
        SLinkOperations.setTarget(rule, "template", SNodeOperations.cast(root, "jetbrains.mps.lang.core.structure.INamedConcept"), false);
        SLinkOperations.setTarget(SLinkOperations.getTarget(root, AttributesRolesUtil.childRoleFromAttributeRole("rootTemplateAnnotation"), true), "applicableConcept", SLinkOperations.getTarget(rule, "applicableConcept", false), false);
      }
    });
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.generator.intentions";
  }

}
