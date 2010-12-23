package jetbrains.mps.lang.editor.plugin;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import jetbrains.mps.logging.Logger;
import jetbrains.mps.nodeEditor.EditorComponent;
import java.util.List;
import jetbrains.mps.smodel.SNode;
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.actionSystem.AnActionEvent;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import java.util.ArrayList;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.structure.behavior.AbstractConceptDeclaration_Behavior;
import jetbrains.mps.lang.structure.behavior.LinkDeclaration_Behavior;

public class CopyThisDown_Action extends GeneratedAction {
  private static final Icon ICON = null;
  private static Logger LOG = Logger.getLogger(CopyThisDown_Action.class);

  private EditorComponent editorComponent;
  private List<SNode> inputNodes;

  public CopyThisDown_Action() {
    super("Duplicate Node", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  @NotNull
  public String getKeyStroke() {
    return "ctrl D";
  }

  public boolean isApplicable(AnActionEvent event) {
    return ListSequence.fromList(CopyThisDown_Action.this.inputNodes).count() > 0 && !(CopyThisDown_Action.this.editorComponent.isReadOnly());
  }

  public void doUpdate(@NotNull AnActionEvent event) {
    try {
      {
        boolean enabled = this.isApplicable(event);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      LOG.error("User's action doUpdate method failed. Action:" + "CopyThisDown", t);
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event) {
    if (!(super.collectActionData(event))) {
      return false;
    }
    {
      List<SNode> nodes = event.getData(MPSDataKeys.NODES);
      boolean error = false;
      if (nodes != null) {
      }
      if (error || nodes == null) {
        this.inputNodes = null;
      } else {
        this.inputNodes = ListSequence.fromListWithValues(new ArrayList<SNode>(), nodes);
      }
    }
    if (this.inputNodes == null) {
      return false;
    }
    this.editorComponent = event.getData(MPSDataKeys.EDITOR_COMPONENT);
    if (this.editorComponent == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event) {
    try {
      if (ListSequence.fromList(CopyThisDown_Action.this.inputNodes).count() == 1) {
        SNode nodeToCopy = ListSequence.fromList(CopyThisDown_Action.this.inputNodes).first();
        while (SNodeOperations.getParent(nodeToCopy) != null) {
          SNode parent = SNodeOperations.getParent(nodeToCopy);
          String role = nodeToCopy.getRole_();
          SNode link = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
          if (link == null) {
            return;
          }
          if (!(LinkDeclaration_Behavior.call_isSingular_1213877254557(link))) {
            SNode copy = SNodeOperations.copyNode(nodeToCopy);
            parent.insertChild(nodeToCopy, role, copy);
            CopyThisDown_Action.this.editorComponent.getEditorContext().selectWRTFocusPolicy(copy);
            CopyThisDown_Action.this.editorComponent.selectNode(copy);
            return;
          }
          nodeToCopy = parent;
        }
      } else {
        SNode firstNode = ListSequence.fromList(CopyThisDown_Action.this.inputNodes).first();
        SNode lastNode = ListSequence.fromList(CopyThisDown_Action.this.inputNodes).last();
        String role = firstNode.getRole_();
        SNode parent = SNodeOperations.getParent(firstNode);
        SNode link = AbstractConceptDeclaration_Behavior.call_findLinkDeclaration_1213877394467(SNodeOperations.getConceptDeclaration(parent), role);
        if (link == null) {
          return;
        }
        for (SNode node : ListSequence.fromList(CopyThisDown_Action.this.inputNodes).reversedList()) {
          parent.insertChild(lastNode, role, SNodeOperations.copyNode(node));
        }
        CopyThisDown_Action.this.editorComponent.getEditorContext().selectRange(firstNode, lastNode);
      }
    } catch (Throwable t) {
      LOG.error("User's action execute method failed. Action:" + "CopyThisDown", t);
    }
  }
}
