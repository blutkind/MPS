package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class Echo_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3881_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3881_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3881_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_3881_1(context, node);
  }

  public EditorCell createCollection_3881_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3881_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConceptProperty_3881_1(context, node));
    editorCell.addEditorCell(this.createRefNode_3881_1(context, node));
    if (renderingCondition3881_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3881_1(context, node, ">>"));
    }
    if (renderingCondition3881_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_3881_0(context, node, ">"));
    }
    editorCell.addEditorCell(this.createRefNode_3881_3(context, node));
    editorCell.addEditorCell(this.createComponent_3881_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3881_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3881_1(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_3881_1(context, node));
    editorCell.addEditorCell(this.createCollection_3881_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3881_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3881_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3881_2(context, node, "append"));
    editorCell.addEditorCell(this.createProperty_3881_1(context, node));
    return editorCell;
  }

  public EditorCell createComponent_3881_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3881_0 == null) {
      this.myConfigurationReferencesEditorComponent3881_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3881_0.createEditorCell(context);
    setupBasic_Component_3881_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_3881_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3881_1 == null) {
      this.myConfigurationReferencesEditorComponent3881_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3881_1.createEditorCell(context);
    setupBasic_Component_3881_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_3881_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3881_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3881_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3881_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3881_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3881_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_3881_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_3881_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_3881_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_3881_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3881_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3881_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3881_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("message");
    provider.setNoTargetText("<no message>");
    EditorCell cellWithRole = this.createRefNode_3881_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3881_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3881_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3881_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    EditorCell cellWithRole = this.createRefNode_3881_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3881_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3881_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3881_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("append");
    provider.setNoTargetText("<no append>");
    EditorCell cellWithRole = this.createProperty_3881_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3881_0");
  }

  private static void setupBasic_Constant_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3881_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Component_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_ConceptProperty_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_3881_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3881_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3881_1");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Collection_3881_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3881_1");
  }

  private static void setupBasic_Component_3881_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3881_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3881_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_3881_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_append");
  }

  private static void setupBasic_Constant_3881_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3881_2");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  public static boolean renderingCondition3881_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "append");
  }

  public static boolean renderingCondition3881_1(SNode node, EditorContext editorContext, IScope scope) {
    return !(SPropertyOperations.getBoolean(node, "append"));
  }

}
