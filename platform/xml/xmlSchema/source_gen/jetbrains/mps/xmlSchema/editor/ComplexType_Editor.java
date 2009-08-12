package jetbrains.mps.xmlSchema.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class ComplexType_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7234_0(context, node);
  }

  public EditorCell createCollection_7234_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_7234_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_7234_1(context, node));
    editorCell.addEditorCell(this.createCollection_7234_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7234_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7234_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7234_0(context, node, "complexType"));
    editorCell.addEditorCell(this.createProperty_7234_1(context, node));
    editorCell.addEditorCell(this.createConstant_7234_2(context, node, ": "));
    editorCell.addEditorCell(this.createRefNode_7234_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7234_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7234_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7234_1(context, node, "  "));
    editorCell.addEditorCell(this.createRefNode_7234_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_7234_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7234_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7234_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7234_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7234_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7234_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_7234_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7234_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7234_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("typeName");
    provider.setNoTargetText("<no typeName>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_7234_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7234_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7234_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7234_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("typeExpressionList");
    provider.setNoTargetText("<no typeExpressionList>");
    EditorCell cellWithRole = this.createRefNode_7234_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7234_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7234_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7234_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("mixedAttribute");
    provider.setNoTargetText("<no mixedAttribute>");
    EditorCell cellWithRole = this.createRefNode_7234_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_7234_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7234_0");
  }

  private static void setupBasic_Collection_7234_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7234_1");
  }

  private static void setupBasic_Constant_7234_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7234_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    }
  }

  private static void setupBasic_Property_7234_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_typeName");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.blue);
    }
  }

  private static void setupBasic_Collection_7234_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7234_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7234_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7234_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_7234_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_7234_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7234_2");
  }

  private static void setupBasic_RefNode_7234_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
