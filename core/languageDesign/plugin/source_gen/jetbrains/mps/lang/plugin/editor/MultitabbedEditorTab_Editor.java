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
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;

public class MultitabbedEditorTab_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1228269557473(context, node);
  }

  public EditorCell createCollection1228269557441(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695574411228269557441(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228269557442(context, node, "multitabbed editor tab"));
    editorCell.addEditorCell(this.createProperty1228269557444(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557446(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12282695574461228269557446(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228269557447(context, node));
    editorCell.addEditorCell(this.createConstant1228269557451(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228269557452(context, node));
    editorCell.addEditorCell(this.createConstant1228269557453(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228269557454(context, node));
    editorCell.addEditorCell(this.createConstant1228269557455(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228269557456(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557447(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695574471228269557447(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228269557448(context, node, "empty text:"));
    editorCell.addEditorCell(this.createProperty1228269557449(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228269557473(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12282695574731228269557473(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228269557474(context, node));
    editorCell.addEditorCell(this.createCollection1228269557477(context, node));
    if (renderingCondition7753_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228269558212(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228269557474(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695574741228269557474(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228269557441(context, node));
    if (renderingCondition7753_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228269558207(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228269557477(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12282695574771228269557477(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell7753_0(context, node));
    editorCell.addEditorCell(this.createCollection1228269557446(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228269557442(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695574421228269557442(editorCell, node, context);
    setupLabel_Constant_1228269557442_1228269557442(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557448(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695574481228269557448(editorCell, node, context);
    setupLabel_Constant_1228269557448_1228269557448(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557451(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695574511228269557451(editorCell, node, context);
    setupLabel_Constant_1228269557451_1228269557451(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557453(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695574531228269557453(editorCell, node, context);
    setupLabel_Constant_1228269557453_1228269557453(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269557455(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695574551228269557455(editorCell, node, context);
    setupLabel_Constant_1228269557455_1228269557455(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269558207(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695582071228269558207(editorCell, node, context);
    setupLabel_Constant_1228269558207_1228269558207(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228269558212(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12282695582121228269558212(editorCell, node, context);
    setupLabel_Constant_1228269558212_1228269558212(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createIndentCell7753_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228269557444_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1228269557444(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1228269557444((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228269557444(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<tab caption>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228269557444_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1228269557449_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_emptyCaption1228269557449(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_emptyCaption_1228269557449((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228269557449(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("emptyCaption");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty1228269557449_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228269557452_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_getNodesBlock1228269557452(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_getNodesBlock_1228269557452((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228269557452(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getNodesBlock");
    provider.setNoTargetText("<no getNodesBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228269557452_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228269557454_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_getInnerTabNameBlock1228269557454(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_getInnerTabNameBlock_1228269557454((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228269557454(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("getInnerTabNameBlock");
    provider.setNoTargetText("<inner tab text : use node name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228269557454_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228269557456_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_createBlock1228269557456(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_createBlock_1228269557456((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228269557456(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("createBlock");
    provider.setNoTargetText("<can't create node from this tab>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228269557456_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12282695574411228269557441(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557441");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12282695574421228269557442(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557442");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.TEXT_BACKGROUND_COLOR, MPSColors.orange);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_property_name1228269557444(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
  }

  private static void setupBasic_Collection_12282695574461228269557446(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557446");
  }

  private static void setupBasic_Collection_12282695574471228269557447(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557447");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12282695574481228269557448(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557448");
  }

  private static void setupBasic_property_emptyCaption1228269557449(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_emptyCaption");
  }

  private static void setupBasic_Constant_12282695574511228269557451(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557451");
  }

  private static void setupBasic_refNode_getNodesBlock1228269557452(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12282695574531228269557453(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557453");
  }

  private static void setupBasic_refNode_getInnerTabNameBlock1228269557454(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12282695574551228269557455(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269557455");
  }

  private static void setupBasic_refNode_createBlock1228269557456(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_12282695574731228269557473(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557473");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12282695574741228269557474(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557474");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12282695574771228269557477(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228269557477");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12282695574781228269557478(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228269557478");
  }

  private static void setupBasic_Constant_12282695582071228269558207(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269558207");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12282695582121228269558212(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228269558212");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228269557442_1228269557442(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1228269557444(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557448_1228269557448(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_emptyCaption_1228269557449(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557451_1228269557451(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_getNodesBlock_1228269557452(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557453_1228269557453(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_getInnerTabNameBlock_1228269557454(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269557455_1228269557455(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_createBlock_1228269557456(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269558207_1228269558207(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228269558212_1228269558212(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition7753_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition7753_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

}
