package jetbrains.mps.baseLanguage.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;

public class SetAccessor_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_4227_0(context, node);
  }

  public EditorCell createCollection_4227_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_4227_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_4227_5(context, node, "set"));
    editorCell.addEditorCell(this.createConstant_4227_2(context, node, "("));
    editorCell.addEditorCell(this.createConstant_4227_4(context, node, "value"));
    editorCell.addEditorCell(this.createConstant_4227_3(context, node, ")"));
    editorCell.addEditorCell(this.createConstant_4227_1(context, node, "{"));
    editorCell.addEditorCell(this.createRefNode_4227_1(context, node));
    editorCell.addEditorCell(this.createConstant_4227_0(context, node, "}"));
    return editorCell;
  }

  public EditorCell createConstant_4227_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4227_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4227_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4227_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4227_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_4227_5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_4227_5(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_4227_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_4227_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_4227_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("statementList");
    provider.setNoTargetText("<no statementList>");
    EditorCell cellWithRole = this.createRefNode_4227_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_4227_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_4227_0");
  }

  private static void setupBasic_RefNode_4227_0(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_INDENT, true);
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_4227_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_0");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_4227_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_1");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, true);
    }
  }

  private static void setupBasic_Constant_4227_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_2");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_4227_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_3");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_4227_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_4");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
    }
  }

  private static void setupBasic_Constant_4227_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_4227_5");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

}
