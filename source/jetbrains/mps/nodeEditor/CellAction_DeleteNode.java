package jetbrains.mps.nodeEditor;

import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.semanticModel.SemanticModel;

/**
 * Author: Sergey Dmitriev.
 * Time: Nov 5, 2003 1:03:02 PM
 */
public class CellAction_DeleteNode extends EditorCellAction {
  private SemanticNode mySemanticNode;

  public CellAction_DeleteNode(SemanticNode semanticNode) {
    mySemanticNode = semanticNode;
  }

  public boolean canExecute(EditorContext context) {
    return true;
  }

  public void execute(EditorContext context) {
    SemanticModel semanticModel = mySemanticNode.getSemanticModel();
    SemanticNode container = mySemanticNode.getParent();
    mySemanticNode.delete();
    semanticModel.fireNodeDeletedEvent(container);
  }
}
