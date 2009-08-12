package jetbrains.mps.samples.formulaLanguage.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class PlusOperation_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0751_0(context, node);
  }

  public EditorCell createCollection_0751_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0751_0(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_0751_1(context, node));
    editorCell.addEditorCell(this.createConstant_0751_0(context, node, "+"));
    editorCell.addEditorCell(this.createRefNode_0751_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_0751_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0751_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new PlusOperation_Editor.PlusOperation_Editor_replaceWith_Operation_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createRefNode_0751_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0751_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0751_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("leftOperand");
    provider.setNoTargetText("<no leftOperand>");
    EditorCell cellWithRole = this.createRefNode_0751_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0751_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0751_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0751_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("rightOperand");
    provider.setNoTargetText("<no rightOperand>");
    EditorCell cellWithRole = this.createRefNode_0751_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0751_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0751_0");
  }

  private static void setupBasic_RefNode_0751_0(EditorCell editorCell, SNode node, EditorContext context) {
    Operation_leftOperand_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_0751_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0751_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, true);
    }
    Operation_symbol_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_RefNode_0751_1(EditorCell editorCell, SNode node, EditorContext context) {
    Operation_rightOperand_Actions.setCellActions(editorCell, node, context);
  }

  public static class PlusOperation_Editor_replaceWith_Operation_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public PlusOperation_Editor_replaceWith_Operation_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.samples.formulaLanguage.structure.Operation";
    }

}

}
