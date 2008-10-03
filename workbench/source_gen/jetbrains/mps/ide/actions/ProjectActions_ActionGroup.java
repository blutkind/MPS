package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ProjectActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(ProjectActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ProjectActions";
  public static final String LABEL_ID_projectNew = ID + "projectNew";

  public ProjectActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAnchor(ProjectActions_ActionGroup.LABEL_ID_projectNew);
      this.addSeparator();
      this.add(new MakeProject_Action());
      this.add(new RebuildProject_Action());
      this.add(new CleanProject_Action());
      this.addSeparator();
      this.add(new OptimizeProjectImports_Action());
      this.add(new MPSProjectPaths_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
