package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class EditorTabActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorTabActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorTabActions_ActionGroup";
  public static final String LABEL_ID_find_instances = ID + "find_instances";
  public static final String LABEL_ID_structure = ID + "structure";
  public static final String LABEL_ID_diff = ID + "diff";

  public EditorTabActions_ActionGroup() {
    super("EditorTabActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new DeleteNode_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new GoToConceptDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToEditorDeclaration_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new GoToRules_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ShowNodeInExplorer_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new FindSpecificNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new FastFindNodeUsages_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_find_instances);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowConceptInHierarchy_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_structure);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      {
        LabelledAnchor action = new LabelledAnchor(EditorTabActions_ActionGroup.LABEL_ID_diff);
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        manager.registerAction(action.getId(), action, PluginId.getId("jetbrains.mps.ide"));
        EditorTabActions_ActionGroup.this.addAction(action);
      }
      EditorTabActions_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new ShowErrorMessage_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          PluginId pluginId = PluginId.getId("jetbrains.mps.ide");
          manager.registerAction(newAction.getActionId(), newAction, pluginId);
          oldAction = newAction;
        }
        EditorTabActions_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
