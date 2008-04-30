package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.nodes.TestNodePathAction;
import jetbrains.mps.ide.actions.cells.CellPropertiesAction;
import jetbrains.mps.ide.actions.cells.ShowCellInCellExplorerAction;
import jetbrains.mps.ide.actions.nodes.PrintNodeIDAction;
import jetbrains.mps.ide.actions.nodes.PrintTextPresentationAction;
import jetbrains.mps.ide.actions.nodes.HighlightCellDependenciesAction;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class EditorInternal_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(EditorInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.EditorInternal";

  public EditorInternal_ActionGroup(MPSProject project) {
    super("Internal", ID, project);
    this.setInternal(true);
    try {
      this.add(new TestNodePathAction(), this);
      this.add(new CellPropertiesAction(), this);
      this.add(new ShowCellInCellExplorerAction(), this);
      this.addSeparator();
      this.add(new PrintNodeIDAction(), this);
      this.add(new PrintTextPresentationAction(), this);
      this.add(new HighlightCellDependenciesAction(), this);
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust(IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = this.getGroup(EditorPopup_ActionGroup.ID);
      ActionGroup gWhat = this.getGroup(EditorInternal_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.add(gWhat, owner);
    }
  }

}
