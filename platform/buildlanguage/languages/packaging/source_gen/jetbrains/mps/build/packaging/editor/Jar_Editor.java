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
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.build.packaging.editor.PackagingStyles_StyleSheet;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class Jar_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1697_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1697_1;
  /* package */AbstractCellProvider myIncludeExcludeInInspector1697_0;
  /* package */AbstractCellProvider myIncludeExcludeEditorComponent1697_0;
  /* package */AbstractCellProvider myCompositecomponentEntriesEditorComponent1697_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1697_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1697_2(context, node);
  }

  public EditorCell createCollection_1697_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1697_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection_1697_1(context, node));
    editorCell.addEditorCell(this.createComponent_1697_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1697_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1697_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty_1697_1(context, node));
    editorCell.addEditorCell(this.createRefNode_1697_1(context, node));
    editorCell.addEditorCell(this.createComponent_1697_3(context, node));
    editorCell.addEditorCell(this.createComponent_1697_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1697_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1697_2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_1697_2(context, node));
    editorCell.addEditorCell(this.createComponent_1697_0(context, node));
    editorCell.addEditorCell(this.createCollection_1697_3(context, node));
    editorCell.addEditorCell(this.createCollection_1697_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1697_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1697_3(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1697_0(context, node, "filemode"));
    editorCell.addEditorCell(this.createProperty_1697_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1697_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1697_4(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant_1697_1(context, node, "dirmode"));
    editorCell.addEditorCell(this.createProperty_1697_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_1697_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1697_0 == null) {
      this.myConfigurationReferencesEditorComponent1697_0 = new jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1697_0.createEditorCell(context);
    setupBasic_Component_1697_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_1697_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1697_1 == null) {
      this.myConfigurationReferencesEditorComponent1697_1 = new jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1697_1.createEditorCell(context);
    setupBasic_Component_1697_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_1697_2(EditorContext context, SNode node) {
    if (this.myIncludeExcludeInInspector1697_0 == null) {
      this.myIncludeExcludeInInspector1697_0 = new jetbrains.mps.build.packaging.editor.IncludeExcludeInInspector(node);
    }
    EditorCell editorCell = this.myIncludeExcludeInInspector1697_0.createEditorCell(context);
    setupBasic_Component_1697_2(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_1697_3(EditorContext context, SNode node) {
    if (this.myIncludeExcludeEditorComponent1697_0 == null) {
      this.myIncludeExcludeEditorComponent1697_0 = new jetbrains.mps.build.packaging.editor.IncludeExcludeEditorComponent(node);
    }
    EditorCell editorCell = this.myIncludeExcludeEditorComponent1697_0.createEditorCell(context);
    setupBasic_Component_1697_3(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_1697_4(EditorContext context, SNode node) {
    if (this.myCompositecomponentEntriesEditorComponent1697_0 == null) {
      this.myCompositecomponentEntriesEditorComponent1697_0 = new jetbrains.mps.build.packaging.editor.CompositecomponentEntriesEditorComponent(node);
    }
    EditorCell editorCell = this.myCompositecomponentEntriesEditorComponent1697_0.createEditorCell(context);
    setupBasic_Component_1697_4(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_1697_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1697_0(editorCell, node, context);
    setupLabel_Constant_1697_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1697_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1697_1(editorCell, node, context);
    setupLabel_Constant_1697_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_1697_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_1697_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_1697_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_1697_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_1697_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1697_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1697_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_1697_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1697_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_1697_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_1697_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_1697_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_1697_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1697_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("filemode");
    provider.setNoTargetText("<no filemode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_1697_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_1697_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_1697_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_Property_1697_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_1697_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("dirmode");
    provider.setNoTargetText("<no dirmode>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_1697_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1697_0");
  }

  private static void setupBasic_Collection_1697_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1697_1");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConceptProperty_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_1697_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1697_2");
  }

  private static void setupBasic_Component_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_1697_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(1.0, Measure.SPACES));
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Component_1697_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_1697_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1697_3");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1697_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_1697_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_filemode");
  }

  private static void setupBasic_Collection_1697_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1697_4");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_1697_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1697_1");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_1697_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_dirmode");
  }

  private static void setupBasic_Component_1697_3(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_1697_4(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptProperty_1697_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_1697_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1697_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_1697_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1697_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Property_1697_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
