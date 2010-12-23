package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.project.IModule;
import java.util.List;
import com.intellij.openapi.project.Project;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.plugins.projectplugins.ProjectPluginManager;

public class CheckModule_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${solution_descriptor}/icons/modelChecker.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(CheckModule_Action.class);

  private IModule module;
  private List<IModule> modules;
  private Project project;
  private IOperationContext operationContext;
  private String moduleType;

  public CheckModule_Action(String moduleType_par) {
    super("Check [Module]", "Check [module] for structure and typesystem rules", ICON);
    this.moduleType = moduleType_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        String whatToCheck = CheckModule_Action.this.moduleType;
        if (CheckModule_Action.this.modules.size() > 1) {
          whatToCheck = CheckModule_Action.this.modules.size() + " Modules";
        }
        event.getPresentation().setText("Check " + whatToCheck);
        event.getPresentation().setDescription("Check " + whatToCheck.toLowerCase() + " for structure and typesystem rules");
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "CheckModule", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    this.modules = event.getData(MPSDataKeys.MODULES);
    if (this.modules == null) {
      return false;
    }
    this.project = event.getData(MPSDataKeys.PROJECT);
    if (this.project == null) {
      return false;
    }
    this.operationContext = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.operationContext == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      if (CheckModule_Action.this.modules.size() > 1) {
        CheckModule_Action.this.project.getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class).checkModules(CheckModule_Action.this.modules, CheckModule_Action.this.operationContext, true);
      } else {
        CheckModule_Action.this.project.getComponent(ProjectPluginManager.class).getTool(ModelCheckerTool_Tool.class).checkModule(CheckModule_Action.this.module, CheckModule_Action.this.operationContext, true);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "CheckModule", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder();
    res.append(super.getActionId());
    res.append("#");
    res.append(moduleType_State((String) this.moduleType));
    res.append("!");
    return res.toString();
  }

  public static String moduleType_State(String object) {
    return object;
  }
}
