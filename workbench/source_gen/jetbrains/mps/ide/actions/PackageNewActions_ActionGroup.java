package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class PackageNewActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(PackageNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.PackageNewActions_ActionGroup";

  public PackageNewActions_ActionGroup() {
    super("New", ID);
    this.setIsInternal(false);
    this.setPopup(true);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
