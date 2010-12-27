package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup";

  public BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup() {
    super("BaseLangugeCodeOverrideImplementMenuGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new OverrideMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ImplementMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
