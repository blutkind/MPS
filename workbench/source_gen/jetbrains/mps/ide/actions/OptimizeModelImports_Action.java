package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.dialogs.MessageDialog;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.actions.model.OptimizeImportsHelper;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.awt.Frame;

public class OptimizeModelImports_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(OptimizeModelImports_Action.class);
  private static final Icon ICON = null;

  public IOperationContext context;
  public SModelDescriptor model;
  public Frame frame;

  public OptimizeModelImports_Action() {
    super("Optimize Imports", "", ICON);
    this.setIsAlwaysVisible(false);
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
      LOG.error("User's action doUpdate method failed. Action:" + "OptimizeModelImports", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.MODEL);
    if (this.model == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<String> report = new Wrappers._T<String>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          report.value = OptimizeImportsHelper.optimizeModelImports(OptimizeModelImports_Action.this.context, OptimizeModelImports_Action.this.model);
        }

      });
      new MessageDialog(OptimizeModelImports_Action.this.frame, report.value).showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "OptimizeModelImports", t);
    }
  }

}
