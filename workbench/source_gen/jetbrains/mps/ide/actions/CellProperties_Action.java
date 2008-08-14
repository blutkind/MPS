package jetbrains.mps.ide.actions;

/*Generated by MPS */

import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.cellExplorer.CellPropertiesWindow;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import jetbrains.mps.workbench.MPSDataKeys;
import org.jetbrains.annotations.NotNull;

import javax.swing.Icon;
import java.awt.Frame;

public class CellProperties_Action extends GeneratedAction {
  public static final Logger LOG = Logger.getLogger(CellProperties_Action.class);
  public static final Icon ICON = null;

  public Frame frame;
  public EditorCell cell;

  public CellProperties_Action() {
    super("Cell Properties", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull()
  public String getKeyStroke() {
    return "";
  }

  public void doUpdate(@NotNull()AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CellProperties", t);
      this.disable(event.getPresentation());
    }
  }

  @Override()
  protected boolean collectActionData(AnActionEvent event) {
    try {
      if (!(super.collectActionData(event))) {
        return false;
      }
      this.frame = event.getData(MPSDataKeys.FRAME);
      if (this.frame == null) {
        return false;
      }
      this.cell = event.getData(MPSDataKeys.EDITOR_CELL);
      if (this.cell == null) {
        return false;
      }
    } catch (Throwable t) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      new CellPropertiesWindow(this.cell, this.frame);
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CellProperties", t);
    }
  }

}
