package jetbrains.mps.build.packaging.mps.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.build.packaging.mps.generator.template.util.CheckUtil;

public class CheckCoreRuntimeDeps_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CheckCoreRuntimeDeps_Action.class);

  public CheckCoreRuntimeDeps_Action() {
    super("Check Core Runtime Deps", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "CheckCoreRuntimeDeps", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      CheckUtil.checkCoreRuntimeDeps();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CheckCoreRuntimeDeps", t);
    }
  }
}
