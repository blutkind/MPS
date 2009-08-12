package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class UnderlinedStyleClassItem_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2890_0(context, node);
  }

  public EditorCell createCollection_2890_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setCellId("Collection_2890_0");
    editorCell.addEditorCell(this.createConceptProperty_2890_1(context, node));
    editorCell.addEditorCell(this.createConstant_2890_0(context, node, ":"));
    if (renderingCondition2890_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createProperty_2890_1(context, node));
    }
    if (renderingCondition2890_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefNode_2890_1(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant_2890_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    editorCell.setCellId("Constant_2890_0");
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty_2890_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("conceptProperty_alias");
    Styles_StyleSheet.getItem(editorCell).apply(editorCell);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new UnderlinedStyleClassItem_Editor.UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConceptProperty_2890_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_2890_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_2890_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setCellId("property_underlined");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new UnderlinedStyleClassItem_Editor.UnderlinedStyleClassItem_generic_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createProperty_2890_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("underlined");
    provider.setNoTargetText("<no underlined>");
    EditorCell cellWithRole = this.createProperty_2890_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_2890_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2890_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("query");
    provider.setNoTargetText("<no query>");
    EditorCell cellWithRole = this.createRefNode_2890_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  public static boolean renderingCondition2890_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "query", true) == null;
  }

  public static boolean renderingCondition2890_1(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "query", true) != null);
  }

  public static class UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public UnderlinedStyleClassItem_Editor_replaceWith_StyleClassItem_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.editor.structure.StyleClassItem";
    }

}
  public static class UnderlinedStyleClassItem_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Item {

    public UnderlinedStyleClassItem_generic_cellMenu0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.setNewChild(node, "query", "jetbrains.mps.lang.editor.structure.QueryFunction_Underlined");
    }

    public String getMatchingText() {
      return "query";
    }

}

}
