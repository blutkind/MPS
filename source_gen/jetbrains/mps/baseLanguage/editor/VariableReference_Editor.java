package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class VariableReference_Editor extends SemanticNodeEditor {
  public static String MATCHING_TEXT = "<VariableReference>";

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createErrorCell(editorContext, node);
  }
  public EditorCell createErrorCell(EditorContext editorContext, SemanticNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(editorContext, node, "<collection>");
    VariableReference_NodeBoxActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
