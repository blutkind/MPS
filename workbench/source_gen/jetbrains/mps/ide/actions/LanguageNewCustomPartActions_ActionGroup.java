package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.smodel.LanguageAspect;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.language.NewAspectModelAction;

public class LanguageNewCustomPartActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(LanguageNewCustomPartActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageNewCustomPartActions";

  public LanguageNewCustomPartActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      for (LanguageAspect aspect : LanguageAspect.values()) {
        this.add(new NewAspectModelAction(aspect));
      }
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(LanguageNewActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(LanguageNewCustomPartActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
  }

}
