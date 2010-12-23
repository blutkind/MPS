package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.logging.Logger;

public class TestNodePath_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(TestNodePath_Action.class);

  private SNode node;

  public TestNodePath_Action() {
    super("Test Node Path", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "TestNodePath", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      SNode root = SNodeOperations.getContainingRoot(TestNodePath_Action.this.node);
      if (TestNodePath_Action.this.node != root.findChildByPath(root.getNodePath(TestNodePath_Action.this.node))) {
        Logger.getLogger("TestNode_Action").error("find child by path works improperly");
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "TestNodePath", t);
      }
    }
  }
}
