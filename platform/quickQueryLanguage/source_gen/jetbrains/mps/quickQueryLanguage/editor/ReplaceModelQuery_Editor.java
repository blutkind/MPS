package jetbrains.mps.quickQueryLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.MPSColors;

public class ReplaceModelQuery_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_0889_0(context, node);
  }

  public EditorCell createCollection_0889_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0889_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_0889_1(context, node));
    editorCell.addEditorCell(this.createCollection_0889_2(context, node));
    editorCell.addEditorCell(this.createCollection_0889_7(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0889_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0889_0(context, node, "modify query"));
    return editorCell;
  }

  public EditorCell createCollection_0889_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0889_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0889_1(context, node, "with all"));
    editorCell.addEditorCell(this.createRefCell_0889_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0889_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0889_2(context, node, "where"));
    editorCell.addEditorCell(this.createCollection_0889_4(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0889_4(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_0889_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_0889_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_0889_3(context, node, "do"));
    editorCell.addEditorCell(this.createCollection_0889_6(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_6(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0889_6(editorCell, node, context);
    editorCell.addEditorCell(this.createRefNode_0889_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_0889_7(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_0889_7(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_0889_3(context, node));
    editorCell.addEditorCell(this.createCollection_0889_5(context, node));
    return editorCell;
  }

  public EditorCell createConstant_0889_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0889_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0889_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0889_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0889_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0889_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_0889_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_0889_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefCell_0889_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new ReplaceModelQuery_Editor._Inline0889_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_0889_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_0889_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("conceptDeclaration");
    provider.setNoTargetText("<no conceptDeclaration>");
    EditorCell cellWithRole = this.createRefCell_0889_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0889_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0889_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0889_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("condition");
    provider.setNoTargetText("<no condition>");
    EditorCell cellWithRole = this.createRefNode_0889_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_0889_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_0889_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_0889_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("replace");
    provider.setNoTargetText("<no replace>");
    EditorCell cellWithRole = this.createRefNode_0889_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_0889_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_0");
  }

  private static void setupBasic_Collection_0889_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_0889_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0889_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_0889_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_0889_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0889_1");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefCell_0889_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0889_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_0889_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0889_2");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_0889_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_0889_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0889_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_0889_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_0889_3");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_0889_6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_6");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_RefNode_0889_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_0889_7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_0889_7");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  public static class _Inline0889_0 extends AbstractCellProvider {

    public _Inline0889_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_0889_1(context, node);
    }

    public EditorCell createProperty_0889_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_0889_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_0889_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_0889_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_0889_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      }
    }

}

}
