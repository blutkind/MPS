package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/

public class ReturnStatement_Editor extends jetbrains.mps.nodeEditor.SemanticNodeEditor {

  public void setSemanticNode(jetbrains.mps.semanticModel.SemanticNode node) {
    super.setSemanticNode(node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createEditorCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    return this.createStatementBox(editorContext, node);
  }
  public jetbrains.mps.nodeEditor.EditorCell createStatementBox(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.nodeEditor.EditorCell_Collection editorCell = jetbrains.mps.nodeEditor.EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "return"));
    editorCell.addEditorCell(this.createExpressionCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ";"));
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createExpressionCell(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node) {
    jetbrains.mps.semanticModel.SemanticNode expression = node.getReferent("expression", (jetbrains.mps.semanticModel.SemanticNode)null);
    jetbrains.mps.nodeEditor.EditorCell editorCell = null;
    if(expression != null) {
      editorCell = this.nodeCell(editorContext, expression);
    } else {
      editorCell = jetbrains.mps.nodeEditor.EditorCell_Error.create(editorContext, node, null);
    }
    jetbrains.mps.baseLanguage.editor.ReturnStatement_Actions.setCellActions_ExpressionActions(editorCell, node);
    return editorCell;
  }
  public jetbrains.mps.nodeEditor.EditorCell createConstantCell1(jetbrains.mps.nodeEditor.EditorContext editorContext, jetbrains.mps.semanticModel.SemanticNode node, java.lang.String text) {
    jetbrains.mps.nodeEditor.EditorCell_Constant editorCell = jetbrains.mps.nodeEditor.EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
}
