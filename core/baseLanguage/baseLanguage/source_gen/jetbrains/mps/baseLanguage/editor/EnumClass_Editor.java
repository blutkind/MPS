package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
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

public class EnumClass_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_3195_0;
  /* package */AbstractCellListHandler myListHandler_3195_1;
  /* package */AbstractCellListHandler myListHandler_3195_2;
  /* package */AbstractCellListHandler myListHandler_3195_3;
  /* package */AbstractCellListHandler myListHandler_3195_4;
  /* package */AbstractCellListHandler myListHandler_3195_5;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3195_0(context, node);
  }

  public EditorCell createCollection_3195_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_3195_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3195_1(context, node, "enum"));
    editorCell.addEditorCell(this.createProperty_3195_1(context, node));
    editorCell.addEditorCell(this.createConstant_3195_12(context, node, "implements"));
    editorCell.addEditorCell(this.createRefNodeList_3195_5(context, node));
    editorCell.addEditorCell(this.createConstant_3195_2(context, node, "{"));
    editorCell.addEditorCell(this.createRefNodeList_3195_1(context, node));
    editorCell.addEditorCell(this.createConstant_3195_8(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList_3195_0(context, node));
    editorCell.addEditorCell(this.createConstant_3195_9(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList_3195_2(context, node));
    editorCell.addEditorCell(this.createConstant_3195_10(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList_3195_3(context, node));
    editorCell.addEditorCell(this.createConstant_3195_11(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList_3195_4(context, node));
    editorCell.addEditorCell(this.createConstant_3195_4(context, node, "}"));
    return editorCell;
  }

  public EditorCell createConstant_3195_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3195_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3195_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_0(EditorContext context, SNode node) {
    if (this.myListHandler_3195_0 == null) {
      this.myListHandler_3195_0 = new EnumClass_Editor.fieldListHandler_3195_0(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_0.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_1(EditorContext context, SNode node) {
    if (this.myListHandler_3195_1 == null) {
      this.myListHandler_3195_1 = new EnumClass_Editor.enumConstantListHandler_3195_0(node, "enumConstant", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_1.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_1(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_1.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_2(EditorContext context, SNode node) {
    if (this.myListHandler_3195_2 == null) {
      this.myListHandler_3195_2 = new EnumClass_Editor.constructorListHandler_3195_0(node, "constructor", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_2.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_2(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_2.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_3(EditorContext context, SNode node) {
    if (this.myListHandler_3195_3 == null) {
      this.myListHandler_3195_3 = new EnumClass_Editor.methodListHandler_3195_0(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_3.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_3(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_3.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_4(EditorContext context, SNode node) {
    if (this.myListHandler_3195_4 == null) {
      this.myListHandler_3195_4 = new EnumClass_Editor.staticMethodListHandler_3195_0(node, "staticMethod", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_4.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_4(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_4.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3195_5(EditorContext context, SNode node) {
    if (this.myListHandler_3195_5 == null) {
      this.myListHandler_3195_5 = new EnumClass_Editor.implementedInterfaceListHandler_3195_0(node, "implementedInterface", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3195_5.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_3195_5(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3195_5.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty_3195_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3195_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3195_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_3195_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_RefNodeList_3195_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_field");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Collection_3195_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3195_0");
  }

  private static void setupBasic_Constant_3195_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_1");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Property_3195_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
  }

  private static void setupBasic_Constant_3195_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_2");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_3195_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_enumConstant");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_CHILDREN_NEWLINE, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_4");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_3195_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_constructor");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_3195_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_method");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_3195_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_staticMethod");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_3195_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3195_12");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_RefNodeList_3195_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_implementedInterface");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, false);
    }
  }

  public static class fieldListHandler_3195_0 extends RefNodeListHandler {

    public fieldListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_0(context, node, "<< fields >>");
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

    public EditorCell createConstant_3195_0(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_0(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_0");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
      }
    }

}
  public static class enumConstantListHandler_3195_0 extends RefNodeListHandler {

    public enumConstantListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_3(context, node, "<< enum constants >>");
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

    public EditorCell createConstant_3195_3(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_3(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_3(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_3");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
      }
    }

}
  public static class constructorListHandler_3195_0 extends RefNodeListHandler {

    public constructorListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_5(context, node, "<< constructors >>");
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

    public EditorCell createConstant_3195_5(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_5(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_5(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_5");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
      }
    }

}
  public static class methodListHandler_3195_0 extends RefNodeListHandler {

    public methodListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_6(context, node, "<< methods >>");
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

    public EditorCell createConstant_3195_6(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_6(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_6(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_6");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
      }
    }

}
  public static class staticMethodListHandler_3195_0 extends RefNodeListHandler {

    public staticMethodListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_7(context, node, "<< static methods >>");
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

    public EditorCell createConstant_3195_7(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_7(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_7(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_7");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
      }
    }

}
  public static class implementedInterfaceListHandler_3195_0 extends RefNodeListHandler {

    public implementedInterfaceListHandler_3195_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3195_13(context, node, "");
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

    public EditorCell createConstant_3195_13(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3195_13(editorCell, node, context);
      editorCell.setDefaultText("<none>");
      return editorCell;
    }


    private static void setupBasic_Constant_3195_13(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3195_13");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.EDITABLE, true);
      }
    }

}

}
