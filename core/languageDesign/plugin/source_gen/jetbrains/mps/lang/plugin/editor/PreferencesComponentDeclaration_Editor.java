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

  /* package */AbstractCellListHandler myListHandler_1227642410670;
  /* package */AbstractCellListHandler myListHandler_1227642410682;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1227642410685(context, node);
  }

  public EditorCell createCollection1227642410665(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424106651227642410665(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1227642410666(context, node, "preferences component"));
    editorCell.addEditorCell(this.createProperty1227642410667(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642410669(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12276424106691227642410669(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNodeList1227642410670(context, node));
    editorCell.addEditorCell(this.createConstant1227642410672(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227642410674(context, node));
    editorCell.addEditorCell(this.createConstant1227642410675(context, node, ""));
    editorCell.addEditorCell(this.createRefNode1227642410677(context, node));
    editorCell.addEditorCell(this.createConstant1227642410678(context, node, ""));
    editorCell.addEditorCell(this.createConstant1227642410680(context, node, ""));
    editorCell.addEditorCell(this.createRefNodeList1227642410682(context, node));
    return editorCell;
  }

  public EditorCell createCollection1227642410685(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_12276424106851227642410685(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227642410686(context, node));
    editorCell.addEditorCell(this.createCollection1227642410689(context, node));
    if (renderingCondition4007_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227642411432(context, node, "}"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227642410686(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424106861227642410686(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCollection1227642410665(context, node));
    if (renderingCondition4007_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant1227642411427(context, node, "{"));
    }
    return editorCell;
  }

  public EditorCell createCollection1227642410689(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12276424106891227642410689(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndentCell4007_0(context, node));
    editorCell.addEditorCell(this.createCollection1227642410669(context, node));
    return editorCell;
  }

  public EditorCell createConstant1227642410666(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424106661227642410666(editorCell, node, context);
    setupLabel_Constant_1227642410666_1227642410666(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410672(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424106721227642410672(editorCell, node, context);
    setupLabel_Constant_1227642410672_1227642410672(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410675(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424106751227642410675(editorCell, node, context);
    setupLabel_Constant_1227642410675_1227642410675(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410678(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424106781227642410678(editorCell, node, context);
    setupLabel_Constant_1227642410678_1227642410678(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642410680(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424106801227642410680(editorCell, node, context);
    setupLabel_Constant_1227642410680_1227642410680(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411427(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424114271227642411427(editorCell, node, context);
    setupLabel_Constant_1227642411427_1227642411427(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1227642411432(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12276424114321227642411432(editorCell, node, context);
    setupLabel_Constant_1227642411432_1227642411432(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1227642410670(EditorContext context, SNode node) {
    if (this.myListHandler_1227642410670 == null) {
      this.myListHandler_1227642410670 = new PreferencesComponentDeclaration_Editor.persistenPropertyDeclarationListHandler_4007_0(node, "persistenPropertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227642410670.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_persistenPropertyDeclaration1227642410670(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227642410670.getElementRole());
    return editorCell;
  }

  public EditorCell createRefNodeList1227642410682(EditorContext context, SNode node) {
    if (this.myListHandler_1227642410682 == null) {
      this.myListHandler_1227642410682 = new PreferencesComponentDeclaration_Editor.preferencePageListHandler_4007_0(node, "preferencePage", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1227642410682.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_refNodeList_preferencePage1227642410682(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.setRole(this.myListHandler_1227642410682.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell4007_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createProperty1227642410667_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1227642410667(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1227642410667((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1227642410667(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1227642410667_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227642410674_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_afterReadBlock1227642410674(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_afterReadBlock_1227642410674((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227642410674(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("afterReadBlock");
    provider.setNoTargetText("<no afterReadBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227642410674_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1227642410677_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_beforeWriteBlock1227642410677(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_beforeWriteBlock_1227642410677((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1227642410677(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("beforeWriteBlock");
    provider.setNoTargetText("<no beforeWriteBlock>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1227642410677_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12276424106651227642410665(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410665");
  }

  private static void setupBasic_Constant_12276424106661227642410666(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410666");
  }

  private static void setupBasic_property_name1227642410667(EditorCell editorCell, SNode node, EditorContext context) {
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

  private static void setupBasic_Collection_12276424106691227642410669(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410669");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_persistenPropertyDeclaration1227642410670(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_persistenPropertyDeclaration");
  }

  private static void setupBasic_Constant_12276424106721227642410672(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410672");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_afterReadBlock1227642410674(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12276424106751227642410675(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410675");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_beforeWriteBlock1227642410677(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12276424106781227642410678(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410678");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_12276424106801227642410680(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642410680");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNodeList_preferencePage1227642410682(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_preferencePage");
  }

  private static void setupBasic_Collection_12276424106851227642410685(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410685");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12276424106861227642410686(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410686");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_12276424106891227642410689(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1227642410689");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Indent_12276424106901227642410690(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1227642410690");
  }

  private static void setupBasic_Constant_12276424114271227642411427(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411427");
    BaseLanguageStyle_StyleSheet.getLeftBrace(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_12276424114321227642411432(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1227642411432");
    BaseLanguageStyle_StyleSheet.getRightBrace(editorCell).apply(editorCell);
  }

  private static void setupLabel_Constant_1227642410666_1227642410666(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1227642410667(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_persistenPropertyDeclaration_1227642410670(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410672_1227642410672(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_afterReadBlock_1227642410674(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410675_1227642410675(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_beforeWriteBlock_1227642410677(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410678_1227642410678(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642410680_1227642410680(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_preferencePage_1227642410682(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411427_1227642411427(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1227642411432_1227642411432(EditorCell_Label editorCell, SNode node, EditorContext context) {
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
      return this.createConstant1227642410671(context, node, "<persistent properties>");
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

    public EditorCell createConstant1227642410671(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12276424106711227642410671(editorCell, node, context);
      setupLabel_Constant_1227642410671_1227642410671(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12276424106711227642410671(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227642410671");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1227642410671_1227642410671(EditorCell_Label editorCell, SNode node, EditorContext context) {
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
      return this.createConstant1227642410683(context, node, "<no preference pages>");
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

    public EditorCell createConstant1227642410683(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_12276424106831227642410683(editorCell, node, context);
      setupLabel_Constant_1227642410683_1227642410683(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_12276424106831227642410683(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1227642410683");
      BaseLanguageStyle_StyleSheet.getEmptyCell(editorCell).apply(editorCell);
    }

    private static void setupLabel_Constant_1227642410683_1227642410683(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
