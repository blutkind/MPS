package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedActionGroup;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.ide.actions.Tools_ActionGroup;

public class BaseLanguageToolsAddition_ActionGroup extends GeneratedActionGroup {
  private static Logger LOG = Logger.getLogger(BaseLanguageToolsAddition_ActionGroup.class);
  public static final String ID = "jetbrains.mps.baseLanguage.plugin.BaseLanguageToolsAddition";

  public BaseLanguageToolsAddition_ActionGroup() {
    super("BaseLanguageToolsAddition", ID);
    this.setIsInternal(false);
    this.setPopup(false);
    try {
      this.addAction("jetbrains.mps.baseLanguage.plugin.ShowTodoViewer_Action", "jetbrains.mps.baseLanguage");
    } catch (Throwable t) {
      LOG.error("User group error", t);
    }
  }

  public void adjust() {
    this.insertGroupIntoAnother(Tools_ActionGroup.ID, Tools_ActionGroup.LABEL_ID_customTools);
  }

}
