package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.io.File;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.ide.SystemInfo;
import jetbrains.mps.util.FileUtil;
import javax.swing.JOptionPane;
import java.io.IOException;

public class InstallIDEAPlugin_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(InstallIDEAPlugin_Action.class);

  private Frame frame;

  public InstallIDEAPlugin_Action() {
    super("Install IntelliJ IDEA Plugin", "", ICON);
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
        log.error("User's action doUpdate method failed. Action:" + "InstallIDEAPlugin", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.frame = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      File pluginFile = new File(new File(PathManager.getHomePath(), "plugin"), "MPSPlugin.jar");
      File targetDir;
      if (!(SystemInfo.isMac)) {
        targetDir = new File(System.getProperty("user.home") + File.separator + ".IntelliJIdea90" + File.separator + "config" + File.separator + "plugins");
      } else {
        targetDir = new File(System.getProperty("user.home") + File.separator + "Library" + File.separator + "Application Support" + File.separator + "IntelliJIdea90");
      }
      if (!(targetDir.exists())) {
        targetDir.mkdirs();
      }
      try {
        FileUtil.copyFileChecked(pluginFile, targetDir);
        JOptionPane.showMessageDialog(InstallIDEAPlugin_Action.this.frame, "Plugin Installed\nYou should restart IDEA before using plugin");
      } catch (IOException e) {
        JOptionPane.showMessageDialog(InstallIDEAPlugin_Action.this.frame, "Failed to install plugin : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "InstallIDEAPlugin", t);
      }
    }
  }
}
