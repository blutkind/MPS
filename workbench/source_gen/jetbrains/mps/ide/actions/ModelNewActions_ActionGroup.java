package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.AnAction;

public class ModelNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModelNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModelNewActions_ActionGroup";
  public static final String LABEL_ID_newRoot = ID + "newRoot";

  public ModelNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      {
        LabelledAnchor action = new LabelledAnchor(ModelNewActions_ActionGroup.LABEL_ID_newRoot);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        ModelNewActions_ActionGroup.this.addAction(action);
      }
      ModelNewActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new NewSubModel_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        ModelNewActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new NewSubTestModel_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        ModelNewActions_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
