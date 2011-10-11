package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import java.io.File;
import jetbrains.mps.util.PathManager;
import jetbrains.mps.util.FileUtil;
import javax.swing.JOptionPane;
import java.awt.Frame;
import java.io.IOException;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;

public class InstallIDEAPlugin_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(InstallIDEAPlugin_Action.class);

  public InstallIDEAPlugin_Action() {
    super("Install IntelliJ IDEA Plugin", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "InstallIDEAPlugin", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      File pluginFile = new File(new File(PathManager.getHomePath(), "plugin"), "MPSPlugin.jar");
      File targetDir = InstallIDEAPlugin_Action.this.getTargetDir(_params);
      if (targetDir == null) {
        return;
      }
      if (!(targetDir.exists())) {
        targetDir.mkdirs();
      }
      try {
        FileUtil.copyFileChecked(pluginFile, targetDir);
        JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "Plugin Installed\nYou should restart IDEA before using plugin");
      } catch (IOException e) {
        JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "Failed to install plugin : " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "InstallIDEAPlugin", t);
      }
    }
  }

  private File getTargetDir(final Map<String, Object> _params) {
    File targetIdeaInstallDir = InstallIDEAPlugin_Action.this.getTargetIdeaInstallDir(_params);
    if (targetIdeaInstallDir == null) {
      return null;
    }
    if (SystemInfo.isMac) {
      return targetIdeaInstallDir;
    }
    return new File(targetIdeaInstallDir, "config" + File.separator + "plugins");
  }

  private File getTargetIdeaInstallDir(final Map<String, Object> _params) {
    boolean isMac = SystemInfo.isMac;
    String userHome = System.getProperty("user.home");
    String ideaConfigRootPath = (isMac ?
      userHome + File.separator + "Library" + File.separator + "Application Support" :
      userHome
    );
    final VirtualFile ideaConfigRoot = VirtualFileUtils.getVirtualFile(ideaConfigRootPath);
    final String ideaConfigFolderPrefix = (isMac ?
      "IntelliJIdea" :
      ".IntelliJIdea"
    );
    List<VirtualFile> existingIdeaConfigs = ListSequence.fromList(new ArrayList<VirtualFile>());
    for (VirtualFile child : ideaConfigRoot.getChildren()) {
      if (child.isDirectory() && child.getName().startsWith(ideaConfigFolderPrefix)) {
        ListSequence.fromList(existingIdeaConfigs).addElement(child);
      }
    }
    if ((int) ListSequence.fromList(existingIdeaConfigs).count() == 0) {
      JOptionPane.showMessageDialog(((Frame) MapSequence.fromMap(_params).get("frame")), "IntelliJ IDEA installation was not found", "Cannot install plugin", JOptionPane.ERROR_MESSAGE);
      return null;
    } else if ((int) ListSequence.fromList(existingIdeaConfigs).count() == 1) {
      return VirtualFileUtils.toFile(ListSequence.fromList(existingIdeaConfigs).first());
    }

    FileChooserDescriptor descriptor = new FileChooserDescriptor(false, true, false, false, false, false) {
      @Override
      public boolean isFileVisible(VirtualFile file, boolean b) {
        if (!(super.isFileVisible(file, b))) {
          return false;
        }
        return ideaConfigRoot.equals(file.getParent()) && file.getName().startsWith(ideaConfigFolderPrefix);
      }
    };
    descriptor.setTitle("Select IntelliJ IDEA configuration folder");
    descriptor.setRoot(ideaConfigRoot);

    String oldShowHiddenValue = PropertiesComponent.getInstance().getValue("FileChooser.showHiddens");
    PropertiesComponent.getInstance().setValue("FileChooser.showHiddens", Boolean.TRUE.toString());
    FileChooserDialog dialog = FileChooserFactory.getInstance().createFileChooser(descriptor, ((Frame) MapSequence.fromMap(_params).get("frame")));
    VirtualFile[] files = dialog.choose(ideaConfigRoot, null);
    PropertiesComponent.getInstance().setValue("FileChooser.showHiddens", oldShowHiddenValue);
    assert files.length <= 1;
    return (files.length == 0 ?
      null :
      VirtualFileUtils.toFile(files[0])
    );
  }
}
