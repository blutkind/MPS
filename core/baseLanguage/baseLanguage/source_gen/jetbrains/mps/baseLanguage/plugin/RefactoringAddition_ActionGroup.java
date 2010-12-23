package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class RefactoringAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(RefactoringAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.RefactoringAddition_ActionGroup";

  public RefactoringAddition_ActionGroup() {
    super("RefactoringAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      {
        GeneratedAction newAction = new InlineLocalVariable_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new ExtractMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new InlineMethod_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new IntroduceVariable_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new IntroduceField_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new IntroduceConstant_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
      {
        GeneratedAction newAction = new RenameVariable_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.baseLanguage"));
          oldAction = newAction;
        }
        RefactoringAddition_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
