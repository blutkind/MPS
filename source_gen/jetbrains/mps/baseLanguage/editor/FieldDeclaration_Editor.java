package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.ModelAccessor;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Label;

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
    if(this.handleConditionalQuery_1075290206265(node)) {
      editorCell.addEditorCell(this.createInitializerArea(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ";"));
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode type = node.getReferent("type", (SemanticNode)null);
    EditorCell editorCell = null;
    if(type != null) {
      editorCell = editorContext.createNodeCell(type);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(type));
      FieldDeclaration_TypeCellActions.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, "<no type>");
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      FieldDeclaration_TypeCellActions.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = new PropertyAccessor(node, "name", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
    editorCell.setDefaultText("<no name>");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
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
      editorCell = editorContext.createNodeCell(initializer);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(initializer));
      __VariableInitializer_ActionSet.setCellActions(editorCell, node);
    } else {
      editorCell = EditorCell_Constant.create(editorContext, node, null, true);
      ((EditorCell_Label)editorCell).setEditable(true);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      __VariableInitializer_ActionSet.setCellActions(editorCell, node);
    }
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public boolean handleConditionalQuery_1075290206265(SemanticNode node) {
    return FreeMethodsUtil_baseLanguage_editor_context._SemanticNodeCondition_HasInitializer(node);
  }
}
