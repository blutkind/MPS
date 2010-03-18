package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.baseLanguage.editor.ConceptFunction_Component;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class ExecuteParameterQuery_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_qazu5o_a(editorContext, node);
  }

  private EditorCell createCollection_qazu5o_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_qazu5o_a");
    editorCell.addEditorCell(this.createCollection_qazu5o_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_qazu5o_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_qazu5o_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_qazu5o_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_qazu5o_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_qazu5o_a0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_qazu5o_b0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_qazu5o_c0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_qazu5o_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_qazu5o_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell_qazu5o_a2a(editorContext, node));
    editorCell.addEditorCell(this.createComponent_qazu5o_b2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_qazu5o_b2a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new ConceptFunction_Component(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_qazu5o_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "execute parameter type");
    editorCell.setCellId("Constant_qazu5o_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_qazu5o_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_qazu5o_b0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_qazu5o_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "parameter query:");
    editorCell.setCellId("Constant_qazu5o_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createIndentCell_qazu5o_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefNode_qazu5o_c0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("parameterType");
    provider.setNoTargetText("<no parameterType>");
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
}
