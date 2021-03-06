package jetbrains.mps.ui.modeling.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.lang.core.behavior.BaseConcept_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class UIPropertySetter_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_e0jlwi_a(editorContext, node);
  }

  private EditorCell createCollection_e0jlwi_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_e0jlwi_a");
    editorCell.addEditorCell(this.createCollection_e0jlwi_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_e0jlwi_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_e0jlwi_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_e0jlwi_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_e0jlwi_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_e0jlwi_a0a(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_e0jlwi_b0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e0jlwi_c0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e0jlwi_d0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e0jlwi_e0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e0jlwi_f0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_e0jlwi_g0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_e0jlwi_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_e0jlwi_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createIndentCell_e0jlwi_a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_e0jlwi_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_e0jlwi_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_e0jlwi_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_e0jlwi_a2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_e0jlwi_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "value");
    editorCell.setCellId("Constant_e0jlwi_c0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_d0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_e0jlwi_d0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_e0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "->");
    editorCell.setCellId("Constant_e0jlwi_e0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_f0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "void");
    editorCell.setCellId("Constant_e0jlwi_f0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_g0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_e0jlwi_g0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_e0jlwi_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_e0jlwi_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_e0jlwi_b0a(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return BaseConcept_Behavior.call_getPresentation_1213877396640(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getAncestor(node, "jetbrains.mps.ui.modeling.structure.UIPropertyAccessCode", false, false), "property", false), "dataType", true));
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_e0jlwi_b0a");
    return editorCell;
  }

  private EditorCell createIndentCell_e0jlwi_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(editorContext, node);
    return result;
  }

  private EditorCell createRefNode_e0jlwi_b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
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
