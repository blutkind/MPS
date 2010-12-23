package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class BaseLanguageToolsAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLanguageToolsAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageToolsAddition_ActionGroup";

  public BaseLanguageToolsAddition_ActionGroup() {
    super("BaseLanguageToolsAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new ShowTodoViewer_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        BaseLanguageToolsAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new AnalyzeStacktrace_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        BaseLanguageToolsAddition_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
