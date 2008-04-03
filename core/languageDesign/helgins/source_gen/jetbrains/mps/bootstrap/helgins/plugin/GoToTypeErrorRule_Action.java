package jetbrains.mps.bootstrap.helgins.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.ide.EditorsPane;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.helgins.inference.IErrorReporter;
import jetbrains.mps.helgins.inference.TypeChecker;

public class GoToTypeErrorRule_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(GoToTypeErrorRule_Action.class);

  private SNode node;
  private IOperationContext operationContext;
  private EditorsPane editorsPane;
  private MPSProject project;
  private boolean isAlwaysVisible = false;

  public  GoToTypeErrorRule_Action(MPSProject project) {
    super(project, "Go To Rule Which Caused Error");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control alt shift R";
  }

  public boolean isApplicable(ActionContext context) {
    IErrorReporter error = TypeChecker.getInstance().getTypeErrorDontCheck(this.node);
    return !(error == null || error.getRuleId() == null || error.getRuleModel() == null);
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      {
        boolean enabled = this.isApplicable(context);
        this.setEnabled(enabled);
        this.setVisible(enabled || this.isAlwaysVisible);
      }
    } catch (Throwable t) {
      GoToTypeErrorRule_Action.LOG.error("User's action doUpdate method failed. Action:" + "GoToTypeErrorRule", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.node = context.getNode();
      if (this.node == null) {
        return false;
      }
      this.operationContext = context.getOperationContext();
      if (this.operationContext == null) {
        return false;
      }
      this.editorsPane = context.get(EditorsPane.class);
      if (this.editorsPane == null) {
        return false;
      }
      {
        MPSProject project = null;
        if (context.getOperationContext() != null) {
          project = context.getOperationContext().getProject();
        }
        this.project = project;
      }
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() ActionContext context) {
    try {
      if (!(this.fillFieldsIfNecessary(context))) {
        return;
      }
      {
        IErrorReporter error = TypeChecker.getInstance().getTypeErrorDontCheck(this.node);
        GoToTypeErrorRuleUtil.goToTypeErrorRule(this.operationContext, error, GoToTypeErrorRule_Action.LOG);
      }
    } catch (Throwable t) {
      GoToTypeErrorRule_Action.LOG.error("User's action execute method failed. Action:" + "GoToTypeErrorRule", t);
    }
  }

}
