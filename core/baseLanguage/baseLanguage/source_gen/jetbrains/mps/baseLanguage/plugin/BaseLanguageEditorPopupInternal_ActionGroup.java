package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.baseLanguage.plugin.uiActions.TestReferenceResolvingPerformance;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;
import jetbrains.mps.ide.actions.EditorInternal_ActionGroup;

public class BaseLanguageEditorPopupInternal_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageEditorPopupInternal";

  public  BaseLanguageEditorPopupInternal_ActionGroup(MPSProject project) {
    super("", BaseLanguageEditorPopupInternal_ActionGroup.ID);
    this.setInternal(false);
    this.add(new TestReferenceResolvingPerformance(TestReferenceResolvingPerformance.EDITOR), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = manager.getGroup(EditorInternal_ActionGroup.ID);
      ActionGroup gWhat = manager.getGroup(BaseLanguageEditorPopupInternal_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      gTo.addEveryFrom(gWhat, owner);
    }
  }

}
