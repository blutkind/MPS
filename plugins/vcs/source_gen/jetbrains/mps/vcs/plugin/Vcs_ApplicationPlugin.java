package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.Goto_ActionGroup;
import jetbrains.mps.ide.actions.ModelActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorTabActions_ActionGroup;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.SolutionActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorLeftPanelMenu_ActionGroup;
import java.util.List;
import jetbrains.mps.plugins.pluginparts.custom.BaseCustomApplicationPlugin;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.workbench.action.BaseKeymapChanges;

public class Vcs_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.vcs");

  public Vcs_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new AddToVcs_Action());
    addAction(new Annotate_Action());
    addAction(new DumpChangesManager_Action());
    addAction(new ForceRefreshModelChanges_Action());
    addAction(new GoToNextChange_Action());
    addAction(new GoToPreviousChange_Action());
    addAction(new IgnoreInVcs_Action());
    addAction(new InstallCustomMergeDriver_Action());
    addAction(new ReRunMergeFromBackup_Action());
    addAction(new RollbackChanges_Action());
    addAction(new ShowDifferencesWithModelOnDisk_Action());
    addAction(new ShowDiffererenesWithCurrentRevision_Action());
    // groups 
    addGroup(new AnnotateGroup_ActionGroup());
    addGroup(new ChangesStrip_ActionGroup());
    addGroup(new EditorInternalVCS_ActionGroup());
    addGroup(new GoToVCS_ActionGroup());
    addGroup(new InstallCustomMergeDriverGroup_ActionGroup());
    addGroup(new ShowDiffWithCurrRev_ActionGroup());
    addGroup(new VCSModelActions_ActionGroup());
    addGroup(new VCS_ActionGroup());
  }

  public void adjustInterfaceGroups() {
  }

  public void adjustRegularGroups() {
    this.insertGroupIntoAnother(Goto_ActionGroup.ID, "jetbrains.mps.vcs.plugin.GoToVCS_ActionGroup", Goto_ActionGroup.LABEL_ID_gotoVCS);
    this.insertGroupIntoAnother(ModelActions_ActionGroup.ID, "jetbrains.mps.vcs.plugin.VCSModelActions_ActionGroup", ModelActions_ActionGroup.LABEL_ID_mpsvcs);
    this.insertGroupIntoAnother(EditorTabActions_ActionGroup.ID, "jetbrains.mps.vcs.plugin.ShowDiffWithCurrRev_ActionGroup", EditorTabActions_ActionGroup.LABEL_ID_diff);
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, "jetbrains.mps.vcs.plugin.ShowDiffWithCurrRev_ActionGroup", NodeActions_ActionGroup.LABEL_ID_diff);
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, "jetbrains.mps.vcs.plugin.VCS_ActionGroup", LanguageActions_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(SolutionActions_ActionGroup.ID, "jetbrains.mps.vcs.plugin.VCS_ActionGroup", SolutionActions_ActionGroup.LABEL_ID_vcs);
    this.insertGroupIntoAnother(EditorLeftPanelMenu_ActionGroup.ID, "jetbrains.mps.vcs.plugin.AnnotateGroup_ActionGroup", null);
    this.insertGroupIntoAnother("VcsGlobalGroup", "jetbrains.mps.vcs.plugin.InstallCustomMergeDriverGroup_ActionGroup", null);
  }

  public List<BaseCustomApplicationPlugin> initCustomParts() {
    List<BaseCustomApplicationPlugin> res = ListSequence.fromList(new ArrayList<BaseCustomApplicationPlugin>());
    this.addCustomPart(res, new main_CustomApplicationPlugin());
    return res;
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    return res;
  }

  private void addCustomPart(List<BaseCustomApplicationPlugin> plugins, BaseCustomApplicationPlugin plugin) {
    ListSequence.fromList(plugins).addElement(plugin);
    plugin.init();
  }
}
