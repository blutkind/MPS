package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import java.util.List;
import jetbrains.mps.workbench.action.BaseGroup;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.ActionFactory;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class Ide_ApplicationPlugin extends BaseApplicationPlugin {

  public List<BaseGroup> initGroups() {
    List<BaseGroup> groups = new ArrayList<BaseGroup>();
    String moduleName = "jetbrains.mps.ide";
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NodeActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ProjectActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.DevkitActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GeneratorNewActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.GeneratorActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.TransientModulesActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.EditorPopup_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.EditorInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Edit_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Generate_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Goto_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Tools_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Help_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NodeActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelActionsInternal_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageNewCustomPartActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.Build_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.AbstractFileActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.FileActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.FolderActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModuleActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.ModelRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.LanguageRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.SolutionRefactoring_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.PackageActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NamespaceActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.PackageInternalActions_ActionGroup");
    this.addGroup(groups, moduleName, "jetbrains.mps.ide.actions.NamespaceInternalActions_ActionGroup");
    return groups;
  }

  public void addGroup(List<BaseGroup> groups, String moduleName, String groupName) {
    BaseGroup group = ActionFactory.getInstance().acquireRegisteredGroup(groupName, moduleName);
    if (group != null) {
      groups.add(group);
    }
  }

  public void adjustInterfaceGroups() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(ModelActions_ActionGroup.ID);
      ActionGroup gWhat = ActionUtils.getDefaultGroup("VcsGroup");
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = ModelActions_ActionGroup.LABEL_ID_vcs;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(AbstractFileActions_ActionGroup.ID);
      ActionGroup gWhat = ActionUtils.getDefaultGroup("VcsGroup");
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = AbstractFileActions_ActionGroup.LABEL_ID_vcs;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      ActionGroup gWhat = ActionUtils.getDefaultGroup("VcsGroup");
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = EditorPopup_ActionGroup.LABEL_ID_vcs;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
