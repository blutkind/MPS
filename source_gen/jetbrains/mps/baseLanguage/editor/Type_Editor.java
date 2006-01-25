package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 25, 2006 12:26:10 AM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;

public class Type_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellAlternation(context, node);
  }
  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = Queries.semanticNodeCondition_IsAbstractConcept(node, context.getOperationContext());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createErrorCell(context, node);
    } else 
    {
      editorCell = this.createCellModel_ConceptProperty(context, node);
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1138060380694");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createErrorCell(EditorContext context, SNode node) {
    EditorCell_Error editorCell = EditorCell_Error.create(context, node, "<type>");
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1138060384542");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createCellModel_ConceptProperty(EditorContext context, SNode node) {
    String text = SModelUtil.getConceptProperty(node, "alias", context.getOperationContext().getScope());
    EditorCell_Label editorCell;
    if(text == null) {
      String errorText = "";
      if((errorText == null) || (errorText.length() == 0)) {
        errorText = "<no " + "alias" + " value>";
      }
      editorCell = EditorCell_Error.create(context, node, errorText);
    } else 
    {
      editorCell = EditorCell_Constant.create(context, node, text, false);
      editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    }
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addKeyMap(new _TypeKeyMap());
    editorCell.putUserObject(EditorCell.CELL_ID, "1138060501183");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
