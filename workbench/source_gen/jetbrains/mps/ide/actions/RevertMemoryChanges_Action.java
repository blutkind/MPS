package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class RevertMemoryChanges_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(RevertMemoryChanges_Action.class);
  public static final Icon ICON = null;

  public SModelDescriptor model;

  public RevertMemoryChanges_Action() {
    super("Revert Memory Changes", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RevertMemoryChanges", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.model = event.getData(MPSDataKeys.MODEL_DESCRIPTOR);
      if (this.model == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      this.model.reloadFromDisk();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RevertMemoryChanges", t);
    }
  }

}
