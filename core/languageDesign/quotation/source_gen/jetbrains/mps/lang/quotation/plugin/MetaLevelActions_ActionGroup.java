package jetbrains.mps.lang.quotation.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class MetaLevelActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(MetaLevelActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.quotation.plugin.MetaLevelActions";

  public MetaLevelActions_ActionGroup() {
    super("MetaLevelActions", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      MetaLevelActions_ActionGroup.this.addAction("jetbrains.mps.lang.quotation.plugin.ShowMetaLevel_Action", "jetbrains.mps.lang.quotation");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(EditorInternal_ActionGroup.ID, null);
  }
}
