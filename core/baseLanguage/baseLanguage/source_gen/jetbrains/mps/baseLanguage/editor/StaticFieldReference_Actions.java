package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;

public class StaticFieldReference_Actions {
  public static void setCellActions(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setAction(CellActionType.DELETE, new StaticFieldReference_Actions.StaticFieldReference_Actions_DELETE(node));
  }

  public static class StaticFieldReference_Actions_DELETE extends EditorCellAction {
    /*package*/ SNode myNode;

    public StaticFieldReference_Actions_DELETE(SNode node) {
      this.myNode = node;
    }

    public void execute(EditorContext editorContext) {
      this.execute_internal(editorContext, this.myNode);
    }

    public void execute_internal(EditorContext editorContext, SNode node) {
      SNode classifier1 = SLinkOperations.getTarget(node, "classifier", false);
      SNode classifier2 = SNodeOperations.getAncestor(node, "jetbrains.mps.baseLanguage.structure.Classifier", false, false);
      if (classifier1 == classifier2) {
        SNode localStaticFieldReference = SNodeFactoryOperations.replaceWithNewChild(node, "jetbrains.mps.baseLanguage.structure.LocalStaticFieldReference");
        SLinkOperations.setTarget(localStaticFieldReference, "variableDeclaration", SLinkOperations.getTarget(node, "variableDeclaration", false), false);
      }
    }
  }
}
