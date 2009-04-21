package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.workbench.actions.model.OptimizeImportsHelper;
import jetbrains.mps.ide.dialogs.ScrollingMessageDialog;

public class OptimizeProjectImports_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(OptimizeProjectImports_Action.class);

  public IOperationContext context;
  public Frame frame;
  public MPSProject project;

  public OptimizeProjectImports_Action() {
    super("Optimize Imports", "", ICON);
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
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "OptimizeProjectImports", t);
      }
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
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<String> report = new Wrappers._T<String>();
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {

        public void run() {
          report.value = OptimizeImportsHelper.optimizeProjectImports(OptimizeProjectImports_Action.this.context, OptimizeProjectImports_Action.this.project);
        }
      });
      new ScrollingMessageDialog(OptimizeProjectImports_Action.this.frame, report.value).showDialog();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "OptimizeProjectImports", t);
      }
    }
  }

}
