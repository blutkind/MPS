package jetbrains.mps.ide.make.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.make.IMakeService;
import jetbrains.mps.smodel.SModelDescriptor;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.make.MakeSession;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.make.TextPreviewUtil;
import java.util.List;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.smodel.DefaultSModelDescriptor;

public class TextPreviewModel_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(TextPreviewModel_Action.class);

  public TextPreviewModel_Action() {
    super("Preview Generated Text", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    if (IMakeService.INSTANCE.get().isSessionActive()) {
      return false;
    }
    SModelDescriptor md = TextPreviewModel_Action.this.modelToGenerate(_params);
    return md != null && TextPreviewModel_Action.this.isUserEditableModel(md, _params);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "TextPreviewModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("cmodel", event.getData(MPSDataKeys.CONTEXT_MODEL));
    MapSequence.fromMap(_params).put("models", event.getData(MPSDataKeys.MODELS));
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      MakeSession session = new MakeSession(((IOperationContext) MapSequence.fromMap(_params).get("context")), null, true);
      if (IMakeService.INSTANCE.get().openNewSession(session)) {
        TextPreviewUtil.previewModelText(session, ((IOperationContext) MapSequence.fromMap(_params).get("context")), TextPreviewModel_Action.this.modelToGenerate(_params));
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "TextPreviewModel", t);
      }
    }
  }

  private SModelDescriptor modelToGenerate(final Map<String, Object> _params) {
    SModelDescriptor md = null;
    if (((SModelDescriptor) MapSequence.fromMap(_params).get("cmodel")) != null) {
      md = ((SModelDescriptor) MapSequence.fromMap(_params).get("cmodel"));
    } else if (((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")).size() > 0) {
      md = ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")).get(0);
    }
    return md;
  }

  private boolean isUserEditableModel(SModelDescriptor md, final Map<String, Object> _params) {
    if (!(SModelStereotype.isUserModel(md))) {
      return false;
    }
    return md instanceof DefaultSModelDescriptor && !(((DefaultSModelDescriptor) md).isReadOnly());
  }
}
