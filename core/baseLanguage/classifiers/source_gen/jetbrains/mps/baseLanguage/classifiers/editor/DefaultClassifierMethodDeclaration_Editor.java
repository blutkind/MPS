package jetbrains.mps.baseLanguage.classifiers.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.baseLanguage.editor._Component_Visibility;
import jetbrains.mps.baseLanguage.editor._GenericDeclaration_TypeVariables_Component;
import jetbrains.mps.baseLanguage.editor.BaseMethodDeclaration_NameCellComponent;
import jetbrains.mps.baseLanguage.editor._DeprecatedPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor._InstanceMethodDeclaration_AddAbstract;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.baseLanguage.editor._BaseMethodDeclaration_Actions;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;

public class DefaultClassifierMethodDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_Component_Visibility7205_0;
  /* package */AbstractCellProvider my_GenericDeclaration_TypeVariables_Component7205_0;
  /* package */AbstractCellProvider myBaseMethodDeclaration_NameCellComponent7205_0;
  /* package */AbstractCellProvider my_DeprecatedPart7205_0;
  /* package */AbstractCellListHandler myListHandler_7205_0;
  /* package */AbstractCellListHandler myListHandler_7205_1;
  /* package */AbstractCellListHandler myListHandler_7205_2;
  /* package */AbstractCellListHandler myListHandler_7205_3;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7205_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_7205_3(context, node);
  }

  public EditorCell createCollection_7205_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7205_0(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_7205_3(context, node));
    if (renderingCondition7205_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_7205_1(context, node));
    }
    editorCell.addEditorCell(this.createComponent_7205_0(context, node));
    if (renderingCondition7205_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_7205_1(context, node));
    }
    editorCell.addEditorCell(this.createRefNode_7205_1(context, node));
    editorCell.addEditorCell(this.createComponent_7205_2(context, node));
    editorCell.addEditorCell(this.createConstant_7205_0(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList_7205_1(context, node));
    editorCell.addEditorCell(this.createConstant_7205_2(context, node, ")"));
    if (renderingCondition7205_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_7205_2(context, node));
    }
    editorCell.addEditorCell(this.createConstant_7205_4(context, node, "{"));
    editorCell.addEditorCell(this.createRefNode_7205_3(context, node));
    editorCell.addEditorCell(this.createConstant_7205_5(context, node, "}"));
    return editorCell;
  }

  public EditorCell createCollection_7205_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7205_1(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNodeList_7205_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7205_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7205_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7205_3(context, node, "throws"));
    editorCell.addEditorCell(this.createRefNodeList_7205_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7205_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_7205_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7205_6(context, node, "annotations:"));
    editorCell.addEditorCell(this.createRefNodeList_7205_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_7205_0(EditorContext context, SNode node) {
    if (this.my_Component_Visibility7205_0 == null) {
      this.my_Component_Visibility7205_0 = new _Component_Visibility(node);
    }
    EditorCell editorCell = this.my_Component_Visibility7205_0.createEditorCell(context);
    setupBasic_Component_7205_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_7205_1(EditorContext context, SNode node) {
    if (this.my_GenericDeclaration_TypeVariables_Component7205_0 == null) {
      this.my_GenericDeclaration_TypeVariables_Component7205_0 = new _GenericDeclaration_TypeVariables_Component(node);
    }
    EditorCell editorCell = this.my_GenericDeclaration_TypeVariables_Component7205_0.createEditorCell(context);
    setupBasic_Component_7205_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_7205_2(EditorContext context, SNode node) {
    if (this.myBaseMethodDeclaration_NameCellComponent7205_0 == null) {
      this.myBaseMethodDeclaration_NameCellComponent7205_0 = new BaseMethodDeclaration_NameCellComponent(node);
    }
    EditorCell editorCell = this.myBaseMethodDeclaration_NameCellComponent7205_0.createEditorCell(context);
    setupBasic_Component_7205_2(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_7205_3(EditorContext context, SNode node) {
    if (this.my_DeprecatedPart7205_0 == null) {
      this.my_DeprecatedPart7205_0 = new _DeprecatedPart(node);
    }
    EditorCell editorCell = this.my_DeprecatedPart7205_0.createEditorCell(context);
    setupBasic_Component_7205_3(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_7205_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7205_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7205_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7205_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7205_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7205_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7205_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_7205_0(EditorContext context, SNode node) {
    if (this.myListHandler_7205_0 == null) {
      this.myListHandler_7205_0 = new DefaultClassifierMethodDeclaration_Editor.annotationListHandler_7205_0(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_7205_0.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_7205_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_7205_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_7205_1(EditorContext context, SNode node) {
    if (this.myListHandler_7205_1 == null) {
      this.myListHandler_7205_1 = new DefaultClassifierMethodDeclaration_Editor.parameterListHandler_7205_0(node, "parameter", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_7205_1.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_7205_1(editorCell, node, context);
    editorCell.setRole(this.myListHandler_7205_1.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_7205_2(EditorContext context, SNode node) {
    if (this.myListHandler_7205_2 == null) {
      this.myListHandler_7205_2 = new DefaultClassifierMethodDeclaration_Editor.throwsItemListHandler_7205_0(node, "throwsItem", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_7205_2.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_7205_2(editorCell, node, context);
    editorCell.setRole(this.myListHandler_7205_2.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_7205_3(EditorContext context, SNode node) {
    if (this.myListHandler_7205_3 == null) {
      this.myListHandler_7205_3 = new DefaultClassifierMethodDeclaration_Editor.annotationListHandler_7205_1(node, "annotation", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_7205_3.createCells(context, new CellLayout_Indent(), false);
    setupBasic_RefNodeList_7205_3(editorCell, node, context);
    editorCell.setRole(this.myListHandler_7205_3.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNode_7205_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7205_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7205_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("returnType");
    provider.setNoTargetText("<no return type>");
    EditorCell cellWithRole = this.createRefNode_7205_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7205_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7205_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7205_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("body");
    provider.setNoTargetText("<no body>");
    EditorCell cellWithRole = this.createRefNode_7205_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_7205_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7205_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
  }

  private static void setupBasic_Collection_7205_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7205_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_7205_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Component_7205_0(EditorCell editorCell, SNode node, EditorContext context) {
    _InstanceMethodDeclaration_AddAbstract.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Component_7205_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_RefNode_7205_0(EditorCell editorCell, SNode node, EditorContext context) {
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.FIRST_EDITABLE_CELL);
    }
  }

  private static void setupBasic_Component_7205_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_7205_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_0");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_7205_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_parameter");
  }

  private static void setupBasic_Constant_7205_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_2");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
    _BaseMethodDeclaration_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Collection_7205_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7205_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7205_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_3");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNodeList_7205_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_throwsItem");
  }

  private static void setupBasic_Constant_7205_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_4");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNode_7205_1(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_7205_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_5");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, true);
      style.set(StyleAttributes.POSITION, "next-line");
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Collection_7205_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7205_3");
  }

  private static void setupBasic_Constant_7205_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7205_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_RefNodeList_7205_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_annotation_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Component_7205_3(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  public static boolean renderingCondition7205_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "annotation") > 0;
  }

  public static boolean renderingCondition7205_1(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "typeVariableDeclaration") > 0;
  }

  public static boolean renderingCondition7205_2(SNode node, EditorContext editorContext, IScope scope) {
    return ListSequence.fromList(SLinkOperations.getTargets(node, "throwsItem", true)).count() > 0;
  }

  public static class annotationListHandler_7205_0 extends RefNodeListHandler {

    public annotationListHandler_7205_0(SNode ownerNode, String childRole, EditorContext context) {
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
  public static class parameterListHandler_7205_0 extends RefNodeListHandler {

    public parameterListHandler_7205_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_7205_1(context, node, "");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

    public EditorCell createConstant_7205_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_7205_1(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_7205_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_7205_1");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.SELECTABLE, true);
        style.set(StyleAttributes.EDITABLE, true);
      }
    }

}
  public static class throwsItemListHandler_7205_0 extends RefNodeListHandler {

    public throwsItemListHandler_7205_0(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}
  public static class annotationListHandler_7205_1 extends RefNodeListHandler {

    public annotationListHandler_7205_1(SNode ownerNode, String childRole, EditorContext context) {
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
