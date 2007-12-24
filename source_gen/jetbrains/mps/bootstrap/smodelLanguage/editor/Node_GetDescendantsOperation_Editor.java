package jetbrains.mps.bootstrap.smodelLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Constant;

public class Node_GetDescendantsOperation_Editor extends DefaultNodeEditor {

  /* package */AbstractCellProvider myOperationParameters_Component4;

  private static void setupBasic_ConstantCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171305552387");
    editorCell.setDrawBorder(false);
    if(true) {
    }
  }

  private static void setupBasic_ConstantCell1(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171305552389");
    editorCell.setDrawBorder(false);
    if(true) {
    }
  }

  private static void setupBasic_OperationParameters_ComponentCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171305552390");
    editorCell.setDrawBorder(false);
    if(true) {
    }
  }

  private static void setupBasic_RowCell(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171305552388");
    editorCell.setDrawBorder(false);
    if(true) {
    }
  }

  private static void setupBasic_CellAlternation(EditorCell editorCell, SNode node, EditorContext context) {
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1171305552386");
    editorCell.setDrawBorder(false);
    if(true) {
    }
  }

  private static void setupLabel_ConstantCell(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
  }

  private static void setupLabel_ConstantCell1(EditorCell_Label editorCell, SNode node, EditorContext context) {
    editorCell.setEditable(true);
  }

  public static boolean _QueryFunction_NodeCondition_1171305552391(SNode node, EditorContext editorContext, IScope scope) {
    return SLinkOperations.getCount(node, "parameter") == 0;
  }


  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createCellAlternation(context, node);
  }

  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = Node_GetDescendantsOperation_Editor._QueryFunction_NodeCondition_1171305552391(node, context, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createConstantCell(context, node, "descendants");
    } else
    {
      editorCell = this.createRowCell(context, node);
    }
    Node_GetDescendantsOperation_Editor.setupBasic_CellAlternation(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    Node_GetDescendantsOperation_Editor.setupBasic_RowCell(editorCell, node, context);
    editorCell.setGridLayout(false);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "descendants"));
    editorCell.addEditorCell(this.createOperationParameters_ComponentCell(context, node));
    return editorCell;
  }

  public EditorCell createOperationParameters_ComponentCell(EditorContext context, SNode node) {
    if(this.myOperationParameters_Component4 == null) {
      this.myOperationParameters_Component4 = new OperationParameters_Component(node);
    }
    EditorCell componentCell = this.myOperationParameters_Component4.createEditorCell(context);
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.addEditorCell(componentCell);
    Node_GetDescendantsOperation_Editor.setupBasic_OperationParameters_ComponentCell(editorCell, node, context);
    return editorCell;
  }

  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    Node_GetDescendantsOperation_Editor.setupBasic_ConstantCell(editorCell, node, context);
    Node_GetDescendantsOperation_Editor.setupLabel_ConstantCell(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = new EditorCell_Constant(context, node, text);
    Node_GetDescendantsOperation_Editor.setupBasic_ConstantCell1(editorCell, node, context);
    Node_GetDescendantsOperation_Editor.setupLabel_ConstantCell1(editorCell, node, context);
    editorCell.setDefaultText("");
    return editorCell;
  }

}
