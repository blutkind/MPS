package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;

public class CommentedStatementsBlock_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(EditorCellAction.DELETE, new CommentedStatementsBlock_Actions.CommentedStatementsBlock_Actions_DELETE(node));
  }

  public static class CommentedStatementsBlock_Actions_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public CommentedStatementsBlock_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "remove commenting";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      for(SNode statement : SLinkOperations.getTargets(node, "statement", true)) {
        SNodeOperations.insertPrevSiblingChild(node, statement);
      }
      SNodeOperations.deleteNode(node);
    }

}

}
