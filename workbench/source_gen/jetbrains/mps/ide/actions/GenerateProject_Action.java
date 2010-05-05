package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnAction;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class GenerateProject_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(GenerateProject_Action.class);

  private AnAction action;

  public GenerateProject_Action(AnAction action_par) {
    super("Generate Modules in Project", "", ICON);
    this.action = action_par;
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
    this.addPlace(null);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      GenerateProject_Action.this.action.update(event);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GenerateProject", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      GenerateProject_Action.this.action.actionPerformed(event);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GenerateProject", t);
      }
    }
  }

  @NotNull
  public String getActionId() {
    StringBuilder res = new StringBuilder(500);
    res.append(GenerateProject_Action.class.getName());
    res.append("#");
    res.append(action_State((AnAction) this.action));
    res.append("!");
    return res.toString();
  }

  public static String action_State(AnAction object) {
    return "";
  }
}
