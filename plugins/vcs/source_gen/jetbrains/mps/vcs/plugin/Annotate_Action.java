package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.vcs.annotate.AnnotationHelper;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;

public class Annotate_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(Annotate_Action.class);

  public Annotate_Action() {
    super("Annotate", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return AnnotationHelper.isAnnotateable(((EditorComponent) MapSequence.fromMap(_params).get("editor")));
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "Annotate", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("editor", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editor") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      AnnotationHelper.annotate(((EditorComponent) MapSequence.fromMap(_params).get("editor")));
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "Annotate", t);
      }
    }
  }
}
