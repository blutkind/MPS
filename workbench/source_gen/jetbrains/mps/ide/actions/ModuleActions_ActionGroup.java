package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.LabelledAnchor;

public class ModuleActions_ActionGroup extends GeneratedActionGroup {
  public static Logger LOG = Logger.getLogger(ModuleActions_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.ModuleActions";
  public static final String LABEL_ID_abstractFileActions = ID + "abstractFileActions";

  public ModuleActions_ActionGroup() {
    super("", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.add(new LabelledAnchor(ModuleActions_ActionGroup.LABEL_ID_abstractFileActions));
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
  }

}
