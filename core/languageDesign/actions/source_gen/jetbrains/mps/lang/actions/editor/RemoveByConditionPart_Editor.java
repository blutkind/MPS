package jetbrains.mps.lang.actions.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;

public class RemoveByConditionPart_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_6871_0(context, node);
  }

  public EditorCell createCollection_6871_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_6871_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_6871_1(context, node));
    editorCell.addEditorCell(this.createCollection_6871_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_6871_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6871_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_6871_0(context, node, "remove by condition"));
    return editorCell;
  }

  public EditorCell createCollection_6871_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_6871_2(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell6871_0(context, node));
    editorCell.addEditorCell(this.createRefNode_6871_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_6871_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_6871_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell6871_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode_6871_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_6871_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_6871_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("condition");
    provider.setNoTargetText("<no condition>");
    EditorCell cellWithRole = this.createRefNode_6871_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_6871_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6871_0");
  }

  private static void setupBasic_Collection_6871_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6871_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_6871_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_6871_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Collection_6871_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_6871_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_6871_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Indent_6871_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_6871_0");
  }

}
