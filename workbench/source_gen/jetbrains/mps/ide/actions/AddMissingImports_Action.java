package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.MissingDependenciesFixer;

public class AddMissingImports_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(AddMissingImports_Action.class);
  public static final Icon ICON = null;

  public SModelDescriptor modelDescriptor;
  public IOperationContext context;

  public AddMissingImports_Action() {
    super("Fix Missing Imports", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "AddMissingImports", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      this.modelDescriptor = event.getData(MPSDataKeys.MODEL_DESCRIPTOR);
      if (this.modelDescriptor == null) {
        return false;
      }
      this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
      if (this.context == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      new MissingDependenciesFixer(this.context, this.modelDescriptor).fix();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "AddMissingImports", t);
    }
  }

}
