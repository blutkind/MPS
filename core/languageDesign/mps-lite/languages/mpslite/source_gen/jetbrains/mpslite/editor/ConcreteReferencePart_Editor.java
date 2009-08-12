package jetbrains.mpslite.editor;

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
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class ConcreteReferencePart_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1235_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1235_1(context, node);
  }

  public EditorCell createCollection_1235_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1235_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_1235_0(context, node, "<"));
    editorCell.addEditorCell(this.createRefNode_1235_1(context, node));
    editorCell.addEditorCell(this.createProperty_1235_1(context, node));
    editorCell.addEditorCell(this.createConstant_1235_1(context, node, ">"));
    if (renderingCondition1235_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_1235_3(context, node, "?"));
    }
    return editorCell;
  }

  public EditorCell createCollection_1235_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1235_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_1235_2(context, node, "optional:"));
    editorCell.addEditorCell(this.createProperty_1235_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_1235_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1235_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1235_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1235_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1235_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1235_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1235_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1235_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_1235_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_1235_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1235_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_1235_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_1235_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_1235_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1235_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("optional");
    provider.setNoTargetText("<no optional>");
    EditorCell cellWithRole = this.createProperty_1235_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1235_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1235_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1235_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("conceptReference");
    provider.setNoTargetText("<no conceptReference>");
    EditorCell cellWithRole = this.createRefNode_1235_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1235_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1235_0");
    editorCell.addKeyMap(new LinePart_Actions());
  }

  private static void setupBasic_Constant_1235_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1235_0");
  }

  private static void setupBasic_Property_1235_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    MPSLite_Style_StyleSheet.getMPSLiteReference(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_1235_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1235_1");
  }

  private static void setupBasic_Collection_1235_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1235_1");
  }

  private static void setupBasic_Constant_1235_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1235_2");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_1235_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_optional");
  }

  private static void setupBasic_Constant_1235_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1235_3");
  }

  private static void setupBasic_RefNode_1235_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1235_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "optional");
  }

}
