package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class FindLanguageUsages_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(FindLanguageUsages_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.core.plugin.FindLanguageUsages_ActionGroup";

  public FindLanguageUsages_ActionGroup() {
    super("FindLanguageUsages", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      FindLanguageUsages_ActionGroup.this.addAction("jetbrains.mps.lang.core.plugin.FindLanguageUsages_Action");
      FindLanguageUsages_ActionGroup.this.addAction("jetbrains.mps.lang.core.plugin.FindLanguageConceptsUsages_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
