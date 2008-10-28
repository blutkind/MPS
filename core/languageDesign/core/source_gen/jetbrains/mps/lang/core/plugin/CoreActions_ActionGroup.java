package jetbrains.mps.lang.core.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;

public class CoreActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(CoreActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.core.plugin.CoreActions";

  public CoreActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new ShowNodeMessages_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(CoreActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
