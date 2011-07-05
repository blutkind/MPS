package jetbrains.mps.ide.devkit.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class GotoConceptAspect_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(GotoConceptAspect_ActionGroup.class);
  public static final String ID = "jetbrains.mps.ide.devkit.actions.GotoConceptAspect_ActionGroup";

  public GotoConceptAspect_ActionGroup() {
    super("GotoConceptAspect", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      GotoConceptAspect_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.GoToConceptDeclaration_Action");
      GotoConceptAspect_ActionGroup.this.addAction("jetbrains.mps.ide.devkit.actions.GoToEditorDeclaration_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
