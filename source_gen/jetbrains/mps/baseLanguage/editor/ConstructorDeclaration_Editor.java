package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.SemanticNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.bootstrap.structureLanguage.SemanticLinkDeclaration;
import jetbrains.mps.semanticModel.SemanticModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.EditorUtil;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class ConstructorDeclaration_Editor extends SemanticNodeEditor {

  private AbstractCellProvider my_BaseMethodParmListEditor;

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }
  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createMethodBox(editorContext, node);
  }
  public EditorCell createMethodBox(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createHeaderRow(editorContext, node));
    editorCell.addEditorCell(this.createBodyArea(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell2(editorContext, node, "}"));
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(true);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createJavaClassReferenceCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell(editorContext, node, "("));
    editorCell.addEditorCell(this.create_BaseMethodParmListEditorCell(editorContext, node));
    editorCell.addEditorCell(this.createConstantCell1(editorContext, node, ") {"));
    return editorCell;
  }
  public EditorCell createJavaClassReferenceCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode effectiveNode = node.getReferent("javaClass");
    SemanticLinkDeclaration linkDeclaration = SemanticModelUtil.getLinkDeclaration(node, "javaClass");
    if(effectiveNode == null) {
      EditorCell_Error errorCell = EditorCell_Error.create(editorContext, node, null);
      errorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      errorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
      errorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
      errorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
      return errorCell;
    }
    AbstractCellProvider javaClass_InlineComponent = new ConstructorDeclaration_Editor_javaClass_InlineComponent(effectiveNode);
    EditorCell editorCell = javaClass_InlineComponent.createEditorCell(editorContext);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration));
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public EditorCell create_BaseMethodParmListEditorCell(EditorContext editorContext, SemanticNode node) {
    if(my_BaseMethodParmListEditor == null) {
      my_BaseMethodParmListEditor = new _BaseMethodParmListEditor(node);
    }
    EditorCell editorCell = my_BaseMethodParmListEditor.createEditorCell(editorContext);
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
  public EditorCell createBodyArea(EditorContext editorContext, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(editorContext, node);
    editorCell.setSelectable(false);
    editorCell.setGridLayout(false);
    editorCell.addEditorCell(this.createIndentCell(editorContext, node, "  "));
    editorCell.addEditorCell(this.createBodyCell(editorContext, node));
    return editorCell;
  }
  public EditorCell createIndentCell(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    return editorCell;
  }
  public EditorCell createBodyCell(EditorContext editorContext, SemanticNode node) {
    SemanticNode body = node.getChild("body");
    EditorCell editorCell = null;
    if(body != null) {
      editorCell = editorContext.createNodeCell(body);
    } else 
    {
      editorCell = EditorCell_Error.create(editorContext, node, null);
      editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    }
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext editorContext, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(editorContext, node, text, false);
    editorCell.setSelectable(false);
    return editorCell;
  }
}
