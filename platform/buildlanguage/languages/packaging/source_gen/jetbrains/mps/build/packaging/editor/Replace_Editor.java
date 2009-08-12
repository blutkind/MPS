package jetbrains.mps.build.packaging.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class Replace_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1160_0;
  /* package */AbstractCellProvider myConfigurationReferencesEditorComponent1160_1;
  /* package */AbstractCellListHandler myListHandler_1160_0;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_1160_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_1160_2(context, node);
  }

  public EditorCell createCollection_1160_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1160_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_1160_1(context, node));
    editorCell.addEditorCell(this.createCollection_1160_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1160_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1160_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConceptProperty_1160_1(context, node));
    editorCell.addEditorCell(this.createRefNode_1160_1(context, node));
    editorCell.addEditorCell(this.createConstant_1160_0(context, node, "from"));
    editorCell.addEditorCell(this.createRefNode_1160_3(context, node));
    editorCell.addEditorCell(this.createComponent_1160_0(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1160_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_1160_2(editorCell, node, context);
    editorCell.addEditorCell(this.createComponent_1160_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_1160_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_1160_3(editorCell, node, context);
    editorCell.addEditorCell(this.createIndentCell1160_0(context, node));
    editorCell.addEditorCell(this.createRefNodeList_1160_0(context, node));
    return editorCell;
  }

  public EditorCell createComponent_1160_0(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1160_0 == null) {
      this.myConfigurationReferencesEditorComponent1160_0 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1160_0.createEditorCell(context);
    setupBasic_Component_1160_0(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createComponent_1160_1(EditorContext context, SNode node) {
    if (this.myConfigurationReferencesEditorComponent1160_1 == null) {
      this.myConfigurationReferencesEditorComponent1160_1 = new ConfigurationReferencesEditorComponent(node);
    }
    EditorCell editorCell = this.myConfigurationReferencesEditorComponent1160_1.createEditorCell(context);
    setupBasic_Component_1160_1(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstant_1160_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_1160_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList_1160_0(EditorContext context, SNode node) {
    if (this.myListHandler_1160_0 == null) {
      this.myListHandler_1160_0 = new Replace_Editor.replacingPairListHandler_1160_0(node, "replacingPair", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1160_0.createCells(context, new CellLayout_Vertical(), false);
    setupBasic_RefNodeList_1160_0(editorCell, node, context);
    editorCell.setRole(this.myListHandler_1160_0.getElementRole());
    return editorCell;
  }

  public EditorCell createIndentCell1160_0(EditorContext context, SNode node) {
    EditorCell_Indent result = new EditorCell_Indent(context, node);
    return result;
  }

  public EditorCell createRefNode_1160_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1160_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1160_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("title");
    provider.setNoTargetText("<no title>");
    EditorCell cellWithRole = this.createRefNode_1160_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createConceptProperty_1160_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_1160_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_1160_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_1160_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_1160_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_1160_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_1160_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("sourcePath");
    provider.setNoTargetText("<no sourcePath>");
    EditorCell cellWithRole = this.createRefNode_1160_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1160_0");
  }

  private static void setupBasic_Collection_1160_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1160_1");
  }

  private static void setupBasic_RefNode_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1160_0");
    PackagingStyles_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Component_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_1160_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1160_2");
  }

  private static void setupBasic_Component_1160_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Collection_1160_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1160_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Indent_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Indent_1160_0");
  }

  private static void setupBasic_RefNodeList_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("refNodeList_replacingPair");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_ConceptProperty_1160_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    PackagingStyles_StyleSheet.getProjectComponent(editorCell).apply(editorCell);
  }

  private static void setupBasic_RefNode_1160_1(EditorCell editorCell, SNode node, EditorContext context) {
  }

  public static class replacingPairListHandler_1160_0 extends RefNodeListHandler {

    public replacingPairListHandler_1160_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant_1160_1(context, node, "<pairs token-value>");
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

    public EditorCell createConstant_1160_1(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_1160_1(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_1160_1(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.setCellId("Constant_1160_1");
      PackagingStyles_StyleSheet.getHint(editorCell).apply(editorCell);
    }

}

}
