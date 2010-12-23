package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.util.NameUtil;
import jetbrains.mps.workbench.MPSDataKeys;

public class ShowDefaultHelp_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowDefaultHelp_Action.class);

  private IModule module;
  private SModelDescriptor model;
  private SNode node;

  public ShowDefaultHelp_Action() {
    super("Show Default Help", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return " F1";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        HelpHelper.HelpType defaultHelp = HelpHelper.getDefaultHelpFor(ShowDefaultHelp_Action.this.module, ShowDefaultHelp_Action.this.model, ShowDefaultHelp_Action.this.node);
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

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      this.node = node;
    }
    this.module = event.getData(MPSDataKeys.CONTEXT_MODULE);
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      HelpHelper.showHelpFor(ShowDefaultHelp_Action.this.module, ShowDefaultHelp_Action.this.model, ShowDefaultHelp_Action.this.node);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowDefaultHelp", t);
    }
  }
}
