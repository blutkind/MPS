package jetbrains.mps.ide.migration.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class PersistenceAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(PersistenceAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.migration.actions.PersistenceAddition_ActionGroup";

  public PersistenceAddition_ActionGroup() {
    super("Persistence", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
      PersistenceAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.UpgradeModelPersistenceInModule_Action");
      PersistenceAddition_ActionGroup.this.addAction("jetbrains.mps.ide.migration.actions.UpgradeModelPersistenceInModel_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
