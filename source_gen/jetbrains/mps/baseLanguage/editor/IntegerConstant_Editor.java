package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCell_Error;

public class IntegerConstant_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createValueCell(editorContext, node);
  }
  public EditorCell createValueCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = Aspects.createModelAccessor_IntegerConstantValue(node);
    EditorCell editorCell = null;
    if(modelAccessor != null) {
      editorCell = EditorCell_Property.create(editorContext, modelAccessor, node, true);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
    }
    IntegerConstant_NodeBoxActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
