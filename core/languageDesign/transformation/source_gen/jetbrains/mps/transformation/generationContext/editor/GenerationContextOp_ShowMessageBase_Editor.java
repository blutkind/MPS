package jetbrains.mps.transformation.generationContext.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;
import jetbrains.mps.nodeEditor.cellMenu.CompositeSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SubstituteInfoPart;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.ConceptPropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefNodeCellProvider;
import jetbrains.mps.nodeEditor.style.Style;
import jetbrains.mps.nodeEditor.style.StyleAttributes;
import jetbrains.mps.bootstrap.editorLanguage.generator.internal.AbstractCellMenuPart_ReplaceNode_CustomNodeConcept;

public class GenerationContextOp_ShowMessageBase_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCollection1217960440453(context, node);
  }

  public EditorCell createCollection1217960440453(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    setupBasic_Collection_12179604404531217960440453(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConceptProperty1217960446064(context, node));
    editorCell.addEditorCell(this.createRefNode1217960469679(context, node));
    editorCell.addEditorCell(this.createConstant1217960507306(context, node, "->"));
    editorCell.addEditorCell(this.createRefNode1218048531617(context, node));
    return editorCell;
  }

  public EditorCell createConstant1217960507306(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    setupBasic_Constant_12179605073061217960507306(editorCell, node, context);
    setupLabel_Constant_1217960507306_1217960507306(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConceptProperty1217960446064_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_conceptProperty_alias1217960446064(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_conceptProperty_alias_1217960446064((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.setSubstituteInfo(new CompositeSubstituteInfo(context, provider.getCellContext(), new SubstituteInfoPart[]{new GenerationContextOp_ShowMessageBase_Editor.GenerationContextOp_ShowMessageBase_Editor_replaceWith_GenerationContextOp_ShowMessageBase_cellMenu0()}));
    return editorCell;
  }

  public EditorCell createConceptProperty1217960446064(EditorContext context, SNode node) {
    CellProviderWithRole provider = new ConceptPropertyCellProvider(node, context);
    provider.setRole("alias");
    provider.setNoTargetText("<no alias>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createConceptProperty1217960446064_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1217960469679_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_messageText1217960469679(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_messageText_1217960469679((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1217960469679(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("messageText");
    provider.setNoTargetText("<no text>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1217960469679_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }

  public EditorCell createRefNode1218048531617_internal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    setupBasic_refNode_referenceNode1218048531617(editorCell, node, context);
    if (editorCell instanceof EditorCell_Label) {
      setupLabel_refNode_referenceNode_1218048531617((EditorCell_Label)editorCell, node, context);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    return editorCell;
  }

  public EditorCell createRefNode1218048531617(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefNodeCellProvider(node, context);
    provider.setRole("referenceNode");
    provider.setNoTargetText("<node>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRefNode1218048531617_internal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if (attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else
    return cellWithRole;
  }


  private static void setupBasic_Collection_12179604404531217960440453(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Collection_1217960440453");
  }

  private static void setupBasic_conceptProperty_alias1217960446064(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "conceptProperty_alias");
    Styles_StyleSheet.GEN_CONTEXT_OPERATION.apply(editorCell);
  }

  private static void setupBasic_refNode_messageText1217960469679(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupBasic_Constant_12179605073061217960507306(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Constant_1217960507306");
    Styles_StyleSheet.GEN_CONTEXT_OPERATION.apply(editorCell);
    {
      Style inlineStyle = new Style(editorCell) {
        {
          this.set(StyleAttributes.SELECTABLE, false);
        }

      };
      inlineStyle.apply(editorCell);
    }
  }

  private static void setupBasic_refNode_referenceNode1218048531617(EditorCell editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_conceptProperty_alias_1217960446064(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_messageText_1217960469679(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_Constant_1217960507306_1217960507306(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  private static void setupLabel_refNode_referenceNode_1218048531617(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

  public static class GenerationContextOp_ShowMessageBase_Editor_replaceWith_GenerationContextOp_ShowMessageBase_cellMenu0 extends AbstractCellMenuPart_ReplaceNode_CustomNodeConcept {

    public GenerationContextOp_ShowMessageBase_Editor_replaceWith_GenerationContextOp_ShowMessageBase_cellMenu0() {
    }

    public String getReplacementConceptName() {
      return "jetbrains.mps.transformation.generationContext.structure.GenerationContextOp_ShowMessageBase";
    }

}

}
