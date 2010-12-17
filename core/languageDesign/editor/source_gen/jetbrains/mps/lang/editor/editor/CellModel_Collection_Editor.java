package jetbrains.mps.lang.editor.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.AttributeCalculator;
import java.awt.Color;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.editor.behavior.CellModel_Collection_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.cellProviders.RefNodeListHandler;
import jetbrains.mps.smodel.action.NodeFactoryManager;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_DeleteNode;
import jetbrains.mps.nodeEditor.cellMenu.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.DefaultChildSubstituteInfo;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_PropertyValues;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class CellModel_Collection_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createAlternation_cvgoyj_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_cvgoyj_a(editorContext, node);
  }

  private EditorCell createAlternation_cvgoyj_a(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = CellModel_Collection_Editor.renderingCondition_cvgoyj_a0(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_cvgoyj_a0(editorContext, node);
    } else {
      editorCell = this.createCollection_cvgoyj_a0_0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createAlternation_cvgoyj_b2d0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = CellModel_Collection_Editor.renderingCondition_cvgoyj_a1c3a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createProperty_cvgoyj_a1c3a(editorContext, node);
    } else {
      editorCell = this.createRefNode_cvgoyj_a1c3a(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a0");
    Styles_StyleSheet.getRootCellModelStyle(editorCell).apply(editorCell);
    if (renderingCondition_cvgoyj_a0a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_cvgoyj_a0a(editorContext, node));
    }
    if (renderingCondition_cvgoyj_a1a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_cvgoyj_b0a(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_cvgoyj_a0a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_cvgoyj_b0a0(editorContext, node));
    if (renderingCondition_cvgoyj_a2a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_cvgoyj_c0a0(editorContext, node));
    }
    editorCell.addEditorCell(this.createCollection_cvgoyj_d0a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a0a0");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
    editorCell.addEditorCell(this.createComponent_cvgoyj_a0a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_b0a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_b0a0");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
    editorCell.addEditorCell(this.createConstant_cvgoyj_a1a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_cvgoyj_b1a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_c0a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_c0a0");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
    editorCell.addEditorCell(this.createConstant_cvgoyj_a2a0a(editorContext, node));
    editorCell.addEditorCell(this.createComponent_cvgoyj_b2a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_d0a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_d0a0");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.BACKGROUND_COLOR, new AttributeCalculator<Color>() {
        public Color calculate(EditorCell cell) {
          return CellModel_Collection_Editor._StyleParameter_QueryFunction_cvgoyj_a0d0a0((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    editorCell.addEditorCell(this.createComponent_cvgoyj_a3a0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_b0a");
    Styles_StyleSheet.getBorderedCollection(editorCell).apply(editorCell);
    editorCell.addEditorCell(this.createComponent_cvgoyj_a1a0(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_cvgoyj_b1a0(editorContext, node));
    if (renderingCondition_cvgoyj_a2b0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_cvgoyj_c1a0(editorContext, node));
    }
    editorCell.addEditorCell(this.createComponent_cvgoyj_d1a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a0_0");
    Styles_StyleSheet.getRootCellModelStyle(editorCell).apply(editorCell);
    editorCell.addEditorCell(this.createComponent_cvgoyj_a0a(editorContext, node));
    editorCell.addEditorCell(this.createRefNodeList_cvgoyj_b0a(editorContext, node));
    if (renderingCondition_cvgoyj_a2a0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createComponent_cvgoyj_c0a(editorContext, node));
    }
    editorCell.addEditorCell(this.createComponent_cvgoyj_d0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createComponent_cvgoyj_a0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_cvgoyj_b0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_cvgoyj_c0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_cvgoyj_d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_d0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_d0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setGridLayout(true);
    editorCell.addEditorCell(this.createCollection_cvgoyj_a3a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_cvgoyj_b3a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_cvgoyj_c3a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_a3a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_a3a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_cvgoyj_a0d0(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_cvgoyj_b0d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_b3a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_b3a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_cvgoyj_a1d0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_cvgoyj_b1d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_cvgoyj_c3a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_cvgoyj_c3a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.addEditorCell(this.createConstant_cvgoyj_a2d0(editorContext, node));
    editorCell.addEditorCell(this.createAlternation_cvgoyj_b2d0(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_a0a0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _OpenTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_b2a0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new CellModelCollection_FoldedCellComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_a3a0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CloseTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_a1a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _OpenTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_c1a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new CellModelCollection_FoldedCellComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_d1a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CloseTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_a0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _OpenTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, new AttributeCalculator<Boolean>() {
        public Boolean calculate(EditorCell cell) {
          return CellModel_Collection_Editor._StyleParameter_QueryFunction_cvgoyj_a0a0a((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_c0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new CellModelCollection_FoldedCellComponent(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_d0a(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CloseTag(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    Styles_StyleSheet.getTag(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.INDENT_LAYOUT_ON_NEW_LINE, new AttributeCalculator<Boolean>() {
        public Boolean calculate(EditorCell cell) {
          return CellModel_Collection_Editor._StyleParameter_QueryFunction_cvgoyj_a0d0a((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
      style.set(StyleAttributes.INDENT_LAYOUT_NEW_LINE, new AttributeCalculator<Boolean>() {
        public Boolean calculate(EditorCell cell) {
          return CellModel_Collection_Editor._StyleParameter_QueryFunction_cvgoyj_a1d0a((cell == null ?
            null :
            cell.getSNode()
          ), (cell == null ?
            null :
            cell.getEditorContext()
          ));
        }
      });
    }
    CellModel_Collection_Actions.setCellActions(editorCell, node, editorContext);
    return editorCell;
  }

  private EditorCell createComponent_cvgoyj_a0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new _CellModel_Common(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_a1a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_cvgoyj_a1a0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_a2a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_cvgoyj_a2a0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_b0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_cvgoyj_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "Cell collection:");
    editorCell.setCellId("Constant_cvgoyj_c0");
    Styles_StyleSheet.getHeader(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_a0d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "cell layout");
    editorCell.setCellId("Constant_cvgoyj_a0d0");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_a1d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "uses braces");
    editorCell.setCellId("Constant_cvgoyj_a1d0");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_cvgoyj_a2d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "uses folding");
    editorCell.setCellId("Constant_cvgoyj_a2d0");
    Styles_StyleSheet.getProperty(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNodeList_cvgoyj_b1a0a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new CellModel_Collection_Editor.childCellModelListHandler_cvgoyj_b1a0a(node, "childCellModel", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Vertical(), false);
    editorCell.setCellId("refNodeList_childCellModel");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_cvgoyj_b1a0(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new CellModel_Collection_Editor.childCellModelListHandler_cvgoyj_b1a0(node, "childCellModel", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Horizontal(), false);
    editorCell.setCellId("refNodeList_childCellModel_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.HORIZONTAL_GAP, new Padding(0.0, Measure.SPACES));
      style.set(StyleAttributes.DRAW_BORDER, true);
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNodeList_cvgoyj_b0a(EditorContext editorContext, SNode node) {
    AbstractCellListHandler handler = new CellModel_Collection_Editor.childCellModelListHandler_cvgoyj_b0a(node, "childCellModel", editorContext);
    EditorCell_Collection editorCell = handler.createCells(editorContext, new CellLayout_Indent(), false);
    editorCell.setCellId("refNodeList_childCellModel_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
      style.set(StyleAttributes.PADDING_RIGHT, new Padding(1.0, Measure.SPACES));
    }
    editorCell.setRole(handler.getElementRole());
    return editorCell;
  }

  private EditorCell createRefNode_cvgoyj_b0d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("cellLayout");
    provider.setNoTargetText("<no layout>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createRefNode_cvgoyj_a1c3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("usesFoldingCondition");
    provider.setNoTargetText("<no usesFoldingCondition>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_cvgoyj_b1d0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("usesBraces");
    provider.setNoTargetText("<no usesBraces>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_usesBraces");
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private EditorCell createProperty_cvgoyj_a1c3a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("usesFolding");
    provider.setNoTargetText("<no usesFolding>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_usesFolding");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, provider.getCellContext(), new SubstituteInfoPart[]{new CellModel_Collection_Editor.CellModel_Collection_usesFolding_cellMenu_a0a1c3a(), new CellModel_Collection_Editor.CellModel_Collection_generic_cellMenu_b0a1c3a()}));
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = editorContext.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(editorContext, attributeConcept, attributeKind, editorCell);
    } else
    return editorCell;
  }

  private static boolean renderingCondition_cvgoyj_a2a0a(SNode node, EditorContext editorContext, IScope scope) {
    return CellModel_Collection_Behavior.call_isFoldingEnabled_1822203275565710635(node);
  }

  private static boolean renderingCondition_cvgoyj_a0a0(SNode node, EditorContext editorContext, IScope scope) {
    return CellModel_Collection_Behavior.call_isVertical_1237380214915(node);
  }

  private static boolean renderingCondition_cvgoyj_a2b0a(SNode node, EditorContext editorContext, IScope scope) {
    return CellModel_Collection_Behavior.call_isFoldingEnabled_1822203275565710635(node);
  }

  private static boolean renderingCondition_cvgoyj_a1a0(SNode node, EditorContext editorContext, IScope scope) {
    return !(CellModel_Collection_Behavior.call_isVertical_1237380214915(node)) && !(CellModel_Collection_Behavior.call_isIndentLayout_1237380273398(node));
  }

  private static boolean renderingCondition_cvgoyj_a0(SNode node, EditorContext editorContext, IScope scope) {
    return !(CellModel_Collection_Behavior.call_isIndentLayout_1237380273398(node));
  }

  private static boolean renderingCondition_cvgoyj_a2a0(SNode node, EditorContext editorContext, IScope scope) {
    return CellModel_Collection_Behavior.call_isFoldingEnabled_1822203275565710635(node);
  }

  private static boolean renderingCondition_cvgoyj_a1c3a(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "usesFoldingCondition", true) == null);
  }

  private static boolean _StyleParameter_QueryFunction_cvgoyj_a0a0a(SNode node, EditorContext editorContext) {
    return CellModel_Collection_Behavior.call_isVerticalIndent_1237451001939(node);
  }

  private static boolean _StyleParameter_QueryFunction_cvgoyj_a0d0a(SNode node, EditorContext editorContext) {
    return CellModel_Collection_Behavior.call_isVerticalIndent_1237451001939(node);
  }

  private static boolean _StyleParameter_QueryFunction_cvgoyj_a1d0a(SNode node, EditorContext editorContext) {
    return CellModel_Collection_Behavior.call_isVerticalIndent_1237451001939(node);
  }

  private static Color _StyleParameter_QueryFunction_cvgoyj_a0d0a0(SNode node, EditorContext editorContext) {
    return _EditorUtil.grayIfNotSelectable(node);
  }

  private static class childCellModelListHandler_cvgoyj_b1a0a extends RefNodeListHandler {
    public childCellModelListHandler_cvgoyj_b1a0a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }

  private static class childCellModelListHandler_cvgoyj_b1a0 extends RefNodeListHandler {
    public childCellModelListHandler_cvgoyj_b1a0(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }

  private static class childCellModelListHandler_cvgoyj_b0a extends RefNodeListHandler {
    public childCellModelListHandler_cvgoyj_b0a(SNode ownerNode, String childRole, EditorContext context) {
      super(ownerNode, childRole, context, false);
    }

    public SNode createNodeToInsert(EditorContext editorContext) {
      SNode listOwner = super.getOwner();
      return NodeFactoryManager.createNode(listOwner, editorContext, super.getElementRole());
    }

    public EditorCell createNodeCell(EditorContext editorContext, SNode elementNode) {
      EditorCell elementCell = super.createNodeCell(editorContext, elementNode);
      this.installElementCellActions(this.getOwner(), elementNode, elementCell, editorContext);
      return elementCell;
    }

    public EditorCell createEmptyCell(EditorContext editorContext) {
      EditorCell emptyCell = null;
      emptyCell = super.createEmptyCell(editorContext);
      this.installElementCellActions(super.getOwner(), null, emptyCell, editorContext);
      return emptyCell;
    }

    public void installElementCellActions(SNode listOwner, SNode elementNode, EditorCell elementCell, EditorContext editorContext) {
      if (elementCell.getUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET) == null) {
        elementCell.putUserObject(AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET, AbstractCellListHandler.ELEMENT_CELL_ACTIONS_SET);
        SNode substituteInfoNode = listOwner;
        if (elementNode != null) {
          substituteInfoNode = elementNode;
          elementCell.setAction(CellActionType.DELETE, new CellAction_DeleteNode(elementNode));
        }
        if (elementCell.getSubstituteInfo() == null || elementCell.getSubstituteInfo() instanceof DefaultReferenceSubstituteInfo) {
          elementCell.setSubstituteInfo(new DefaultChildSubstituteInfo(listOwner, elementNode, super.getLinkDeclaration(), editorContext));
        }
      }
    }
  }

  public static class CellModel_Collection_usesFolding_cellMenu_a0a1c3a extends AbstractCellMenuPart_PropertyValues {
    public CellModel_Collection_usesFolding_cellMenu_a0a1c3a() {
    }

    public List<String> getPropertyValues(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<String>(), "true", "false");
    }
  }

  public static class CellModel_Collection_generic_cellMenu_b0a1c3a extends AbstractCellMenuPart_Generic_Item {
    public CellModel_Collection_generic_cellMenu_b0a1c3a() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SLinkOperations.setNewChild(node, "usesFoldingCondition", "jetbrains.mps.lang.editor.structure.QueryFunction_NodeCondition");
    }

    public String getMatchingText() {
      return "query";
    }
  }
}
