package jetbrains.mps.baseLanguage.editor;

/*Generated by MPS Jan 25, 2006 12:26:11 AM */


import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.AbstractCellProvider;
import jetbrains.mps.nodeEditor.EditorCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.MPSColors;
import jetbrains.mps.nodeEditor.PropertyAccessor;
import jetbrains.mps.nodeEditor.EditorCell_Property;
import jetbrains.mps.nodeEditor.EditorCellAction;
import jetbrains.mps.nodeEditor.CellAction_DeleteProperty;
import jetbrains.mps.annotations.PropertyAttributeConcept;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;

public class Interface_Editor extends DefaultNodeEditor {

  public AbstractCellProvider my_GenericDeclaration_TypeVariables_Component;
  public EditorCellListHandler myExtendedInterfaceListHandler;
  public EditorCellListHandler myStaticFieldListHandler;
  public EditorCellListHandler myMethodListHandler;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createClassBox(context, node);
  }
  public EditorCell createClassBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.addEditorCell(this.createConstantCell6(context, node, ""));
    editorCell.addEditorCell(this.createMethodsArea(context, node));
    editorCell.addEditorCell(this.createConstantCell8(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell9(context, node, "}"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852505");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createHeaderRow(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell(context, node, "interface"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.addEditorCell(this.create_GenericDeclaration_TypeVariables_ComponentCell(context, node));
    editorCell.addEditorCell(this.createConstantCell1(context, node, "extends"));
    editorCell.addEditorCell(this.createExtendedInterfaceList(context, node));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "{"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852507");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createConstantCell4(context, node, "    "));
    editorCell.addEditorCell(this.createStaticFieldList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1128556090207");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodsArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.addEditorCell(this.createMethodsIndentCell(context, node, "    "));
    editorCell.addEditorCell(this.createMethodsList(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852513");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell create_GenericDeclaration_TypeVariables_ComponentCell(EditorContext context, SNode node) {
    if(this.my_GenericDeclaration_TypeVariables_Component == null) {
      this.my_GenericDeclaration_TypeVariables_Component = new _GenericDeclaration_TypeVariables_Component(node);
    }
    EditorCell editorCell = this.my_GenericDeclaration_TypeVariables_Component.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1109281106345");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852517");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.getTextLine().setTextColor(MPSColors.DARK_BLUE);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852519");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852521");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1128556090208");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852512");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodsIndentCell(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852538");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852514");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852516");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCellinternal(EditorContext context, SNode node) {
    String propertyName = "name";
    PropertyAccessor propertyAccessor = new PropertyAccessor(node, propertyName, false, false, context);
    EditorCell_Property editorCell = EditorCell_Property.create(context, propertyAccessor, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(true);
    editorCell.setDefaultText("<no name>");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setAction(EditorCellAction.DELETE, new CellAction_DeleteProperty(node, "name"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1107796852518");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    String propertyName = "name";
    EditorCell propertyCell = this.createNameCellinternal(context, node);
    PropertyAttributeConcept propertyAttributeConcept = node.getPropertyAttribute(propertyName);
    if(propertyAttributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createPropertyAttributeCell(context, propertyAttributeConcept, propertyCell);
    } else 
    return propertyCell;
  }
  public EditorCell createExtendedInterfaceList(EditorContext context, SNode node) {
    if(this.myExtendedInterfaceListHandler == null) {
      this.myExtendedInterfaceListHandler = new Interface_Editor_ExtendedInterfaceListHandler(node, "extendedInterface", context);
    }
    EditorCell_Collection editorCell = this.myExtendedInterfaceListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "extendedInterface");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createStaticFieldList(EditorContext context, SNode node) {
    if(this.myStaticFieldListHandler == null) {
      this.myStaticFieldListHandler = new Interface_Editor_StaticFieldListHandler(node, "staticField", context);
    }
    EditorCell_Collection editorCell = this.myStaticFieldListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "staticField");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createMethodsList(EditorContext context, SNode node) {
    if(this.myMethodListHandler == null) {
      this.myMethodListHandler = new Interface_Editor_MethodListHandler(node, "method", context);
    }
    EditorCell_Collection editorCell = this.myMethodListHandler.createCells(context, new CellLayout_Vertical());
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.ROLE, "method");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
}
