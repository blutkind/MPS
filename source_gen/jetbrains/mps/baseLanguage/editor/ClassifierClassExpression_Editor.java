package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 11, 2006 7:17:56 PM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSFonts;
import jetbrains.mps.nodeEditor.MPSColors;
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

public class ClassifierClassExpression_Editor extends DefaultNodeEditor {

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
    editorCell.addEditorCell(this.createClassifierReferenceCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, ".class"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1116615268507");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setFontType(MPSFonts.ITALIC);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, "1116615336905");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createClassifierReferenceCellinternal(EditorContext context, SNode node) {
    SNode effectiveNode = null;
    effectiveNode = node.getReferent("classifier");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "classifier", context.getOperationContext().getScope());
    SReference reference = node.getReference("classifier");
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
      noRefCell.putUserObject(EditorCell.CELL_ID, "1116615277650");
      noRefCell.putUserObject(EditorCell.ROLE, "classifier");
      return noRefCell;
    }
    if(effectiveNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "<no classifier>");
        noRefCell.setEditable(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
        noRefCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
        noRefCell.putUserObject(EditorCell.CELL_ID, "1116615277650");
        noRefCell.setLayoutConstraint("");
        noRefCell.putUserObject(EditorCell.ROLE, "classifier");
        return noRefCell;
      }
    }
    AbstractCellProvider inlineComponent = new ClassifierClassExpression_Editor_classifier_InlineComponent(effectiveNode);
    EditorCell editorCell = inlineComponent.createEditorCell(context);
    EditorUtil.setSemanticNodeToCells(editorCell, node);
    editorCell.setLayoutConstraint("");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.METAINFO_LINK_DECLARATION, linkDeclaration);
    editorCell.putUserObject(EditorCell.METAINFO_SOURCE_NODE, node);
    editorCell.putUserObject(EditorCell.ROLE, "classifier");
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    editorCell.setSubstituteInfo(new DefaultReferenceSubstituteInfo(node, linkDeclaration, context));
    return editorCell;
  }
  public EditorCell createClassifierReferenceCell(EditorContext context, SNode node) {
    String linkRole = "classifier";
    EditorCell refCell = this.createClassifierReferenceCellinternal(context, node);
    LinkAttributeConcept linkAttributeConcept = node.getLinkAttribute(linkRole);
    if(linkAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createLinkAttributeCell(context, linkAttributeConcept, refCell);
    } else 
    return refCell;
  }
}
