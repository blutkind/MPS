package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.LabelledAnchor;
import jetbrains.mps.workbench.actions.ReloadAllAction;
import jetbrains.mps.workbench.actions.tools.InstallIDEAPluginAction;

public class Tools_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(Tools_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Tools";
  public static final String INTERNAL_LABEL_ID_Internal = ID + "Internal";

  public Tools_ActionGroup() {
    super("Tools", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new ShowModuleRepository_Action());
      this.add(new ShowModelRepository_Action());
      this.addSeparator();
      this.add(new ReloadAllAction());
      this.addSeparator();
      this.add(new InstallIDEAPluginAction());
      this.addSeparator();
      this.add(new MakeAllModules_Action());
      this.add(new RebuildAllModules_Action());
      this.add(new CleanAllModules_Action());
      this.add(new LabelledAnchor(Tools_ActionGroup.INTERNAL_LABEL_ID_Internal));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gToDef = ActionUtils.getDefaultGroup("ToolsMenu");
      BaseGroup gWhat = ActionUtils.getGroup(Tools_ActionGroup.ID);
      if (gToDef == null || gWhat == null) {
        return;
      }
      gToDef.add(gWhat);
    }
  }

}
