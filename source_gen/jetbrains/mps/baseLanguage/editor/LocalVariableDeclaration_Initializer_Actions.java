package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;

public class LocalVariableDeclaration_Initializer_Actions {

  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction("DELETE", new LocalVariableDeclaration_Initializer_Actions.LocalVariableDeclaration_Initializer_Actions_DELETE(node));
  }

  public static class LocalVariableDeclaration_Initializer_Actions_DELETE extends EditorCellAction {

    /* package */SNode myNode;

    public  LocalVariableDeclaration_Initializer_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public String getDescriptionText() {
      return "remove initializer";
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SLinkOperations.deleteChild(node, "initializer");
    }

}

}
