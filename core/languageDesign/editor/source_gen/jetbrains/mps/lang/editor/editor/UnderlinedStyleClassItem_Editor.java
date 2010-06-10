package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class UnderlinedStyleClassItem_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_4fi5xp_a(editorContext, node);
  }

  private EditorCell createCollection_4fi5xp_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_4fi5xp_a");
    editorCell.addEditorCell(this.createConceptProperty_4fi5xp_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_4fi5xp_b0(editorContext, node));
    if (renderingCondition_4fi5xp_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_4fi5xp_c0(editorContext, node));
    }
    if (renderingCondition_4fi5xp_a3a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode_4fi5xp_d0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createConstant_4fi5xp_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_4fi5xp_b0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createProperty_4fi5xp_c0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("underlined");
    provider.setNoTargetText("<no underlined>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_underlined");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new UnderlinedStyleClassItem_Editor.UnderlinedStyleClassItem_underlined_cellMenu_a0c0(), new UnderlinedStyleClassItem_Editor.UnderlinedStyleClassItem_generic_cellMenu_b0c0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_4fi5xp_d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_RECURSIVELY);
    }
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

  private EditorCell createConceptProperty_4fi5xp_a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_alias");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new UnderlinedStyleClassItem_Editor.UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu_a0a0()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_4fi5xp_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) == null;
  }

  private static boolean renderingCondition_4fi5xp_a3a(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "query", true) != null);
  }

  public static class UnderlinedStyleClassItem_underlined_cellMenu_a0c0 extends AbstractCellMenuPart_PropertyValues {
    public UnderlinedStyleClassItem_underlined_cellMenu_a0c0() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<String>(), "0", "1", "2");
    }
  }

  public static class UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu_a0a0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {
    public UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu_a0a0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.editor.structure.StyleClassItem";
    }
  }

  public static class UnderlinedStyleClassItem_generic_cellMenu_b0c0 extends AbstractCellMenuPart_Generic_Item {
    public UnderlinedStyleClassItem_generic_cellMenu_b0c0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.setNewChild(node, "query", "jetbrains.mps.lang.editor.structure.QueryFunction_Underlined");
    }

    public String getMatchingText() {
      return "query";
    }
  }
}
