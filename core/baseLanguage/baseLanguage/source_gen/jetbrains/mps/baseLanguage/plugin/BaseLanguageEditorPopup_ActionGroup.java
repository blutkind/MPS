package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class BaseLanguageEditorPopup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLanguageEditorPopup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup_ActionGroup";

  public BaseLanguageEditorPopup_ActionGroup() {
    super("BaseLanguageEditorPopup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new GoToOverridingMethod_Action(ListSequence.fromListAndArray(new ArrayList<String>(), "jetbrains.mps.baseLanguage.findUsages.DerivedMethods_Finder"));
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLanguageEditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToOverridenMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLanguageEditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToInheritedClassifier_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLanguageEditorPopup_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowMembers_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.baseLanguage");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        BaseLanguageEditorPopup_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
