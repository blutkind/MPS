package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.helgins.inference.IErrorReporter;
import jetbrains.mps.helgins.inference.TypeChecker;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.action.ActionEventData;
import jetbrains.mps.workbench.action.BaseAction;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class GoToTypeErrorRule_Action extends BaseAction {
  public static final Logger LOG = Logger.getLogger(GoToTypeErrorRule_Action.class);
  public static final Icon ICON = null;

  private SNode node;
  private IOperationContext operationContext;
  private MPSProject project;

  public GoToTypeErrorRule_Action() {
    super("Go To Rule Which Caused Error", "", ICON, false, false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt shift R";
  }

  public boolean isApplicable(AnActionEvent event) {
    IErrorReporter error = TypeChecker.getInstance().getTypeErrorDontCheck(this.node);
    return !(error == null || error.getRuleId() == null || error.getRuleModel() == null);
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GoToTypeErrorRule", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean fillFieldsIfNecessary(AnActionEvent event) {
    try {
      this.node = new ActionEventData(event).getNode();
      if (this.node == null) {
        return false;
      }
      this.operationContext = new ActionEventData(event).getOperationContext();
      if (this.operationContext == null) {
        return false;
      }
      this.project = new ActionEventData(event).getMPSProject();
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
      IErrorReporter error = TypeChecker.getInstance().getTypeErrorDontCheck(this.node);
      GoToTypeErrorRuleUtil.goToTypeErrorRule(this.operationContext, error, LOG);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GoToTypeErrorRule", t);
    }
  }

}
