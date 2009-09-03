package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.project.Project;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.IOperationContext;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;
import javax.swing.SwingUtilities;
import jetbrains.mps.ide.projectPane.ProjectPane;

public class CloneRoot_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(CloneRoot_Action.class);

  private Project ideaProject;
  private MPSProject project;
  private IOperationContext context;
  private List<SNode> nodes;

  public CloneRoot_Action() {
    super("Clone Root", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "shift F5";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CloneRoot", t);
      }
      this.disable(event.getPresentation());
    }
  }

  @Override
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSDataKeys.NODES);
      boolean error = false;
      if (nodes != null) {
      }
      if (error || nodes == null) {
        this.nodes = null;
      } else {
        this.nodes = ListSequence.fromListWithValues(new ArrayList<SNode>(), nodes);
      }
    }
    if (this.nodes == null) {
      return false;
    }
    this.ideaProject = event.getData(MPSDataKeys.PROJECT);
    if (this.ideaProject == null) {
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
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      for (SNode node : ListSequence.fromList(CloneRoot_Action.this.nodes)) {
        SNode root = SNodeOperations.getContainingRoot(node);
        final SNode copy = SNodeOperations.copyNode(root);
        SModelOperations.addRootNode(SNodeOperations.getModel(root), copy);
        CloneRoot_Action.this.project.getComponentSafe(MPSEditorOpener.class).editNode(copy, CloneRoot_Action.this.context);
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            ProjectPane.getInstance(CloneRoot_Action.this.ideaProject).selectNode(copy);
          }
        });
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CloneRoot", t);
      }
    }
  }
}
