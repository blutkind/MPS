package jetbrains.mps.lang.plugin.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.nodeEditor.BlockCells;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class PreferencesComponentDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1228677765903;
  /* package */AbstractCellListHandler myListHandler_1228677765915;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1228677765918(context, node);
  }

  public EditorCell createCollection1228677765898(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286777658981228677765898(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1228677765899(context, node, "preferences component"));
    editorCell.addEditorCell(this.createProperty1228677765900(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228677765902(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286777659021228677765902(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1228677765903(context, node));
    editorCell.addEditorCell(this.createConstant1228677765905(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228677765907(context, node));
    editorCell.addEditorCell(this.createConstant1228677765908(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1228677765910(context, node));
    editorCell.addEditorCell(this.createConstant1228677765911(context, node, ""));
    editorCell.addEditorCell(this.createConstant1228677765913(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1228677765915(context, node));
    return editorCell;
  }

  public EditorCell createCollection1228677765918(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12286777659181228677765918(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228677765919(context, node));
    editorCell.addEditorCell(this.createCollection1228677765922(context, node));
    if (renderingCondition4007_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228677766438(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228677765919(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286777659191228677765919(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1228677765898(context, node));
    if (renderingCondition4007_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1228677766433(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1228677765922(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12286777659221228677765922(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell4007_0(context, node));
    editorCell.addEditorCell(this.createCollection1228677765902(context, node));
    return editorCell;
  }

  public EditorCell createConstant1228677765899(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777658991228677765899(editorCell, node, context);
    setupLabel_Constant_1228677765899_1228677765899(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677765905(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777659051228677765905(editorCell, node, context);
    setupLabel_Constant_1228677765905_1228677765905(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677765908(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777659081228677765908(editorCell, node, context);
    setupLabel_Constant_1228677765908_1228677765908(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677765911(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777659111228677765911(editorCell, node, context);
    setupLabel_Constant_1228677765911_1228677765911(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677765913(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777659131228677765913(editorCell, node, context);
    setupLabel_Constant_1228677765913_1228677765913(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677766433(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777664331228677766433(editorCell, node, context);
    setupLabel_Constant_1228677766433_1228677766433(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1228677766438(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12286777664381228677766438(editorCell, node, context);
    setupLabel_Constant_1228677766438_1228677766438(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1228677765903(EditorContext context, SNode node) {
    if (this.myListHandler_1228677765903 == null) {
      this.myListHandler_1228677765903 = new PreferencesComponentDeclaration_Editor.persistenPropertyDeclarationListHandler_4007_0(node, "persistenPropertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228677765903.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_persistenPropertyDeclaration1228677765903(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228677765903.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1228677765915(EditorContext context, SNode node) {
    if (this.myListHandler_1228677765915 == null) {
      this.myListHandler_1228677765915 = new PreferencesComponentDeclaration_Editor.preferencePageListHandler_4007_0(node, "preferencePage", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1228677765915.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_preferencePage1228677765915(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1228677765915.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell4007_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1228677765900_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1228677765900(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1228677765900((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1228677765900(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1228677765900_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228677765907_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_afterReadBlock1228677765907(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_afterReadBlock_1228677765907((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228677765907(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("afterReadBlock");
    provider.setNoTargetText("<no afterReadBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228677765907_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1228677765910_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_beforeWriteBlock1228677765910(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_beforeWriteBlock_1228677765910((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1228677765910(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("beforeWriteBlock");
    provider.setNoTargetText("<no beforeWriteBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1228677765910_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12286777658981228677765898(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228677765898");
  }

  private static void setupBasic_Constant_12286777658991228677765899(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677765899");
  }

  private static void setupBasic_property_name1228677765900(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286777659021228677765902(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228677765902");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_persistenPropertyDeclaration1228677765903(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_persistenPropertyDeclaration");
  }

  private static void setupBasic_Constant_12286777659051228677765905(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677765905");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_afterReadBlock1228677765907(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12286777659081228677765908(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677765908");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_beforeWriteBlock1228677765910(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12286777659111228677765911(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677765911");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12286777659131228677765913(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677765913");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_preferencePage1228677765915(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_preferencePage");
  }

  private static void setupBasic_Collection_12286777659181228677765918(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228677765918");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286777659191228677765919(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228677765919");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12286777659221228677765922(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1228677765922");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12286777659231228677765923(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1228677765923");
  }

  private static void setupBasic_Constant_12286777664331228677766433(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677766433");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12286777664381228677766438(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1228677766438");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1228677765899_1228677765899(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1228677765900(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_persistenPropertyDeclaration_1228677765903(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677765905_1228677765905(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_afterReadBlock_1228677765907(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677765908_1228677765908(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_beforeWriteBlock_1228677765910(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677765911_1228677765911(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677765913_1228677765913(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_preferencePage_1228677765915(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677766433_1228677766433(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1228677766438_1228677766438(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition4007_0(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static boolean renderingCondition4007_1(SNode node, EditorContext editorContext, IScope scope) {
    return BlockCells.useBraces();
  }

  public static class persistenPropertyDeclarationListHandler_4007_0 extends RefNodeListHandler {

    public persistenPropertyDeclarationListHandler_4007_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1228677765904(context, node, "<persistent properties>");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1228677765904(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12286777659041228677765904(editorCell, node, context);
      setupLabel_Constant_1228677765904_1228677765904(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12286777659041228677765904(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228677765904");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1228677765904_1228677765904(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}
  public static class preferencePageListHandler_4007_0 extends RefNodeListHandler {

    public preferencePageListHandler_4007_0(SNode ownerNode, String childRole, EditorContext context) {
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
      emptyCell = this.createEmptyCell_internal(context, this.getOwner());
      this.installElementCellActions(super.getOwner(), null, emptyCell, context);
      return emptyCell;
    }

    public EditorCell createEmptyCell_internal(EditorContext context, SNode node) {
      return this.createConstant1228677765916(context, node, "<no preference pages>");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      return super.createSeparatorCell(context);
    }

    public EditorCell createConstant1228677765916(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12286777659161228677765916(editorCell, node, context);
      setupLabel_Constant_1228677765916_1228677765916(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12286777659161228677765916(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1228677765916");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1228677765916_1228677765916(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
