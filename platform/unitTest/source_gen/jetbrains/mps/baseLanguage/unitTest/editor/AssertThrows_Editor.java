package jetbrains.mps.baseLanguage.unitTest.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class AssertThrows_Editor extends DefaultNodeEditor {

  private static void setupBasic_CollectionCell18211_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_CollectionCell18211_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell18211_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18211_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell18211_01(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18211_01");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_ConstantCell18211_02(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_ConstantCell18211_02");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_statementRefNodeCell18211_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_statementRefNodeCell18211_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_exceptionTypeRefNodeCell18211_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_exceptionTypeRefNodeCell18211_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupBasic_messageRefNodeCell18211_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_messageRefNodeCell18211_0");
    editorCell.setDrawBorder(false);
  }

  private static void setupLabel_ConstantCell18211_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(Color.blue);
  }

  private static void setupLabel_ConstantCell18211_01(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.getTextLine().setTextColor(Color.blue);
  }

  private static void setupLabel_ConstantCell18211_02(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_statementRefNodeCell18211_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_exceptionTypeRefNodeCell18211_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_messageRefNodeCell18211_0(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.create_CollectionCell18211_0(context, node);
  }

  public EditorCell create_CollectionCell18211_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_CollectionCell18211_0(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.create_ConstantCell18211_0(context, node, "assert"));
    editorCell.addEditorCell(this.create_statementRefNodeCell18211_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18211_01(context, node, "throws"));
    editorCell.addEditorCell(this.create_exceptionTypeRefNodeCell18211_0(context, node));
    editorCell.addEditorCell(this.create_messageRefNodeCell18211_0(context, node));
    editorCell.addEditorCell(this.create_ConstantCell18211_02(context, node, ";"));
    return editorCell;
  }

  public EditorCell create_ConstantCell18211_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18211_0(editorCell, node, context);
    setupLabel_ConstantCell18211_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell18211_01(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18211_01(editorCell, node, context);
    setupLabel_ConstantCell18211_01(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_ConstantCell18211_02(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_ConstantCell18211_02(editorCell, node, context);
    setupLabel_ConstantCell18211_02(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell create_statementRefNodeCell18211_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_statementRefNodeCell18211_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_statementRefNodeCell18211_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_statementRefNodeCell18211_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statement");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_statementRefNodeCell18211_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_exceptionTypeRefNodeCell18211_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_exceptionTypeRefNodeCell18211_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_exceptionTypeRefNodeCell18211_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_exceptionTypeRefNodeCell18211_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("exceptionType");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_exceptionTypeRefNodeCell18211_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell create_messageRefNodeCell18211_0_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_messageRefNodeCell18211_0(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_messageRefNodeCell18211_0((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell create_messageRefNodeCell18211_0(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("message");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.create_messageRefNodeCell18211_0_internal(context, node, provider);
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
