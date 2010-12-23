package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import com.intellij.openapi.actionSystem.ex.ActionManagerEx;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.extensions.PluginId;

public class SolutionRefactoring_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(SolutionRefactoring_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.SolutionRefactoring_ActionGroup";

  public SolutionRefactoring_ActionGroup() {
    super("Refactoring", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      {
        GeneratedAction newAction = new RenameSolution_Action();
        ActionManagerEx manager = ActionManagerEx.getInstanceEx();
        AnAction oldAction = manager.getAction(newAction.getActionId());
        if (oldAction == null) {
          manager.registerAction(newAction.getActionId(), newAction, PluginId.getId("jetbrains.mps.ide"));
          oldAction = newAction;
        }
        SolutionRefactoring_ActionGroup.this.addAction(oldAction);
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
