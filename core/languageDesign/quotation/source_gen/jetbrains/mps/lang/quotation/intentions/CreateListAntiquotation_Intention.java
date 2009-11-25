package jetbrains.mps.lang.quotation.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntention;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;

public class CreateListAntiquotation_Intention extends BaseIntention {
  public CreateListAntiquotation_Intention() {
  }

  public String getConcept() {
    return "jetbrains.mps.lang.quotation.structure.Quotation";
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
    return "Create List Antiquotation";
  }

  public void execute(final SNode node, final EditorContext editorContext) {
    SNode contextNode = editorContext.getSelectedCell().getSNode();
    if (contextNode == null) {
      return;
    }
    if (SNodeOperations.isInstanceOf(contextNode, "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
      SNode attributedNode = SNodeOperations.getParent(contextNode);
      assert attributedNode != null;
      attributedNode.setAttribute(null);
      return;
    }
    SModel model = SNodeOperations.getModel(contextNode);
    if (SNodeOperations.isInstanceOf(((SNode)contextNode.getAttribute()), "jetbrains.mps.lang.quotation.structure.ListAntiquotation")) {
      contextNode.setAttribute(null);
    } else {
      SNode listAntiquotation = SModelOperations.createNewNode(model, "jetbrains.mps.lang.quotation.structure.ListAntiquotation", null);
      contextNode.setAttribute(listAntiquotation);
      editorContext.selectWRTFocusPolicy(listAntiquotation);
    }
  }

  public String getLocationString() {
    return "jetbrains.mps.lang.quotation.intentions";
  }
}
