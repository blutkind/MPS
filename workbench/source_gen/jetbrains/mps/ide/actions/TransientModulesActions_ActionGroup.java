package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.ide.actions.tools.RemoveTransientModulesAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;

public class TransientModulesActions_ActionGroup extends BaseActionGroup {

  public TransientModulesActions_ActionGroup() {
    super("", "jetbrains.mps.ide.actions.TransientModulesActions");
    this.add(new RemoveTransientModulesAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
  }

}
