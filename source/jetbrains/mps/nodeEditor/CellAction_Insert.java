package jetbrains.mps.nodeEditor;

import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;

/**
 * Author: Sergey Dmitriev.
 * Time: Nov 5, 2003 1:03:02 PM
 */
public class CellAction_Insert extends EditorCellAction {
  private AbstractCellListHandler listHandler;
  private boolean myInsertBefore;

  public CellAction_Insert(AbstractCellListHandler listHandler, boolean insertBefore) {
    this.listHandler = listHandler;
    myInsertBefore = insertBefore;
  }

  protected AbstractCellListHandler getListHandler() {
    return listHandler;
  }

  public boolean canExecute(EditorContext context) {
    return true;
  }

  public void execute(EditorContext context) {
    listHandler.startInsertMode(context, context.getContextCell(), myInsertBefore);
  }
}
