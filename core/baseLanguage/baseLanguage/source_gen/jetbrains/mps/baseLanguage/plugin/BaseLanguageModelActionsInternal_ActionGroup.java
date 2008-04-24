package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.plugin.uiActions.TestReferenceResolvingPerformance;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;
import jetbrains.mps.ide.actions.ProjectPaneModelActionsInternal_ActionGroup;

public class BaseLanguageModelActionsInternal_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(BaseLanguageModelActionsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageModelActionsInternal";

  public BaseLanguageModelActionsInternal_ActionGroup(MPSProject project) {
    super("", BaseLanguageModelActionsInternal_ActionGroup.ID);
    this.setInternal(false);
    try {
      this.add(new TestReferenceResolvingPerformance(TestReferenceResolvingPerformance.MODEL), this);
    } catch (Throwable t) {
      BaseLanguageModelActionsInternal_ActionGroup.LOG.error("User group error", t);
    }
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(ProjectPaneModelActionsInternal_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(BaseLanguageModelActionsInternal_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.addEveryFrom(gWhat, owner);
    }
  }

}
