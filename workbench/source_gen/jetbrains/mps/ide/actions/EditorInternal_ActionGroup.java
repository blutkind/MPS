package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class EditorInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorInternal";

  public EditorInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
      this.addAction("jetbrains.mps.ide.actions.TestNodePath_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.CellProperties_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.ide.actions.ShowCellInExplorer_Action", "jetbrains.mps.ide");
      this.addSeparator();
      this.addAction("jetbrains.mps.ide.actions.PrintNodeID_Action", "jetbrains.mps.ide");
      this.addAction("jetbrains.mps.workbench.actions.nodes.HighlightCellDependenciesAction", "jetbrains.mps.ide");
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorPopup_ActionGroup.ID, null);
  }

}
