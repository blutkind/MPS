package jetbrains.mps.buildlanguage.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class CreateNormalPropertyFromExternal_intention_Intention extends BaseIntention {

  public String getConcept() {
    return "jetbrains.mps.buildlanguage.structure.ExternalPropertyDeclaration";
  }

  public boolean isErrorIntention() {
    return false;
  }

  public String getDescription(final SNode node, final EditorContext editorContext) {
    return "Transform external property to ordinary property";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode property = SConceptOperations.createNewNode("jetbrains.mps.buildlanguage.structure.PropertyDeclaration", null);
    SLinkOperations.setTarget(property, "type", SLinkOperations.getTarget(node, "type", true), true);
    SPropertyOperations.set(property, "name", SPropertyOperations.getString(node, "name"));
    SNodeOperations.replaceWithAnother(node, property);
  }

  public String getLocationString() {
    return "jetbrains.mps.buildlanguage.intentions";
  }

}
