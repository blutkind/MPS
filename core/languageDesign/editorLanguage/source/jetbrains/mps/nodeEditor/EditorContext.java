package jetbrains.mps.nodeEditor;

import com.intellij.openapi.util.Computable;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.inspector.InspectorEditorComponent;
import jetbrains.mps.smodel.*;
import jetbrains.mps.smodel.event.SModelEvent;

import java.util.List;


/**
 * Author: Sergey Dmitriev
 * Created Sep 14, 2003
 */
public class EditorContext {

  private AbstractEditorComponent myNodeEditorComponent;
  private SModelDescriptor myModelDescriptor;
  private IOperationContext myOperationContext;
  private EditorCell myContextCell;
  private java.util.List<SModelEvent> mySModelEvents = null;

  private ReferencedNodeContext myCurrentRefNodeContext;

  public EditorContext(AbstractEditorComponent editorComponent, SModel model, IOperationContext operationContext) {
    myNodeEditorComponent = editorComponent;
    myModelDescriptor = model == null ? null : model.getModelDescriptor();
    myOperationContext = operationContext;
  }

  public AbstractEditorComponent getNodeEditorComponent() {
    return myNodeEditorComponent;
  }

  public boolean isInspector() {
    return myNodeEditorComponent instanceof InspectorEditorComponent;
  }

  public EditorCell getSelectedCell() {
    return myNodeEditorComponent.getSelectedCell();
  }

  public IScope getScope() {
    return myOperationContext.getScope();
  }

  public SNode getSelectedNode() {
    return getSelectedCell().getSNode();
  }

  public SModel getModel() {
    return myModelDescriptor.getSModel();
  }

  public IOperationContext getOperationContext() {
    return myOperationContext;
  }

  public void resetModelEvents() {
    mySModelEvents = null;
  }

  public void setModelEvents(List<SModelEvent> modelEvents) {
    mySModelEvents = modelEvents;
  }

  private EditorCell createNodeCell(java.util.List<SModelEvent> events, ReferencedNodeContext refContext) {
    return myOperationContext.getComponent(EditorManager.class).createEditorCell(this, events, refContext);
  }

  private EditorCell createNodeCellInAir(EditorManager editorManager, ReferencedNodeContext referencedNodeContext) {
    return editorManager.createEditorCell(this, null, referencedNodeContext);
  }

  public EditorCell createRootCell(SNode node, java.util.List<SModelEvent> events) {
    mySModelEvents = events;
    initializeRefContext(node);
    EditorCell result = myOperationContext.getComponent(EditorManager.class).createRootCell(this, node, events);
    resetCurrentRefContext();
    mySModelEvents = null;
    return result;
  }

  public EditorCell createInspectedCell(SNode node, java.util.List<SModelEvent> events) {
    mySModelEvents = events;
    initializeRefContext(node);
    EditorCell result = myOperationContext.getComponent(EditorManager.class).createInspectedCell(this, node, events);
    resetCurrentRefContext();
    mySModelEvents = null;
    return result;
  }

  private void initializeRefContext(SNode rootNode) {
    myCurrentRefNodeContext = ReferencedNodeContext.createNodeContext(rootNode);
  }

  private void resetCurrentRefContext() {
    myCurrentRefNodeContext = null;
  }

  public EditorCell createNodeCell(SNode node) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(node);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.sameContextButAnotherNode(node);
    EditorCell nodeCell = createNodeCell(mySModelEvents, myCurrentRefNodeContext);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public EditorCell createNodeCellInAir(SNode node, EditorManager editorManager) {
    ReferencedNodeContext referencedNodeContext = ReferencedNodeContext.createNodeContext(node);
    EditorCell nodeCell = createNodeCellInAir(editorManager, referencedNodeContext);
    return nodeCell;
  }

  public EditorCell createReferentCell(SNode sourceNode, SNode targetNode, String role) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(targetNode);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.contextWithOneMoreReference(targetNode, sourceNode, role);
    EditorCell nodeCell = createNodeCell(mySModelEvents, myCurrentRefNodeContext);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public EditorCell createReferentCell(AbstractCellProvider inlineComponent, SNode sourceNode, SNode targetNode, String role) {
    if (myCurrentRefNodeContext == null) {
      initializeRefContext(targetNode);
    }
    ReferencedNodeContext oldNodeContext = myCurrentRefNodeContext;
    myCurrentRefNodeContext = myCurrentRefNodeContext.contextWithOneMoreReference(targetNode, sourceNode, role);
    EditorCell nodeCell = inlineComponent.createEditorCell(this);
    myCurrentRefNodeContext = oldNodeContext;
    return nodeCell;
  }

