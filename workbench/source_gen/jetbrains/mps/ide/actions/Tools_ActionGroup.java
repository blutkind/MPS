package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.ide.actions.tools.InstallIDEAPluginAction;
import jetbrains.mps.ide.actions.tools.ReloadAllAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class Tools_ActionGroup extends BaseActionGroup {

  public Tools_ActionGroup() {
    super("Tools", "jetbrains.mps.ide.actions.Tools");
    this.add(new InstallIDEAPluginAction());
    this.add(new ReloadAllAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup("jetbrains.mps.ide.actions.MainMenu");
      ActionGroup gWhat = manager.getGroup("jetbrains.mps.ide.actions.Tools");
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner, "jetbrains.mps.ide.actions.tools_ExtentionPoint");
    }
  }

}
