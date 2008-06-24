package jetbrains.mps.bootstrap.editorLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;

public class CellModel_BlockStart_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider my_CellKeyMapLnk_Component14;
  /* package */AbstractCellProvider my_FocusPolicy_Applicable;
  /* package */AbstractCellProvider my_EditorCellModel_RTAnchor_Component3;
  /* package */AbstractCellProvider myStyle_Component2;

  private static void setupBasic_openBracePropertyCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_openBracePropertyCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_0");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_0");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_02");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_01");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_selectablePropertyCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_selectablePropertyCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_03");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_02");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_attractsFocusPropertyCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_attractsFocusPropertyCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_03(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_03");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_04");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_04(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_04");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_layoutConstraintPropertyCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_layoutConstraintPropertyCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_05");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_05(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_05");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_06(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_06");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_actionMapRefCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_actionMapRefCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_06(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_06");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_07(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_07");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic__CellKeyMapLnk_ComponentComponentCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__CellKeyMapLnk_ComponentComponentCell7038_0");
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_CollectionCell7038_07(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell7038_07");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell7038_08(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_08");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_menuDescriptorRefNodeCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic_ConstantCell7038_09(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell7038_09");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
  }

  private static void setupBasic__FocusPolicy_ApplicableComponentCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__FocusPolicy_ApplicableComponentCell7038_0");
  }

  private static void setupBasic__EditorCellModel_RTAnchor_ComponentComponentCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "__EditorCellModel_RTAnchor_ComponentComponentCell7038_0");
  }

  private static void setupBasic_Style_ComponentComponentCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_Style_ComponentComponentCell7038_0");
  }

  private static void setupLabel_openBracePropertyCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setTextColor(Color.blue);
    editorCell.setNullTextColor(Color.blue);
  }

  private static void setupLabel_ConstantCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_selectablePropertyCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_attractsFocusPropertyCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_03(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_04(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_layoutConstraintPropertyCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_05(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_06(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_actionMapRefCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_07(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_08(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_menuDescriptorRefNodeCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7038_09(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_openBracePropertyCell7038_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.create_CollectionCell7038_0(context, node);
  }

  public EditorCell create_CollectionCell7038_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell7038_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_Style_ComponentComponentCell7038_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7038_0(context, node, "< block start cell >"));
    editorCell.addEditorCell(this.create_CollectionCell7038_01(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_01(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_CollectionCell7038_01(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_CollectionCell7038_02(context, node));
    editorCell.addEditorCell(this.create_CollectionCell7038_03(context, node));
    editorCell.addEditorCell(this.create__FocusPolicy_ApplicableComponentCell7038_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7038_03(context, node, ""));
    editorCell.addEditorCell(this.create_CollectionCell7038_04(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7038_05(context, node, ""));
    editorCell.addEditorCell(this.create_CollectionCell7038_05(context, node));
    editorCell.addEditorCell(this.create_CollectionCell7038_06(context, node));
    editorCell.addEditorCell(this.create__EditorCellModel_RTAnchor_ComponentComponentCell7038_0(context, node));
    editorCell.addEditorCell(this.create_CollectionCell7038_07(context, node));
    editorCell.addEditorCell(this.create_ConstantCell7038_09(context, node, ""));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_02(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_02(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_01(context, node, "selectable"));
    editorCell.addEditorCell(this.create_selectablePropertyCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_03(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_03(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_02(context, node, "attracts focus"));
    editorCell.addEditorCell(this.create_attractsFocusPropertyCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_04(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_04(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_04(context, node, "layout constraint "));
    editorCell.addEditorCell(this.create_layoutConstraintPropertyCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_05(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_05(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_06(context, node, "action map"));
    editorCell.addEditorCell(this.create_actionMapRefCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_06(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_06(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_07(context, node, "keymap"));
    editorCell.addEditorCell(this.create__CellKeyMapLnk_ComponentComponentCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create_CollectionCell7038_07(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell7038_07(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell7038_08(context, node, "menu"));
    editorCell.addEditorCell(this.create_menuDescriptorRefNodeCell7038_0(context, node));
    return editorCell;
  }

  public EditorCell create__CellKeyMapLnk_ComponentComponentCell7038_0(EditorContext context, SNode node) {
    if (this.my_CellKeyMapLnk_Component14 == null) {
      this.my_CellKeyMapLnk_Component14 = new _CellKeyMapLnk_Component(node);
    }
    EditorCell editorCell = this.my_CellKeyMapLnk_Component14.createEditorCell(context);
    setupBasic__CellKeyMapLnk_ComponentComponentCell7038_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create__FocusPolicy_ApplicableComponentCell7038_0(EditorContext context, SNode node) {
    if (this.my_FocusPolicy_Applicable == null) {
      this.my_FocusPolicy_Applicable = new _FocusPolicy_Applicable(node);
    }
    EditorCell editorCell = this.my_FocusPolicy_Applicable.createEditorCell(context);
    setupBasic__FocusPolicy_ApplicableComponentCell7038_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create__EditorCellModel_RTAnchor_ComponentComponentCell7038_0(EditorContext context, SNode node) {
    if (this.my_EditorCellModel_RTAnchor_Component3 == null) {
      this.my_EditorCellModel_RTAnchor_Component3 = new _EditorCellModel_RTAnchor_Component(node);
    }
    EditorCell editorCell = this.my_EditorCellModel_RTAnchor_Component3.createEditorCell(context);
    setupBasic__EditorCellModel_RTAnchor_ComponentComponentCell7038_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_Style_ComponentComponentCell7038_0(EditorContext context, SNode node) {
    if (this.myStyle_Component2 == null) {
      this.myStyle_Component2 = new Style_Component(node);
    }
    EditorCell editorCell = this.myStyle_Component2.createEditorCell(context);
    setupBasic_Style_ComponentComponentCell7038_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_0(editorCell, node, context);
    setupLabel_ConstantCell7038_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_01(editorCell, node, context);
    setupLabel_ConstantCell7038_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_02(editorCell, node, context);
    setupLabel_ConstantCell7038_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_03(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_03(editorCell, node, context);
    setupLabel_ConstantCell7038_03(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_04(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_04(editorCell, node, context);
    setupLabel_ConstantCell7038_04(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_05(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_05(editorCell, node, context);
    setupLabel_ConstantCell7038_05(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_06(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_06(editorCell, node, context);
    setupLabel_ConstantCell7038_06(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_07(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_07(editorCell, node, context);
    setupLabel_ConstantCell7038_07(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_08(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_08(editorCell, node, context);
    setupLabel_ConstantCell7038_08(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell7038_09(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell7038_09(editorCell, node, context);
    setupLabel_ConstantCell7038_09(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_openBracePropertyCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_openBracePropertyCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_openBracePropertyCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_openBracePropertyCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("openBrace");
    provider.setNoTargetText("{");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.create_openBracePropertyCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_selectablePropertyCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_selectablePropertyCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_selectablePropertyCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_selectablePropertyCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("selectable");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_selectablePropertyCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_attractsFocusPropertyCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_attractsFocusPropertyCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_attractsFocusPropertyCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_attractsFocusPropertyCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("attractsFocus");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_attractsFocusPropertyCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_layoutConstraintPropertyCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_layoutConstraintPropertyCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_layoutConstraintPropertyCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_layoutConstraintPropertyCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("layoutConstraint");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_layoutConstraintPropertyCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_actionMapRefCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new CellModel_BlockStart_Editor._Inline41());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_actionMapRefCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_actionMapRefCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_actionMapRefCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("actionMap");
    provider.setNoTargetText("<default>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_actionMapRefCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_menuDescriptorRefNodeCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_menuDescriptorRefNodeCell7038_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_menuDescriptorRefNodeCell7038_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_menuDescriptorRefNodeCell7038_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("menuDescriptor");
    provider.setNoTargetText("<none>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_menuDescriptorRefNodeCell7038_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _Inline41 extends AbstractCellProvider {

    public _Inline41() {
      super();
    }

    private static void setupBasic_namePropertyCell7038_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_namePropertyCell7038_0");
      editorCell.setDrawBorder(true);
    }

    private static void setupLabel_namePropertyCell7038_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }


    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.create_namePropertyCell7038_0(context, node);
    }

    public EditorCell create_namePropertyCell7038_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
      CellProviderWithRole provider = aProvider;
      provider.setAuxiliaryCellProvider(null);
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_namePropertyCell7038_0(editorCell, node, context);
      if (editorCell instanceof EditorCell_Label) {
        setupLabel_namePropertyCell7038_0((EditorCell_Label)editorCell, node, context);
      }
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell create_namePropertyCell7038_0(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("");
      provider.setReadOnly(true);
      provider.setAllowsEmptyTarget(false);
      EditorCell cellWithRole = this.create_namePropertyCell7038_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }

}

}
