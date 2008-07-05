package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.Anchor;
import com.intellij.openapi.actionSystem.Constraints;
import jetbrains.mps.ide.actions.language.NewAccessoryModelAction;
import jetbrains.mps.ide.actions.language.NewGeneratorAction;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

public class LanguageNewActions_ActionGroup extends BaseGroup {
  public static Logger LOG = Logger.getLogger(LanguageNewActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.LanguageNewActions";

  public LanguageNewActions_ActionGroup() {
    super("New", ID, true, false, null);
    this.setPopup(true);
    try {
      this.add(new NewGeneratorAction());
      this.addSeparator();
      this.add(new NewAccessoryModelAction());
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(LanguageActions_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(LanguageNewActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = LanguageActions_ActionGroup.LABEL_ID_newGroup;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
