package jetbrains.mps.baseLanguage.dates.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.ModelActionsInternal_ActionGroup;

public class DateLangGroup_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(DateLangGroup_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.dates.plugin.DateLangGroup";

  public DateLangGroup_ActionGroup() {
    super("DateLangGroup", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.baseLanguage.dates.plugin.ConvertDateTimeOperations_Action", "jetbrains.mps.baseLanguage.dates");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(ModelActionsInternal_ActionGroup.ID, null);
  }

}
