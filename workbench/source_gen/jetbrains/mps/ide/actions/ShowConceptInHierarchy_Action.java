package jetbrains.mps.ide.actions;

/*Generated by MPS */

import jetbrains.mps.plugins.pluginparts.actions.GeneratedAction;
import javax.swing.Icon;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.intellij.openapi.actionSystem.AnActionEvent;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.internal.collections.runtime.MapSequence;
import jetbrains.mps.workbench.MPSDataKeys;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.ide.hierarchy.HierarchyViewTool;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.IEditor;
import jetbrains.mps.ide.editorTabs.TabbedEditor;
import javax.swing.ImageIcon;
import com.intellij.openapi.util.io.StreamUtil;
import java.io.IOException;

public class ShowConceptInHierarchy_Action extends GeneratedAction {
  private static final Icon ICON = getIcon();
  protected static Log log = LogFactory.getLog(ShowConceptInHierarchy_Action.class);

  public ShowConceptInHierarchy_Action() {
    super("Show Concept in Hierarchy", "", ICON);
    this.setIsAlwaysVisible(false);
    this.setExecuteOutsideCommand(false);
  }

  public boolean isApplicable(AnActionEvent event, final Map<String, Object> _params) {
    return (ShowConceptInHierarchy_Action.this.getConceptNode(_params) != null);
  }

  public void doUpdate(@NotNull AnActionEvent event, final Map<String, Object> _params) {
    try {
      {
        boolean enabled = this.isApplicable(event, _params);
        this.setEnabledState(event.getPresentation(), enabled);
      }
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action doUpdate method failed. Action:" + "ShowConceptInHierarchy", t);
      }
      this.disable(event.getPresentation());
    }
  }

  protected boolean collectActionData(AnActionEvent event, final Map<String, Object> _params) {
    if (!(super.collectActionData(event, _params))) {
      return false;
    }
    MapSequence.fromMap(_params).put("context", event.getData(MPSDataKeys.OPERATION_CONTEXT));
    if (MapSequence.fromMap(_params).get("context") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editorCell", event.getData(MPSDataKeys.EDITOR_CELL));
    if (MapSequence.fromMap(_params).get("editorCell") == null) {
      return false;
    }
    {
      SNode node = event.getData(MPSDataKeys.NODE);
      if (node != null) {
      }
      MapSequence.fromMap(_params).put("node", node);
    }
    if (MapSequence.fromMap(_params).get("node") == null) {
      return false;
    }
    MapSequence.fromMap(_params).put("editor", event.getData(MPSDataKeys.MPS_EDITOR));
    if (MapSequence.fromMap(_params).get("editor") == null) {
      return false;
    }
    return true;
  }

  public void doExecute(@NotNull final AnActionEvent event, final Map<String, Object> _params) {
    try {
      HierarchyViewTool tool = ((IOperationContext) MapSequence.fromMap(_params).get("context")).getComponent(HierarchyViewTool.class);
      tool.showItemInHierarchy(ShowConceptInHierarchy_Action.this.getConceptNode(_params), ((IOperationContext) MapSequence.fromMap(_params).get("context")));
      tool.openToolLater(true);
    } catch (Throwable t) {
      if (log.isErrorEnabled()) {
        log.error("User's action execute method failed. Action:" + "ShowConceptInHierarchy", t);
      }
    }
  }

  private SNode getConceptNode(final Map<String, Object> _params) {
    SNode refNode = ((EditorCell) MapSequence.fromMap(_params).get("editorCell")).getSNodeWRTReference();
    if (SNodeOperations.isInstanceOf(refNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration")) {
      return SNodeOperations.cast(refNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
    }
    if (SNodeOperations.isInstanceOf(refNode, "jetbrains.mps.lang.behavior.structure.ConceptConstructorDeclaration")) {
      SNode concept = SNodeOperations.getAncestor(refNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", false, false);
      if (concept != null) {
        return concept;
      }
    }
    SNode outerConcept = SNodeOperations.getAncestor(((SNode) MapSequence.fromMap(_params).get("node")), "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration", true, false);
    if (outerConcept != null) {
      return outerConcept;
    }

    if (!(((IEditor) MapSequence.fromMap(_params).get("editor")) instanceof TabbedEditor)) {
      return null;
    }
    TabbedEditor tabbedEditor = (TabbedEditor) ((IEditor) MapSequence.fromMap(_params).get("editor"));
    SNode editedNode = tabbedEditor.getCurrentlyEditedNode().getNode();
    if (!(SNodeOperations.isInstanceOf(editedNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration"))) {
      return null;
    }
    return SNodeOperations.cast(editedNode, "jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration");
  }

  private static Icon getIcon() {
    try {
      return new ImageIcon(StreamUtil.loadFromStream(ShowConceptInHierarchy_Action.class.getResourceAsStream("hierarchyView.png")));
    } catch (IOException e) {
      if (log.isWarnEnabled()) {
        log.warn("Couldn't load icon for ShowConceptInHierarchy", e);
      }
      return null;
    }
  }
}
