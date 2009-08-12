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

public class Zip_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myIncludeExcludeEditorComponent5723_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5723_0;
  /* package */AbstractCellProvider myCompositecomponentEntriesEditorComponent5723_0;
  /* package */AbstractCellProvider myIncludeExcludeInInspector5723_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent5723_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_5723_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_5723_2(context, node);
  }

  public EditorCell createCollection_5723_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_5723_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_5723_1(context, node));
    editorCell.addEditorCell(this.createComponent_5723_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5723_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5723_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConceptProperty_5723_1(context, node));
    editorCell.addEditorCell(this.createRefNode_5723_1(context, node));
    editorCell.addEditorCell(this.createComponent_5723_0(context, node));
    editorCell.addEditorCell(this.createComponent_5723_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5723_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_5723_2(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_5723_3(context, node));
    editorCell.addEditorCell(this.createComponent_5723_4(context, node));
    editorCell.addEditorCell(this.createCollection_5723_3(context, node));
    editorCell.addEditorCell(this.createCollection_5723_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5723_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5723_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_5723_0(context, node, "filemode"));
    editorCell.addEditorCell(this.createProperty_5723_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_5723_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_5723_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_5723_1(context, node, "dirmode"));
    editorCell.addEditorCell(this.createProperty_5723_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_5723_0(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent5723_0 == null) {
      this.myIncludeExcludeEditorComponent5723_0 = new IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent5723_0.createEditorCell(context);
    setupBasic_Component_5723_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5723_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5723_0 == null) {
      this.myConfigurationReferencesEditorComponent5723_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5723_0.createEditorCell(context);
    setupBasic_Component_5723_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5723_2(EditorContext context, SNode node) {
    if (this.myCompositecomponentEntriesEditorComponent5723_0 == null) {
      this.myCompositecomponentEntriesEditorComponent5723_0 = new CompositecomponentEntriesEditorComponent(node);
    }
    EditorCell editorCell = this.myCompositecomponentEntriesEditorComponent5723_0.createEditorCell(context);
    setupBasic_Component_5723_2(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5723_3(EditorContext context, SNode node) {
    if (this.myIncludeExcludeInInspector5723_0 == null) {
      this.myIncludeExcludeInInspector5723_0 = new IncludeExcludeInInspector(node);
    }
    EditorCell editorCell = this.myIncludeExcludeInInspector5723_0.createEditorCell(context);
    setupBasic_Component_5723_3(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_5723_4(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent5723_1 == null) {
      this.myConfigurationReferencesEditorComponent5723_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent5723_1.createEditorCell(context);
    setupBasic_Component_5723_4(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_5723_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5723_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_5723_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_5723_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_5723_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_5723_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_5723_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_5723_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_5723_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_5723_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_5723_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    EditorCell cellWithRole = this.createRefNode_5723_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_5723_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_5723_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_5723_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("filemode");
    provider.setNoTargetText("<no filemode>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_5723_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_5723_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_5723_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_5723_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("dirmode");
    provider.setNoTargetText("<no dirmode>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_5723_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5723_0");
  }

  private static void setupBasic_Collection_5723_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5723_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_ConceptProperty_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(1.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Component_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_5723_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_5723_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_5723_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5723_2");
  }

  private static void setupBasic_Component_5723_3(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_5723_4(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_5723_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5723_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5723_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_5723_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_filemode");
  }

  private static void setupBasic_Collection_5723_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_5723_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_5723_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_5723_1");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_5723_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_dirmode");
  }

}
