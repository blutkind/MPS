package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.util.LinkedHashSet;
import java.util.Set;

public class CleanProject_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CleanProject_Action.class);
  public static final Icon ICON = null;

  public IOperationContext context;
  public Project ideaProject;
  public MPSProject project;

  public CleanProject_Action() {
    super("Clean", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CleanProject", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      if (this.context == null) {
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
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Set<IModule> modulesToBuild = new LinkedHashSet<IModule>();
      modulesToBuild.addAll(this.project.getProjectSolutions());
      modulesToBuild.addAll(this.project.getProjectLanguages());
      modulesToBuild.addAll(this.project.getProjectDevKits());
      ProgressManager.getInstance().run(new Task.Modal(this.ideaProject, "Cleaning", true) {

        public void run(@NotNull() final ProgressIndicator indicator) {
          ModelAccess.instance().runReadAction(new Runnable() {

            public void run() {
              ModuleMaker maker = new ModuleMaker();
              maker.clean(modulesToBuild, indicator);
            }

          });
        }

      });
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CleanProject", t);
    }
  }

}
