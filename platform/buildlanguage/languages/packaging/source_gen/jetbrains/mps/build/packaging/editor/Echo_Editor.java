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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class Echo_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3881_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3881_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1205331467671(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createComponent1205331923100(context, node);
  }

  public EditorCell createCollection1205331467671(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12053314676711205331467671(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1205332796526(context, node));
    editorCell.addEditorCell(this.createRefNode1205341761449(context, node));
    editorCell.addEditorCell(this.createConstant1205331546803(context, node, ">"));
    editorCell.addEditorCell(this.createRefNode1205344861008(context, node));
    editorCell.addEditorCell(this.createComponent1205331920317(context, node));
    return editorCell;
  }

  public EditorCell createComponent1205331920317(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3881_0 == null) {
      this.myConfigurationReferencesEditorComponent3881_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3881_0.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1205331920317(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1205331923100(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3881_1 == null) {
      this.myConfigurationReferencesEditorComponent3881_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3881_1.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1205331923100(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1205331546803(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12053315468031205331546803(editorCell, node, context);
    setupLabel_Constant_1205331546803_1205331546803(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty1205332796526_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1205332796526(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1205332796526((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1205332796526(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1205332796526_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1205341761449_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_message1205341761449(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_message_1205341761449((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1205341761449(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("message");
    provider.setNoTargetText("<no message>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1205341761449_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1205344861008_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_title1205344861008(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_title_1205344861008((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1205344861008(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1205344861008_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12053314676711205331467671(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1205331467671");
  }

  private static void setupBasic_Constant_12053315468031205331546803(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1205331546803");
    MPSLayoutStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1205331920317(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1205331923100(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_conceptProperty_alias1205332796526(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    MPSLayoutStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_message1205341761449(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_refNode_title1205344861008(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1205331546803_1205331546803(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1205332796526(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_message_1205341761449(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_title_1205344861008(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
