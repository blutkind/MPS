package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_BlockStart_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_CellModel_Common1215_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createProperty_1215_1(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1215_0(context, node);
  }

  public EditorCell createCollection_1215_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1215_0(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_1215_0(context, node));
    return editorCell;
  }

  public EditorCell createComponent_1215_0(EditorContext context, SNode node) {
    if (this.my_CellModel_Common1215_0 == null) {
      this.my_CellModel_Common1215_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common1215_0.createEditorCell(context);
    setupBasic_Component_1215_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createProperty_1215_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_1215_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1215_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("openBrace");
    provider.setNoTargetText("{");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_1215_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Property_1215_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_openBrace");
    Styles_StyleSheet.getRootCellModelStyle(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
      style.set(StyleAttributes.NULL_TEXT_COLOR, MPSColors.blue);
    }
  }

  private static void setupBasic_Collection_1215_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1215_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
  }

  private static void setupBasic_Component_1215_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
