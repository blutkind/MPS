package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.semanticModel.SemanticModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;

public class EnumConstantReference_Editor extends DefaultNodeEditor {
  public static String MATCHING_TEXT = ". <enum constant>";
  public static String PRESENTATION_NAME = "enum constant";

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createJavaClassTypeCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "."));
    editorCell.addEditorCell(this.createEnumConstantDeclarationReferenceCell(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    return editorCell;
  }
  public EditorCell createEnumConstantDeclarationReferenceCell(EditorContext context, SemanticNode node) {
    SemanticNode effectiveNode = null;
    effectiveNode = node.getReferent("enumConstantDeclaration");
    LinkDeclaration linkDeclaration = SemanticModelUtil.getLinkDeclaration(node, "enumConstantDeclaration");
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "");
        noRefCell.setEditable(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
        EnumConstantReference_ConstantNameActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new EnumConstantReference_Editor_enumConstantDeclaration_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
    EnumConstantReference_ConstantNameActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createJavaClassTypeCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("javaClassType");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "javaClassType");
        noRefCell.setEditable(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(true);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        EnumConstantReference_TypeActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    EnumConstantReference_TypeActions.setCellActions(editorCell, node);
    return editorCell;
  }
}
