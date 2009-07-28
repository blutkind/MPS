package jetbrains.mps.build.packaging.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.ProjectNewActions_ActionGroup;

public class ProjectPaneProjectAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ProjectPaneProjectAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.build.packaging.plugin.ProjectPaneProjectAddition";

  public ProjectPaneProjectAddition_ActionGroup() {
    super("ProjectPaneProjectAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ProjectPaneProjectAddition_ActionGroup.this.addSeparator();
      ProjectPaneProjectAddition_ActionGroup.this.addAction("jetbrains.mps.build.packaging.plugin.GenerateBuildForProjectAction_Action", "jetbrains.mps.build.packaging");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(ProjectNewActions_ActionGroup.ID, null);
  }

}
