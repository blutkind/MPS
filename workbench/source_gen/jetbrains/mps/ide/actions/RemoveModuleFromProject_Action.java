package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.project.MPSProject;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.project.IModule;
import jetbrains.mps.workbench.MPSDataKeys;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;
import javax.swing.JComponent;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.project.Solution;
import jetbrains.mps.project.DevKit;

public class RemoveModuleFromProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(RemoveModuleFromProject_Action.class);

  private IOperationContext context;
  private MPSProject mpsproject;
  private Project project;

  public RemoveModuleFromProject_Action() {
    super("Remove From Project", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    IModule module = RemoveModuleFromProject_Action.this.context.getModule();
    if (module == null) {
      return false;
    }
    return RemoveModuleFromProject_Action.this.mpsproject.isProjectModule(module);
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "RemoveModuleFromProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.mpsproject = event.getData(MPSDataKeys.MPS_PROJECT);
    if (this.mpsproject == null) {
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
    this.context = null;
    this.mpsproject = null;
    this.project = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      IModule module = RemoveModuleFromProject_Action.this.context.getModule();
      final String message = "Are you sure you want to remove selected module from a project? This operation is not undoable.";
      DialogWrapper dialogWrapper = new DialogWrapper(RemoveModuleFromProject_Action.this.project, true) {
        {
          setTitle("Remove Module From Project");
          init();
        }

        @Nullable
        protected JComponent createCenterPanel() {
          JPanel panel = new JPanel(new GridBagLayout());
          GridBagConstraints gbc = new GridBagConstraints();
          gbc.insets = new Insets(4, 8, 40, 4);
          JLabel label = new JLabel(message);
          panel.add(label, gbc);
          return panel;
        }
      };
      dialogWrapper.show();
      if (!(dialogWrapper.isOK())) {
        return;
      }
      if (module instanceof Language) {
        RemoveModuleFromProject_Action.this.mpsproject.removeProjectLanguage((Language) module);
      } else
      if (module instanceof Solution) {
        RemoveModuleFromProject_Action.this.mpsproject.removeProjectSolution((Solution) module);
      } else
      if (module instanceof DevKit) {
        RemoveModuleFromProject_Action.this.mpsproject.removeProjectDevKit((DevKit) module);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "RemoveModuleFromProject", t);
      }
    }
  }
}
