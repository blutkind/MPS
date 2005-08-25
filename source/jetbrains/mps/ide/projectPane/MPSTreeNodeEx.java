package jetbrains.mps.ide.projectPane;

import jetbrains.mps.ide.ui.MPSTreeNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SNode;

/**
 * Created by IntelliJ IDEA.
 * User: Igoor
 * Date: Aug 25, 2005
 * Time: 5:22:56 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class MPSTreeNodeEx extends MPSTreeNode {
  protected MPSTreeNodeEx(IOperationContext operationContext) {
    super(operationContext);
  }

  protected abstract SModel getSModel();

  public SNode getSNode() {
    return null;
  }
}
