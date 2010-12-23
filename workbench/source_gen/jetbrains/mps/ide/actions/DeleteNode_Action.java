package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.dialogs.DeleteDialog;
import jetbrains.mps.workbench.actions.nodes.DeleteNodesHelper;

public class DeleteNode_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(DeleteNode_Action.class);

  private Project project;
  private List<SNode> nodes;
  private IOperationContext context;

  public DeleteNode_Action() {
    super("Delete", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return " DELETE";
  }

  public boolean isApplicable(AnActionEvent event) {
    return DeleteNode_Action.this.nodes.size() != 0;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "DeleteNode", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.nodes = event.getData(MPSDataKeys.NODES);
    if (this.nodes == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._boolean safe = new Wrappers._boolean(false);
      final Wrappers._boolean dialogNeeded = new Wrappers._boolean(false);
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          for (SNode node : DeleteNode_Action.this.nodes) {
            if (SNodeOperations.isInstanceOf(node, "jetbrains.mps.lang.structure.structure.ConceptDeclaration") && node.isRoot()) {
              dialogNeeded.value = true;
              break;
            }
          }
        }
      });
      if (dialogNeeded.value) {
        DeleteDialog dialog = new DeleteDialog(DeleteNode_Action.this.project, "Delete Node", "Are you sure you want to delete selected node?");
        dialog.setOptions(false, true, false, false);
        dialog.show();
        if (!(dialog.isOK())) {
          return;
        }
        safe.value = dialog.isSafe();
      }
      ModelAccess.instance().runWriteActionInCommand(new Runnable() {
        public void run() {
          new DeleteNodesHelper(DeleteNode_Action.this.nodes, DeleteNode_Action.this.context, safe.value).deleteNodes(true);
        }
      });
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "DeleteNode", t);
      }
    }
  }
}
