package jetbrains.mps.nodeEditor;

import jetbrains.mps.semanticModel.SemanticNode;

import java.awt.event.KeyEvent;
import java.util.Iterator;

/**
 * Author: Sergey Dmitriev.
 * Time: Oct 21, 2003 5:12:16 PM
 */
public abstract class EditorCellListHandler implements IKeyboardHandler {

  private String myReferenceRole;
  private String myRefernceMetaclass;
  private SemanticNode myOwnerNode;
  private EditorCell_Collection myListEditorCell_Collection;
  private EditorCell_Collection myInsertCell;
  private boolean myVertical;
  private SemanticNode myInsertedNode;
  private EditorCell myInsertedNodeCell;

  public EditorCellListHandler(SemanticNode ownerNode, String referenceRole, String referenceMetaclass) {
    myOwnerNode = ownerNode;
    myReferenceRole = referenceRole;
    myRefernceMetaclass = referenceMetaclass;
  }

  public SemanticNode getOwner() {
    return myOwnerNode;
  }

  public void startInsertMode(EditorContext editorContext, EditorCell anchorCell) {
    SemanticNode anchorNode = (anchorCell != null ? anchorCell.getSemanticNode() : null);
    if(anchorNode != null) {
      // anchor should be directly referenced from "list owner"
      while(anchorNode != null && anchorNode.getContainer() != myOwnerNode) {
        anchorNode = anchorNode.getContainer();
      }
    }
    myInsertedNode = createNodeToInsert();
    getOwner().insertReference(anchorNode, myReferenceRole, myInsertedNode, myRefernceMetaclass);

    NodeEditor editor = editorContext.getComponent();
    editor.pushKeyboardHandler(this);
    editor.rebuildEditorContent();
    EditorCell selectableLeaf = myInsertCell.findFirstSelectableLeaf();
    if(selectableLeaf != null) {
      editor.changeSelection(selectableLeaf);
    }
  }

  private void finishInsertMode(EditorContext editorContext) {
    if(isInsertMode()) {
      editorContext.getComponent().popKeyboardHandler(); // remove this handler from stack.

      EditorCell prevCell = myListEditorCell_Collection.getPrevCell(myInsertCell);
      myListEditorCell_Collection.removeCell(myInsertCell);
      myListEditorCell_Collection.insertAfter(prevCell, myInsertedNodeCell);

      myInsertCell = null;
      myInsertedNode = null;
      myInsertedNodeCell = null;
      editorContext.getComponent().relayout();
    }
  }

  private void cancelInsertMode(EditorContext editorContext) {
    if(isInsertMode()) {
      editorContext.getComponent().popKeyboardHandler(); // remove this handler from stack.
      myInsertedNode.delete();

      myInsertCell = null;
      myInsertedNode = null;
      myInsertedNodeCell = null;
      editorContext.getComponent().rebuildEditorContent();
    }
  }

  private boolean isInsertMode() {
    return myInsertedNode != null;
  }

  private boolean isVertical() {
    return myVertical;
  }

  protected EditorCell createNodeCell(EditorContext editorContext, SemanticNode node) {
    return editorContext.getEditorManager().createEditorCell(node);
  }

  protected EditorCell createSeparatorCell(EditorContext editorContext) {
    return null;
  }

  protected EditorCell createEmptyCell(EditorContext editorContext) {
    return EditorCell_Constant.create(editorContext, getOwner(), " << " + myReferenceRole + " >>", true);
  }

  public abstract SemanticNode createNodeToInsert();

  public EditorCell_Collection createCells_Vertical(EditorContext editorContext) {
    myVertical = true;
    return createCells(editorContext);
  }

  public EditorCell_Collection createCells_Horizontal(EditorContext editorContext) {
    myVertical = false;
    return createCells(editorContext);
  }

  private EditorCell_Collection createCells(EditorContext editorContext) {
    if(isVertical()) {
      myListEditorCell_Collection = EditorCell_Collection.createVertical(editorContext, myOwnerNode);
    } else {
      myListEditorCell_Collection = EditorCell_Collection.createHorizontal(editorContext, myOwnerNode);
    }
    myListEditorCell_Collection.setSelectable(false);

    Iterator<SemanticNode> listNodes = myOwnerNode.referents(myReferenceRole);
    if(!listNodes.hasNext()) {
      myListEditorCell_Collection.addEditorCell(createEmptyCell(editorContext));
    } else {
      EditorCell separatorCell = null;
      while(listNodes.hasNext()) {
        separatorCell = addSeparatorCell(editorContext, separatorCell);
        SemanticNode node = listNodes.next();
        myListEditorCell_Collection.addEditorCell(createNodeCell_internal(editorContext, node));
      }
    }
    return myListEditorCell_Collection;
  }

