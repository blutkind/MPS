package jetbrains.mps.lang.actions.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class SideTransformHintSubstituteActionsBuilder_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_3064_0;
  /* package */AbstractCellListHandler myListHandler_3064_1;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3064_0(context, node);
  }

  public EditorCell createCollection_3064_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3064_0(editorCell, node, context);
    editorCell.setUsesBraces(true);
    editorCell.addEditorCell(this.createCollection_3064_1(context, node));
    editorCell.addEditorCell(this.createCollection_3064_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_1(editorCell, node, context);
    editorCell.addEditorCell(this.createProperty_3064_7(context, node));
    editorCell.addEditorCell(this.createConstant_3064_0(context, node, "transformed node:"));
    editorCell.addEditorCell(this.createRefCell_3064_1(context, node));
    editorCell.addEditorCell(this.createConstant_3064_1(context, node, "tag:"));
    editorCell.addEditorCell(this.createProperty_3064_3(context, node));
    editorCell.addEditorCell(this.createConstant_3064_5(context, node, " //"));
    editorCell.addEditorCell(this.createProperty_3064_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_2(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_0(context, node));
    editorCell.addEditorCell(this.createCollection_3064_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3064_3(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_3064_6(context, node));
    editorCell.addEditorCell(this.createCollection_3064_7(context, node));
    editorCell.addEditorCell(this.createConstant_3064_4(context, node, ""));
    editorCell.addEditorCell(this.createCollection_3064_8(context, node));
    editorCell.addEditorCell(this.createCollection_3064_9(context, node));
    editorCell.addEditorCell(this.createCollection_3064_10(context, node));
    editorCell.addEditorCell(this.createCollection_3064_11(context, node));
    editorCell.addEditorCell(this.createConstant_3064_9(context, node, ""));
    editorCell.addEditorCell(this.createCollection_3064_5(context, node));
    editorCell.addEditorCell(this.createCollection_3064_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_4(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_5(context, node));
    editorCell.addEditorCell(this.createRefNodeList_3064_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3064_2(context, node, "actions :"));
    return editorCell;
  }

  public EditorCell createCollection_3064_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3064_3(context, node, "condition :"));
    return editorCell;
  }

  public EditorCell createCollection_3064_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_7(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_1(context, node));
    editorCell.addEditorCell(this.createRefNode_3064_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_8(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3064_6(context, node, "common initializer :"));
    return editorCell;
  }

  public EditorCell createCollection_3064_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_9(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_2(context, node));
    editorCell.addEditorCell(this.createRefNodeList_3064_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3064_10(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_10(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_3(context, node));
    editorCell.addEditorCell(this.createConstant_3064_8(context, node, "...................................."));
    return editorCell;
  }

  public EditorCell createCollection_3064_11(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3064_11(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell3064_4(context, node));
    editorCell.addEditorCell(this.createRefNode_3064_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3064_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3064_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3064_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_3064_0(EditorContext context, SNode node) {
    if (this.myListHandler_3064_0 == null) {
      this.myListHandler_3064_0 = new SideTransformHintSubstituteActionsBuilder_Editor.partListHandler_3064_0(node, "part", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3064_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_3064_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3064_0.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList_3064_1(EditorContext context, SNode node) {
    if (this.myListHandler_3064_1 == null) {
      this.myListHandler_3064_1 = new SideTransformHintSubstituteActionsBuilder_Editor.variableListHandler_3064_0(node, "variable", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_3064_1.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_3064_1(editorCell, node, context);
    editorCell.setRole(this.myListHandler_3064_1.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell3064_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell3064_1(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell3064_2(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell3064_3(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell3064_4(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createIndentCell3064_5(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefCell_3064_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new SideTransformHintSubstituteActionsBuilder_Editor._Inline3064_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_3064_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_3064_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("applicableConcept");
    provider.setNoTargetText("<choose concept>");
    EditorCell cellWithRole = this.createRefCell_3064_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3064_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3064_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3064_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("transformTag");
    provider.setNoTargetText("<no transformTag>");
    EditorCell cellWithRole = this.createProperty_3064_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3064_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3064_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3064_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("precondition");
    provider.setNoTargetText("<none>");
    EditorCell cellWithRole = this.createRefNode_3064_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3064_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3064_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3064_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_3064_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3064_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3064_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3064_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("commonInitializer");
    provider.setNoTargetText("<no common initializer>");
    EditorCell cellWithRole = this.createRefNode_3064_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3064_6_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3064_3(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3064_7(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("side");
    provider.setNoTargetText("<no side>");
    EditorCell cellWithRole = this.createProperty_3064_6_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
  }

  private static void setupBasic_Collection_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_0");
  }

  private static void setupBasic_RefCell_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_1");
  }

  private static void setupBasic_Property_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_transformTag");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    }
  }

  private static void setupBasic_Collection_3064_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_3064_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_3064_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNodeList_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_part");
  }

  private static void setupBasic_Collection_3064_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_2");
  }

  private static void setupBasic_Collection_3064_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_3");
  }

  private static void setupBasic_Collection_3064_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_3064_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
  }

  private static void setupBasic_Property_3064_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_description");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    }
  }

  private static void setupBasic_Collection_3064_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_6");
  }

  private static void setupBasic_Collection_3064_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNodeList_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_variable");
  }

  private static void setupBasic_Collection_3064_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
    }
  }

  private static void setupBasic_Collection_3064_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3064_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3064_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3064_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Property_3064_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_side");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
    }
  }

  private static void setupBasic_Indent_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_0");
  }

  private static void setupBasic_Indent_3064_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_1");
  }

  private static void setupBasic_Indent_3064_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_2");
  }

  private static void setupBasic_Indent_3064_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_3");
  }

  private static void setupBasic_Indent_3064_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_4");
  }

  private static void setupBasic_Indent_3064_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_3064_5");
  }

  public static class _Inline3064_0 extends AbstractCellProvider {

    public _Inline3064_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_3064_1(context, node);
    }

    public EditorCell createProperty_3064_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_3064_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_3064_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_3064_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_3064_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      }
    }

}
  public static class partListHandler_3064_0 extends RefNodeListHandler {

    public partListHandler_3064_0(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, "----------"));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), "----------");
        editorCell.setSelectable(false);
        editorCell.getStyle().set(StyleAttributes.LAYOUT_CONSTRAINT, "");
        editorCell.getStyle().set(StyleAttributes.PUNCTUATION_LEFT, true);
        return editorCell;
      }
    }

}
  public static class variableListHandler_3064_0 extends RefNodeListHandler {

    public variableListHandler_3064_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_3064_7(context, node, "");
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

    public EditorCell createConstant_3064_7(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_3064_7(editorCell, node, context);
      editorCell.setDefaultText("<no common variables>");
      return editorCell;
    }


    private static void setupBasic_Constant_3064_7(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_3064_7");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.EDITABLE, true);
      }
    }

}

}
