package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class InlineSwitch_RuleConsequence_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_4569_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4569_0(context, node);
  }

  public EditorCell createCollection_4569_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_4569_0(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNodeList_4569_0(context, node));
    editorCell.addEditorCell(this.createConstant_4569_0(context, node, "default:"));
    editorCell.addEditorCell(this.createCollection_4569_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_4569_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_4569_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_4569_1(context, node, "  "));
    editorCell.addEditorCell(this.createRefNode_4569_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_4569_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4569_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4569_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4569_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_4569_0(EditorContext context, SNode node) {
    if (this.myListHandler_4569_0 == null) {
      this.myListHandler_4569_0 = new InlineSwitch_RuleConsequence_Editor.caseListHandler_4569_0(node, "case", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_4569_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_4569_0(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setRole(this.myListHandler_4569_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNode_4569_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_4569_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_4569_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("defaultConsequence");
    provider.setNoTargetText("<no defaultConsequence>");
    EditorCell cellWithRole = this.createRefNode_4569_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_4569_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4569_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BRACKETS, true);
      style.set(StyleAttributes.BRACKETS_COLOR, MPSColors.gray);
    }
  }

  private static void setupBasic_Collection_4569_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4569_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_4569_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNodeList_4569_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_case");
  }

  private static void setupBasic_Constant_4569_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4569_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
  }

  private static void setupBasic_Constant_4569_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4569_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  public static class caseListHandler_4569_0 extends RefNodeListHandler {

    public caseListHandler_4569_0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext context) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, context, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext context, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(context, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, context);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext context) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(context);
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

}

}
