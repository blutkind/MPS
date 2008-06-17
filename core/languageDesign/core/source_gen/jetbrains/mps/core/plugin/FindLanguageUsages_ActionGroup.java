package jetbrains.mps.core.plugin;

/*Generated by MPS */

import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;

public class FindLanguageUsages_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(FindLanguageUsages_ActionGroup.class);
  public static final String ID = "jetbrains.mps.core.plugin.FindLanguageUsages";

  public FindLanguageUsages_ActionGroup(MPSProject project) {
    super("", ID, project);
    this.setInternal(false);
    try {
      this.add(new FindLanguageUsages_Action(project), this);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust(IActionGroupElementOwner owner) {
    {

    }
  }

}
