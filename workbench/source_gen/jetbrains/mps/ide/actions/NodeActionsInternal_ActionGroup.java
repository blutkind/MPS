package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.NodeActions_ActionGroup;

public class NodeActionsInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(NodeActionsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.NodeActionsInternal";

  public NodeActionsInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsInternal(true);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(NodeActions_ActionGroup.ID, null);
  }

}
