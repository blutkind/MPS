package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.tools.RemoveTransientModulesAction;
import jetbrains.mps.ide.actions.tools.DumpKeyStrokes;
import jetbrains.mps.ide.actions.tools.InternalRefactoringAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;

public class ToolsInternal_ActionGroup extends BaseActionGroup {
  public static final String ID = "jetbrains.mps.ide.actions.Internal";

  public ToolsInternal_ActionGroup(MPSProject project) {
    super("Internal", ToolsInternal_ActionGroup.ID);
    this.setInternal(true);
    this.add(new RemoveTransientModulesAction(), this);
    this.addSeparator();
    this.add(new DumpKeyStrokes(), this);
    this.addSeparator();
    this.add(new InternalRefactoringAction(), this);
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
    manager.getGroup(Tools_ActionGroup.ID).add(this, owner, Tools_ActionGroup.INTERNAL_LABEL_ID_Internal);
  }

}
