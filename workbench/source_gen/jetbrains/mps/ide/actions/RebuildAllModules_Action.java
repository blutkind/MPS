package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.progress.ProgressIndicator;
import jetbrains.mps.smodel.ModelAccess;
import java.util.LinkedHashSet;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.MPSModuleRepository;
import jetbrains.mps.make.ModuleMaker;
import jetbrains.mps.reloading.ClassLoaderManager;

public class RebuildAllModules_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(RebuildAllModules_Action.class);
  private static final Icon ICON = null;

  public Project project;

  public RebuildAllModules_Action() {
    super("Rebuild All", "", ICON);
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
      LOG.error("User's action doUpdate method failed. Action:" + "RebuildAllModules", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ProgressManager.getInstance().run(new Task.Modal(RebuildAllModules_Action.this.project, "Rebuilding", true) {

        public void run(@NotNull() final ProgressIndicator indicator) {
          ModelAccess.instance().runReadAction(new Runnable() {

            public void run() {
              LinkedHashSet<IModule> modules = new LinkedHashSet<IModule>(MPSModuleRepository.getInstance().getAllModules());
              ModuleMaker maker = new ModuleMaker();
              maker.clean(modules, indicator);
              maker.make(modules, indicator);
              ClassLoaderManager.getInstance().reloadAll(indicator);
            }

          });
        }

      });
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RebuildAllModules", t);
    }
  }

}
