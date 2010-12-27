package jetbrains.mps.lang.dataFlow.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.applicationplugins.BaseApplicationPlugin;
import com.intellij.openapi.extensions.PluginId;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class DataFlow_ApplicationPlugin extends BaseApplicationPlugin {
  private PluginId myId = PluginId.getId("jetbrains.mps.lang.dataFlow");

  public DataFlow_ApplicationPlugin() {
  }

  public PluginId getId() {
    return myId;
  }

  public void createGroups() {
    // actions w/o parameters 
    addAction(new PrintDFAResult_Action());
    addAction(new PrintInitializationInformation_Action());
    addAction(new PrintReachingDefinintionsInformation_Action());
    addAction(new ShowDFA_Action());
    // groups 
    addGroup(new DFAActions_ActionGroup());
  }

  public void adjustRegularGroups() {
    this.insertGroupIntoAnother(EditorInternal_ActionGroup.ID, "jetbrains.mps.lang.dataFlow.plugin.DFAActions_ActionGroup", null);
  }
}
