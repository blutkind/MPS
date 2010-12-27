package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class FindInstancesByConditionGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(FindInstancesByConditionGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionGroup_ActionGroup";

  public FindInstancesByConditionGroup_ActionGroup() {
    super("FindInstancesByConditionGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new FindInstancesByCondition_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.quickQueryLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        FindInstancesByConditionGroup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ReplacementQueryAction_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.quickQueryLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        FindInstancesByConditionGroup_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
