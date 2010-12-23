package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorComponent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.debug.api.BreakpointManagerComponent;
import jetbrains.mps.workbench.MPSDataKeys;

public class ToggleBreakpoint_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ToggleBreakpoint_Action.class);

  private EditorCell selectedCell;
  private EditorComponent editorComponent;
  private Project project;

  public ToggleBreakpoint_Action() {
    super("Toggle Breakpoint", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl F8";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      event.getPresentation().setEnabled(ToggleBreakpoint_Action.this.project.getComponent(BreakpointManagerComponent.class).isDebuggable(ToggleBreakpoint_Action.this.selectedCell));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ToggleBreakpoint", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.selectedCell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.selectedCell == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      ToggleBreakpoint_Action.this.project.getComponent(BreakpointManagerComponent.class).toggleBreakpoint(ToggleBreakpoint_Action.this.selectedCell);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ToggleBreakpoint", t);
      }
    }
  }
}
