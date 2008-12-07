package jetbrains.mps.lang.plugin.editor;

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
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class FileGeneratorDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1228678116668;
  /* package */AbstractCellListHandler myListHandler_1228678116681;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1228678116683(context, node);
  }

  public EditorCell createCollection1228678116659(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781166591228678116659(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228678116660(context, node, "file generator"));
    editorCell.addEditorCell(this.createProperty1228678116661(context, node));
    editorCell.addEditorCell(this.createConstant1228678116662(context, node, "extends"));
    editorCell.addEditorCell(this.createRefCell1228678116663(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228678116667(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286781166671228678116667(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1228678116668(context, node));
    editorCell.addEditorCell(this.createConstant1228678116670(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228678116672(context, node));
    editorCell.addEditorCell(this.createConstant1228678116673(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228678116675(context, node));
    editorCell.addEditorCell(this.createConstant1228678116676(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228678116678(context, node));
    editorCell.addEditorCell(this.createConstant1228678116679(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1228678116681(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228678116683(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286781166831228678116683(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228678116684(context, node));
    editorCell.addEditorCell(this.createCollection1228678116687(context, node));
    if (renderingCondition0103_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228678116977(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228678116684(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781166841228678116684(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228678116659(context, node));
    if (renderingCondition0103_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228678116972(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228678116687(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781166871228678116687(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell0103_0(context, node));
    editorCell.addEditorCell(this.createCollection1228678116667(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228678116660(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166601228678116660(editorCell, node, context);
    setupLabel_Constant_1228678116660_1228678116660(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116662(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166621228678116662(editorCell, node, context);
    setupLabel_Constant_1228678116662_1228678116662(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116670(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166701228678116670(editorCell, node, context);
    setupLabel_Constant_1228678116670_1228678116670(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116673(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166731228678116673(editorCell, node, context);
    setupLabel_Constant_1228678116673_1228678116673(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116676(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166761228678116676(editorCell, node, context);
    setupLabel_Constant_1228678116676_1228678116676(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116679(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781166791228678116679(editorCell, node, context);
    setupLabel_Constant_1228678116679_1228678116679(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116972(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781169721228678116972(editorCell, node, context);
    setupLabel_Constant_1228678116972_1228678116972(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116977(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781169771228678116977(editorCell, node, context);
    setupLabel_Constant_1228678116977_1228678116977(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1228678116668(EditorContext context, SNode node) {
    if (this.myListHandler_1228678116668 == null) {
      this.myListHandler_1228678116668 = new FileGeneratorDeclaration_Editor.fieldListHandler_0103_0(node, "field", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228678116668.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_field1228678116668(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228678116668.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1228678116681(EditorContext context, SNode node) {
    if (this.myListHandler_1228678116681 == null) {
      this.myListHandler_1228678116681 = new FileGeneratorDeclaration_Editor.methodListHandler_0103_0(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228678116681.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_method1228678116681(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228678116681.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell0103_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228678116661_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1228678116661(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1228678116661((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228678116661(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228678116661_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell1228678116663_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new FileGeneratorDeclaration_Editor._Inline0103_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refCell_extendedClass1228678116663(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refCell_extendedClass_1228678116663((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell1228678116663(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("extendedClass");
    provider.setNoTargetText("<no extendedClass>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefCell1228678116663_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228678116672_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_generateBlock1228678116672(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_generateBlock_1228678116672((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228678116672(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("generateBlock");
    provider.setNoTargetText("<no generate block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228678116672_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228678116675_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_isDefaultBlock1228678116675(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_isDefaultBlock_1228678116675((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228678116675(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("isDefaultBlock");
    provider.setNoTargetText("<no isDefault block>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228678116675_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228678116678_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_overridesDefaultBlock1228678116678(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_overridesDefaultBlock_1228678116678((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228678116678(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("overridesDefaultBlock");
    provider.setNoTargetText("<no overridesDefaultBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228678116678_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12286781166591228678116659(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116659");
  }

  private static void setupBasic_Constant_12286781166601228678116660(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116660");
  }

  private static void setupBasic_property_name1228678116661(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Constant_12286781166621228678116662(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116662");
  }

  private static void setupBasic_refCell_extendedClass1228678116663(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refCell_extendedClass");
  }

  private static void setupBasic_Collection_12286781166671228678116667(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116667");
  }

  private static void setupBasic_refNodeList_field1228678116668(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_field");
  }

  private static void setupBasic_Constant_12286781166701228678116670(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116670");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_generateBlock1228678116672(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12286781166731228678116673(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116673");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_isDefaultBlock1228678116675(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12286781166761228678116676(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116676");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_overridesDefaultBlock1228678116678(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12286781166791228678116679(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116679");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_method1228678116681(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_method");
  }

  private static void setupBasic_Collection_12286781166831228678116683(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116683");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286781166841228678116684(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116684");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286781166871228678116687(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116687");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12286781166881228678116688(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228678116688");
  }

  private static void setupBasic_Constant_12286781169721228678116972(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116972");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12286781169771228678116977(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116977");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228678116660_1228678116660(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1228678116661(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116662_1228678116662(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refCell_extendedClass_1228678116663(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_field_1228678116668(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116670_1228678116670(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_generateBlock_1228678116672(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116673_1228678116673(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_isDefaultBlock_1228678116675(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116676_1228678116676(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_overridesDefaultBlock_1228678116678(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116679_1228678116679(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_method_1228678116681(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116972_1228678116972(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116977_1228678116977(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition0103_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition0103_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class _Inline0103_0 extends AbstractCellProvider {

    public _Inline0103_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty1228678116665(context, node);
    }

    public EditorCell createProperty1228678116665_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_property_name1228678116665(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_property_name_1228678116665((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty1228678116665(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.createProperty1228678116665_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_property_name1228678116665(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_property_name_1228678116665(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class fieldListHandler_0103_0 extends RefNodeListHandler {

    public fieldListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1228678116669(context, node, "");
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

    public EditorCell createConstant1228678116669(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12286781166691228678116669(editorCell, node, context);
      setupLabel_Constant_1228678116669_1228678116669(editorCell, node, context);
      editorCell.setDefaultText("<fields>");
      return editorCell;
    }


    private static void setupBasic_Constant_12286781166691228678116669(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228678116669");
    }

    private static void setupLabel_Constant_1228678116669_1228678116669(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class methodListHandler_0103_0 extends RefNodeListHandler {

    public methodListHandler_0103_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1228678116682(context, node, "");
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

    public EditorCell createConstant1228678116682(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12286781166821228678116682(editorCell, node, context);
      setupLabel_Constant_1228678116682_1228678116682(editorCell, node, context);
      editorCell.setDefaultText("<methods>");
      return editorCell;
    }


    private static void setupBasic_Constant_12286781166821228678116682(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228678116682");
    }

    private static void setupLabel_Constant_1228678116682_1228678116682(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
