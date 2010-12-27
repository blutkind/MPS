package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.ModelActions_ActionGroup;
import jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup;

public class Packaging_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.build.packaging");

  public Packaging_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new GenerateBuildAction_Action());
    addAction(new GenerateBuildForProjectAction_Action());
    // groups 
    addGroup(new ProjectPaneModelAddition_ActionGroup());
    addGroup(new ProjectPaneProjectAddition_ActionGroup());
  }

  public void adjustRegularGroups() {
    insertGroupIntoAnother(ModelActions_ActionGroup.ID, "jetbrains.mps.build.packaging.plugin.ProjectPaneModelAddition_ActionGroup", null);
    insertGroupIntoAnother(ProjectNewActions_ActionGroup.ID, "jetbrains.mps.build.packaging.plugin.ProjectPaneProjectAddition_ActionGroup", null);
  }
}
