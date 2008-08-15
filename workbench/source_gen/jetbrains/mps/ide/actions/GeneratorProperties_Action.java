package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.ide.dialogs.GeneratorPropertiesDialog;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.MacrosUtil;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.smodel.Generator;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.workbench.action.ActionEventData;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;

public class GeneratorProperties_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(GeneratorProperties_Action.class);
  public static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}\\workbench\\source\\jetbrains\\mps\\ide\\projectPane\\nodes\\generatorProperties.png", "jetbrains.mps.ide"), true);

  public MPSProject project;

  public GeneratorProperties_Action() {
    super("Generator Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "alt ENTER";
  }

  public boolean isApplicable(AnActionEvent event) {
    return new ActionEventData(event).getModule() instanceof Generator;
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "GeneratorProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.project = event.getData(MPSDataKeys.MPS_PROJECT);
      if (this.project == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      ActionEventData data = new ActionEventData(event);
      final Generator generator = (Generator) data.getModule();
      GeneratorPropertiesDialog dialog = new GeneratorPropertiesDialog(GeneratorProperties_Action.this.project, generator);
      dialog.showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "GeneratorProperties", t);
    }
  }

}
