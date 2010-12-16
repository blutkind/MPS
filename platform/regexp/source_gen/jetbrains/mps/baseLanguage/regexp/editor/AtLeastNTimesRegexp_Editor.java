package jetbrains.mps.baseLanguage.regexp.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.baseLanguage.editor.BaseLanguageStyle_StyleSheet;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.FocusPolicy;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.baseLanguage.regexp.behavior.UnaryRegexp_Behavior;

public class AtLeastNTimesRegexp_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_zeg0q_a(editorContext, node);
  }

  private EditorCell createCollection_zeg0q_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_zeg0q_a");
    editorCell.addKeyMap(new RegexpSequenceByEnter());
    if (renderingCondition_zeg0q_a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_zeg0q_a0(editorContext, node));
    }
    editorCell.addEditorCell(this.createRefNode_zeg0q_b0(editorContext, node));
    if (renderingCondition_zeg0q_a2a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_zeg0q_c0(editorContext, node));
    }
    editorCell.addEditorCell(this.createConstant_zeg0q_d0(editorContext, node));
    editorCell.addEditorCell(this.createProperty_zeg0q_e0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_zeg0q_f0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_zeg0q_g0(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_zeg0q_a0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "(");
    editorCell.setCellId("Constant_zeg0q_a0");
    RegexpStylesheet_StyleSheet.getLeftRegexpBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_zeg0q_c0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ")");
    editorCell.setCellId("Constant_zeg0q_c0");
    RegexpStylesheet_StyleSheet.getRightRegexpBrace(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_zeg0q_d0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "{");
    editorCell.setCellId("Constant_zeg0q_d0");
    BaseLanguageStyle_StyleSheet.getMatching(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    UnaryRegexp_Regexp_actions.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_zeg0q_f0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ",");
    editorCell.setCellId("Constant_zeg0q_f0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
      style.set(StyleAttributes.PUNCTUATION_RIGHT, true);
    }
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_zeg0q_g0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "}");
    editorCell.setCellId("Constant_zeg0q_g0");
    BaseLanguageStyle_StyleSheet.getMatching(editorCell).apply(editorCell);
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.TEXT_COLOR, MPSColors.DARK_MAGENTA);
      style.set(StyleAttributes.PUNCTUATION_LEFT, true);
    }
    if (true) {
      editorCell.setFocusPolicy(FocusPolicy.ATTRACTS_FOCUS);
    }
    UnaryRegexp_Regexp_actions.setCellActions(editorCell, node, editorContext);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_zeg0q_b0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("regexp");
    provider.setNoTargetText("<no regexp>");
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

  private EditorCell createProperty_zeg0q_e0(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("n");
    provider.setNoTargetText("<no n>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_n");
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

  private static boolean renderingCondition_zeg0q_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return UnaryRegexp_Behavior.call_inParentheses_1353467374623956744(node);
  }

  private static boolean renderingCondition_zeg0q_a2a(SNode node, EditorContext editorContext, IScope scope) {
    return UnaryRegexp_Behavior.call_inParentheses_1353467374623956744(node);
  }
}
