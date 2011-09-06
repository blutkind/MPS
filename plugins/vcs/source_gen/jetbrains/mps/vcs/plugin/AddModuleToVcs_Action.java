package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import com.intellij.openapi.actionSystem.Presentation;
import java.util.List;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.project.Project;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.openapi.vcs.changes.ChangeListManagerImpl;

public class AddModuleToVcs_Action extends GeneratedAction {
  private static final Icon ICON = new ImageIcon(AddModuleToVcs_Action.class.getResource("addToVcs.png"));
  protected static Log log = LogFactory.getLog(AddModuleToVcs_Action.class);

  public AddModuleToVcs_Action() {
    super("Add Module to VCS", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        Presentation presentation = event.getPresentation();
        presentation.setText(String.format("Add %s to VCS", (((List<IModule>) MapSequence.fromMap(_params).get("modules")).size() == 1 ?
          "Module" :
          "Modules"
        )));
        boolean enabled = ListSequence.fromList(VcsActionsHelper.getUnversionedFilesForModules(((Project) MapSequence.fromMap(_params).get("project")), ((List<IModule>) MapSequence.fromMap(_params).get("modules")))).isNotEmpty();
        presentation.setEnabled(enabled);
        presentation.setVisible(enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AddModuleToVcs", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("modules", event.getData(MPSDataKeys.MODULES));
    if (MapSequence.fromMap(_params).get("modules") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      List<VirtualFile> unversionedFiles = VcsActionsHelper.getUnversionedFilesForModules(((Project) MapSequence.fromMap(_params).get("project")), ((List<IModule>) MapSequence.fromMap(_params).get("modules")));
      ChangeListManagerImpl changeListManager = ChangeListManagerImpl.getInstanceImpl(((Project) MapSequence.fromMap(_params).get("project")));
      changeListManager.addUnversionedFiles(changeListManager.getDefaultChangeList(), unversionedFiles);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddModuleToVcs", t);
      }
    }
  }
}
