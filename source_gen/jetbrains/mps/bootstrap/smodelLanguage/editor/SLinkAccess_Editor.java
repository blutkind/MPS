package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS Jan 31, 2006 9:04:43 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.smodel.SReference;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.resolve.BadReferenceTextProvider;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultReferenceSubstituteInfo;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorUtil;
import jetbrains.mps.annotations.LinkAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class SLinkAccess_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createLinkReferenceCell(context, node);
  }
  public EditorCell createLinkReferenceCellinternal(EditorContext context, SNode node) {
    SNode effectiveNode = null;
    effectiveNode = node.getReferent("link");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "link", context.getOperationContext().getScope());
    SReference reference = node.getReference("link");
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
      noRefCell.putUserObject(EditorCell.CELL_ID, "1138412329756");
      noRefCell.putUserObject(EditorCell.ROLE, "link");
      return noRefCell;
    }
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no link>");
        noRefCell.setEditable(true);
        noRefCell.setDrawBorder(false);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
        noRefCell.putUserObject(EditorCell.CELL_ID, "1138412329756");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "link");
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new SLinkAccess_Editor_link_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setLayoutConstraint("");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.putUserObject(EditorCell.ROLE, "link");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
    return editorCell;
  }
  public EditorCell createLinkReferenceCell(EditorContext context, SNode node) {
    String linkRole = "link";
    EditorCell refCell = this.createLinkReferenceCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
}
