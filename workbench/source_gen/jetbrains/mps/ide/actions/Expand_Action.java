package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorComponent;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellActionType;

public class Expand_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(Expand_Action.class);

  private EditorCell editorCell;
  private EditorContext editorContext;
  private EditorComponent editorComponent;

  public Expand_Action() {
    super("Expand", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
    this.setMnemonic("x".charAt(0));
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl ADD";
  }

  public boolean isApplicable(AnActionEvent event) {
    return Expand_Action.this.getAction() != null;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "Expand", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.editorCell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.editorCell == null) {
      return false;
    }
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      Expand_Action.this.getAction().execute(Expand_Action.this.editorContext);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "Expand", t);
      }
    }
  }

  /*package*/ EditorCellAction getAction() {
    return Expand_Action.this.editorComponent.getComponentAction(CellActionType.UNFOLD);
  }
}
