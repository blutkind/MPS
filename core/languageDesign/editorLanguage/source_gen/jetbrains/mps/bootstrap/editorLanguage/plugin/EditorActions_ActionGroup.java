package jetbrains.mps.bootstrap.editorLanguage.plugin;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.Anchor;
import com.intellij.openapi.actionSystem.Constraints;
import jetbrains.mps.ide.actions.Edit_ActionGroup;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.workbench.action.BaseGroup;

public class EditorActions_ActionGroup extends BaseGroup {
  public static Logger LOG = Logger.getLogger(EditorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.bootstrap.editorLanguage.plugin.EditorActions";

  public EditorActions_ActionGroup() {
    super("", ID, true, false, null);
    this.setPopup(false);
    try {
      this.add(new CopyThisDown_Action());
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    {
      BaseGroup gToBase = ActionUtils.getGroup(EditorPopup_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(EditorActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      gToBase.add(gWhat);
    }
    {
      BaseGroup gToBase = ActionUtils.getGroup(Edit_ActionGroup.ID);
      BaseGroup gWhat = ActionUtils.getGroup(EditorActions_ActionGroup.ID);
      if (gToBase == null || gWhat == null) {
        return;
      }
      {
        String labelName = null;
        labelName = Edit_ActionGroup.LABEL_ID_custom;
        Constraints constraints = new Constraints(Anchor.AFTER, labelName);
        gToBase.add(gWhat, constraints);
      }
    }
  }

}
