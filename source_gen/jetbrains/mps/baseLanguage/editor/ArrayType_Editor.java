package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteSmart;

public class ArrayType_Editor extends DefaultNodeEditor {

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
    editorCell.addKeyMap(new _TypeKeyMap());
    editorCell.addEditorCell(this.createComponentTypeCell(context, node));
    editorCell.addEditorCell(this.createConstantCell(context, node, "[]"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1113208366980");
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
    editorCell.addKeyMap(new _ArrayTypeBracketsActions());
    editorCell.putUserObject(EditorCell.CELL_ID, "1113208455588");
    return editorCell;
  }
  public EditorCell createComponentTypeCell(EditorContext context, SNode node) {
    SNode referencedNode = null;
    referencedNode = node.getChild("componentType");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "componentType", context.getOperationContext().getScope());
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
        noRefCell.putUserObject(EditorCell.CELL_ID, "1113208455587");
        noRefCell.putUserObject(EditorCell.ROLE, "componentType");
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.putUserObject(EditorCell.ROLE, "componentType");
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteSmart(node, linkDeclaration, referencedNode));
    editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration, context));
    return editorCell;
  }
}
