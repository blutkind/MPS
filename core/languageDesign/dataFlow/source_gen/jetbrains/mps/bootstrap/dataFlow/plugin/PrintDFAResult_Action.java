package jetbrains.mps.bootstrap.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import jetbrains.mps.dataFlow.framework.Program;
import jetbrains.mps.dataFlow.DataFlowManager;

public class PrintDFAResult_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(PrintDFAResult_Action.class);

  private SNode node;
  private boolean isAlwaysVisible = false;

  public  PrintDFAResult_Action(MPSProject project) {
    super(project, "Print DFA");
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      this.setEnabled(true);
      this.setVisible(true);
    } catch (Throwable t) {
      PrintDFAResult_Action.LOG.error("User's action doUpdate method failed. Action:" + "PrintDFAResult", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      {
        SNode node = context.getNode();
        if (node != null) {
        }
        this.node = node;
        /*
          if (!(<!IsSubtypeExpression TextGen not found!>)) {
            return false;
          }
        */
      }
      if (this.node == null) {
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
        Program program = DataFlowManager.getInstance().buildProgramFor(this.node);
        System.out.println(program.toString(true));
      }
    } catch (Throwable t) {
      PrintDFAResult_Action.LOG.error("User's action execute method failed. Action:" + "PrintDFAResult", t);
    }
  }

}
