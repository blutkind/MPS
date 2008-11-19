package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;

import javax.swing.Icon;

import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class ShowErrorMessage_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ShowErrorMessage_Action.class);
  private static final Icon ICON = null;

  public ShowErrorMessage_Action() {
    super("Show Error Message", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return false;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowErrorMessage", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowErrorMessage", t);
    }
  }

}
