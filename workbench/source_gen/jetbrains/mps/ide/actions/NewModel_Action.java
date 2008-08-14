package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.NewModelDialog;
import jetbrains.mps.ide.projectPane.ProjectPane;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.IModule;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class NewModel_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(NewModel_Action.class);
  public static final Icon ICON = null;

  public MPSProject project;
  public IOperationContext context;
  public IModule module;

  public NewModel_Action() {
    super("New Model", "", ICON);
    this.setIsAlwaysVisible(false);
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
      LOG.error("User's action doUpdate method failed. Action:" + "NewModel", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.project = event.getData(MPSDataKeys.MPS_PROJECT);
      if (this.project == null) {
        return false;
      }
      this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      if (this.context == null) {
        return false;
      }
      this.module = event.getData(MPSDataKeys.CONTEXT_MODULE);
      if (this.module == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final NewModelDialog[] dialog = new NewModelDialog[1];
      final IOperationContext localContext = this.context;
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          dialog[0] = new NewModelDialog(NewModel_Action.this.module, NewModel_Action.this.getNamespace(), localContext);
        }

      });
      dialog[0].showDialog();
      SModelDescriptor modelDescriptor = dialog[0].getResult();
      this.project.getComponentSafe(ProjectPane.class).selectModel(modelDescriptor);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "NewModel", t);
    }
  }

  protected String getNamespace() {
    return null;
  }

}
