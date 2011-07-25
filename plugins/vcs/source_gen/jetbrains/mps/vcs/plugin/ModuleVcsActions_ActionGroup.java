package jetbrains.mps.vcs.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class ModuleVcsActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ModuleVcsActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.vcs.plugin.ModuleVcsActions_ActionGroup";

  public ModuleVcsActions_ActionGroup() {
    super("ModuleVcsActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      ModuleVcsActions_ActionGroup.this.addAction("jetbrains.mps.vcs.plugin.AddModuleToVcs_Action");
      ModuleVcsActions_ActionGroup.this.addAction("jetbrains.mps.vcs.plugin.IgnoreModuleInVcs_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
