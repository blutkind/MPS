package jetbrains.mps.buildlanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class ExternalPropertyDeclaration_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_i6hv21_a(editorContext, node);
  }

  public EditorCell createInspectedCell(EditorContext editorContext, SNode node) {
    return this.createCollection_i6hv21_a_0(editorContext, node);
  }

  private EditorCell createCollection_i6hv21_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setCellId("Collection_i6hv21_a");
    if (renderingCondition_i6hv21_a0a(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_i6hv21_a0(editorContext, node));
    }
    editorCell.addEditorCell(this.createCollection_i6hv21_b0(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_i6hv21_a0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_i6hv21_a0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
    editorCell.addEditorCell(this.createConstant_i6hv21_a0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_i6hv21_b0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_i6hv21_b0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_i6hv21_b0");
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(editorContext, new BasicCellContext(node), new SubstituteInfoPart[]{new ExternalPropertyDeclaration_Editor.ExternalPropertyDeclaration_generic_cellMenu_a0b0()}));
    if (renderingCondition_i6hv21_a0b0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_i6hv21_a1a(editorContext, node));
    }
    editorCell.addEditorCell(this.createConceptProperty_i6hv21_b1a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_i6hv21_c1a(editorContext, node));
    editorCell.addEditorCell(this.createConstant_i6hv21_d1a(editorContext, node));
    editorCell.addEditorCell(this.createRefNode_i6hv21_e1a(editorContext, node));
    return editorCell;
  }

  private EditorCell createCollection_i6hv21_a_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_i6hv21_a_0");
    if (renderingCondition_i6hv21_a0a_0(node, editorContext, editorContext.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_i6hv21_a0_0(editorContext, node));
    }
    return editorCell;
  }

  private EditorCell createCollection_i6hv21_a0_0(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setCellId("Collection_i6hv21_a0_0");
    editorCell.addEditorCell(this.createConstant_i6hv21_a0a_0(editorContext, node));
    editorCell.addEditorCell(this.createConstant_i6hv21_b0a(editorContext, node));
    editorCell.addEditorCell(this.createProperty_i6hv21_c0a(editorContext, node));
    return editorCell;
  }

  private EditorCell createConstant_i6hv21_a0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "//");
    editorCell.setCellId("Constant_i6hv21_a0a");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_i6hv21_a1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "checked");
    editorCell.setCellId("Constant_i6hv21_a1a");
    BuildLanguageStyle_StyleSheet.getKeyword(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_i6hv21_d1a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, ":");
    editorCell.setCellId("Constant_i6hv21_d1a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_i6hv21_a0a_0(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "check on start");
    editorCell.setCellId("Constant_i6hv21_a0a_0");
    BuildLanguageStyle_StyleSheet.getAttributeName(editorCell).apply(editorCell);
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createConstant_i6hv21_b0a(EditorContext editorContext, SNode node) {
    EditorCell_Constant editorCell = new EditorCell_Constant(editorContext, node, "=");
    editorCell.setCellId("Constant_i6hv21_b0a");
    editorCell.setDefaultText("");
    return editorCell;
  }

  private EditorCell createRefNode_i6hv21_e1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, editorContext);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
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

  private EditorCell createProperty_i6hv21_b0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("shortDescription");
    provider.setNoTargetText("<no shortDescription>");
    provider.setAllowsEmptyTarget(true);
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_shortDescription");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
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

  private EditorCell createProperty_i6hv21_c1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_name");
    BuildLanguageStyle_StyleSheet.getProperty(editorCell).apply(editorCell);
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

  private EditorCell createProperty_i6hv21_c0a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, editorContext);
    provider.setRole("checkOnStart");
    provider.setNoTargetText("<no checkOnStart>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("property_checkOnStart");
    BuildLanguageStyle_StyleSheet.getBooleanLiteral(editorCell).apply(editorCell);
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

  private EditorCell createConceptProperty_i6hv21_b1a(EditorContext editorContext, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, editorContext);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell editorCell;
    editorCell = provider.createEditorCell(editorContext);
    editorCell.setCellId("conceptProperty_alias");
    BuildLanguageStyle_StyleSheet.getKeyword(editorCell).apply(editorCell);
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

  private static boolean renderingCondition_i6hv21_a0a(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "shortDescription") != null;
  }

  private static boolean renderingCondition_i6hv21_a0b0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "checkOnStart");
  }

  private static boolean renderingCondition_i6hv21_a0a_0(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.buildlanguage.structure.Project");
  }

  public static class ExternalPropertyDeclaration_generic_cellMenu_a0b0 extends AbstractCellMenuPart_Generic_Item {
    public ExternalPropertyDeclaration_generic_cellMenu_a0b0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "shortDescription", "");
    }

    public String getMatchingText() {
      return "//";
    }
  }
}
