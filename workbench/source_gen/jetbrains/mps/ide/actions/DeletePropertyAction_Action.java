package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.swing.tree.TreeNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.ui.smodel.PropertyTreeNode;
import jetbrains.mps.ide.ui.smodel.PropertiesTreeNode;
import jetbrains.mps.workbench.MPSDataKeys;

public class DeletePropertyAction_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(DeletePropertyAction_Action.class);

  private TreeNode node;

  public DeletePropertyAction_Action() {
    super("Delete", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return " DELETE";
  }

  public boolean isApplicable(AnActionEvent event) {
    if (!(DeletePropertyAction_Action.this.node instanceof PropertyTreeNode)) {
      return false;
    }
    TreeNode parent = DeletePropertyAction_Action.this.node.getParent();
    return parent instanceof PropertiesTreeNode;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "DeletePropertyAction", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.LOGICAL_VIEW_NODE);
    if (this.node == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      TreeNode parent = DeletePropertyAction_Action.this.node.getParent();
      PropertiesTreeNode propsNode = (PropertiesTreeNode) parent;
      PropertyTreeNode propNode = (PropertyTreeNode) DeletePropertyAction_Action.this.node;
      propsNode.getSNode().setProperty(propNode.getProperty(), null);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "DeletePropertyAction", t);
      }
    }
  }
}
