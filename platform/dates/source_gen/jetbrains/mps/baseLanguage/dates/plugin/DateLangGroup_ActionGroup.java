package jetbrains.mps.baseLanguage.dates.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class DateLangGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DateLangGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.dates.plugin.DateLangGroup_ActionGroup";

  public DateLangGroup_ActionGroup() {
    super("DateLangGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new ConvertDateTimeOperations_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage.dates");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        DateLangGroup_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
