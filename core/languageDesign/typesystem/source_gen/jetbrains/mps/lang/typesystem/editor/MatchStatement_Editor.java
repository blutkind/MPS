package jetbrains.mps.lang.typesystem.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class MatchStatement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1177515385057;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1177514452383(context, node);
  }

  public EditorCell createCollection1177514452383(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11775144523831177514452383(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1177514752404(context, node));
    editorCell.addEditorCell(this.createCollection1177515195746(context, node));
    editorCell.addEditorCell(this.createCollection1177515332636(context, node));
    return editorCell;
  }

  public EditorCell createCollection1177514752404(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775147524041177514752404(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177514755928(context, node, "match"));
    editorCell.addEditorCell(this.createRefNode1177514769274(context, node));
    editorCell.addEditorCell(this.createConstant1177514772276(context, node, "with"));
    return editorCell;
  }

  public EditorCell createCollection1177515195746(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775151957461177515195746(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177515199263(context, node, "  "));
    editorCell.addEditorCell(this.createRefNodeList1177515385057(context, node));
    return editorCell;
  }

  public EditorCell createCollection1177515332636(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775153326361177515332636(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177515336930(context, node, "  "));
    editorCell.addEditorCell(this.createCollection1177515332637(context, node));
    return editorCell;
  }

  public EditorCell createCollection1177515332637(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_11775153326371177515332637(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1177515332638(context, node));
    editorCell.addEditorCell(this.createCollection1177515332642(context, node));
    editorCell.addEditorCell(this.createCollection1177515332645(context, node));
    return editorCell;
  }

  public EditorCell createCollection1177515332638(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775153326381177515332638(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177515332640(context, node, "default"));
    editorCell.addEditorCell(this.createConstant1177515332641(context, node, "->"));
    editorCell.addEditorCell(this.createConstant1215446257385(context, node, "{"));
    return editorCell;
  }

  public EditorCell createCollection1177515332642(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775153326421177515332642(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell5822_0(context, node));
    editorCell.addEditorCell(this.createRefNode1177515332644(context, node));
    return editorCell;
  }

  public EditorCell createCollection1177515332645(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11775153326451177515332645(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1177515332647(context, node, "}"));
    return editorCell;
  }

  public EditorCell createConstant1177514755928(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775147559281177514755928(editorCell, node, context);
    setupLabel_Constant_1177514755928_1177514755928(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177514772276(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775147722761177514772276(editorCell, node, context);
    setupLabel_Constant_1177514772276_1177514772276(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177515199263(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775151992631177515199263(editorCell, node, context);
    setupLabel_Constant_1177515199263_1177515199263(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177515332640(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775153326401177515332640(editorCell, node, context);
    setupLabel_Constant_1177515332640_1177515332640(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177515332641(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775153326411177515332641(editorCell, node, context);
    setupLabel_Constant_1177515332641_1177515332641(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177515332647(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775153326471177515332647(editorCell, node, context);
    setupLabel_Constant_1177515332647_1177515332647(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1177515336930(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11775153369301177515336930(editorCell, node, context);
    setupLabel_Constant_1177515336930_1177515336930(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1215446257385(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12154462573851215446257385(editorCell, node, context);
    setupLabel_Constant_1215446257385_1215446257385(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1177515385057(EditorContext context, SNode node) {
    if (this.myListHandler_1177515385057 == null) {
      this.myListHandler_1177515385057 = new MatchStatement_Editor.itemListHandler_5822_0(node, "item", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1177515385057.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_item1177515385057(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1177515385057.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell5822_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode1177514769274_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_expression1177514769274(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_expression_1177514769274((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1177514769274(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<no expression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1177514769274_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1177515332644_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_ifFalseStatement1177515332644(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_ifFalseStatement_1177515332644((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1177515332644(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("ifFalseStatement");
    provider.setNoTargetText("<no ifFalseStatement>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1177515332644_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11775144523831177514452383(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177514452383");
  }

  private static void setupBasic_Collection_11775147524041177514752404(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177514752404");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11775147559281177514755928(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177514755928");
    BaseLanguageStyle_StyleSheet.getCompactKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(1.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_expression1177514769274(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_11775147722761177514772276(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177514772276");
    BaseLanguageStyle_StyleSheet.getCompactKeyWord(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11775151957461177515195746(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515195746");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11775151992631177515199263(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177515199263");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11775153326361177515332636(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515332636");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11775153326371177515332637(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515332637");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11775153326381177515332638(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515332638");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11775153326401177515332640(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177515332640");
    BaseLanguageStyle_StyleSheet.getCompactKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11775153326411177515332641(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177515332641");
  }

  private static void setupBasic_Collection_11775153326421177515332642(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515332642");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_ifFalseStatement1177515332644(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_11775153326451177515332645(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1177515332645");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11775153326471177515332647(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177515332647");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11775153369301177515336930(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1177515336930");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_item1177515385057(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_item");
  }

  private static void setupBasic_Constant_12154462573851215446257385(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1215446257385");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Indent_12154465360151215446536015(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1215446536015");
  }

  private static void setupLabel_Constant_1177514755928_1177514755928(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_expression_1177514769274(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177514772276_1177514772276(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177515199263_1177515199263(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177515332640_1177515332640(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177515332641_1177515332641(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_ifFalseStatement_1177515332644(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177515332647_1177515332647(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1177515336930_1177515336930(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_item_1177515385057(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1215446257385_1215446257385(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class itemListHandler_5822_0 extends RefNodeListHandler {

    public itemListHandler_5822_0(SNode ownerNode, String childRole, EditorContext context) {
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
