package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import jetbrains.mps.project.IModule;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.ide.actions.MPSCommonDataKeys;

public class ShowDefaultHelp_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowDefaultHelp_Action.class);

  public ShowDefaultHelp_Action() {
    super("Show Default Help", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        HelpHelper.HelpType defaultHelp = HelpHelper.getDefaultHelpFor(((IModule) MapSequence.fromMap(_params).get("module")), ((SModelDescriptor) MapSequence.fromMap(_params).get("model")), ((SNode) MapSequence.fromMap(_params).get("node")));
        if (defaultHelp == null) {
          ShowDefaultHelp_Action.this.setEnabledState(event.getPresentation(), false);
          return;
        }
        ShowDefaultHelp_Action.this.setEnabledState(event.getPresentation(), true);
        event.getPresentation().setText("Show Help for " + NameUtil.capitalize(defaultHelp.getName()));
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowDefaultHelp", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("module", event.getData(MPSDataKeys.CONTEXT_MODULE));
    MapSequence.fromMap(_params).put("model", event.getData(MPSDataKeys.CONTEXT_MODEL));
    {
      SNode node = event.getData(MPSCommonDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      HelpHelper.showHelpFor(((IModule) MapSequence.fromMap(_params).get("module")), ((SModelDescriptor) MapSequence.fromMap(_params).get("model")), ((SNode) MapSequence.fromMap(_params).get("node")));
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowDefaultHelp", t);
    }
  }
}
