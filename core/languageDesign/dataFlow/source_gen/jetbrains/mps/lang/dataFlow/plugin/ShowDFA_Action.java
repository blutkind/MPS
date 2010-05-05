package jetbrains.mps.lang.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.dataFlow.framework.Program;
import jetbrains.mps.lang.dataFlow.DataFlowManager;
import jetbrains.mps.lang.dataFlow.presentation.ShowCFGDialog;

public class ShowDFA_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowDFA_Action.class);

  private IOperationContext context;
  private SNode node;
  private Frame frame;

  public ShowDFA_Action() {
    super("Show DFA (under construction)", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowDFA", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
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
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.context = null;
    this.frame = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Program program = DataFlowManager.getInstance().buildProgramFor(ShowDFA_Action.this.node);
      new ShowCFGDialog(program, ShowDFA_Action.this.context, ShowDFA_Action.this.frame);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowDFA", t);
    }
  }
}
