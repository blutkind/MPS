package jetbrains.mps.lang.script.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.AbstractCellProvider;

public class MigrationScriptPart_Instance_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_7916_0(context, node);
  }

  public EditorCell createCollection_7916_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_7916_0(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_7916_1(context, node));
    editorCell.addEditorCell(this.createConstant_7916_0(context, node, ";"));
    return editorCell;
  }

  public EditorCell createCollection_7916_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_7916_1(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_7916_2(context, node));
    editorCell.addEditorCell(this.createCollection_7916_6(context, node));
    editorCell.addEditorCell(this.createCollection_7916_3(context, node));
    editorCell.addEditorCell(this.createCollection_7916_4(context, node));
    editorCell.addEditorCell(this.createCollection_7916_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7916_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7916_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7916_1(context, node, "description"));
    editorCell.addEditorCell(this.createConstant_7916_2(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_7916_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7916_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7916_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7916_3(context, node, "for each"));
    editorCell.addEditorCell(this.createConstant_7916_4(context, node, ":"));
    editorCell.addEditorCell(this.createRefCell_7916_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7916_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7916_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7916_5(context, node, "where"));
    editorCell.addEditorCell(this.createConstant_7916_6(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_7916_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7916_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7916_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7916_7(context, node, "do"));
    editorCell.addEditorCell(this.createConstant_7916_8(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_7916_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_7916_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_7916_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_7916_9(context, node, "show as intention"));
    editorCell.addEditorCell(this.createConstant_7916_10(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_7916_5(context, node));
    return editorCell;
  }

  public EditorCell createConstant_7916_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_7916_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_7916_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_7916_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7916_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7916_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("description");
    provider.setNoTargetText("<no description>");
    EditorCell cellWithRole = this.createProperty_7916_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_7916_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new MigrationScriptPart_Instance_Editor._Inline7916_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_7916_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_7916_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("affectedInstanceConcept");
    provider.setNoTargetText("<choose concept>");
    EditorCell cellWithRole = this.createRefCell_7916_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7916_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7916_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7916_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("affectedInstancePredicate");
    provider.setNoTargetText("<no condition>");
    EditorCell cellWithRole = this.createRefNode_7916_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_7916_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_7916_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_7916_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("affectedInstanceUpdater");
    provider.setNoTargetText("<no affectedInstanceUpdater>");
    EditorCell cellWithRole = this.createRefNode_7916_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_7916_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_7916_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_7916_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("showAsIntention");
    provider.setNoTargetText("<no showAsIntention>");
    EditorCell cellWithRole = this.createProperty_7916_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_7916_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_0");
  }

  private static void setupBasic_Constant_7916_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Collection_7916_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BRACKETS, true);
      style.set(StyleAttributes.BRACKETS_COLOR, MPSColors.lightGray);
    }
  }

  private static void setupBasic_Collection_7916_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7916_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_1");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_7916_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_Property_7916_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_description");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_GREEN);
    }
  }

  private static void setupBasic_Collection_7916_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7916_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_3");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_7916_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_RefCell_7916_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_7916_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7916_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_5");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_7916_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_RefNode_7916_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_7916_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7916_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_7");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_7916_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  private static void setupBasic_RefNode_7916_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_7916_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_7916_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_7916_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_9");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_7916_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_showAsIntention");
  }

  private static void setupBasic_Constant_7916_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_7916_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
    }
  }

  public static class _Inline7916_0 extends AbstractCellProvider {

    public _Inline7916_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_7916_3(context, node);
    }

    public EditorCell createProperty_7916_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_7916_1(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_7916_3(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_7916_2_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_7916_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      }
    }

}

}
