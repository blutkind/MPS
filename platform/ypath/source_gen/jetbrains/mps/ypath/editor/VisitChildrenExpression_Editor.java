package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.ypath.behavior.VisitChildrenExpression_Behavior;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandlerElementKeyMap;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;

public class VisitChildrenExpression_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myListHandler_1180014198298;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1180014178115(context, node);
  }

  public EditorCell createCollection1180014178115(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11800141781151180014178115(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1180014178116(context, node));
    if (renderingCondition9190_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection1180014183119(context, node));
    }
    return editorCell;
  }

  public EditorCell createCollection1180014183119(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11800141831191180014183119(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstant1180014193419(context, node, "("));
    editorCell.addEditorCell(this.createRefNodeList1180014198298(context, node));
    editorCell.addEditorCell(this.createConstant1180014195577(context, node, ")"));
    return editorCell;
  }

  public EditorCell createConstant1180014193419(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11800141934191180014193419(editorCell, node, context);
    setupLabel_Constant_1180014193419_1180014193419(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1180014195577(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11800141955771180014195577(editorCell, node, context);
    setupLabel_Constant_1180014195577_1180014195577(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNodeList1180014198298(EditorContext context, SNode node) {
    if (this.myListHandler_1180014198298 == null) {
      this.myListHandler_1180014198298 = new VisitChildrenExpression_Editor.actualArgumentListHandler_9190_0(node, "actualArgument", context);
    }
    EditorCell_Collection editorCell = this.myListHandler_1180014198298.createCells(context, new CellLayout_Horizontal(), false);
    setupBasic_refNodeList_actualArgument1180014198298(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myListHandler_1180014198298.getElementRole());
    return editorCell;
  }

  public EditorCell createConceptProperty1180014178116_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1180014178116(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1180014178116((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty1180014178116(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1180014178116_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11800141781151180014178115(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1180014178115");
  }

  private static void setupBasic_conceptProperty_alias1180014178116(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "conceptProperty_alias");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.EDITABLE, false);
          this.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_BLUE);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Collection_11800141831191180014183119(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1180014183119");
  }

  private static void setupBasic_Constant_11800141934191180014193419(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1180014193419");
  }

  private static void setupBasic_Constant_11800141955771180014195577(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1180014195577");
  }

  private static void setupBasic_refNodeList_actualArgument1180014198298(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "refNodeList_actualArgument");
  }

  private static void setupLabel_conceptProperty_alias_1180014178116(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1180014193419_1180014193419(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1180014195577_1180014195577(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNodeList_actualArgument_1180014198298(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static boolean renderingCondition9190_0(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(SLinkOperations.getTarget(VisitChildrenExpression_Behavior.call_getEnclosingVisitNodesStatement_1213877259423(node), "visitParameterDeclarationList", true), "visitParameterDeclaration") > 0;
  }

  public static class actualArgumentListHandler_9190_0 extends RefNodeListHandler {

    public actualArgumentListHandler_9190_0(SNode ownerNode, String childRole, EditorContext context) {
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
      return this.createConstant1180014219471(context, node, "<no arguments>");
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext context) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
          elementCell.addKeyMap(new RefNodeListHandlerElementKeyMap(this, ","));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), context));
        }
      }
    }

    public EditorCell createSeparatorCell(EditorContext context) {
      {
        EditorCell_Constant editorCell = new EditorCell_Constant(context, this.getOwner(), ",");
        editorCell.setSelectable(false);
        return editorCell;
      }
    }

    public EditorCell createConstant1180014219471(EditorContext context, SNode node, String text) {
      EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
      setupBasic_Constant_11800142194711180014219471(editorCell, node, context);
      setupLabel_Constant_1180014219471_1180014219471(editorCell, node, context);
      editorCell.setDefaultText("");
      return editorCell;
    }


    private static void setupBasic_Constant_11800142194711180014219471(EditorCell editorCell, SNode node, EditorContext context) {
      editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1180014219471");
      {
        Style inlineStyle = new Style(editorCell) {
          {
            this.set(StyleAttributes.TEXT_COLOR, MPSColors.lightGray);
          }

        };
        inlineStyle.apply(editorCell);
      }
    }

    private static void setupLabel_Constant_1180014219471_1180014219471(EditorCell_Label editorCell, SNode node, EditorContext context) {
    }

}

}
