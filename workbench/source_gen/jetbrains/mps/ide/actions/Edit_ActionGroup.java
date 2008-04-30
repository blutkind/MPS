package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.actions.BaseActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.MPSProject;
import jetbrains.mps.ide.actions.nodes.CopyNodeAction;
import jetbrains.mps.ide.actions.nodes.CopyNodeReferenceAction;
import jetbrains.mps.ide.actions.nodes.PasteNodeAction;
import jetbrains.mps.ide.actions.nodes.CutNodeAction;
import jetbrains.mps.ide.action.Label;
import jetbrains.mps.ide.actions.model.AddModelImportAction;
import jetbrains.mps.ide.actions.model.AddLanguageImportAction;
import jetbrains.mps.ide.action.IActionGroupElementOwner;
import jetbrains.mps.ide.action.ActionGroup;

public class Edit_ActionGroup extends BaseActionGroup {
  public static Logger LOG = Logger.getLogger(Edit_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Edit";
  public static final String LABEL_ID_custom = "custom";

  public Edit_ActionGroup(MPSProject project) {
    super("Edit", ID, project);
    this.setMnemonic("E".charAt(0));
    this.setInternal(false);
    try {
      this.add(new UndoAction(), this);
      this.add(new RedoAction(), this);
      this.addSeparator();
      this.add(new CopyNodeAction(), this);
      this.add(new CopyNodeReferenceAction(), this);
      this.add(new PasteNodeAction(), this);
      this.add(new CutNodeAction(), this);
      this.addSeparator();
      this.add(new RecentEditorsAction(), this);
      this.add(new Label(Edit_ActionGroup.LABEL_ID_custom), this);
      this.addSeparator();
      this.add(new AddModelImportAction(), this);
      this.add(new AddLanguageImportAction(), this);
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust(IActionGroupElementOwner owner) {
    {
      ActionGroup gTo = this.getGroup(MainMenu_ActionGroup.ID);
      ActionGroup gWhat = this.getGroup(Edit_ActionGroup.ID);
      if (gTo == null || gWhat == null) {
        return;
      }
      {
        String labelName;
        labelName = MainMenu_ActionGroup.LABEL_ID_edit;
        gTo.add(gWhat, owner, labelName);
      }
    }
  }

}
