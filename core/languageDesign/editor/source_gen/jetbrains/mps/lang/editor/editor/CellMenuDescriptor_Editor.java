package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;

public class CellMenuDescriptor_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1820_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1820_0(context, node);
  }

  public EditorCell createCollection_1820_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1820_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_1820_0(context, node, "menu parts:"));
    editorCell.addEditorCell(this.createRefNodeList_1820_0(context, node));
    return editorCell;
  }

  public EditorCell createConstant_1820_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1820_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_1820_0(EditorContext context, SNode node) {
    if (this.myListHandler_1820_0 == null) {
      this.myListHandler_1820_0 = new CellMenuDescriptor_Editor.cellMenuPartListHandler_1820_0(node, "cellMenuPart", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1820_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_1820_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_1820_0.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_1820_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1820_0");
  }

  private static void setupBasic_Constant_1820_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1820_0");
  }

  private static void setupBasic_RefNodeList_1820_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_cellMenuPart");
  }

  public static class cellMenuPartListHandler_1820_0 extends RefNodeListHandler {

    public cellMenuPartListHandler_1820_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant_1820_1(context, node, "<choose menu part>");
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

    public EditorCell createConstant_1820_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_1820_1(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_1820_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1820_1");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.FONT_STYLE, MPSFonts.ITALIC);
        style.set(StyleAttributes.EDITABLE, true);
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.darkGray);
      }
    }

}

}
