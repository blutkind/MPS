package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.util.PathManager;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class ShowDefaultKeymap_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowDefaultKeymap_Action.class);
  public static final Icon ICON = null;

  public ShowDefaultKeymap_Action() {
    super("Default Keymap Reference", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
    this.setMnemonic("K".charAt(0));
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowDefaultKeymap", t);
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
      BrowserUtil.launchBrowser(PathManager.getHomePath() + "/docs/" + "DefaultKeymap.html");
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowDefaultKeymap", t);
    }
  }

}
