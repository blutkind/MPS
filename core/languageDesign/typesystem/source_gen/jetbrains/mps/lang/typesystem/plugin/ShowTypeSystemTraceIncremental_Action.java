package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.typesystem.inference.TypeCheckingContext;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.newTypesystem.TypeCheckingContextNew;
import jetbrains.mps.newTypesystem.presentation.trace.ShowTypeSystemTrace;
import jetbrains.mps.smodel.IOperationContext;
import java.awt.Frame;

public class ShowTypeSystemTraceIncremental_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowTypeSystemTraceIncremental_Action.class);

  public ShowTypeSystemTraceIncremental_Action() {
    super("Show Incremental Typesystem Trace", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowTypeSystemTraceIncremental", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("frame", event.getData(MPSDataKeys.FRAME));
    if (MapSequence.fromMap(_params).get("frame") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorComponent", event.getData(MPSDataKeys.EDITOR_COMPONENT));
    if (MapSequence.fromMap(_params).get("editorComponent") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      TypeCheckingContext typeCheckingContext;
      typeCheckingContext = ((EditorComponent) MapSequence.fromMap(_params).get("editorComponent")).getTypeCheckingContext();
      if (typeCheckingContext instanceof TypeCheckingContextNew) {
        TypeCheckingContextNew t = (TypeCheckingContextNew) typeCheckingContext;
        new ShowTypeSystemTrace(t, ((IOperationContext) MapSequence.fromMap(_params).get("context")), ((Frame) MapSequence.fromMap(_params).get("frame")), ((SNode) MapSequence.fromMap(_params).get("node")), false);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowTypeSystemTraceIncremental", t);
    }
  }
}
