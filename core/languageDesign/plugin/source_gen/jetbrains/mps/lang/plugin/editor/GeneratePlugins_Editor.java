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
    return this.createCollection1228678116411(context, node);
  }

  public EditorCell createCollection1228678116385(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286781163851228678116385(editorCell, node, context);
    editorCell.setGridLayout(true);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228678116386(context, node));
    editorCell.addEditorCell(this.createCollection1228678116391(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228678116386(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781163861228678116386(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228678116388(context, node, "generate project component"));
    editorCell.addEditorCell(this.createConstant1228678116389(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1228678116390(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228678116391(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781163911228678116391(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228678116393(context, node, "generate application component"));
    editorCell.addEditorCell(this.createConstant1228678116394(context, node, ":"));
    editorCell.addEditorCell(this.createProperty1228678116395(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228678116411(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286781164111228678116411(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228678116412(context, node));
    editorCell.addEditorCell(this.createCollection1228678116415(context, node));
    if (renderingCondition1681_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228678116951(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228678116412(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781164121228678116412(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228678116384(context, node, "Generate Plugins"));
    if (renderingCondition1681_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228678116946(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228678116415(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286781164151228678116415(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell1681_0(context, node));
    editorCell.addEditorCell(this.createCollection1228678116385(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228678116384(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781163841228678116384(editorCell, node, context);
    setupLabel_Constant_1228678116384_1228678116384(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116388(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781163881228678116388(editorCell, node, context);
    setupLabel_Constant_1228678116388_1228678116388(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116389(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781163891228678116389(editorCell, node, context);
    setupLabel_Constant_1228678116389_1228678116389(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116393(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781163931228678116393(editorCell, node, context);
    setupLabel_Constant_1228678116393_1228678116393(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116394(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781163941228678116394(editorCell, node, context);
    setupLabel_Constant_1228678116394_1228678116394(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116946(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781169461228678116946(editorCell, node, context);
    setupLabel_Constant_1228678116946_1228678116946(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228678116951(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286781169511228678116951(editorCell, node, context);
    setupLabel_Constant_1228678116951_1228678116951(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell1681_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228678116390_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateProjectPlugin1228678116390(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateProjectPlugin_1228678116390((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228678116390(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateProjectPlugin");
    provider.setNoTargetText("<no generateProjectPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228678116390_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1228678116395_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_generateApplicationPlugin1228678116395(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_generateApplicationPlugin_1228678116395((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228678116395(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("generateApplicationPlugin");
    provider.setNoTargetText("<no generateApplicationPlugin>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228678116395_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Constant_12286781163841228678116384(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116384");
  }

  private static void setupBasic_Collection_12286781163851228678116385(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116385");
  }

  private static void setupBasic_Collection_12286781163861228678116386(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116386");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12286781163881228678116388(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116388");
  }

  private static void setupBasic_Constant_12286781163891228678116389(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116389");
  }

  private static void setupBasic_property_generateProjectPlugin1228678116390(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateProjectPlugin");
  }

  private static void setupBasic_Collection_12286781163911228678116391(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116391");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12286781163931228678116393(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116393");
  }

  private static void setupBasic_Constant_12286781163941228678116394(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116394");
  }

  private static void setupBasic_property_generateApplicationPlugin1228678116395(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_generateApplicationPlugin");
  }

  private static void setupBasic_Collection_12286781164111228678116411(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116411");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286781164121228678116412(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116412");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286781164151228678116415(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228678116415");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12286781164161228678116416(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228678116416");
  }

  private static void setupBasic_Constant_12286781169461228678116946(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116946");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12286781169511228678116951(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228678116951");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228678116384_1228678116384(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116388_1228678116388(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116389_1228678116389(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateProjectPlugin_1228678116390(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116393_1228678116393(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116394_1228678116394(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_generateApplicationPlugin_1228678116395(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116946_1228678116946(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228678116951_1228678116951(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition1681_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition1681_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

}
