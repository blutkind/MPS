package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.lang.editor.cellProviders.RefNodeCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.lang.editor.cellProviders.PropertyCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.nodeEditor.style.Padding;
import jetbrains.mps.nodeEditor.style.Measure;

public class AnnotationMethodDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1188206651843(context, node);
  }

  public EditorCell createCollection1188206651843(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_11882066518431188206651843(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRefNode1188206654658(context, node));
    editorCell.addEditorCell(this.createProperty1188206662537(context, node));
    editorCell.addEditorCell(this.createConstant1188206667508(context, node, "("));
    editorCell.addEditorCell(this.createConstant1188206669104(context, node, ")"));
    editorCell.addEditorCell(this.createConstant1188206672106(context, node, ";"));
    return editorCell;
  }

  public EditorCell createConstant1188206667508(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882066675081188206667508(editorCell, node, context);
    setupLabel_Constant_1188206667508_1188206667508(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188206669104(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882066691041188206669104(editorCell, node, context);
    setupLabel_Constant_1188206669104_1188206669104(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstant1188206672106(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_11882066721061188206672106(editorCell, node, context);
    setupLabel_Constant_1188206672106_1188206672106(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createRefNode1188206654658_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_returnType1188206654658(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_returnType_1188206654658((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1188206654658(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("returnType");
    provider.setNoTargetText("<no returnType>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1188206654658_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createProperty1188206662537_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_property_name1188206662537(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_property_name_1188206662537((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createProperty1188206662537(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createProperty1188206662537_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_11882066518431188206651843(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Collection_1188206651843");
  }

  private static void setupBasic_refNode_returnType1188206654658(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_property_name1188206662537(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("property_name");
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.PADDING_LEFT, new Padding(1.0, Measure.SPACES));
          this.set(StyleAttributes.PADDING_RIGHT, new Padding(0.0, Measure.SPACES));
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_Constant_11882066675081188206667508(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1188206667508");
    BaseLanguageStyle_StyleSheet.getLeftParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11882066691041188206669104(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1188206669104");
    BaseLanguageStyle_StyleSheet.getRightParen(editorCell).apply(editorCell);
  }

  private static void setupBasic_Constant_11882066721061188206672106(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.setCellId("Constant_1188206672106");
    BaseLanguageStyle_StyleSheet.getSemicolon(editorCell).apply(editorCell);
  }

  private static void setupLabel_refNode_returnType_1188206654658(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_property_name_1188206662537(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188206667508_1188206667508(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188206669104_1188206669104(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1188206672106_1188206672106(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
