package jetbrains.mps.bootstrap.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;

public class DataFlow_ApplicationPlugin extends BaseApplicationPlugin {

  public void initGroups() {
    this.addGroup(new DFAActions_ActionGroup());
  }

  public void adjustGroups() {
    (this.getGroup(DFAActions_ActionGroup.ID)).adjust();
  }

}
