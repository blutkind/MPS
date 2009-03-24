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
import jetbrains.mps.build.packaging.editor.PackagingStyles_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class File_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3696_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent3696_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3696_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_3696_1(context, node);
  }

  public EditorCell createCollection_3696_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3696_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty_3696_1(context, node));
    editorCell.addEditorCell(this.createRefNode_3696_1(context, node));
    editorCell.addEditorCell(this.createConstant_3696_0(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode_3696_3(context, node));
    editorCell.addEditorCell(this.createComponent_3696_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3696_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3696_1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createComponent_3696_1(context, node));
    return editorCell;
  }

  public EditorCell createComponent_3696_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3696_0 == null) {
      this.myConfigurationReferencesEditorComponent3696_0 = new jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3696_0.createEditorCell(context);
    setupBasic_Component_3696_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_3696_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent3696_1 == null) {
      this.myConfigurationReferencesEditorComponent3696_1 = new jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent3696_1.createEditorCell(context);
    setupBasic_Component_3696_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_3696_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3696_0(editorCell, node, context);
    setupLabel_Constant_3696_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_3696_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_3696_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_ConceptProperty_3696_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_3696_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty_3696_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3696_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3696_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_3696_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3696_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_3696_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3696_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3696_1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_RefNode_3696_1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3696_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode_3696_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3696_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3696_0");
  }

  private static void setupBasic_Constant_3696_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3696_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
        }
      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_ConceptProperty_3696_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_Component_3696_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_3696_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3696_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3696_1");
  }

  private static void setupBasic_Component_3696_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_3696_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_3696_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConceptProperty_3696_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_3696_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_RefNode_3696_1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
