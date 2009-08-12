package jetbrains.mps.lang.generator.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class MapSrcListMacro_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myNodeMacro_postfix2762_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2762_1(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_2762_0(context, node);
  }

  public EditorCell createCollection_2762_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2762_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_1(context, node, "map node macro"));
    editorCell.addEditorCell(this.createConstant_2762_2(context, node, ""));
    editorCell.addEditorCell(this.createCollection_2762_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_0(context, node, "$MAP_SRCL$"));
    editorCell.addEditorCell(this.createComponent_2762_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2762_2(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_2762_7(context, node));
    editorCell.addEditorCell(this.createCollection_2762_5(context, node));
    editorCell.addEditorCell(this.createCollection_2762_3(context, node));
    editorCell.addEditorCell(this.createCollection_2762_4(context, node));
    editorCell.addEditorCell(this.createCollection_2762_6(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_3(context, node, "mapped nodes"));
    editorCell.addEditorCell(this.createConstant_2762_4(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_2762_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_5(context, node, "mapping func"));
    editorCell.addEditorCell(this.createConstant_2762_6(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_2762_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_7(context, node, "mapping label"));
    editorCell.addEditorCell(this.createConstant_2762_8(context, node, ":"));
    editorCell.addEditorCell(this.createRefCell_2762_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_6(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_9(context, node, "post-processing"));
    editorCell.addEditorCell(this.createConstant_2762_10(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_2762_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2762_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2762_7(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2762_11(context, node, "comment"));
    editorCell.addEditorCell(this.createConstant_2762_12(context, node, ":"));
    editorCell.addEditorCell(this.createProperty_2762_3(context, node));
    return editorCell;
  }

  public EditorCell createComponent_2762_0(EditorContext context, SNode node) {
    if (this.myNodeMacro_postfix2762_0 == null) {
      this.myNodeMacro_postfix2762_0 = new NodeMacro_postfix(node);
    }
    EditorCell editorCell = this.myNodeMacro_postfix2762_0.createEditorCell(context);
    setupBasic_Component_2762_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_2762_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_0(editorCell, node, context);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new MapSrcListMacro_Editor.MapSrcListMacro_Editor_replaceWith_NodeMacro_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConstant_2762_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_11(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_11(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2762_12(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2762_12(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_2762_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2762_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2762_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourceNodesQuery");
    provider.setNoTargetText("<none>");
    EditorCell cellWithRole = this.createRefNode_2762_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_2762_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2762_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2762_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("mapperFunction");
    provider.setNoTargetText("<default>");
    EditorCell cellWithRole = this.createRefNode_2762_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_2762_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new MapSrcListMacro_Editor._Inline2762_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_2762_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_2762_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("mappingLabel");
    provider.setNoTargetText("<no label>");
    EditorCell cellWithRole = this.createRefCell_2762_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_2762_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2762_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2762_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("postMapperFunction");
    provider.setNoTargetText("<default>");
    EditorCell cellWithRole = this.createRefNode_2762_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_2762_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_2762_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2762_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("comment");
    provider.setNoTargetText("<none>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_2762_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_2762_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_1");
  }

  private static void setupBasic_Constant_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_0");
    Styles_StyleSheet.getMacroStart(editorCell).apply(editorCell);
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
    MacroSymbol_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_2762_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
      style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.lightGray);
    }
  }

  private static void setupBasic_Constant_2762_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_2762_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_2762_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.FIRST_EDITABLE_CELL);
    }
  }

  private static void setupBasic_Collection_2762_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_2762_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Component_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_2762_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_7");
  }

  private static void setupBasic_Constant_2762_8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_8");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefCell_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_2762_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_9");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_10");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_2762_2(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_2762_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2762_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2762_11(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_11");
  }

  private static void setupBasic_Constant_2762_12(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2762_12");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_2762_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_comment");
  }

  public static class _Inline2762_0 extends AbstractCellProvider {

    public _Inline2762_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_2762_1(context, node);
    }

    public EditorCell createProperty_2762_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_2762_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_2762_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_2762_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_2762_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      Styles_StyleSheet.getMappingLabelReference(editorCell).apply(editorCell);
    }

}
  public static class MapSrcListMacro_Editor_replaceWith_NodeMacro_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public MapSrcListMacro_Editor_replaceWith_NodeMacro_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.lang.generator.structure.NodeMacro";
    }

}

}
