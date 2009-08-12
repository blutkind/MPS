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
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class CellKeyMapItem_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_9930_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_9930_0(context, node);
  }

  public EditorCell createCollection_9930_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_9930_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_9930_1(context, node));
    editorCell.addEditorCell(this.createConstant_9930_15(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection_9930_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_0(context, node, "item"));
    editorCell.addEditorCell(this.createCollection_9930_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_9930_2(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_9930_3(context, node));
    editorCell.addEditorCell(this.createCollection_9930_4(context, node));
    editorCell.addEditorCell(this.createCollection_9930_5(context, node));
    editorCell.addEditorCell(this.createCollection_9930_6(context, node));
    editorCell.addEditorCell(this.createCollection_9930_7(context, node));
    editorCell.addEditorCell(this.createCollection_9930_8(context, node));
    editorCell.addEditorCell(this.createCollection_9930_9(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_1(context, node, "description"));
    editorCell.addEditorCell(this.createConstant_9930_2(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_9930_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_3(context, node, "keystrokes"));
    editorCell.addEditorCell(this.createConstant_9930_4(context, node, ":"));
    editorCell.addEditorCell(this.createRefNodeList_9930_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_5(context, node, "caret policy"));
    editorCell.addEditorCell(this.createConstant_9930_6(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_9930_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_7(context, node, "show in popup"));
    editorCell.addEditorCell(this.createConstant_9930_8(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_9930_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_7(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_9(context, node, "menu always shown"));
    editorCell.addEditorCell(this.createConstant_9930_10(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_9930_7(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_8(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_11(context, node, "is applicable"));
    editorCell.addEditorCell(this.createConstant_9930_12(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_9930_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_9930_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_9930_9(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_9930_13(context, node, "execute"));
    editorCell.addEditorCell(this.createConstant_9930_14(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_9930_3(context, node));
    return editorCell;
  }

  public EditorCell createConstant_9930_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_13(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_14(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_14(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_9930_15(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_9930_15(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_9930_0(EditorContext context, SNode node) {
    if (this.myListHandler_9930_0 == null) {
      this.myListHandler_9930_0 = new CellKeyMapItem_Editor.keystrokeListHandler_9930_0(node, "keystroke", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_9930_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_9930_0(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setRole(this.myListHandler_9930_0.getElementRole());
    return editorCell;
  }

  public EditorCell createProperty_9930_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_9930_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_9930_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_9930_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_9930_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_9930_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_9930_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("caretPolicy");
    provider.setNoTargetText("<no description>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_9930_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_9930_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_9930_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_9930_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("showInPopup");
    provider.setNoTargetText("<no showInPopup>");
    EditorCell cellWithRole = this.createProperty_9930_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_9930_6_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_9930_3(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_9930_7(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("menuAlwaysShown");
    provider.setNoTargetText("<no menuAlwaysShown>");
    EditorCell cellWithRole = this.createProperty_9930_6_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_9930_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_9930_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_9930_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isApplicableFunction");
    provider.setNoTargetText("<always>");
    EditorCell cellWithRole = this.createRefNode_9930_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_9930_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_9930_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_9930_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("executeFunction");
    provider.setNoTargetText("<no executeFunction>");
    EditorCell cellWithRole = this.createRefNode_9930_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_9930_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_0");
  }

  private static void setupBasic_Collection_9930_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, true);
    }
  }

  private static void setupBasic_Collection_9930_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, true);
    }
  }

  private static void setupBasic_Collection_9930_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_9930_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_description");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    }
  }

  private static void setupBasic_Collection_9930_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNodeList_9930_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_keystroke");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_9930_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_9930_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_caretPolicy");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.BOLD);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
    }
  }

  private static void setupBasic_Collection_9930_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_9930_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_showInPopup");
  }

  private static void setupBasic_Collection_9930_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_9930_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_menuAlwaysShown");
  }

  private static void setupBasic_Collection_9930_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_12");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_9930_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_9930_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_9930_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_13");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_9930_14(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_14");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_9930_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_9930_15(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_9930_15");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, true);
    }
  }

  public static class keystrokeListHandler_9930_0 extends RefNodeListHandler {

    public keystrokeListHandler_9930_0(SNode ownerNode, String childRole, EditorContext context) {
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
