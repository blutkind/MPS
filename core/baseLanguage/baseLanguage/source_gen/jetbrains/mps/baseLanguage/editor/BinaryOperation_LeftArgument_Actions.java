package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.nodeEditor.EditorComponent;
import jetbrains.mps.nodeEditor.cells.CellConditions;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class BinaryOperation_LeftArgument_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new BinaryOperation_LeftArgument_Actions.BinaryOperation_LeftArgument_Actions_DELETE(node));
  }

  public static class BinaryOperation_LeftArgument_Actions_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public BinaryOperation_LeftArgument_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "replace binary operation with right operand";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode rightExpression = SLinkOperations.getTarget(node, "rightExpression", true);
      SNodeOperations.replaceWithAnother(node, rightExpression);
      editorContext.flushEvents();
      EditorComponent editor = editorContext.getNodeEditorComponent();
      EditorCell cell = editor.findNodeCell(rightExpression);
      if (cell != null) {
        EditorCell firstLeaf = cell.getFirstLeaf(CellConditions.SELECTABLE);
        editor.changeSelection(firstLeaf);
        if (firstLeaf instanceof EditorCell_Label) {
          ((EditorCell_Label)firstLeaf).home();
        }
      }
    }

}

}
