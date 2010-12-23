package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.awt.Frame;
import jetbrains.mps.smodel.SNode;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import com.intellij.openapi.vfs.VirtualFile;
import jetbrains.mps.ide.vfs.VirtualFileUtils;
import com.intellij.openapi.vcs.ProjectLevelVcsManager;
import com.intellij.openapi.vcs.FileStatus;
import com.intellij.openapi.vcs.impl.VcsFileStatusProvider;
import jetbrains.mps.workbench.MPSDataKeys;

public class ShowDiffererenesWithCurrentRevision_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/diff.png", "jetbrains.mps.vcs"), true);
  protected static Log log = LogFactory.getLog(ShowDiffererenesWithCurrentRevision_Action.class);

  private Frame frame;
  private SNode node;
  private Project project;
  private IOperationContext context;
  private SModelDescriptor model;

  public ShowDiffererenesWithCurrentRevision_Action() {
    super("Compare with the Same Repository Revision", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    IconUtil.useIcon(ShowDiffererenesWithCurrentRevision_Action.this, event.getPresentation(), "icons/diff.png");
    if (!(ShowDiffererenesWithCurrentRevision_Action.this.model instanceof EditableSModelDescriptor)) {
      return false;
    }
    VirtualFile virtualFile = VirtualFileUtils.getVirtualFile(((EditableSModelDescriptor) ShowDiffererenesWithCurrentRevision_Action.this.model).getModelFile());
    if (ShowDiffererenesWithCurrentRevision_Action.this.node.isRoot() && ProjectLevelVcsManager.getInstance(ShowDiffererenesWithCurrentRevision_Action.this.project).getVcsFor(virtualFile) != null) {
      FileStatus fileStatus = ShowDiffererenesWithCurrentRevision_Action.this.project.getComponent(VcsFileStatusProvider.class).getFileStatus(virtualFile);
      return FileStatus.ADDED != fileStatus && FileStatus.UNKNOWN != fileStatus;
    }
    return false;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowDiffererenesWithCurrentRevision", t);
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
    this.node = event.getData(MPSDataKeys.NODE);
    if (this.node == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      VcsActionsHelper.showRootDifference(ShowDiffererenesWithCurrentRevision_Action.this.frame, ShowDiffererenesWithCurrentRevision_Action.this.context, ShowDiffererenesWithCurrentRevision_Action.this.model.getSModel(), ShowDiffererenesWithCurrentRevision_Action.this.node, ShowDiffererenesWithCurrentRevision_Action.this.project);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowDiffererenesWithCurrentRevision", t);
      }
    }
  }
}
