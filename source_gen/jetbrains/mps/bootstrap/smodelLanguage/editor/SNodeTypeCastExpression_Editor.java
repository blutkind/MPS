package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS Feb 16, 2006 8:33:30 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.resolve.BadReferenceTextProvider;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;
import jetbrains.mps.annotations.LinkAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteSmart;

public class SNodeTypeCastExpression_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createRowCell(context, node);
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.addEditorCell(this.createLeftExpressionCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, ":"));
    editorCell.addEditorCell(this.createConceptReferenceCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1140138178976");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1140138199073");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptReferenceCellinternal(EditorContext context, SNode node) {
    SNode effectiveNode = null;
    effectiveNode = node.getReferent("concept");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "concept", context.getOperationContext().getScope());
    SReference reference = node.getReference("concept");
    if(reference != null && !(reference.isResolved())) {
      EditorCell_Error noRefCell = EditorCell_Error.create(context, node, null);
      noRefCell.setText(BadReferenceTextProvider.getBadReferenceText(reference));
      noRefCell.setEditable(true);
      noRefCell.setDrawBrackets(false);
      noRefCell.setBracketsColor(Color.black);
      noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
      noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
      noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
      noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
      SNodeTypeCastExpression_Concept_Actions.setCellActions(noRefCell, node, context);
      noRefCell.putUserObject(EditorCell.CELL_ID, "1140138237889");
      noRefCell.putUserObject(EditorCell.ROLE, "concept");
      return noRefCell;
    }
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no concept>");
        noRefCell.setEditable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
        SNodeTypeCastExpression_Concept_Actions.setCellActions(noRefCell, node, context);
        noRefCell.putUserObject(EditorCell.CELL_ID, "1140138237889");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "concept");
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new SNodeTypeCastExpression_Editor_concept_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setLayoutConstraint("");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.putUserObject(EditorCell.ROLE, "concept");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
    SNodeTypeCastExpression_Concept_Actions.setCellActions(editorCell, node, context);
    return editorCell;
  }
  public EditorCell createConceptReferenceCell(EditorContext context, SNode node) {
    String linkRole = "concept";
    EditorCell refCell = this.createConceptReferenceCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
  public EditorCell createLeftExpressionCellinternal(EditorContext context, SNode node) {
    SNode referencedNode = null;
    referencedNode = node.getChild("leftExpression");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "leftExpression", context.getOperationContext().getScope());
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration, context));
        noRefCell.putUserObject(EditorCell.CELL_ID, "1140138184899");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "leftExpression");
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.putUserObject(EditorCell.ROLE, "leftExpression");
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.setLayoutConstraint("");
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteSmart(node, linkDeclaration, referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration, context));
    return editorCell;
  }
  public EditorCell createLeftExpressionCell(EditorContext context, SNode node) {
    String linkRole = "leftExpression";
    EditorCell refCell = this.createLeftExpressionCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
}
