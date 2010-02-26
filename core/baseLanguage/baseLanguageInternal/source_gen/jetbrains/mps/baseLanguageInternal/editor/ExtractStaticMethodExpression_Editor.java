package jetbrains.mps.baseLanguageInternal.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class ExtractStaticMethodExpression_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_7rx7ya_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_7rx7ya_a_0(editorContext, node);
  }

  private EditorCell createCollection_7rx7ya_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_7rx7ya_a");
    editorCell.addEditorCell(this.createConstant_7rx7ya_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_7rx7ya_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_7rx7ya_c0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_7rx7ya_d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_7rx7ya_e0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_7rx7ya_f0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7rx7ya_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_7rx7ya_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BRACKETS, true);
      style.set(StyleAttributes.BRACKETS_COLOR, MPSColors.lightGray);
    }
    editorCell.addEditorCell(this.createRefNode_7rx7ya_a2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7rx7ya_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_7rx7ya_a_0");
    editorCell.addEditorCell(this.createCollection_7rx7ya_a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_7rx7ya_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_7rx7ya_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_7rx7ya_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_7rx7ya_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_7rx7ya_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=>");
    editorCell.setCellId("Constant_7rx7ya_d0");
    StyleSheet_StyleSheet.getInternalName(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1, Measure.SPACES));
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7rx7ya_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_7rx7ya_b0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7rx7ya_f0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_7rx7ya_f0");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7rx7ya_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "extract");
    editorCell.setCellId("Constant_7rx7ya_a0");
    StyleSheet_StyleSheet.getInternalName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_7rx7ya_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "make unique");
    editorCell.setCellId("Constant_7rx7ya_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_7rx7ya_a2a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("method");
    provider.setNoTargetText("<no method>");
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

  private EditorCell createRefNode_7rx7ya_e0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("inner");
    provider.setNoTargetText("<no inner>");
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

  private EditorCell createProperty_7rx7ya_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("makeUnique");
    provider.setNoTargetText("<no makeUnique>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_makeUnique");
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
