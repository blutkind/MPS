package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS*/


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.semanticModel.SemanticNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.bootstrap.structureLanguage.LinkDeclaration;
import jetbrains.mps.semanticModel.SModelUtil;
import jetbrains.mps.nodeEditor.EditorCell_Error;
import jetbrains.mps.nodeEditor.CellAction_Empty;
import jetbrains.mps.nodeEditor.DefaultChildSubstituteInfo;
import jetbrains.mps.nodeEditor.CellAction_DeleteNode;

public class LocalVariableDeclaration_Editor extends DefaultNodeEditor {
  public static String MATCHING_TEXT = "local variable";
  public static String PRESENTATION_NAME = "local variable declaration";

  public EditorCell createEditorCell(EditorContext context, SemanticNode node) {
    return this.createDeclarationBox(context, node);
  }
  public EditorCell createDeclarationBox(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createTypeCell(context, node));
    editorCell.addEditorCell(this.createNameCell(context, node));
    if(this.handleConditionalQuery_1075303160504(node)) {
      editorCell.addEditorCell(this.createInitializerArea(context, node));
    }
    return editorCell;
  }
  public EditorCell createInitializerArea(EditorContext context, SemanticNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell(context, node, "="));
    editorCell.addEditorCell(this.createInitializerCell(context, node));
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SemanticNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SemanticNode node) {
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, "name", false, false);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    LocalVariableDeclaration_NameCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createTypeCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("type");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "type");
    if(referencedNode == null) {
      {
        EditorCell_Error noRefCell = EditorCell_Error.create(context, node, "type");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        LocalVariableDeclaration_TypeCellActions.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
    if(editorCell.getSubstituteInfo() == null) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    }
    LocalVariableDeclaration_TypeCellActions.setCellActions(editorCell, node);
    return editorCell;
  }
  public EditorCell createInitializerCell(EditorContext context, SemanticNode node) {
    SemanticNode referencedNode = null;
    referencedNode = node.getChild("initializer");
    LinkDeclaration linkDeclaration = SModelUtil.getLinkDeclaration(node, "initializer");
    if(referencedNode == null) {
      {
        EditorCell_Constant noRefCell = EditorCell_Constant.create(context, node, null, true);
        noRefCell.setDefaultText("");
        noRefCell.setEditable(true);
        noRefCell.setSelectable(true);
        noRefCell.setDrawBorder(true);
        noRefCell.setDrawBrackets(false);
        noRefCell.setBracketsColor(Color.black);
        noRefCell.setAction(EditorCellAction.DELETE, new CellAction_Empty());
        noRefCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
        __VariableInitializer_ActionSet.setCellActions(noRefCell, node);
        return noRefCell;
      }
    }
    EditorCell editorCell = context.createNodeCell(referencedNode);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteNode(referencedNode));
    if(editorCell.getSubstituteInfo() == null) {
      editorCell.setSubstituteInfo(new DefaultChildSubstituteInfo(node, linkDeclaration));
    }
    __VariableInitializer_ActionSet.setCellActions(editorCell, node);
    return editorCell;
  }
  public boolean handleConditionalQuery_1075303160504(SemanticNode node) {
    return FreeMethodsUtil_jetbrains_mps_baseLanguage_editor_context._SemanticNodeCondition_HasInitializer(node);
  }
}
