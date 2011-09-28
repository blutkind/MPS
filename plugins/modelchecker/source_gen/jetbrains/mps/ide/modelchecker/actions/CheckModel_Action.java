package jetbrains.mps.ide.modelchecker.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.io.StreamUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SModelStereotype;
import jetbrains.mps.workbench.MPSDataKeys;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CheckModel_Action extends GeneratedAction {
  private static final Icon ICON = getIcon();
  protected static Log log = LogFactory.getLog(CheckModel_Action.class);

  public CheckModel_Action() {
    super("Check Model", "Check model for unresolved references and typesystem rules", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        String whatToCheck = "Model";
        if (((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")).size() > 1) {
          whatToCheck = ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")).size() + " Models";
        }
        event.getPresentation().setText("Check " + whatToCheck);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CheckModel", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.MODEL));
    if (MapSequence.fromMap(_params).get("model") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("models", event.getData(MPSDataKeys.MODELS));
    if (MapSequence.fromMap(_params).get("models") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("project", event.getData(MPSDataKeys.PROJECT));
    if (MapSequence.fromMap(_params).get("project") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("operationContext", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("operationContext") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      // check all models in model 
      List<SModelDescriptor> modelsToCheck = new ArrayList<SModelDescriptor>();
      modelsToCheck.addAll(((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models")));
      for (SModelDescriptor model : ((List<SModelDescriptor>) MapSequence.fromMap(_params).get("models"))) {
        String name = model.getLongName();
        boolean isStub = SModelStereotype.isStubModelStereotype(model.getStereotype());
        for (SModelDescriptor innerModel : ListSequence.fromList(model.getModule().getOwnModelDescriptors())) {
          if (innerModel.getLongName().startsWith(name + ".")) {
            if (isStub == SModelStereotype.isStubModelStereotype(innerModel.getStereotype())) {
              modelsToCheck.add(innerModel);
            }
          }
        }
      }
      if (modelsToCheck.size() > 1) {
        ((Project) MapSequence.fromMap(_params).get("project")).getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class).checkModels(modelsToCheck, ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")), true);
      } else {
        ((Project) MapSequence.fromMap(_params).get("project")).getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class).checkModel(modelsToCheck.get(0), ((IOperationContext) MapSequence.fromMap(_params).get("operationContext")), true);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CheckModel", t);
      }
    }
  }

  private static Icon getIcon() {
    try {
      return new ImageIcon(StreamUtil.loadFromStream(CheckModel_Action.class.getResourceAsStream("modelChecker.png")));
    } catch (IOException e) {
      if (log.isWarnEnabled()) {
        log.warn("Couldn't load icon for CheckModel", e);
      }
      return null;
    }
  }
}
