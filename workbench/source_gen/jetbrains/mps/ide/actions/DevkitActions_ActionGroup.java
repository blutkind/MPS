package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.module.SetModuleFolderAction;
import jetbrains.mps.ide.actions.project.AddModuleToProjectAction;
import jetbrains.mps.ide.actions.project.RemoveModuleFromProjectAction;

public class DevkitActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(DevkitActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.DevkitActions";

  public DevkitActions_ActionGroup() {
    super("", ID);
    this.setIsAlwaysVisible(true);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new SetModuleFolderAction());
      this.addSeparator();
      this.add(new AddModuleToProjectAction());
      this.add(new RemoveModuleFromProjectAction());
      this.add(new AnalyzeClasspath_Action());
      this.addSeparator();
      this.add(new DevkitProperties_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
