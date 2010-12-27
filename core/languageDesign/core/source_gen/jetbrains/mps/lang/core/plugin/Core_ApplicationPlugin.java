package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.ModelActions_ActionGroup;
import jetbrains.mps.ide.actions.LanguageActions_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import java.util.List;
import jetbrains.mps.workbench.action.BaseKeymapChanges;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;

public class Core_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.core");

  public Core_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new FindLanguageConceptsUsages_Action());
    addAction(new FindLanguageUsages_Action());
    addAction(new FindModelUsages_Action());
    addAction(new ShowNodeMessages_Action());
    // groups 
    addGroup(new CoreActions_ActionGroup());
    addGroup(new FindLanguageUsages_ActionGroup());
    addGroup(new FindModelUsages_ActionGroup());
  }

  public void adjustRegularGroups() {
    this.insertGroupIntoAnother(ModelActions_ActionGroup.ID, "jetbrains.mps.lang.core.plugin.FindModelUsages_ActionGroup", ModelActions_ActionGroup.LABEL_ID_modelUsages);
    this.insertGroupIntoAnother(LanguageActions_ActionGroup.ID, "jetbrains.mps.lang.core.plugin.FindLanguageUsages_ActionGroup", LanguageActions_ActionGroup.LABEL_ID_find_usages);
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, "jetbrains.mps.lang.core.plugin.CoreActions_ActionGroup", null);
  }

  public List<BaseKeymapChanges> initKeymaps() {
    List<BaseKeymapChanges> res = ListSequence.fromList(new ArrayList<BaseKeymapChanges>());
    ListSequence.fromList(res).addElement(new Default_KeymapChanges());
    return res;
  }
}
