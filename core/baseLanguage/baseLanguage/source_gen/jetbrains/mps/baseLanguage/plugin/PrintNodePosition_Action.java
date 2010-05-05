package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.project.IModule;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.debug.info.DebugInfo;
import jetbrains.mps.debug.info.BLDebugInfoCache;
import jetbrains.mps.debug.info.PositionInfo;

public class PrintNodePosition_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(PrintNodePosition_Action.class);

  private SNode node;
  private SModelDescriptor model;
  private IModule module;

  public PrintNodePosition_Action() {
    super("Print Node Line", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "PrintNodePosition", t);
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
    if (this.node == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.model == null) {
      return false;
    }
    this.module = event.getData(MPSDataKeys.MODULE);
    if (this.module == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.model = null;
    this.module = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      DebugInfo result = BLDebugInfoCache.getInstance().get(PrintNodePosition_Action.this.model);
      if (result != null) {
        PositionInfo positionInfo = result.getPositionForNode(PrintNodePosition_Action.this.node.getSNodeId().toString());
        System.out.println(positionInfo);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "PrintNodePosition", t);
    }
  }
}
