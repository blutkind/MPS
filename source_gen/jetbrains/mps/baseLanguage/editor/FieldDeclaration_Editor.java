package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class FieldDeclaration_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createDeclarationBox(editorContext, node);
  }
  public EditorCell createDeclarationBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setGridLayout(false);
    FieldDeclaration_NodeBoxActions.setCellActions(editorCell, node);
    editorCell.addEditorCell(this.createTypeCell(editorContext, node));
    editorCell.addEditorCell(this.createNameCell(editorContext, node));
    if(Aspects.semanticNodeCondition_HasInitializer(node)) {
      editorCell.addEditorCell(this.createInitializerArea(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ";"));
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode type = node.getReferent("type", (SemanticNode)null);
    EditorCell editorCell = null;
    if(type != null) {
      editorCell = this.nodeCell(editorContext, type);
      FieldDeclaration_TypeCellActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      FieldDeclaration_TypeCellActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "name", "?", true);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    FieldDeclaration_NameCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createInitializerArea(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "="));
    editorCell.addEditorCell(this.createInitializerCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createInitializerCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode initializer = node.getReferent("initializer", (SemanticNode)null);
    EditorCell editorCell = null;
    if(initializer != null) {
      editorCell = this.nodeCell(editorContext, initializer);
      _VariableInitializer_ActionSet.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Constant.create(editorContext, node, "<none>", true);
      _VariableInitializer_ActionSet.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
}
