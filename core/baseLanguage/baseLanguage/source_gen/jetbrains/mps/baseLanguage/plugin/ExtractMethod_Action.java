package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.CurrentProjectMPSAction;
import jetbrains.mps.logging.Logger;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.ide.action.ActionContext;
import java.util.ArrayList;
import jetbrains.mps.baseLanguage.refactoring.ExtractMethodKind;
import jetbrains.mps.baseLanguage.refactoring.ExtractMethodDialog;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;

public class ExtractMethod_Action extends CurrentProjectMPSAction {
  public static final Logger LOG = Logger.getLogger(ExtractMethod_Action.class);

  private List<SNode> nodes;
  private boolean isAlwaysVisible = false;

  public  ExtractMethod_Action(MPSProject project) {
    super(project, "Extract Method");
  }

  @NotNull()
  public String getKeyStroke() {
    return "control alt M";
  }

  public void doUpdate(@NotNull() ActionContext context) {
    try {
      super.doUpdate(context);
      if (!(this.fillFieldsIfNecessary(context))) {
        this.setEnabled(false);
        this.setVisible(this.isAlwaysVisible);
        return;
      }
      if (!(this.isExpression(this.nodes)) && !(this.isStatements(this.nodes))) {
        this.setVisible(false);
      } else
      {
        this.setVisible(true);
      }
    } catch (Throwable t) {
      ExtractMethod_Action.LOG.error("User's action doUpdate method failed. Action:" + "ExtractMethod", t);
      this.setEnabled(false);
      this.setVisible(this.isAlwaysVisible);
    }
  }

  private boolean fillFieldsIfNecessary(ActionContext context) {
    try {
      this.nodes = new ArrayList<SNode>(context.getNodes());
      if (this.nodes == null) {
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
        ExtractMethodKind kind;
        if (this.isStatements(this.nodes)) {
          kind = ExtractMethodKind.FROM_STATEMENTS;
        } else
        {
          kind = ExtractMethodKind.FROM_EXPRESSION;
        }
        ExtractMethodDialog dialog = new ExtractMethodDialog(kind, context);
        dialog.showDialog();
      }
    } catch (Throwable t) {
      ExtractMethod_Action.LOG.error("User's action execute method failed. Action:" + "ExtractMethod", t);
    }
  }

  /* package */boolean isStatements(List<SNode> statements) {
    for(SNode node : statements) {
      if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.Statement"))) {
        return false;
      }
    }
    return true;
  }

  /* package */boolean isExpression(List<SNode> nodes) {
    return SequenceOperations.getSize(nodes) == 1 && SNodeOperations.isInstanceOf(SequenceOperations.getFirst(nodes), "jetbrains.mps.baseLanguage.structure.Expression");
  }

}
