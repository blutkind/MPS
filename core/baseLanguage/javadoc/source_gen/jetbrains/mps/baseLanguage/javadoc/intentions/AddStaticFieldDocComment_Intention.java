package jetbrains.mps.baseLanguage.javadoc.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.AttributesRolesUtil;

public class AddStaticFieldDocComment_Intention extends BaseIntention {
  public AddStaticFieldDocComment_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.baseLanguage.structure.StaticFieldDeclaration";
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
    return ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("staticFieldDocComment"), true) == null) ?
      "Add Documentation Comment" :
      "Remove Documentation Comment"
    );
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    if ((SLinkOperations.getTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("staticFieldDocComment"), true) == null)) {
      SLinkOperations.setNewChild(node, AttributesRolesUtil.childRoleFromAttributeRole("staticFieldDocComment"), "jetbrains.mps.baseLanguage.javadoc.structure.FieldDocComment");
    } else {
      SLinkOperations.setTarget(node, AttributesRolesUtil.childRoleFromAttributeRole("staticFieldDocComment"), null, true);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.baseLanguage.javadoc.intentions";
  }
}
