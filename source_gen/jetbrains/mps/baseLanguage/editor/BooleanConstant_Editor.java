package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.semanticModel.SemanticModel;
import jetbrains.mps.nodeEditor.*;
import jetbrains.mps.baseLanguage.PlusExpression;
import jetbrains.mps.baseLanguage.Expression;

public class BooleanConstant_Editor extends SemanticNodeEditor {

  public void setSemanticNode(SemanticNode node) {
    super.setSemanticNode(node);
  }

  public EditorCell createEditorCell(EditorContext editorContext, SemanticNode node) {
    return this.createValueCell(editorContext, node);
  }

  public EditorCell createValueCell(EditorContext editorContext, SemanticNode node) {
    ModelAccessor modelAccessor = Aspects.createModelAccessor_BooleanConstantValue(node);
    EditorCell editorCell = null;
    if (modelAccessor != null) {
      editorCell = EditorCell_Property.create(editorContext, modelAccessor, node);
      ((EditorCell_Label) editorCell).setEditable(true);
    } else {
      editorCell = EditorCell_Error.create(editorContext, node, null);
    }
    BooleanConstant_NodeBoxActions.setCellActions(editorCell, node);
    // todo: gen it
    EditorCellKeyMap keyMap = new EditorCellKeyMap();
    keyMap.putAction(EditorCellKeyMap.KEY_MODIFIERS_ANY, "+", new EditorCellAction() {
      public boolean canExecute(EditorContext context) {
        return true;
      }

      public void execute(EditorContext context) {
        System.out.println("The PLUS is pressed!!!!!");
        Expression selectedExpression = (Expression) context.getNodeEditorComponent().getSelectedCell().getSemanticNode();
        SemanticModel javaModel = selectedExpression.getSemanticModel();
        PlusExpression plusExpression = PlusExpression.newInstance(javaModel);
        SemanticNode parentNode = selectedExpression.getParent();
        String role = parentNode.getReference(selectedExpression).getRole();
        parentNode.removeReferences(role, selectedExpression);
        plusExpression.addReference(PlusExpression.LEFT_EXPRESSION, selectedExpression);
        parentNode.setReference(role, plusExpression);

        javaModel.fireNodeAddedEvent(plusExpression);
      }
    });
    editorCell.setKeyMap(keyMap);
    return editorCell;
  }
}
