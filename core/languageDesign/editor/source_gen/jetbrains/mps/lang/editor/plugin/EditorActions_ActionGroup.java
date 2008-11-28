package jetbrains.mps.lang.editor.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.BaseGroup;
import jetbrains.mps.workbench.action.ActionUtils;
import jetbrains.mps.ide.actions.EditorPopup_ActionGroup;
import jetbrains.mps.ide.actions.Edit_ActionGroup;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class EditorActions_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(EditorActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.editor.plugin.EditorActions";

  public EditorActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.lang.editor.plugin.CopyThisDown_Action", "jetbrains.mps.lang.editor");
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
