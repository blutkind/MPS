package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.BooleanPropertySubstituteInfo;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;

public class BooleanConstant_Editor extends DefaultNodeEditor {
  public static String PRESENTATION_NAME = "boolean constant";

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createValueCell(context, node);
  }
  public EditorCell createValueCell(EditorContext context, SemanticNode node) {
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, "value", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(true);
    editorCell.setDefaultText("");
    editorCell.setSubstituteInfo(new BooleanPropertySubstituteInfo(node, "value"));
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "value"));
    BooleanConstant_NodeBoxActions.setCellActions(editorCell, node);
    editorCell.addKeyMap(new _Expression_KeyMap());
    return editorCell;
  }
}
