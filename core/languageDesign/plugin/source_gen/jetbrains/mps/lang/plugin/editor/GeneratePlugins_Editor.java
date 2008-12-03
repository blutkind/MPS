package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;

public class GeneratePlugins_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1228269557894(context, node);
  }

  public EditorCell createCollection1228269557883(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12282695578831228269557883(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228269557884(context, node));
    editorCell.addEditorCell(this.createCollection1228269557889(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557884(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695578841228269557884(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228269557886(context, node, "generate project component"));
    editorCell.addEditorCell(this.createConstant1228269557887(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1228269557888(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557889(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695578891228269557889(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228269557891(context, node, "generate application component"));
    editorCell.addEditorCell(this.createConstant1228269557892(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1228269557893(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557894(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12282695578941228269557894(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228269557895(context, node));
    editorCell.addEditorCell(this.createCollection1228269557898(context, node));
    if (renderingCondition1681_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228269558308(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228269557895(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695578951228269557895(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228269557882(context, node, "Generate Plugins"));
    if (renderingCondition1681_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228269558303(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228269557898(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695578981228269557898(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1681_0(context, node));
    editorCell.addEditorCell(this.createCollection1228269557883(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228269557882(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695578821228269557882(editorCell, node, context);
    setupLabel_Constant_1228269557882_1228269557882(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557886(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695578861228269557886(editorCell, node, context);
    setupLabel_Constant_1228269557886_1228269557886(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557887(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695578871228269557887(editorCell, node, context);
    setupLabel_Constant_1228269557887_1228269557887(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557891(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695578911228269557891(editorCell, node, context);
    setupLabel_Constant_1228269557891_1228269557891(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557892(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695578921228269557892(editorCell, node, context);
    setupLabel_Constant_1228269557892_1228269557892(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269558303(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695583031228269558303(editorCell, node, context);
    setupLabel_Constant_1228269558303_1228269558303(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269558308(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695583081228269558308(editorCell, node, context);
    setupLabel_Constant_1228269558308_1228269558308(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell1681_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228269557888_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateProjectPlugin1228269557888(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateProjectPlugin_1228269557888((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228269557888(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateProjectPlugin");
    provider.setNoTargetText("<no generateProjectPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228269557888_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1228269557893_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateApplicationPlugin1228269557893(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateApplicationPlugin_1228269557893((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228269557893(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateApplicationPlugin");
    provider.setNoTargetText("<no generateApplicationPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228269557893_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Constant_12282695578821228269557882(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557882");
  }

  private static void setupBasic_Collection_12282695578831228269557883(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557883");
  }

  private static void setupBasic_Collection_12282695578841228269557884(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557884");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12282695578861228269557886(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557886");
  }

  private static void setupBasic_Constant_12282695578871228269557887(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557887");
  }

  private static void setupBasic_property_generateProjectPlugin1228269557888(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateProjectPlugin");
  }

  private static void setupBasic_Collection_12282695578891228269557889(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557889");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12282695578911228269557891(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557891");
  }

  private static void setupBasic_Constant_12282695578921228269557892(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557892");
  }

  private static void setupBasic_property_generateApplicationPlugin1228269557893(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateApplicationPlugin");
  }

  private static void setupBasic_Collection_12282695578941228269557894(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557894");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12282695578951228269557895(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557895");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12282695578981228269557898(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557898");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12282695578991228269557899(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228269557899");
  }

  private static void setupBasic_Constant_12282695583031228269558303(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269558303");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12282695583081228269558308(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269558308");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228269557882_1228269557882(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557886_1228269557886(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557887_1228269557887(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateProjectPlugin_1228269557888(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557891_1228269557891(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557892_1228269557892(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateApplicationPlugin_1228269557893(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269558303_1228269558303(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269558308_1228269558308(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1681_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition1681_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

}
