package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.action.ActionEventData;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.make.ModuleMaker;
import java.util.LinkedHashSet;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.reloading.ClassLoaderManager;

public class CleanAllModules_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CleanAllModules_Action.class);
  public static final Icon ICON = null;

  private Project project;

  public CleanAllModules_Action() {
    super("Clean All Modules", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CleanAllModules", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.project = new ActionEventData(event).getProject();
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
      ProgressManager.getInstance().run(new Task.Modal(this.project, "Cleaning", true) {

        public void run(@NotNull() final ProgressIndicator indicator) {
          ModelAccess.instance().runReadAction(new Runnable() {

            public void run() {
              ModuleMaker maker = new ModuleMaker();
              maker.clean(new LinkedHashSet<IModule>(MPSModuleRepository.getInstance().getAllModules()), indicator);
              ClassLoaderManager.getInstance().reloadAll(indicator);
            }

          });
        }

      });
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CleanAllModules", t);
    }
  }

}
