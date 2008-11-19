package jetbrains.mps.baseLanguage.dates.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class DateTimeOffsetFormatToken_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1174321305126;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1174321300763(context, node);
  }

  public EditorCell createCollection1174321300763(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11743213007631174321300763(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1174321300764(context, node, "{"));
    editorCell.addEditorCell(this.createRefNodeList1174321305126(context, node));
    editorCell.addEditorCell(this.createConstant1174321320004(context, node, "}"));
    editorCell.addEditorCell(this.createConstant1174321326506(context, node, "ago"));
    return editorCell;
  }

  public EditorCell createConstant1174321300764(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11743213007641174321300764(editorCell, node, context);
    setupLabel_Constant_1174321300764_1174321300764(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1174321320004(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11743213200041174321320004(editorCell, node, context);
    setupLabel_Constant_1174321320004_1174321320004(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1174321326506(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11743213265061174321326506(editorCell, node, context);
    setupLabel_Constant_1174321326506_1174321326506(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1174321305126(EditorContext context, SNode node) {
    if (this.myListHandler_1174321305126 == null) {
      this.myListHandler_1174321305126 = new DateTimeOffsetFormatToken_Editor.durationTypeReferenceListHandler_4936_0(node, "durationTypeReference", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1174321305126.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_durationTypeReference1174321305126(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1174321305126.getElementRole());
    return editorCell;
  }


  private static void setupBasic_Collection_11743213007631174321300763(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1174321300763");
  }

  private static void setupBasic_Constant_11743213007641174321300764(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1174321300764");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNodeList_durationTypeReference1174321305126(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_durationTypeReference");
  }

  private static void setupBasic_Constant_11743213200041174321320004(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1174321320004");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11743213265061174321326506(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1174321326506");
    Dates_StyleSheet.getDateCompactKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1., Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupLabel_Constant_1174321300764_1174321300764(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_durationTypeReference_1174321305126(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1174321320004_1174321320004(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1174321326506_1174321326506(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class durationTypeReferenceListHandler_4936_0 extends RefNodeListHandler {

    public durationTypeReferenceListHandler_4936_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1174321316064(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, " "));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), " ");
        editorCell.setSelectable(false);
        return editorCell;
      }
    }

    public EditorCell createConstant1174321316064(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11743213160641174321316064(editorCell, node, context);
      setupLabel_Constant_1174321316064_1174321316064(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11743213160641174321316064(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1174321316064");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1174321316064_1174321316064(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
