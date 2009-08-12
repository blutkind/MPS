package jetbrains.mps.lang.smodel.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.lang.sharedConcepts.editor.SharedStyles_StyleSheet;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;

public class Node_GetReferentSearchScopeOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myReplaceableAlias_Comp3341_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3341_0(context, node);
  }

  public EditorCell createCollection_3341_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_3341_0(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_3341_0(context, node));
    editorCell.addEditorCell(this.createConstant_3341_0(context, node, "("));
    editorCell.addEditorCell(this.createRefCell_3341_1(context, node));
    editorCell.addEditorCell(this.createConstant_3341_2(context, node, ","));
    editorCell.addEditorCell(this.createRefNode_3341_1(context, node));
    editorCell.addEditorCell(this.createConstant_3341_1(context, node, ")"));
    return editorCell;
  }

  public EditorCell createComponent_3341_0(EditorContext context, SNode node) {
    if (this.myReplaceableAlias_Comp3341_0 == null) {
      this.myReplaceableAlias_Comp3341_0 = new ReplaceableAlias_Comp(node);
    }
    EditorCell editorCell = this.myReplaceableAlias_Comp3341_0.createEditorCell(context);
    setupBasic_Component_3341_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_3341_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3341_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3341_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3341_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3341_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3341_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_3341_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new Node_GetReferentSearchScopeOperation_Editor._Inline3341_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_3341_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_3341_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("referenceLink");
    provider.setNoTargetText("<no reference role>");
    EditorCell cellWithRole = this.createRefCell_3341_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3341_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3341_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3341_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("operationContext");
    provider.setNoTargetText("<no operationContext>");
    EditorCell cellWithRole = this.createRefNode_3341_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3341_0");
  }

  private static void setupBasic_Component_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3341_0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_3341_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3341_1");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefCell_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
    SharedStyles_StyleSheet.getReferenceOnConceptualFeature(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_3341_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3341_2");
  }

  private static void setupBasic_RefNode_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static class _Inline3341_0 extends AbstractCellProvider {

    public _Inline3341_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_3341_1(context, node);
    }

    public EditorCell createProperty_3341_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_3341_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_3341_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("role");
      provider.setNoTargetText("<no role>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_3341_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_3341_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_role");
    }

}

}
