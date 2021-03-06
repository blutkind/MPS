package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.InlineCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class Dependency_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_l58ghc_a(editorContext, node);
  }

  private EditorCell createCollection_l58ghc_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_l58ghc_a");
    editorCell.addEditorCell(this.createCollection_l58ghc_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_l58ghc_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_l58ghc_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_l58ghc_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_l58ghc_a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_l58ghc_b0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_l58ghc_c0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_l58ghc_d0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_l58ghc_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_l58ghc_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_l58ghc_a1a(editorContext, node));
    editorCell.addEditorCell(this.createRefCell_l58ghc_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_l58ghc_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "target concept:");
    editorCell.setCellId("Constant_l58ghc_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_l58ghc_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, " find source:");
    editorCell.setCellId("Constant_l58ghc_c0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_l58ghc_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "source concept(optional):");
    editorCell.setCellId("Constant_l58ghc_a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefCell_l58ghc_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("targetConcept");
    provider.setNoTargetText("<no targetConcept>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new Dependency_Editor._Inline_l58ghc_a1a0());
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

  private EditorCell createRefCell_l58ghc_b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("sourceConcept");
    provider.setNoTargetText("<auto>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new Dependency_Editor._Inline_l58ghc_a1b0());
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

  private EditorCell createRefNode_l58ghc_d0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("findSourceBlock");
    provider.setNoTargetText("<no findSourceBlock>");
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

  public static class _Inline_l58ghc_a1a0 extends InlineCellProvider {
    public _Inline_l58ghc_a1a0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_l58ghc_a0b0a(editorContext, node);
    }

    private EditorCell createProperty_l58ghc_a0b0a(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name");
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

  public static class _Inline_l58ghc_a1b0 extends InlineCellProvider {
    public _Inline_l58ghc_a1b0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_l58ghc_a0b1a(editorContext, node);
    }

    private EditorCell createProperty_l58ghc_a0b1a(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
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
}
