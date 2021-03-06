package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class MatchParensRegexp_removeName {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new MatchParensRegexp_removeName.MatchParensRegexp_removeName_DELETE(node));
  }

  public static class MatchParensRegexp_removeName_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public MatchParensRegexp_removeName_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.regexp.structure.ParensRegexp");
    }
  }
}
