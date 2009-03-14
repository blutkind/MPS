package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.logging.Logger;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.workbench.ActionPlace;
import jetbrains.mps.project.MPSProject;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.dialogs.project.properties.model.ModelPropertiesDialog;

public class ModelProperties_Action extends GeneratedAction {
  private static final Logger LOG = Logger.getLogger(ModelProperties_Action.class);
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/modelProperties.png", "jetbrains.mps.ide"), true);

  public SModelDescriptor model;
  public IOperationContext context;
  public ActionPlace place;
  public MPSProject project;
  public Integer size;

  public ModelProperties_Action() {
    super("Model Properties", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt ENTER";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ModelProperties_Action.this.size == 1;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ModelProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.model == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.place = event.getData(MPSDataKeys.PLACE);
    if (this.place == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.project == null) {
      return false;
    }
    this.size = event.getData(MPSDataKeys.LOGICAL_VIEW_SELECTION_SIZE);
    if (this.size == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      new ModelPropertiesDialog(ModelProperties_Action.this.model, ModelProperties_Action.this.context).showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ModelProperties", t);
    }
  }

}
