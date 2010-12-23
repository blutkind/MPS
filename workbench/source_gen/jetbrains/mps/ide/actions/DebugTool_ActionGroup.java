package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class DebugTool_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DebugTool_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.DebugTool_ActionGroup";
  public static final String LABEL_ID_StopAction = ID + "StopAction";
  public static final String LABEL_ID_MuteAction = ID + "MuteAction";

  public DebugTool_ActionGroup() {
    super("DebugTool", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      DebugTool_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new Resume_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        DebugTool_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new Pause_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        DebugTool_ActionGroup.this.addAction(oldAction);
      }
      DebugTool_ActionGroup.this.addAnchor(DebugTool_ActionGroup.LABEL_ID_StopAction);
      DebugTool_ActionGroup.this.addSeparator();
      {
        GeneratedAction newAction = new EvaluateExpression_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        DebugTool_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ExportThreads_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        DebugTool_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ViewBreakpoints_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        DebugTool_ActionGroup.this.addAction(oldAction);
      }
      DebugTool_ActionGroup.this.addAnchor(DebugTool_ActionGroup.LABEL_ID_MuteAction);
      DebugTool_ActionGroup.this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
