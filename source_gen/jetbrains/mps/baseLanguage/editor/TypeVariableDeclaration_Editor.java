package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Dec 24, 2005 1:49:08 AM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.annotations.PropertyAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;

public class TypeVariableDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNameCell(context, node);
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    String propertyName = "name";
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, propertyName, false, false, context);
    PropertyAttributeConcept propertyAttributeConcept = node.getPropertyAttribute(propertyName);
    if(propertyAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      EditorCell cell = manager.createPropertyAttributeEditorCell(context, propertyAttributeConcept, null);
      return cell;
    }
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1109281432641");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
