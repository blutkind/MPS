package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class SemanticDowncastExpression_Editor extends DefaultNodeEditor {

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1145404664303");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_LeftExpressionCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1145404664304");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1145404664305");
    editorCell.setDrawBorder(false);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
    SemanticDowncastExpression_Symbol_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_LeftExpressionCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(false);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_MAGENTA);
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    SemanticDowncastExpression_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createLeftExpressionCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "/"));
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    SemanticDowncastExpression_Editor.setupBasic_ConstantCell(editorCell, node, context);
    SemanticDowncastExpression_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createLeftExpressionCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    SemanticDowncastExpression_Editor.setupBasic_LeftExpressionCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      SemanticDowncastExpression_Editor.setupLabel_LeftExpressionCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createLeftExpressionCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftExpression");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createLeftExpressionCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

}
