package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellModel_Block_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_CellModel_Common0905_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0905_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_0905_3(context, node);
  }

  public EditorCell createCollection_0905_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0905_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_0905_1(context, node));
    editorCell.addEditorCell(this.createCollection_0905_2(context, node));
    editorCell.addEditorCell(this.createProperty_0905_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0905_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0905_1(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_0905_3(context, node));
    editorCell.addEditorCell(this.createProperty_0905_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0905_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0905_2(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell0905_0(context, node));
    editorCell.addEditorCell(this.createRefNode_0905_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0905_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0905_3(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createComponent_0905_0(context, node));
    return editorCell;
  }

  public EditorCell createComponent_0905_0(EditorContext context, SNode node) {
    if (this.my_CellModel_Common0905_0 == null) {
      this.my_CellModel_Common0905_0 = new _CellModel_Common(node);
    }
    EditorCell editorCell = this.my_CellModel_Common0905_0.createEditorCell(context);
    setupBasic_Component_0905_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createIndentCell0905_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode_0905_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0905_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0905_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    EditorCell cellWithRole = this.createRefNode_0905_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0905_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0905_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0905_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("header");
    provider.setNoTargetText("<no header>");
    EditorCell cellWithRole = this.createRefNode_0905_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0905_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0905_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0905_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("openBrace");
    provider.setNoTargetText("{");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_0905_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0905_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0905_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0905_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("closeBrace");
    provider.setNoTargetText("}");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_0905_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0905_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0905_0");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_0905_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0905_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
  }

  private static void setupBasic_Collection_0905_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0905_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
  }

  private static void setupBasic_Indent_0905_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_0905_0");
  }

  private static void setupBasic_RefNode_0905_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_0905_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0905_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0905_3");
  }

  private static void setupBasic_Property_0905_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_openBrace");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
      style.set(StyleAttributes.NULL_TEXT_COLOR, MPSColors.blue);
    }
  }

  private static void setupBasic_Property_0905_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_closeBrace");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
      style.set(StyleAttributes.NULL_TEXT_COLOR, MPSColors.blue);
    }
  }

  private static void setupBasic_Component_0905_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
