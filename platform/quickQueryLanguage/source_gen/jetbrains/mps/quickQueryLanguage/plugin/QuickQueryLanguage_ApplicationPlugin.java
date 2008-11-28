package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;

public class QuickQueryLanguage_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = new ArrayList<BaseGroup>();
    String moduleName = "jetbrains.mps.quickQueryLanguage";
    this.addGroup(groups, moduleName, "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionGroup_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.quickQueryLanguage.plugin.FindInstancesByConditionAndNodeGroup_ActionGroup");
    return groups;
  }

  public void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      groups.add(group);
    }
  }

}
