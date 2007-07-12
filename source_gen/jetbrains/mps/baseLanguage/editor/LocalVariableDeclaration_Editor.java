package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;

public class LocalVariableDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myVariableDeclaration_NameCellComponent2;

  public static boolean _QueryFunction_NodeCondition_1177528613676(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "isFinal");
  }
  public static boolean _QueryFunction_NodeCondition_1145916333852(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "initializer", true) != null;
  }
  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177528607804");
  }
  private static void setupBasic_TypeCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075303160502");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_VariableDeclaration_NameCellComponentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1181824043507");
  }
  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075303160505");
    editorCell.setDrawBorder(false);
    LocalVariableDeclaration_Initializer_Actions.setCellActions(editorCell, node, context);
  }
  private static void setupBasic_InitializerCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075303160506");
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_InitializerArea(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075303160504");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }
  private static void setupBasic_DeclarationBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1075303160501");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new LocalVariableDeclaration_KeyMap());
  }
  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177528761777");
  }
  private static void setupBasic_IsFinalCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177528805179");
  }
  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177528761004");
  }
  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }
  private static void setupLabel_TypeCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_InitializerCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }
  private static void setupLabel_IsFinalCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createDeclarationBox(context, node);
  }
  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createInitializerArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    LocalVariableDeclaration_Editor.setupBasic_InitializerArea(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "="));
    editorCell.addEditorCell(this.createInitializerCell(context, node));
    return editorCell;
  }
  public EditorCell createDeclarationBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    LocalVariableDeclaration_Editor.setupBasic_DeclarationBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if(LocalVariableDeclaration_Editor._QueryFunction_NodeCondition_1177528613676(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell(context, node, "final"));
    }
    editorCell.addEditorCell(this.createTypeCell(context, node));
    editorCell.addEditorCell(this.createVariableDeclaration_NameCellComponentCell(context, node));
    if(LocalVariableDeclaration_Editor._QueryFunction_NodeCondition_1145916333852(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createInitializerArea(context, node));
    }
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    LocalVariableDeclaration_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell2(context, node, "final"));
    editorCell.addEditorCell(this.createIsFinalCell(context, node));
    return editorCell;
  }
  public EditorCell createVariableDeclaration_NameCellComponentCell(EditorContext context, SNode node) {
    if(this.myVariableDeclaration_NameCellComponent2 == null) {
      this.myVariableDeclaration_NameCellComponent2 = new VariableDeclaration_NameCellComponent(node);
    }
    EditorCell componentCell = this.myVariableDeclaration_NameCellComponent2.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    LocalVariableDeclaration_Editor.setupBasic_VariableDeclaration_NameCellComponentCell(editorCell, node, context);
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    LocalVariableDeclaration_Editor.setupBasic_ConstantCell(editorCell, node, context);
    LocalVariableDeclaration_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    LocalVariableDeclaration_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    LocalVariableDeclaration_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    LocalVariableDeclaration_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    LocalVariableDeclaration_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createTypeCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    LocalVariableDeclaration_Editor.setupBasic_TypeCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LocalVariableDeclaration_Editor.setupLabel_TypeCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createTypeCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createInitializerCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    LocalVariableDeclaration_Editor.setupBasic_InitializerCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LocalVariableDeclaration_Editor.setupLabel_InitializerCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createInitializerCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("initializer");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createInitializerCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
  public EditorCell createIsFinalCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    LocalVariableDeclaration_Editor.setupBasic_IsFinalCell(editorCell, node, context);
    if(editorCell instanceof EditorCell_Label) {
      LocalVariableDeclaration_Editor.setupLabel_IsFinalCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }
  public EditorCell createIsFinalCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isFinal");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createIsFinalCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }
}
