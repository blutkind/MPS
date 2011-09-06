package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.MissingDependenciesFixer;
import java.awt.Frame;
import jetbrains.mps.smodel.SModelDescriptor;

public class AddMissingImports_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(AddMissingImports_Action.class);

  public AddMissingImports_Action() {
    super("Add Missing Imports", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "AddMissingImports", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("modelDescriptor", event.getData(MPSDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("modelDescriptor") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      new MissingDependenciesFixer(((Frame) MapSequence.fromMap(_params).get("frame")), ((SModelDescriptor) MapSequence.fromMap(_params).get("modelDescriptor"))).fix(true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "AddMissingImports", t);
      }
    }
  }
}
