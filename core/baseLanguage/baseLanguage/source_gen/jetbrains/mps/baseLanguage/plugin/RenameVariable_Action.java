package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.RenameRefactoringDialog;

public class RenameVariable_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(RenameVariable_Action.class);

  private SNode node;
  private Frame frame;

  public RenameVariable_Action() {
    super("Rename Variable", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "shift F6";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "RenameVariable", t);
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
        if (!(SNodeOperations.isInstanceOf(node, "jetbrains.mps.baseLanguage.structure.VariableReference"))) {
          node = null;
        }
      }
      this.node = node;
    }
    if (this.node == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.frame = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final Wrappers._T<SNode> varDeclNode = new Wrappers._T<SNode>();
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          varDeclNode.value = SLinkOperations.getTarget(RenameVariable_Action.this.node, "variableDeclaration", false);
        }
      });
      new RenameRefactoringDialog(RenameVariable_Action.this.frame, "Variable", varDeclNode.value).showDialog();
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "RenameVariable", t);
    }
  }
}
