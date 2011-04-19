package jetbrains.mps.lang.typesystem.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;

public class TypesystemEditorPopupInternal_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(TypesystemEditorPopupInternal_ActionGroup.class);
  public static final String ID = "jetbrains.mps.lang.typesystem.plugin.TypesystemEditorPopupInternal_ActionGroup";

  public TypesystemEditorPopupInternal_ActionGroup() {
    super("TypesystemEditorPopupInternal", ID);
    this.setIsInternal(true);
    this.setPopup(false);
    try {
      TypesystemEditorPopupInternal_ActionGroup.this.addAction("jetbrains.mps.lang.typesystem.plugin.ShowInequationsForCell_Action");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }
}
