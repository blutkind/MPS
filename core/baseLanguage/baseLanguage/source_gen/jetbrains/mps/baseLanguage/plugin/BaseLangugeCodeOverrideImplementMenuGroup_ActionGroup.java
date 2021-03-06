package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup";

  public BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup() {
    super("BaseLangugeCodeOverrideImplementMenuGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.OverrideMethod_Action");
      BaseLangugeCodeOverrideImplementMenuGroup_ActionGroup.this.addAction("jetbrains.mps.baseLanguage.plugin.ImplementMethod_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
