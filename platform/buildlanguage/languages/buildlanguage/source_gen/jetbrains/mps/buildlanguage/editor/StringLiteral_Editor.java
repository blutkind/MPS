package jetbrains.mps.buildlanguage.editor;

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
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class StringLiteral_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_3246_0(context, node);
  }

  public EditorCell createCollection_3246_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_3246_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_3246_0(context, node, "\""));
    editorCell.addEditorCell(this.createProperty_3246_1(context, node));
    editorCell.addEditorCell(this.createConstant_3246_1(context, node, "\""));
    return editorCell;
  }

  public EditorCell createConstant_3246_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3246_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_3246_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_3246_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_3246_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_3246_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_3246_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("value");
    provider.setNoTargetText("");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_3246_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_3246_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_3246_0");
    BuildLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_3246_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3246_0");
    BuildLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
  }

  private static void setupBasic_Property_3246_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_value");
    BuildLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(0.0, Measure.SPACES));
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Constant_3246_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_3246_1");
    BuildLanguageStyle_StyleSheet.getStringLiteral(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
  }

}
