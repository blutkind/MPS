package jetbrains.mps.lang.plugin.editor;

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
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.sharedConcepts.editor.SharedStyles_StyleSheet;

public class PropertyRefExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1110_0(context, node);
  }

  public EditorCell createCollection_1110_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(context, node);
    setupBasic_Collection_1110_0(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_1110_0(context, node, "property"));
    editorCell.addEditorCell(this.createConstant_1110_1(context, node, "/"));
    editorCell.addEditorCell(this.createRefNode_1110_1(context, node));
    editorCell.addEditorCell(this.createConstant_1110_2(context, node, "|"));
    editorCell.addEditorCell(this.createRefCell_1110_1(context, node));
    editorCell.addEditorCell(this.createConstant_1110_3(context, node, "/"));
    return editorCell;
  }

  public EditorCell createConstant_1110_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1110_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1110_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1110_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1110_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1110_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_1110_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1110_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode_1110_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1110_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1110_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("nodeExpr");
    provider.setNoTargetText("<no nodeExpr>");
    EditorCell cellWithRole = this.createRefNode_1110_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefCell_1110_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    provider.setAuxiliaryCellProvider(new PropertyRefExpression_Editor._Inline1110_0());
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefCell_1110_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefCell_1110_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("propertyDeclaration");
    provider.setNoTargetText("link");
    EditorCell cellWithRole = this.createRefCell_1110_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1110_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1110_0");
  }

  private static void setupBasic_Constant_1110_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1110_0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Constant_1110_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1110_1");
    BaseLanguageStyle_StyleSheet.getLeftParenAfterName(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_1110_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_1110_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1110_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
  }

  private static void setupBasic_RefCell_1110_0(EditorCell editorCell, SNode node, EditorContext context) {
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
    }
  }

  private static void setupBasic_Constant_1110_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1110_3");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  public static class _Inline1110_0 extends AbstractCellProvider {

    public _Inline1110_0() {
      super();
    }

    public EditorCell createEditorCell(EditorContext context) {
      return this.createEditorCell(context, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext context, SNode node) {
      return this.createProperty_1110_1(context, node);
    }

    public EditorCell createProperty_1110_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
      EditorCell editorCell = provider.createEditorCell(context);
      setupBasic_Property_1110_0(editorCell, node, context);
      editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
      return editorCell;
    }

    public EditorCell createProperty_1110_1(EditorContext context, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, context);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell cellWithRole = this.createProperty_1110_0_internal(context, node, provider);
      SNode attributeConcept = provider.getRoleAttribute();
      Class attributeKind = provider.getRoleAttributeClass();
      if (attributeConcept != null) {
        IOperationContext opContext = context.getOperationContext();
        EditorManager manager = EditorManager.getInstanceFromContext(opContext);
        return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
      } else
      return cellWithRole;
    }


    private static void setupBasic_Property_1110_0(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("property_name");
      SharedStyles_StyleSheet.getReferenceOnConceptualFeature(editorCell).apply(editorCell);
      {
        Style style = editorCell.getStyle();
        style.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
      }
    }

}

}
