package jetbrains.mps.baseLanguage.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Frame;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.IntroduceFieldRefactoring;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.smodel.ModelAccess;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.baseLanguage.util.plugin.refactorings.IntroduceFieldDialog;
import javax.swing.JOptionPane;

public class IntroduceField_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(IntroduceField_Action.class);

  private SNode node;
  private EditorComponent component;
  private EditorContext context;
  private Frame frame;

  public IntroduceField_Action() {
    super("Introduce Field...", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(true);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl alt F";
  }

  public boolean isApplicable(AnActionEvent event) {
    return IntroduceFieldRefactoring.isApplicable(IntroduceField_Action.this.node);
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "IntroduceField", t);
      this.disable(event.getPresentation());
    }
  }

  @Override
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
    this.component = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.component == null) {
      return false;
    }
    this.context = event.getData(MPSDataKeys.EDITOR_CONTEXT);
    if (this.context == null) {
      return false;
    }
    this.frame = event.getData(MPSDataKeys.FRAME);
    if (this.frame == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      final IntroduceFieldRefactoring introducer = new IntroduceFieldRefactoring();
      final Wrappers._T<String> error = new Wrappers._T<String>();
      ModelAccess.instance().runWriteAction(new Runnable() {
        public void run() {
          error.value = introducer.init(SNodeOperations.cast(IntroduceField_Action.this.node, "jetbrains.mps.baseLanguage.structure.Expression"), IntroduceField_Action.this.component);
        }
      });
      if (error.value == null) {
        IntroduceFieldDialog dialog = new IntroduceFieldDialog(IntroduceField_Action.this.frame, introducer, IntroduceField_Action.this.context);
        dialog.showDialog();
      } else {
        JOptionPane.showMessageDialog(IntroduceField_Action.this.component, error.value, "Error", JOptionPane.ERROR_MESSAGE);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "IntroduceField", t);
    }
  }
}
