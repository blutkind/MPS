package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class TransientModulesActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(TransientModulesActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.TransientModulesActions";

  public TransientModulesActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new RemoveTransientModels_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
