package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class ShowModuleRepository_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowModuleRepository_Action.class);
  public static final Icon ICON = null;

  public MPSProject project;

  public ShowModuleRepository_Action() {
    super("Show Module Repository", "", ICON);
    this.setIsAlwaysVisible(true);
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
      LOG.error("User's action doUpdate method failed. Action:" + "ShowModuleRepository", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.project = event.getData(MPSDataKeys.MPS_PROJECT);
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ModuleRepository_Tool tool = this.project.getPluginManager().getTool(ModuleRepository_Tool.class);
      assert tool != null;
      tool.openTool(true);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowModuleRepository", t);
    }
  }

}
