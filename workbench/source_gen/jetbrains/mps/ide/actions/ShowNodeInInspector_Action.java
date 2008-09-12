package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class ShowNodeInInspector_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(ShowNodeInInspector_Action.class);
  public static final Icon ICON = null;

  public SNode node;
  public EditorComponent editor;

  public ShowNodeInInspector_Action() {
    super("Inspect Node", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ShowNodeInInspector_Action.this.editor instanceof InspectorEditorComponent;
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowNodeInInspector", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.node = event.getData(MPSDataKeys.SNODE);
    if (this.node == null) {
      return false;
    }
    this.editor = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editor == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      InspectorEditorComponent inspector = (InspectorEditorComponent) ShowNodeInInspector_Action.this.editor;
      inspector.inspectNode(ShowNodeInInspector_Action.this.node, inspector.getOperationContext(), null);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowNodeInInspector", t);
    }
  }

}
