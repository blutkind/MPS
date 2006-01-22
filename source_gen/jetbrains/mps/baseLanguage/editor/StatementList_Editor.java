package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 21, 2006 8:49:42 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import java.awt.Color;

public class StatementList_Editor extends DefaultNodeEditor {

  public EditorCellListHandler myStatementListHandler;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createStatementList(context, node);
  }
  public EditorCell createStatementList(EditorContext context, SNode node) {
    if(this.myStatementListHandler == null) {
      this.myStatementListHandler = new StatementList_Editor_StatementListHandler(node, "statement", context);
    }
    EditorCell_Collection editorCell = this.myStatementListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "statement");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
