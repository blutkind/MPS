package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.workbench.action.ActionUtils;
import com.intellij.openapi.actionSystem.Constraints;
import com.intellij.openapi.actionSystem.Anchor;

public class ToolsInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(ToolsInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.actions.Internal";

  public ToolsInternal_ActionGroup() {
    super("Internal", ID);
    this.setIsInternal(true);
    this.setPopup(false);
    try {
      this.add(new RemoveTransientModels_Action());
      this.addSeparator();
      this.add(new DumpKeyStrokes_Action());
      this.addSeparator();
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    ActionUtils.getGroup(Tools_ActionGroup.ID).add(this, new Constraints(Anchor.AFTER, Tools_ActionGroup.INTERNAL_LABEL_ID_Internal));
  }

}
