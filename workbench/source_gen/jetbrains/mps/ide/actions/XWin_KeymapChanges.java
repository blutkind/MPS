package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.workbench.action.BaseKeymapChanges;

public class XWin_KeymapChanges extends BaseKeymapChanges {
  public XWin_KeymapChanges() {
    this.addAction("jetbrains.mps.ide.actions.GoToLanguage_Action", "jetbrains.mps.ide", "ctrl shift L");
    this.addAction("jetbrains.mps.ide.actions.GoToModel_Action", "jetbrains.mps.ide", "ctrl shift M");
    this.addAction("jetbrains.mps.ide.actions.GoToDevkit_Action", "jetbrains.mps.ide", "ctrl shift D");
  }

  public String getScheme() {
    return "Default for XWin";
  }
}
