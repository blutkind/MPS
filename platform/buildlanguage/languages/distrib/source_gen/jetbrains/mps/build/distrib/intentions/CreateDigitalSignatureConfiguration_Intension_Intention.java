package jetbrains.mps.build.distrib.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import java.util.List;
import jetbrains.mps.intentions.Intention;
import java.util.ArrayList;

public class CreateDigitalSignatureConfiguration_Intension_Intention extends BaseIntention {

  public CreateDigitalSignatureConfiguration_Intension_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.build.distrib.structure.WindowsConfig";
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
    return "Create Digital Signature Configuration";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    return (SLinkOperations.getTarget(node, "signatureConfiguration", true) == null);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode signConfig = SConceptOperations.createNewNode("jetbrains.mps.build.distrib.structure.DigitalSignatureWindowsConfiguration", null);
    SLinkOperations.setTarget(node, "signatureConfiguration", signConfig, true);
  }

  public String getLocationString() {
    return "jetbrains.mps.build.distrib.intentions";
  }

  public List<Intention> getInstances(final SNode node, final EditorContext editorContext) {
    List<Intention> list = new ArrayList<Intention>();
    list.add(this);
    return list;
  }

}