  private EditorCell createNodeCell_internal(EditorContext editorContext, SemanticNode node) {
    EditorCell nodeCell = createNodeCell(editorContext, node);
    if(node == myInsertedNode) {
      if(myInsertCell == null) {
        myInsertedNodeCell = nodeCell;
        myInsertCell = createInsertCell_internal(editorContext, myInsertedNodeCell);
      }
      return myInsertCell;
    }
    return nodeCell;
  }

  private EditorCell_Collection createInsertCell_internal(EditorContext editorContext, EditorCell insertedNodeCell) {
    EditorCell_Collection insertCell = EditorCell_Collection.createHorizontal(editorContext, insertedNodeCell.getSemanticNode());
    insertCell.setSelectable(false);
    insertCell.setHighlighted(true);
    insertCell.addEditorCell(insertedNodeCell);
    // install actions
////    insertCell.setAction(EditorCellAction.LEFT, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.RIGHT, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.UP, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.DOWN, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.NEXT, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.PREV, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.LEFT_SPECIAL, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.RIGHT_SPECIAL, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.UP_SPECIAL, new Empty_CellAction());
////    insertCell.setAction(EditorCellAction.DOWN_SPECIAL, new Empty_CellAction());
//    if(isVertical()) {
//      insertCell.setAction(EditorCellAction.UP_SPECIAL, new MoveAnchorToPrevPos());
//      insertCell.setAction(EditorCellAction.DOWN_SPECIAL, new MoveAnchorToNextPos());
//    } else {
//      insertCell.setAction(EditorCellAction.LEFT_SPECIAL, new MoveAnchorToPrevPos());
//      insertCell.setAction(EditorCellAction.RIGHT_SPECIAL, new MoveAnchorToNextPos());
//    }
    return insertCell;
  }

  private EditorCell addSeparatorCell(EditorContext editorContext, EditorCell separatorCell) {
    if(separatorCell != null) {
      myListEditorCell_Collection.addEditorCell(separatorCell);
    }
    separatorCell = createSeparatorCell(editorContext);
    return separatorCell;
  }

//  public boolean moveAnchorToNextPos() {
//    List<SemanticNode> elementsList = createElementsList();
//    int index = elementsList.indexOf(myNodeToInsert);
//    if(index < elementsList.size() - 1) {
//      SemanticNode anchorNode = elementsList.getJavaClass(index + 1);
//      SemanticNode container = myNodeToInsert.getContainer();
//      container.removeChild(myNodeToInsert);
//      container.insertReference(anchorNode, myReferenceRole, myNodeToInsert, myRefernceMetaclass);
//      return true;
//    }
//    return false;
//  }

//  public boolean moveAnchorToPrevPos() {
//    List<SemanticNode> elementsList = createElementsList();
//    int index = elementsList.indexOf(myNodeToInsert);
//    if(index > 0) {
//      SemanticNode anchorNode;
//      if(index <= 1) {
//        anchorNode = null;
//      } else {
//        anchorNode = elementsList.getJavaClass(index - 2);
//      }
//      SemanticNode container = myNodeToInsert.getContainer();
//      container.removeChild(myNodeToInsert);
//      container.insertReference(anchorNode, myReferenceRole, myNodeToInsert, myRefernceMetaclass);
//      return true;
//    }
//    return false;
//  }

//  private class MoveAnchorToNextPos extends EditorCellAction {
//    public boolean canExecute(EditorContext context) {
//      return true; // allways true to prevent navigation by other actions
//    }
//
//    public void execute(EditorContext context) {
//      EditorCell selectedCell = context.getComponent().getSelectedCell();
//      moveAnchorToNextPos();
//      context.getComponent().rebuildEditorContent();
//      context.getComponent().changeSelection(selectedCell);
//    }
//  }

//  private class MoveAnchorToPrevPos extends EditorCellAction {
//    public boolean canExecute(EditorContext context) {
//      return true; // allways true to prevent navigation by other actions
//    }
//
//    public void execute(EditorContext context) {
//      EditorCell selectedCell = context.getComponent().getSelectedCell();
//      moveAnchorToPrevPos();
//      context.getComponent().rebuildEditorContent();
//      context.getComponent().changeSelection(selectedCell);
//    }
//  }

  public boolean processKeyPressed(EditorContext editorContext, KeyEvent keyEvent) {
    NodeEditor editor = editorContext.getComponent();
    String actionType = editor.getActionType(keyEvent);
    if(EditorCellAction.INSERT.equals(actionType)) {
      cancelInsertMode(editorContext);
      editor.executeAction(myListEditorCell_Collection.getParent(), actionType);
    } else {
      finishInsertMode(editorContext);
      editor.processKeyPressed(keyEvent);
    }

    return true;
  }

  public boolean processKeyReleased(EditorContext editorContext, KeyEvent keyEvent) {
    NodeEditor editor = editorContext.getComponent();
    String actionType = editor.getActionType(keyEvent);
    if(!EditorCellAction.INSERT.equals(actionType)) {
      finishInsertMode(editorContext);
      return true;
    }
    return false;
  }
}
