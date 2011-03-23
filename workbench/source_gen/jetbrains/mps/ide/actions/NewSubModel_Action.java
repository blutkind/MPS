package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelStereotype;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.ide.dialogs.project.creation.NewModelDialog;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.ide.projectPane.ProjectPane;
import com.intellij.openapi.project.Project;

public class NewSubModel_Action extends GeneratedAction {
  private static final Icon ICON = new ImageIcon(NewSubModel_Action.class.getResource("model.png"));
  protected static Log log = LogFactory.getLog(NewSubModel_Action.class);

  public NewSubModel_Action() {
    super("Model", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    boolean correctStereotype = false;
    String stereotype = ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getStereotype();
    for (String availableStereotype : SModelStereotype.values) {
      if (stereotype.equals(availableStereotype)) {
        correctStereotype = true;
        break;
      }
    }
    return correctStereotype;
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "NewSubModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("ideaProject", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("ideaProject") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.CONTEXT_MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      final Wrappers._T<NewModelDialog> dialog = new Wrappers._T<NewModelDialog>();
      final IModule localModule = (((IOperationContext) MapSequence.fromMap(_params).get("context")).getModule() != null ?
        ((IOperationContext) MapSequence.fromMap(_params).get("context")).getModule() :
        ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getModule()
      );
      final String namespace = ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getLongName();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          String stereotype = ((SModelDescriptor) MapSequence.fromMap(_params).get("model")).getStereotype();
          dialog.value = new NewModelDialog(localModule, namespace, ((IOperationContext) MapSequence.fromMap(_params).get("context")), stereotype, true);
        }
      });
      dialog.value.showDialog();
      SModelDescriptor result = dialog.value.getResult();
      if (result != null) {
        SModelDescriptor modelDescriptor = result;
        ProjectPane.getInstance(((Project) MapSequence.fromMap(_params).get("ideaProject"))).selectModel(modelDescriptor, false);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "NewSubModel", t);
      }
    }
  }
}
