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

public class File_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3696_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3696_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1203598619601(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection1209539878943(context, node);
  }

  public EditorCell createCollection1203598619601(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12035986196011203598619601(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1203599074970(context, node));
    editorCell.addEditorCell(this.createRefNode1205344590206(context, node));
    editorCell.addEditorCell(this.createConstant1203598633261(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode1220982003265(context, node));
    editorCell.addEditorCell(this.createComponent1204128152423(context, node));
    return editorCell;
  }

  public EditorCell createCollection1209539878943(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12095398789431209539878943(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent1209539879976(context, node));
    return editorCell;
  }

  public EditorCell createComponent1204128152423(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3696_0 == null) {
      this.myConfigurationReferencesEditorComponent3696_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3696_0.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1204128152423(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent1209539879976(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3696_1 == null) {
      this.myConfigurationReferencesEditorComponent3696_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3696_1.createEditorCell(context);
    setupBasic_component_ConfigurationReferencesEditorComponent1209539879976(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant1203598633261(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12035986332611203598633261(editorCell, node, context);
    setupLabel_Constant_1203598633261_1203598633261(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty1203599074970_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1203599074970(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1203599074970((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1203599074970(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1203599074970_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1205344590206_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_title1205344590206(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_title_1205344590206((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1205344590206(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1205344590206_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1220982003265_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_sourcePath1220982003265(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_sourcePath_1220982003265((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1220982003265(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1220982003265_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12035986196011203598619601(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1203598619601");
  }

  private static void setupBasic_Constant_12035986332611203598633261(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1203598633261");
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

  private static void setupBasic_conceptProperty_alias1203599074970(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    MPSLayoutStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1204128152423(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_refNode_title1205344590206(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12095398789431209539878943(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1209539878943");
  }

  private static void setupBasic_component_ConfigurationReferencesEditorComponent1209539879976(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("component_ConfigurationReferencesEditorComponent");
  }

  private static void setupBasic_refNode_sourcePath1220982003265(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1203598633261_1203598633261(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1203599074970(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_title_1205344590206(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_sourcePath_1220982003265(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
