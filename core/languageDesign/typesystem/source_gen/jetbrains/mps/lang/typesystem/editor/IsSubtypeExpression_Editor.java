package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class IsSubtypeExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1964_0(context, node);
  }

  public EditorCell createCollection_1964_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1964_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_1964_0(context, node, "isSubtype"));
    editorCell.addEditorCell(this.createConstant_1964_3(context, node, "("));
    editorCell.addEditorCell(this.createRefNode_1964_1(context, node));
    editorCell.addEditorCell(this.createConstant_1964_1(context, node, ":<"));
    editorCell.addEditorCell(this.createRefNode_1964_3(context, node));
    editorCell.addEditorCell(this.createConstant_1964_2(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant_1964_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1964_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new IsSubtypeExpression_Editor.IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_1964_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1964_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1964_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1964_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1964_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1964_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_1964_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1964_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1964_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("subtypeExpression");
    provider.setNoTargetText("<no subtypeExpression>");
    EditorCell cellWithRole = this.createRefNode_1964_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1964_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1964_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1964_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("supertypeExpression");
    provider.setNoTargetText("<no supertypeExpression>");
    EditorCell cellWithRole = this.createRefNode_1964_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1964_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1964_0");
  }

  private static void setupBasic_Constant_1964_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1964_0");
  }

  private static void setupBasic_RefNode_1964_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_1964_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1964_1");
  }

  private static void setupBasic_RefNode_1964_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_1964_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1964_2");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_1964_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1964_3");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
  }

  public static class IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public IsSubtypeExpression_Editor_replaceWith_IsSubtypeExpression_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.typesystem.structure.IsSubtypeExpression";
    }

}

}
