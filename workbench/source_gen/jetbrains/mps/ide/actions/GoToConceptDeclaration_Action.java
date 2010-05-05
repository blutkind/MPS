package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.ide.icons.IconManager;
import jetbrains.mps.plugins.MacrosUtil;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IOperationContext;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.workbench.editors.MPSEditorOpener;

public class GoToConceptDeclaration_Action extends GeneratedAction {
  private static final Icon ICON = IconManager.loadIcon(MacrosUtil.expandPath("${mps_home}/core/languageDesign/structure/icons/structure.png", "jetbrains.mps.ide"), true);
  protected static Log log = LogFactory.getLog(GoToConceptDeclaration_Action.class);

  private SNode node;
  private IOperationContext context;

  public GoToConceptDeclaration_Action() {
    super("Go To Concept Declaration", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl shift S";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "GoToConceptDeclaration", t);
      }
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
    this.context = event.getData(MPSDataKeys.OPERATION_CONTEXT);
    if (this.context == null) {
      return false;
    }
    return true;
  }

  protected void cleanup() {
    super.cleanup();
    this.node = null;
    this.context = null;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      SNode concept = SNodeOperations.getConceptDeclaration(GoToConceptDeclaration_Action.this.node);
      GoToConceptDeclaration_Action.this.context.getComponent(MPSEditorOpener.class).editNode(concept, GoToConceptDeclaration_Action.this.context);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "GoToConceptDeclaration", t);
      }
    }
  }
}
