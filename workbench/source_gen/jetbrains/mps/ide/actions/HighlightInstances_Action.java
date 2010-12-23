package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.smodel.SModelDescriptor;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.nodeEditor.NodeHighlightManager;
import jetbrains.mps.nodeEditor.EditorMessageOwner;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import jetbrains.mps.smodel.ModelFindOperations;
import jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;

public class HighlightInstances_Action extends GeneratedAction {
  private static final Icon ICON = null;
  protected static Log log = LogFactory.getLog(HighlightInstances_Action.class);

  private EditorComponent editorComponent;
  private EditorCell editorCell;
  private IScope scope;
  private SModelDescriptor model;
  private SNode node;

  public HighlightInstances_Action() {
    super("Highlight Instances", "", ICON);
    this.setIsAlwaysVisible(true);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl shift F6";
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      this.enable(event.getPresentation());
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "HighlightInstances", t);
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
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    this.editorCell = event.getData(MPSDataKeys.EDITOR_CELL);
    if (this.editorCell == null) {
      return false;
    }
    this.scope = event.getData(MPSDataKeys.SCOPE);
    if (this.scope == null) {
      return false;
    }
    this.model = event.getData(MPSDataKeys.CONTEXT_MODEL);
    if (this.model == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      NodeHighlightManager highlightManager = HighlightInstances_Action.this.editorComponent.getHighlightManager();
      EditorMessageOwner messageOwner = HighlightInstances_Action.this.editorComponent.getHighlightMessagesOwner();
      for (SNode ref : SetSequence.fromSet(new ModelFindOperations(HighlightInstances_Action.this.model).findInstances(((AbstractConceptDeclaration) SNodeOperations.getAdapter(SNodeOperations.getConceptDeclaration(HighlightInstances_Action.this.node))), HighlightInstances_Action.this.scope))) {
        if (ref.getContainingRoot() == HighlightInstances_Action.this.editorComponent.getRootCell().getSNode().getContainingRoot()) {
          highlightManager.mark(ref, HighlightConstants.INSTANCES_COLOR, "usage", messageOwner);
        }
      }
      highlightManager.repaintAndRebuildEditorMessages();
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "HighlightInstances", t);
      }
    }
  }
}
