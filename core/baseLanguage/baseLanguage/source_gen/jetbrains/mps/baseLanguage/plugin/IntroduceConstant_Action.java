package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.baseLanguage.plugin.IntroduceConstantRefactoring;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.baseLanguage.plugin.IntroduceConstantDialog;
import javax.swing.JOptionPane;

public class IntroduceConstant_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(IntroduceConstant_Action.class);

  private SNode node;
  public EditorContext context;
  public EditorComponent component;
  public Frame frame;

  public IntroduceConstant_Action() {
    super("Introduce Constant...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull()
  public String getKeyStroke() {
    return "ctrl alt C";
  }

  public boolean isApplicable(AnActionEvent event) {
    return SNodeOperations.isInstanceOf(IntroduceConstant_Action.this.node, "jetbrains.mps.baseLanguage.structure.Expression");
  }

  public void doUpdate(@NotNull() AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "IntroduceConstant");
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
    this.context = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.component = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.component == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull() final AnActionEvent event) {
    try {
      final Wrappers._T<IntroduceConstantRefactoring> refactoring = new Wrappers._T<IntroduceConstantRefactoring>();
      final Wrappers._T<String> error = new Wrappers._T<String>();
      ModelAccess.instance().runReadAction(new Runnable() {

        public void run() {
          refactoring.value = new IntroduceConstantRefactoring();
          error.value = refactoring.value.init(IntroduceConstant_Action.this.node, IntroduceConstant_Action.this.component);
        }
      });
      if (error.value == null) {
        IntroduceConstantDialog dialog = new IntroduceConstantDialog(IntroduceConstant_Action.this.frame, refactoring.value, IntroduceConstant_Action.this.context);
        dialog.showDialog();
      } else
      {
        JOptionPane.showMessageDialog(IntroduceConstant_Action.this.component, error.value, "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "IntroduceConstant");
    }
  }

}
