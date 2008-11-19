package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class BitwiseNotExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1225894578681(context, node);
  }

  public EditorCell createCollection1225894578681(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12258945786811225894578681(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1225894578682(context, node, "~"));
    editorCell.addEditorCell(this.createConstant1225894578687(context, node, "("));
    editorCell.addEditorCell(this.createRefNode1225894578688(context, node));
    editorCell.addEditorCell(this.createConstant1225894578689(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1225894578682(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12258945786821225894578682(editorCell, node, context);
    setupLabel_Constant_1225894578682_1225894578682(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225894578687(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12258945786871225894578687(editorCell, node, context);
    setupLabel_Constant_1225894578687_1225894578687(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1225894578689(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12258945786891225894578689(editorCell, node, context);
    setupLabel_Constant_1225894578689_1225894578689(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1225894578688_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_expression1225894578688(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_expression_1225894578688((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1225894578688(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("expression");
    provider.setNoTargetText("<no expression>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1225894578688_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12258945786811225894578681(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1225894578681");
  }

  private static void setupBasic_Constant_12258945786821225894578682(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225894578682");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.FONT_STYLE, MPSFonts.PLAIN);
          this.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
          this.set(StyleAttributes.LAST_POSITION_ALLOWED, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
    BitwiseNotExpression_Parens_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupBasic_Constant_12258945786871225894578687(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225894578687");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_refNode_expression1225894578688(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12258945786891225894578689(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1225894578689");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, true);
        }

      };
      inlineStyle.apply(editorCell);
    }
    NotExpression_Parens_Actions.setCellActions(editorCell, node, context);
  }

  private static void setupLabel_Constant_1225894578682_1225894578682(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225894578687_1225894578687(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_expression_1225894578688(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1225894578689_1225894578689(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
