package jetbrains.mps.build.custommps.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.build.packaging.editor.IncludeExcludeEditorComponent;
import jetbrains.mps.build.packaging.editor.ConfigurationReferencesEditorComponent;
import jetbrains.mps.build.packaging.editor.CompositecomponentEntriesEditorComponent;
import jetbrains.mps.build.packaging.editor.IncludeExcludeInInspector;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.build.packaging.editor.PackagingStyles_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;

public class LibraryFolder_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6uq7kh_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_6uq7kh_a_0(editorContext, node);
  }

  private EditorCell createCollection_6uq7kh_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6uq7kh_a");
    editorCell.addEditorCell(this.createCollection_6uq7kh_a0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_6uq7kh_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6uq7kh_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_6uq7kh_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConceptProperty_6uq7kh_a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6uq7kh_b0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6uq7kh_c0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6uq7kh_d0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_6uq7kh_e0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_6uq7kh_f0a(editorContext, node));
    editorCell.addEditorCell(this.createComponent_6uq7kh_g0a(editorContext, node));
    editorCell.addEditorCell(this.createComponent_6uq7kh_h0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_6uq7kh_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_6uq7kh_a_0");
    editorCell.addEditorCell(this.createComponent_6uq7kh_a0(editorContext, node));
    editorCell.addEditorCell(this.createComponent_6uq7kh_b0_0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_6uq7kh_g0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new IncludeExcludeEditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6uq7kh_h0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConfigurationReferencesEditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6uq7kh_b0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new CompositecomponentEntriesEditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6uq7kh_a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new IncludeExcludeInInspector(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_6uq7kh_b0_0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConfigurationReferencesEditorComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_6uq7kh_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "in folder");
    editorCell.setCellId("Constant_6uq7kh_c0a");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_6uq7kh_e0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "from");
    editorCell.setCellId("Constant_6uq7kh_e0a");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_6uq7kh_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("libraryName");
    provider.setNoTargetText("<no libraryName>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_6uq7kh_d0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_6uq7kh_f0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createConceptProperty_6uq7kh_a0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }
}
