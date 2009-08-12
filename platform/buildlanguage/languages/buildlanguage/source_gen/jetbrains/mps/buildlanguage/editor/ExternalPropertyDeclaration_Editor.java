package jetbrains.mps.buildlanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.BasicCellContext;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.editor.generator.internal.AbstractCellMenuPart_Generic_Item;
import jetbrains.mps.smodel.SModel;

public class ExternalPropertyDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_2766_0(context, node);
  }

  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createCollection_2766_4(context, node);
  }

  public EditorCell createCollection_2766_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_2766_0(editorCell, node, context);
    if (renderingCondition2766_0(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_2766_1(context, node));
    }
    editorCell.addEditorCell(this.createCollection_2766_2(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2766_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2766_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2766_0(context, node, "//"));
    editorCell.addEditorCell(this.createProperty_2766_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2766_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2766_2(editorCell, node, context);
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, new BasicCellContext(node), new SubstituteInfoPart[]{new ExternalPropertyDeclaration_Editor.ExternalPropertyDeclaration_generic_cellMenu0()}));
    if (renderingCondition2766_1(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createConstant_2766_2(context, node, "checked"));
    }
    editorCell.addEditorCell(this.createConceptProperty_2766_1(context, node));
    editorCell.addEditorCell(this.createProperty_2766_3(context, node));
    editorCell.addEditorCell(this.createConstant_2766_1(context, node, ":"));
    editorCell.addEditorCell(this.createRefNode_2766_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2766_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2766_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_2766_3(context, node, "check on start"));
    editorCell.addEditorCell(this.createConstant_2766_4(context, node, "="));
    editorCell.addEditorCell(this.createProperty_2766_5(context, node));
    return editorCell;
  }

  public EditorCell createCollection_2766_4(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_2766_4(editorCell, node, context);
    if (renderingCondition2766_2(node, context, context.getOperationContext().getScope())) {
      editorCell.addEditorCell(this.createCollection_2766_3(context, node));
    }
    return editorCell;
  }

  public EditorCell createConstant_2766_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2766_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2766_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2766_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2766_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2766_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2766_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2766_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_2766_4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_2766_4(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_2766_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_2766_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2766_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("shortDescription");
    provider.setNoTargetText("<no shortDescription>");
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createProperty_2766_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createConceptProperty_2766_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_ConceptProperty_2766_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createConceptProperty_2766_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    EditorCell cellWithRole = this.createConceptProperty_2766_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_2766_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_2766_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2766_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    EditorCell cellWithRole = this.createProperty_2766_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_2766_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_2766_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_2766_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("type");
    provider.setNoTargetText("<no type>");
    EditorCell cellWithRole = this.createRefNode_2766_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_2766_4_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_2766_2(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_2766_5(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("checkOnStart");
    provider.setNoTargetText("<no checkOnStart>");
    EditorCell cellWithRole = this.createProperty_2766_4_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_2766_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2766_0");
  }

  private static void setupBasic_Collection_2766_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2766_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_2766_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2766_0");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_2766_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_shortDescription");
    BuildLanguageStyle_StyleSheet.getComment(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_2766_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2766_2");
  }

  private static void setupBasic_ConceptProperty_2766_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("conceptProperty_alias");
    BuildLanguageStyle_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Property_2766_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    BuildLanguageStyle_StyleSheet.getProperty(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_2766_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2766_1");
  }

  private static void setupBasic_RefNode_2766_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_2766_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2766_2");
    BuildLanguageStyle_StyleSheet.getKeyword(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_2766_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2766_3");
  }

  private static void setupBasic_Constant_2766_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2766_3");
    BuildLanguageStyle_StyleSheet.getAttributeName(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_2766_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_2766_4");
  }

  private static void setupBasic_Property_2766_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_checkOnStart");
    BuildLanguageStyle_StyleSheet.getBooleanLiteral(editorCell).apply(editorCell);
  }

  private static void setupBasic_Collection_2766_4(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_2766_4");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  public static boolean renderingCondition2766_0(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getString(node, "shortDescription") != null;
  }

  public static boolean renderingCondition2766_1(SNode node, EditorContext editorContext, IScope scope) {
    return SPropertyOperations.getBoolean(node, "checkOnStart");
  }

  public static boolean renderingCondition2766_2(SNode node, EditorContext editorContext, IScope scope) {
    return SNodeOperations.isInstanceOf(SNodeOperations.getParent(node), "jetbrains.mps.buildlanguage.structure.Project");
  }

  public static class ExternalPropertyDeclaration_generic_cellMenu0 extends AbstractCellMenuPart_Generic_Item {

    public ExternalPropertyDeclaration_generic_cellMenu0() {
    }

    public void handleAction(SNode node, SModel model, IScope scope, IOperationContext operationContext) {
      SPropertyOperations.set(node, "shortDescription", "");
    }

    public String getMatchingText() {
      return "//";
    }

}

}
