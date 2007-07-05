package jetbrains.mps.baseLanguage.ext.collections.lang.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ForEachVariableReference_Editor extends DefaultNodeEditor {

  private static void setupBasic_VariableReferenceCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1153944293571");
    editorCell.setDrawBorder(false);
  }
  private static void setupLabel_VariableReferenceCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createVariableReferenceCell(context, node);
  }
  public EditorCell createVariableReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ForEachVariableReference_Editor_variable_InlineComponent());
    EditorCell editorCell = provider.createEditorCell(context);
    ForEachVariableReference_Editor.setupBasic_VariableReferenceCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      ForEachVariableReference_Editor.setupLabel_VariableReferenceCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createVariableReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("variable");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createVariableReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
}
