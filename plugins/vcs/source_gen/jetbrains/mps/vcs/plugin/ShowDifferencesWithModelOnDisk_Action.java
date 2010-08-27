package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SModelDescriptor;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.smodel.descriptor.EditableSModelDescriptor;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.persistence.def.ModelPersistence;
import com.intellij.openapi.application.ApplicationManager;
import jetbrains.mps.vcs.diff.ui.ModelDifferenceDialog;
import com.intellij.openapi.application.ModalityState;

public class ShowDifferencesWithModelOnDisk_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(ShowDifferencesWithModelOnDisk_Action.class);

  private SModelDescriptor modelDescriptor;
  private Frame frame;

  public ShowDifferencesWithModelOnDisk_Action() {
    super("Show Differences with Model on Disk", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ShowDifferencesWithModelOnDisk_Action.this.modelDescriptor instanceof EditableSModelDescriptor;
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowDifferencesWithModelOnDisk", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.modelDescriptor = event.getData(MPSDataKeys.MODEL);
    if (this.modelDescriptor == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.modelDescriptor = null;
    this.frame = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final SModel memory = ShowDifferencesWithModelOnDisk_Action.this.modelDescriptor.getSModel();
      final SModel disk = ModelPersistence.readModel(((EditableSModelDescriptor) ShowDifferencesWithModelOnDisk_Action.this.modelDescriptor).getModelFile());
      ApplicationManager.getApplication().invokeLater(new Runnable() {
        public void run() {
          String[] titles = new String[]{"Disk", "Memory"};
          new ModelDifferenceDialog(event.getRequiredData(MPSDataKeys.OPERATION_CONTEXT), ShowDifferencesWithModelOnDisk_Action.this.frame, disk, memory, "Model Difference", true, titles).showDialog();
        }
      }, ModalityState.NON_MODAL);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowDifferencesWithModelOnDisk", t);
      }
    }
  }
}
