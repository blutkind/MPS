package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class Structure_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(Structure_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.structure.plugin.Structure_ActionGroup";
  public static final String LABEL_ID_showHelp = ID + "showHelp";

  public Structure_ActionGroup() {
    super("Structure", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new ShowConceptStructure_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.lang.structure");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        Structure_ActionGroup.this.addAction(oldAction);
      }
      {
        LabelledAnchor action = new LabelledAnchor(Structure_ActionGroup.LABEL_ID_showHelp);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.lang.structure"));
        Structure_ActionGroup.this.addAction(action);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
