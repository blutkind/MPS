package jetbrains.mps.lang.test.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.intentions.Intention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.test.behavior.NodesTestCase_Behavior;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class AddNodeHasErrorMark_Intention extends BaseIntention implements Intention {
  public AddNodeHasErrorMark_Intention() {
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
    return "Add Node Has Error Annotation";
  }

  public boolean isApplicable(final SNode node, final EditorContext editorContext) {
    if (!(this.isApplicableToNode(node, editorContext))) {
      return false;
    }
    return true;
  }

  public boolean isApplicableToNode(final SNode node, final EditorContext editorContext) {
    return NodesTestCase_Behavior.isIntentionApplicable_1217250498008(node);
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode newAnnotation = SNodeFactoryOperations.createNewNode("jetbrains.mps.lang.test.structure.NodePropertiesContainer", null);
    AttributeOperations.setAttribute(node, new IAttributeDescriptor.NodeAttribute(SConceptOperations.findConceptDeclaration("jetbrains.mps.lang.test.structure.NodePropertiesContainer")), newAnnotation);
    SNodeFactoryOperations.addNewChild(newAnnotation, "properties", "jetbrains.mps.lang.test.structure.NodeErrorPropety");
    editorContext.select(newAnnotation);
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.test.intentions";
  }
}
