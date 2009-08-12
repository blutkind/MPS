package jetbrains.mps.ide.uiLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;

public class IDEDialogButton_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection_8408_0(context, node);
  }

  public EditorCell createCollection_8408_0(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    setupBasic_Collection_8408_0(editorCell, node, context);
    editorCell.addEditorCell(this.createCollection_8408_1(context, node));
    editorCell.addEditorCell(this.createCollection_8408_2(context, node));
    editorCell.addEditorCell(this.createConstant_8408_2(context, node, ""));
    editorCell.addEditorCell(this.createCollection_8408_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_8408_1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8408_1(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8408_0(context, node, "text"));
    editorCell.addEditorCell(this.createProperty_8408_1(context, node));
    return editorCell;
  }

  public EditorCell createCollection_8408_2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8408_2(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8408_1(context, node, "default"));
    editorCell.addEditorCell(this.createProperty_8408_3(context, node));
    return editorCell;
  }

  public EditorCell createCollection_8408_3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_8408_3(editorCell, node, context);
    editorCell.addEditorCell(this.createConstant_8408_3(context, node, "handler"));
    editorCell.addEditorCell(this.createRefNode_8408_1(context, node));
    return editorCell;
  }

  public EditorCell createConstant_8408_0(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8408_0(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8408_1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8408_1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8408_2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8408_2(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant_8408_3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_8408_3(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createProperty_8408_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_8408_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_8408_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("text");
    provider.setNoTargetText("<no text>");
    EditorCell cellWithRole = this.createProperty_8408_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty_8408_2_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_Property_8408_1(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty_8408_3(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("isDefault");
    provider.setNoTargetText("<no isDefault>");
    EditorCell cellWithRole = this.createProperty_8408_2_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode_8408_0_internal(EditorContext context, SNode node, CellProviderWithRole provider) {
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_RefNode_8408_0(editorCell, node, context);
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode_8408_1(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("handler");
    provider.setNoTargetText("<none>");
    EditorCell cellWithRole = this.createRefNode_8408_0_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_8408_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8408_0");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.DRAW_BRACKETS, true);
    }
  }

  private static void setupBasic_Collection_8408_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8408_1");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_8408_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8408_0");
  }

  private static void setupBasic_Property_8408_0(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_text");
  }

  private static void setupBasic_Collection_8408_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8408_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_8408_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8408_1");
  }

  private static void setupBasic_Property_8408_1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_isDefault");
  }

  private static void setupBasic_Constant_8408_2(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8408_2");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Collection_8408_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_8408_3");
    {
      Style style = editorCell.getStyle();
      style.set(StyleAttributes.SELECTABLE, false);
    }
  }

  private static void setupBasic_Constant_8408_3(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_8408_3");
  }

  private static void setupBasic_RefNode_8408_0(EditorCell editorCell, SNode node, EditorContext context) {
  }

}
