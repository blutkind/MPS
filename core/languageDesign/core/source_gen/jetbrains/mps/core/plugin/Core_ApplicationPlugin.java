package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;

public class Core_ApplicationPlugin extends BaseApplicationPlugin {

  public void initGroups() {
    this.addGroup(new FindModelUsages_ActionGroup());
    this.addGroup(new FindLanguageUsages_ActionGroup());
    this.addGroup(new CoreActions_ActionGroup());
  }

  public void adjustGroups() {
    (this.getGroup(FindModelUsages_ActionGroup.ID)).adjust();
    (this.getGroup(FindLanguageUsages_ActionGroup.ID)).adjust();
    (this.getGroup(CoreActions_ActionGroup.ID)).adjust();
  }

}
