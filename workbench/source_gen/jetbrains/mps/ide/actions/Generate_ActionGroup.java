package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.DefaultActionGroup;
import jetbrains.mps.ide.actions.generate.GenerateFilesFromCurrentModelAction;
import jetbrains.mps.ide.actions.generate.GenerateTextFromCurrentModelAction;
import jetbrains.mps.ide.actions.module.GenerateAllModelsInModuleAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.actions.generate.SaveTransientModelsAction;

public class Generate_ActionGroup extends BaseGroup {
  public static Logger LOG = Logger.getLogger(Generate_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Generate";

  public Generate_ActionGroup() {
    super("Generate", ID, true, false, null);
    this.setPopup(false);
    try {
      this.add(new SaveTransientModelsAction());
      this.addSeparator();
      this.add(new GenerateAllModelsInModuleAction(false));
      this.addSeparator();
      this.add(new GenerateFilesFromCurrentModelAction());
      this.add(new GenerateTextFromCurrentModelAction());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      DefaultActionGroup gToDef = ActionUtils.getDefaultGroup("GenerateMenu");
      BaseGroup gWhat = ActionUtils.getGroup(Generate_ActionGroup.ID);
      if (gToDef == null || gWhat == null) {
        return;
      }
      gToDef.add(gWhat);
    }
  }

}
