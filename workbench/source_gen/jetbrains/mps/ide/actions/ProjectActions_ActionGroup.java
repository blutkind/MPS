package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.action.Label;
import jetbrains.mps.ide.actions.make.MakeProjectAction;
import jetbrains.mps.ide.actions.make.CleanProjectAction;
import jetbrains.mps.ide.actions.file.ProjectSettingsAction;
import jetbrains.mps.ide.action.ActionManager;
import jetbrains.mps.ide.action.IActionGroupElementOwner;

public class ProjectActions_ActionGroup extends BaseActionGroup {

  public ProjectActions_ActionGroup(MPSProject project) {
    super("", "jetbrains.mps.ide.actions.ProjectActions");
    this.setInternal(false);
    this.add(new Label("jetbrains.mps.ide.actions.projectNew_ExtentionPoint"));
    this.addSeparator();
    this.add(new MakeProjectAction());
    this.add(new CleanProjectAction());
    this.addSeparator();
    this.add(new ProjectSettingsAction());
  }

  public void adjust(ActionManager manager, IActionGroupElementOwner owner) {
  }

}
