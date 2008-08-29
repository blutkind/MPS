package jetbrains.mps.quickQueryLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.ArrayList;

public class QuickQueryLanguage_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = new ArrayList<BaseGroup>();
    groups.add(new FindInstancesByConditionGroup_ActionGroup());
    groups.add(new FindInstancesByConditionAndNodeGroup_ActionGroup());
    return groups;
  }

}
