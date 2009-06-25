package jetbrains.mps.lang.structure.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;

public class ShowHelpForNode_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(ShowHelpForNode_Action.class);

  public SModelDescriptor model;
  public IModule module;
  private SNode node;

  public ShowHelpForNode_Action() {
    super("Show Help for Node", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public boolean isApplicable(AnActionEvent event) {
    return HelpHelper.helpForNodeIsAvailable(ShowHelpForNode_Action.this.node) && HelpHelper.getDefaultHelpFor(null, null, ShowHelpForNode_Action.this.node) != HelpHelper.HelpType.NODE;
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "ShowHelpForNode", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.SNODE);
      if (node != null) {
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    this.module = event.getData(MPSDataKeys.CONTEXT_MODULE);
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      HelpHelper.showHelpForNode(ShowHelpForNode_Action.this.node);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "ShowHelpForNode", t);
    }
  }

}
