package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class Expression_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createErrorCell(editorContext, node);
  }
  public EditorCell createErrorCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(editorContext, node, "expression");
    Expression_NodeBoxActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
