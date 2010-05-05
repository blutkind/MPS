package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.nodeEditor.EditorContext;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.changesmanager.EditorChangesHighlighter;
import jetbrains.mps.workbench.MPSDataKeys;

public class GoToNextChange_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/nextOccurence.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(GoToNextChange_Action.class);

  private EditorContext editorContext;
  private Project project;

  public GoToNextChange_Action() {
    super("Next Change", "Go to next change", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl alt shift DOWN";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      event.getPresentation().setVisible(true);
      event.getPresentation().setEnabled(EditorChangesHighlighter.getInstance(GoToNextChange_Action.this.project).isNextChangeAvailable(GoToNextChange_Action.this.editorContext));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToNextChange", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.editorContext = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.editorContext == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.editorContext = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      EditorChangesHighlighter.getInstance(GoToNextChange_Action.this.project).goToNextChange(GoToNextChange_Action.this.editorContext);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToNextChange", t);
      }
    }
  }
}
