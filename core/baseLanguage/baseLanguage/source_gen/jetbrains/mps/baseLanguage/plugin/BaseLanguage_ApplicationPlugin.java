package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;

public class BaseLanguage_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = ListSequence.fromList(new ArrayList<BaseGroup>());
    String moduleName = "jetbrains.mps.baseLanguage";
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopup_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopupInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageModelActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageNodeActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageProjectNodePopup_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.BaseLanguageToolsAddition_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.baseLanguage.plugin.RefactoringAddition_ActionGroup");
    return groups;
  }

  private void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      ListSequence.fromList(groups).addElement(group);
    }
  }

}
