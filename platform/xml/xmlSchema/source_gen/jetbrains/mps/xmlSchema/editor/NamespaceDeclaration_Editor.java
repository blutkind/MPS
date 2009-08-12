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

public class NamespaceDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0717_0(context, node);
  }

  public EditorCell createCollection_0717_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0717_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0717_0(context, node, "namespace"));
    editorCell.addEditorCell(this.createProperty_0717_1(context, node));
    editorCell.addEditorCell(this.createConstant_0717_1(context, node, "="));
    editorCell.addEditorCell(this.createConstant_0717_2(context, node, "\""));
    editorCell.addEditorCell(this.createProperty_0717_3(context, node));
    editorCell.addEditorCell(this.createConstant_0717_3(context, node, "\""));
    return editorCell;
  }

  public EditorCell createConstant_0717_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0717_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0717_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0717_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0717_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0717_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0717_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0717_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_0717_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0717_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0717_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("prefix");
    provider.setNoTargetText("<no prefix>");
    EditorCell cellWithRole = this.createProperty_0717_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_0717_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_0717_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_0717_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("uri");
    provider.setNoTargetText("<no uri>");
    EditorCell cellWithRole = this.createProperty_0717_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0717_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0717_0");
  }

  private static void setupBasic_Constant_0717_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0717_0");
  }

  private static void setupBasic_Property_0717_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_prefix");
  }

  private static void setupBasic_Constant_0717_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0717_1");
  }

  private static void setupBasic_Constant_0717_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0717_2");
  }

  private static void setupBasic_Constant_0717_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0717_3");
  }

  private static void setupBasic_Property_0717_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_uri");
  }

}
