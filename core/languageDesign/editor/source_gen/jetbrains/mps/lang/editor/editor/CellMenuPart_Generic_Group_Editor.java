package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;

public class CellMenuPart_Generic_Group_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3584_0(context, node);
  }

  public EditorCell createCollection_3584_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3584_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_3584_1(context, node));
    editorCell.addEditorCell(this.createCollection_3584_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_0(context, node, "generic group"));
    return editorCell;
  }

  public EditorCell createCollection_3584_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_1(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_3584_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_3584_3(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createCollection_3584_4(context, node));
    editorCell.addEditorCell(this.createCollection_3584_5(context, node));
    editorCell.addEditorCell(this.createCollection_3584_6(context, node));
    if (renderingCondition3584_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_3584_7(context, node));
    }
    if (renderingCondition3584_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_3584_8(context, node));
    }
    editorCell.addEditorCell(this.createCollection_3584_9(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_2(context, node, "parameter object type"));
    editorCell.addEditorCell(this.createConstant_3584_3(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_3584_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_4(context, node, "parameter objects"));
    editorCell.addEditorCell(this.createConstant_3584_5(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_3584_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_6(context, node, "presentation"));
    editorCell.addEditorCell(this.createConstant_3584_7(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_3584_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_7(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_8(context, node, "matching text"));
    editorCell.addEditorCell(this.createConstant_3584_9(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_3584_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_8(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_8(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_10(context, node, "description text"));
    editorCell.addEditorCell(this.createConstant_3584_11(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_3584_7(context, node));
    return editorCell;
  }

  public EditorCell createCollection_3584_9(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3584_9(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3584_12(context, node, "handler"));
    editorCell.addEditorCell(this.createConstant_3584_13(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_3584_9(context, node));
    return editorCell;
  }

  public EditorCell createConstant_3584_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3584_13(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3584_13(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_3584_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3584_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3584_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("parameterObjectType");
    provider.setNoTargetText("<none>");
    EditorCell cellWithRole = this.createRefNode_3584_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3584_2_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3584_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3584_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("parametersFunction");
    provider.setNoTargetText("<no parametersFunction>");
    EditorCell cellWithRole = this.createRefNode_3584_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_3584_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3584_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3584_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("presentation");
    provider.setNoTargetText("<no presentation>");
    EditorCell cellWithRole = this.createProperty_3584_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3584_4_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3584_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3584_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("matchingTextFunction");
    provider.setNoTargetText("<default>");
    EditorCell cellWithRole = this.createRefNode_3584_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3584_6_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3584_3(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3584_7(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("descriptionTextFunction");
    provider.setNoTargetText("<default>");
    EditorCell cellWithRole = this.createRefNode_3584_6_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_3584_8_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_3584_4(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_3584_9(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("handlerFunction");
    provider.setNoTargetText("<default>");
    EditorCell cellWithRole = this.createRefNode_3584_8_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3584_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_0");
  }

  private static void setupBasic_Collection_3584_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
    }
  }

  private static void setupBasic_Collection_3584_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_3584_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_3584_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_2");
  }

  private static void setupBasic_Constant_3584_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3584_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3584_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_4");
  }

  private static void setupBasic_Constant_3584_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3584_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3584_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_6");
  }

  private static void setupBasic_Constant_3584_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_3584_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_presentation");
  }

  private static void setupBasic_Collection_3584_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_8");
  }

  private static void setupBasic_Constant_3584_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3584_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3584_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_10");
  }

  private static void setupBasic_Constant_3584_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_11");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3584_3(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_3584_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3584_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_3584_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_12");
  }

  private static void setupBasic_Constant_3584_13(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3584_13");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_3584_4(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition3584_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.hasValue(node, "presentation", "custom", null);
  }

  public static boolean renderingCondition3584_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.hasValue(node, "presentation", "custom", null);
  }

}