  public void flushEvents() {
    myNodeEditorComponent.flushEvents();
  }

  public Object createMemento(boolean full) {
    return new Memento(this, full);
  }

  public Object createMemento() {
    return createMemento(true);
  }

  public void select(final SNode node) {
    flushEvents();

    getNodeEditorComponent().selectNode(node);
  }
  
  public void select(final SNode node, String cellId) {
    flushEvents();

    getNodeEditorComponent().selectNode(node, cellId);
  }

  public void selectBefore(final SNode node) {
    flushEvents();

    getNodeEditorComponent().selectNode(node);
    EditorCell cell = getNodeEditorComponent().getSelectedCell();

    if (cell instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) cell;
      label.home();
    }
  }

  public void selectAfter(final SNode node) {
    flushEvents();

    getNodeEditorComponent().selectNode(node);
    EditorCell cell = getNodeEditorComponent().getSelectedCell();

    if (cell instanceof EditorCell_Label) {
      EditorCell_Label label = (EditorCell_Label) cell;
      label.end();
    }

  }

  public void selectWRTFocusPolicy(final SNode node) {
    selectWRTFocusPolicy(node, true);
  }

  public void selectWRTFocusPolicy(final SNode node, final boolean force) {
    flushEvents();

    if (!force && getNodeEditorComponent().getSelectedNode() == node) {
      return;
    }

    EditorCell cell = getNodeEditorComponent().findNodeCell(node);
    if (cell != null) {
      getNodeEditorComponent().changeSelectionWRTFocusPolicy(cell);
    }
  }

  public void selectAndSetCaret(final SNode node, final int position) {
    flushEvents();

    getNodeEditorComponent().selectNode(node);
    EditorCell selectedCell = getNodeEditorComponent().getSelectedCell();
    setCaretPosition(selectedCell, position);
  }

  private int setCaretPosition(EditorCell editorCell, int position) {
    int newPosition = position;
    if (editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCell_label = (EditorCell_Label) editorCell;
      newPosition = position - editorCell_label.getText().length();
      if (newPosition < 0) {
        getNodeEditorComponent().changeSelection(editorCell);
        editorCell_label.setCaretPosition(position);
      }
    } else if (editorCell instanceof EditorCell_Collection) {
      EditorCell_Collection editorCell_iterable = (EditorCell_Collection) editorCell;
      for (EditorCell subEditorCell : editorCell_iterable) {
        newPosition = setCaretPosition(subEditorCell, newPosition);
        if (newPosition < 0) {
          break;
        }
      }
    }
    return newPosition;
  }

  public boolean setMemento(Object o) {
    if (o instanceof Memento) {
      final Memento memento = (Memento) o;
      ModelAccess.instance().runReadAction(new Runnable() {
        public void run() {
          memento.restore(myNodeEditorComponent);
        }
      });

      myNodeEditorComponent.flushEvents();

      myNodeEditorComponent.relayout();

      return true;
    }
    return false;
  }

  public EditorCell getContextCell() {
    if (myContextCell == null) return getNodeEditorComponent().getSelectedCell();
    return myContextCell;
  }

  public void runWithContextCell(EditorCell contextCell, final Runnable r) {
    runWithContextCell(contextCell, new Computable<Object>() {
      public Object compute() {
        r.run();
        return null;
      }
    });
  }


  public <T> T runWithContextCell(EditorCell contextCell, Computable<T> r) {
    EditorCell oldContextCell = myContextCell;
    myContextCell = contextCell;
    try {
      return r.compute();
    } finally {
      myContextCell = oldContextCell;
    }
  }

  public EditorCell createRoleAttributeCell(Class attributeClass, EditorCell cellWithRole, SNode roleAttribute) {
    if (myCurrentRefNodeContext != null) {
      if (attributeClass != jetbrains.mps.annotations.structure.LinkAttributeConcept.class && myCurrentRefNodeContext.hasRoles())
        return cellWithRole;
    }
    return myOperationContext.getComponent(EditorManager.class).doCreateRoleAttributeCell(attributeClass, cellWithRole, this, roleAttribute);
  }

  public List<SNode> getSelectedNodes() {
    return myNodeEditorComponent.getSelectedNodes();
  }

}
