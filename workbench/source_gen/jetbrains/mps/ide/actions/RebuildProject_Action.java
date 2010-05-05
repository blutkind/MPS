package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.Set;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.LinkedHashSet;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.intellij.openapi.progress.ProgressManager;

public class RebuildProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RebuildProject_Action.class);

  private Project ideaProject;
  private MPSProject project;

  public RebuildProject_Action() {
    super("Rebuild Project", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
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
        log.error("User's action doUpdate method failed. Action:" + "RebuildProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.ideaProject = event.getData(MPSDataKeys.PROJECT);
    if (this.ideaProject == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.ideaProject = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Set<IModule> modules = SetSequence.fromSet(new LinkedHashSet<IModule>());
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(RebuildProject_Action.this.project.getProjectSolutions()));
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(RebuildProject_Action.this.project.getProjectLanguages()));
      SetSequence.fromSet(modules).addSequence(ListSequence.fromList(RebuildProject_Action.this.project.getProjectDevKits()));
      ProgressManager.getInstance().run(new DefaultMakeTask(RebuildProject_Action.this.ideaProject, "Rebuilding", modules, true));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RebuildProject", t);
      }
    }
  }
}
