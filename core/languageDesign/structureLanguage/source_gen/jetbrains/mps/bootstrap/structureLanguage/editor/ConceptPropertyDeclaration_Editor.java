package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cells.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Error;
import jetbrains.mps.nodeEditor.cells.EditorCell_Label;

public class ConceptPropertyDeclaration_Editor extends DefaultNodeEditor {

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createError1137469134524(context, node);
  }

  public EditorCell createError1137469134524(EditorContext context, SNode node) {
    EditorCell_Error editorCell = new EditorCell_Error(context, node, "<choose property type>");
    setupBasic_Error_11374691345241137469134524(editorCell, node, context);
    setupLabel_Error_1137469134524_1137469134524(editorCell, node, context);
    return editorCell;
  }


  private static void setupBasic_Error_11374691345241137469134524(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, "Error_1137469134524");
  }

  private static void setupLabel_Error_1137469134524_1137469134524(EditorCell_Label editorCell, SNode node, EditorContext context) {
  }

}
