package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;

public class BaseLanguageNodeActionsInternal_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(BaseLanguageNodeActionsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageNodeActionsInternal";

  public BaseLanguageNodeActionsInternal_ActionGroup(MPSProject project) {
    super("", ID, project);
    this.setInternal(false);
    try {
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust(IActionGroupElementOwner owner) {
    {

    }
  }

}
