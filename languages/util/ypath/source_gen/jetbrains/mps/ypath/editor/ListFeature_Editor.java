package jetbrains.mps.ypath.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.ypath.behavior.IFeature_Behavior;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.nodeEditor.CellActionType;
import jetbrains.mps.nodeEditor.cellActions.CellAction_Empty;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefCellCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Group;
import java.util.List;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import java.util.ArrayList;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.action.INodeSubstituteAction;
import jetbrains.mps.nodeEditor.cellMenu.CellContext;
import jetbrains.mps.nodeEditor.InlineCellProvider;

public class ListFeature_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_hr3usq_a(editorContext, node);
  }

  private EditorCell createAlternation_hr3usq_a0a(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ListFeature_Editor.renderingCondition_hr3usq_a0a0(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createConstant_hr3usq_a0a0(editorContext, node);
    } else {
      editorCell = this.createConstant_hr3usq_a0a0_0(editorContext, node);
    }
    IFeature_default_DELETE.setCellActions(editorCell, node, editorContext);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_generic_cellMenu_a0a0a()}));
    return editorCell;
  }

  private EditorCell createAlternation_hr3usq_a2a0(EditorContext editorContext, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ListFeature_Editor.renderingCondition_hr3usq_a0c0a(node, editorContext, editorContext.getOperationContext().getScope());
    EditorCell editorCell = null;
    if (alternationCondition) {
      editorCell = this.createCollection_hr3usq_a0c0a(editorContext, node);
    } else {
      editorCell = this.createCollection_hr3usq_a0c0a_0(editorContext, node);
    }
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_hr3usq_a0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_c0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addKeyMap(new keymap_ListFeature());
    editorCell.addEditorCell(this.createAlternation_hr3usq_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_hr3usq_b0a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_c0a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_hr3usq_d0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_c0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_c0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    IFeature_opposite_DELETE.setCellActions(editorCell, node, editorContext);
    editorCell.addEditorCell(this.createAlternation_hr3usq_a2a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_a0c0a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_a0c0a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a0a2a0(editorContext, node));
    editorCell.addEditorCell(this.createReadOnlyModelAccessor_hr3usq_b0a2a0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_a0c0a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_a0c0a_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    if (renderingCondition_hr3usq_a0a0c0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_hr3usq_a0a2a0_0(editorContext, node));
    }
    if (renderingCondition_hr3usq_a1a0c0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_hr3usq_b0a2a0(editorContext, node));
    }
    if (renderingCondition_hr3usq_a2a0c0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createRefCell_hr3usq_c0a2a0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setCanBeFolded(true);
    editorCell.addEditorCell(this.createComponent_hr3usq_a1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_b1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_c1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_b1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_b1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a1b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_c1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_c1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a2b1a(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_b2b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_b2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_b2b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createCollection_hr3usq_a1c1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_b1c1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_c1c1b0(editorContext, node));
    editorCell.addEditorCell(this.createCollection_hr3usq_d1c1b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_a1c1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_a1c1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a0b2b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_b1c1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_b1c1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a1b2b1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_hr3usq_b1b2b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_c1c1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_c1c1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a2b2b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_d1c1b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_d1c1b0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a3b2b1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_hr3usq_b3b2b1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_hr3usq_c0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_hr3usq_c0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_hr3usq_a2a(editorContext, node));
    return editorCell;
  }

  private EditorCell createComponent_hr3usq_a1b0(EditorContext editorContext, SNode node) {
    AbstractCellProvider provider = new IFeature_Properties(node);
    EditorCell editorCell = provider.createEditorCell(editorContext);
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a0a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "default");
    editorCell.setCellId("Constant_hr3usq_a0a0");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a0a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "");
    editorCell.setCellId("Constant_hr3usq_a0a0_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a0a2a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<<--");
    editorCell.setCellId("Constant_hr3usq_a0a2a0");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu_a0a0a2a0()}));
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a0a2a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<--");
    editorCell.setCellId("Constant_hr3usq_a0a2a0_0");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu_a0a0a2a0_0()}));
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_b0a2a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "<-->");
    editorCell.setCellId("Constant_hr3usq_b0a2a0");
    stylesheet_Feature_StyleSheet.getOPPOSITE(editorCell).apply(editorCell);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ListFeature_Editor.ListFeature_component_cellMenu_a0b0a2a0()}));
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_d0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_hr3usq_d0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  ");
    editorCell.setCellId("Constant_hr3usq_a1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a1b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "operations");
    editorCell.setCellId("Constant_hr3usq_a1b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.gray);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  ");
    editorCell.setCellId("Constant_hr3usq_a2b1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a0b2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "get");
    editorCell.setCellId("Constant_hr3usq_a0b2b1a");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a1b2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  ");
    editorCell.setCellId("Constant_hr3usq_a1b2b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a2b2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "size");
    editorCell.setCellId("Constant_hr3usq_a2b2b1a");
    BaseLanguageStyle_StyleSheet.getKeyWord(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a3b2b1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "  ");
    editorCell.setCellId("Constant_hr3usq_a3b2b1a");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_hr3usq_a2a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_hr3usq_a2a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createReadOnlyModelAccessor_hr3usq_b0a2a0(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        StringBuilder sb = new StringBuilder("[ ");
        String sep = "";
        for (SNode foo : Sequence.fromIterable(IFeature_Behavior.call_getPartialOpposites_1213877499798(node))) {
          sb.append(sep).append(SPropertyOperations.getString(foo, "name"));
          sep = ", ";
        }
        return sb.append(" ]").toString();
      }

      public void setText(String s) {
      }

      public boolean isValidText(String s) {
        return EqualUtil.equals(s, this.getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, new CellAction_Empty());
    editorCell.setCellId("ReadOnlyModelAccessor_hr3usq_b0a2a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.EDITABLE, false);
    }
    return editorCell;
  }

  private EditorCell createRefCell_hr3usq_c0a2a0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, editorContext);
    provider.setRole("opposite");
    provider.setNoTargetText("<no opposite>");
    EditorCell editorCell;
    provider.setAuxiliaryCellProvider(new ListFeature_Editor._Inline_hr3usq_a2a0c0a());
    editorCell = provider.createEditorCell(editorContext);
    IFeature_opposite_DELETE.setCellActions(editorCell, node, editorContext);
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

  private EditorCell createRefNode_hr3usq_b1b2b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("getFunction");
    provider.setNoTargetText("<no getFunction>");
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

  private EditorCell createRefNode_hr3usq_b3b2b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("sizeFunction");
    provider.setNoTargetText("<no sizeFunction>");
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

  private EditorCell createProperty_hr3usq_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("?name?");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.RT_ANCHOR_TAG, "default_RTransform");
    }
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

  private static boolean renderingCondition_hr3usq_a0a0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "default");
  }

  private static boolean renderingCondition_hr3usq_a0c0a(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasPartialOpposites_1213877499758(node);
  }

  private static boolean renderingCondition_hr3usq_a0a0c0a(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null) && SLinkOperations.getTarget(SLinkOperations.getTarget(node, "opposite", false), "opposite", false) != node;
  }

  private static boolean renderingCondition_hr3usq_a1a0c0a(SNode node, EditorContext editorContext, IScope scope) {
    return IFeature_Behavior.call_hasMutualOpposite_1213877499741(node);
  }

  private static boolean renderingCondition_hr3usq_a2a0c0a(SNode node, EditorContext editorContext, IScope scope) {
    return (SLinkOperations.getTarget(node, "opposite", false) != null);
  }

  public static class ListFeature_generic_cellMenu_a0a0a extends AbstractCellMenuPart_Generic_Group {
    public ListFeature_generic_cellMenu_a0a0a() {
    }

    public List<?> createParameterObjects(SNode node, IScope scope, IOperationContext operationContext) {
      return ListSequence.fromListAndArray(new ArrayList<Boolean>(), true, false);
    }

    protected void handleAction(Object parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      this.handleAction_impl((Boolean) parameterObject, node, model, scope, operationContext, editorContext);
    }

    public void handleAction_impl(Boolean parameterObject, SNode node, SModel model, IScope scope, IOperationContext operationContext, EditorContext editorContext) {
      SPropertyOperations.set(node, "default", "" + (parameterObject));
    }

    public boolean isReferentPresentation() {
      return false;
    }

    public String getMatchingText(Object parameterObject) {
      return this.getMatchingText_internal((Boolean) parameterObject);
    }

    public String getMatchingText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "default" :
        "regular"
      );
    }

    public String getDescriptionText(Object parameterObject) {
      return this.getDescriptionText_internal((Boolean) parameterObject);
    }

    public String getDescriptionText_internal(Boolean parameterObject) {
      return (parameterObject ?
        "allows to omit the feature when iterating" :
        "feature must be always specified"
      );
    }
  }

  public static class ListFeature_component_cellMenu_a0a0a2a0 implements SubstituteInfoPart {
    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu_a0a0a2a0() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class ListFeature_component_cellMenu_a0a0a2a0_0 implements SubstituteInfoPart {
    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu_a0a0a2a0_0() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class ListFeature_component_cellMenu_a0b0a2a0 implements SubstituteInfoPart {
    private menu_FeatureSetOpposite myComponent;

    public ListFeature_component_cellMenu_a0b0a2a0() {
      this.myComponent = new menu_FeatureSetOpposite();
    }

    public List<INodeSubstituteAction> createActions(CellContext cellContext, EditorContext editorContext) {
      return this.myComponent.createActions(cellContext, editorContext);
    }
  }

  public static class _Inline_hr3usq_a2a0c0a extends InlineCellProvider {
    public _Inline_hr3usq_a2a0c0a() {
      super();
    }

    public EditorCell createEditorCell(EditorContext editorContext) {
      return this.createEditorCell(editorContext, this.getSNode());
    }

    public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
      return this.createProperty_hr3usq_a0c0a2a0(editorContext, node);
    }

    private EditorCell createProperty_hr3usq_a0c0a2a0(EditorContext editorContext, SNode node) {
      CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
      provider.setRole("name");
      provider.setNoTargetText("<no name>");
      provider.setReadOnly(true);
      EditorCell editorCell;
      editorCell = provider.createEditorCell(editorContext);
      editorCell.setCellId("property_name_1");
      BaseLanguageStyle_StyleSheet.getField(editorCell).apply(editorCell);
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
  }
}
