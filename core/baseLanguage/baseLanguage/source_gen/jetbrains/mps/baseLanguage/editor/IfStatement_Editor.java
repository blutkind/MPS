package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.ext.collections.internal.query.SequenceOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;

public class IfStatement_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myElsifClausesListHandler_elsifClausesList_;

  private static void setupBasic_StatementBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034647");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_HeaderRow(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034648");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034649");
    editorCell.setSelectable(false);
  }

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034650");
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034651");
  }

  private static void setupBasic_ConstantCell2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034672");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034673");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConditionCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034674");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034675");
    editorCell.setDrawBorder(false);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_IfTrueBox(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034676");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IndentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034677");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IfTrueCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034678");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034679");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    IfStatement_rTransform_action.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_CellAlternation(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034688");
  }

  private static void setupBasic_ColumnCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034706");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IfFalseBranch(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034707");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell6(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034708");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell7(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034709");
    editorCell.setDrawBorder(false);
    editorCell.setFontType(MPSFonts.BOLD);
    IfStatement_elseDelete_action.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_ConstantCell8(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034710");
    editorCell.setDrawBorder(false);
    IfStatement_elseBlockStatement_delete.setCellActions(editorCell, node, context);
    editorCell.addKeyMap(new InsertFirstStatement_KeyMap());
  }

  private static void setupBasic_IfFalseBranch1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034720");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell9(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034721");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IfFalseStatementCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034722");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_IfFalseBranch2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034723");
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell10(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034724");
    editorCell.setDrawBorder(false);
    IfStatement_elseBlockStatement_delete.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_IfFalseStatementCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1177555034734");
  }

  private static void setupBasic_ElsifClausesList(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1206063692153");
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_ConstantCell2(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_ConstantCell3(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConditionCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell4(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IndentCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IfTrueCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell5(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
  }

  private static void setupLabel_ConstantCell6(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell7(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
  }

  private static void setupLabel_ConstantCell8(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell9(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IfFalseStatementCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ConstantCell10(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_IfFalseStatementCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_ElsifClausesList(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean _QueryFunction_NodeCondition_1177555034652(SNode node, EditorContext editorContext, IScope scope) {
    SNode parent = SNodeOperations.getParent(node, null, false, false);
    return SNodeOperations.isInstanceOf(parent, "jetbrains.mps.baseLanguage.structure.IfStatement") && SLinkOperations.getTarget(parent, "ifFalseStatement", true) == node;
  }

  public static boolean _QueryFunction_NodeCondition_1177555034680(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "ifFalseStatement", true) == null;
  }

  public static boolean _QueryFunction_NodeCondition_1177555034689(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.IfStatement");
  }

  public static boolean _QueryFunction_NodeCondition_1177555034698(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getTarget(node, "ifFalseStatement", true) != null;
  }

  public static boolean _QueryFunction_NodeCondition_1177555034711(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.BlockStatement");
  }

  public static boolean _QueryFunction_NodeCondition_1177555034725(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(node, "ifFalseStatement", true), "jetbrains.mps.baseLanguage.structure.BlockStatement");
  }

  public static boolean _QueryFunction_NodeCondition_1206063712466(SNode node, EditorContext editorContext, IScope scope) {
    return !(SequenceOperations.isEmpty(SLinkOperations.getTargets(node, "elsifClauses", true)));
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createStatementBox(context, node);
  }

  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = IfStatement_Editor._QueryFunction_NodeCondition_1177555034689(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createIfFalseStatementCell1(context, node);
    } else
    {
      editorCell = this.createColumnCell(context, node);
    }
    IfStatement_Editor.setupBasic_CellAlternation(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createStatementBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    IfStatement_Editor.setupBasic_StatementBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createIfTrueBox(context, node));
    if (IfStatement_Editor._QueryFunction_NodeCondition_1206063712466(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createElsifClausesList(context, node));
    }
    if (IfStatement_Editor._QueryFunction_NodeCondition_1177555034680(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell5(context, node, "}"));
    }
    if (IfStatement_Editor._QueryFunction_NodeCondition_1177555034698(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCellAlternation(context, node));
    }
    return editorCell;
  }

  public EditorCell createHeaderRow(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_HeaderRow(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (IfStatement_Editor._QueryFunction_NodeCondition_1177555034652(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRowCell(context, node));
    }
    editorCell.addEditorCell(this.createConstantCell2(context, node, "if"));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "("));
    editorCell.addEditorCell(this.createConditionCell(context, node));
    editorCell.addEditorCell(this.createConstantCell4(context, node, ") {"));
    return editorCell;
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "}"));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "else"));
    return editorCell;
  }

  public EditorCell createIfTrueBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_IfTrueBox(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell(context, node, "  "));
    editorCell.addEditorCell(this.createIfTrueCell(context, node));
    return editorCell;
  }

  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    IfStatement_Editor.setupBasic_ColumnCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIfFalseBranch(context, node));
    editorCell.addEditorCell(this.createIfFalseBranch1(context, node));
    editorCell.addEditorCell(this.createIfFalseBranch2(context, node));
    return editorCell;
  }

  public EditorCell createIfFalseBranch(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_IfFalseBranch(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell6(context, node, "}"));
    editorCell.addEditorCell(this.createConstantCell7(context, node, "else"));
    if (IfStatement_Editor._QueryFunction_NodeCondition_1177555034711(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell8(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createIfFalseBranch1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_IfFalseBranch1(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell9(context, node, "  "));
    editorCell.addEditorCell(this.createIfFalseStatementCell(context, node));
    return editorCell;
  }

  public EditorCell createIfFalseBranch2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    IfStatement_Editor.setupBasic_IfFalseBranch2(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    if (IfStatement_Editor._QueryFunction_NodeCondition_1177555034725(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstantCell10(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell2(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell3(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell4(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_IndentCell(editorCell, node, context);
    IfStatement_Editor.setupLabel_IndentCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell5(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell6(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell6(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell7(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell7(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell8(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell8(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell9(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell9(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    IfStatement_Editor.setupBasic_ConstantCell10(editorCell, node, context);
    IfStatement_Editor.setupLabel_ConstantCell10(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createElsifClausesList(EditorContext context, SNode node) {
    if (this.myElsifClausesListHandler_elsifClausesList_ == null) {
      this.myElsifClausesListHandler_elsifClausesList_ = new IfStatement_Editor._RefNodeListHandler68(node, "elsifClauses", context);
    }
    EditorCell_Collection editorCell = this.myElsifClausesListHandler_elsifClausesList_.createCells(context, new CellLayout_Vertical(), false);
    IfStatement_Editor.setupBasic_ElsifClausesList(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myElsifClausesListHandler_elsifClausesList_.getElementRole());
    return editorCell;
  }

  public EditorCell createConditionCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    IfStatement_Editor.setupBasic_ConditionCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      IfStatement_Editor.setupLabel_ConditionCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConditionCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("condition");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConditionCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createIfTrueCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    IfStatement_Editor.setupBasic_IfTrueCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      IfStatement_Editor.setupLabel_IfTrueCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createIfTrueCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("ifTrue");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createIfTrueCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createIfFalseStatementCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    IfStatement_Editor.setupBasic_IfFalseStatementCell(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      IfStatement_Editor.setupLabel_IfFalseStatementCell((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createIfFalseStatementCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("ifFalseStatement");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createIfFalseStatementCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createIfFalseStatementCell1internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    IfStatement_Editor.setupBasic_IfFalseStatementCell1(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      IfStatement_Editor.setupLabel_IfFalseStatementCell1((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createIfFalseStatementCell1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("ifFalseStatement");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createIfFalseStatementCell1internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public static class _RefNodeListHandler68 extends RefNodeListHandler {

    public _RefNodeListHandler68(SNode ownerNode, String childRole, EditorContext context) {
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
          elementCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(elementNode));
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
