package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;

public class IFeature_Properties extends AbstractCellProvider {

  public IFeature_Properties(SNode node) {
    super(node);
  }

  public EditorCell createEditorCell(EditorContext context) {
    return this.createEditorCell(context, this.getSNode());
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2453_0(context, node);
  }

  public EditorCell createCollection_2453_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2453_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_2453_1(context, node));
    editorCell.addEditorCell(this.createCollection_2453_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2453_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2453_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2453_0(context, node, "properties"));
    return editorCell;
  }

  public EditorCell createCollection_2453_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2453_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2453_1(context, node, "  "));
    editorCell.addEditorCell(this.createCollection_2453_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2453_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2453_3(editorCell, node, context);
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createCollection_2453_4(context, node));
    editorCell.addEditorCell(this.createCollection_2453_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2453_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2453_4(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2453_2(context, node, "ascending"));
    return editorCell;
  }

  public EditorCell createCollection_2453_5(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2453_5(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2453_3(context, node, "  "));
    editorCell.addEditorCell(this.createProperty_2453_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_2453_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2453_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2453_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2453_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2453_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2453_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2453_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2453_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_2453_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_2453_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2453_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("ascending");
    provider.setNoTargetText("<no ascending>");
    EditorCell cellWithRole = this.createProperty_2453_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_2453_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_0");
  }

  private static void setupBasic_Collection_2453_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2453_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2453_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
    }
  }

  private static void setupBasic_Collection_2453_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2453_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2453_1");
  }

  private static void setupBasic_Collection_2453_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_2453_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2453_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2453_2");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_2453_5(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2453_5");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2453_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2453_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Property_2453_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_ascending");
  }

}
