package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS  */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.IScope;
import jetbrains.mps.bootstrap.structureLanguage.ConceptDeclaration;
import jetbrains.mps.smodel.Language;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.util.Macros;
import jetbrains.mps.bootstrap.smodelLanguage.generator.smodelAdapter.SPropertyOperations;
import java.io.File;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import jetbrains.mps.nodeEditor.EditorCell_Component;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.nodeEditor.EditorCell_Image;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.RefCellCellProvider;

public class ConceptDeclaration_Editor extends DefaultNodeEditor {

  public AbstractCellListHandler myPropertyDeclarationListHandler;
  public AbstractCellListHandler myLinkDeclarationListHandler;
  public AbstractCellListHandler myConceptPropertyListHandler;
  public AbstractCellListHandler myConceptLinkListHandler;
  public AbstractCellListHandler myConceptPropertyDeclarationListHandler;
  public AbstractCellListHandler myConceptLinkDeclarationListHandler;

  public static boolean _QueryFunction_NodeCondition_1161165530948(SNode node, IScope scope) {
    ConceptDeclaration decl = (ConceptDeclaration)node;
    Language l = SModelUtil.getDeclaringLanguage(decl, scope);
    if(l == null) {
      return false;
    }
    String s = Macros.languageDescriptor().expandPath(SPropertyOperations.get(node, "iconPath"), l.getDescriptorFile());
    if(s == null) {
      return false;
    }
    return new File(s).exists();
  }

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNodeBox(context, node);
  }
  public EditorCell createInspectedCell(EditorContext context, SNode node) {
    return this.createColumnCell(context, node);
  }
  public EditorCell createCellAlternation(EditorContext context, SNode node) {
    boolean alternationCondition = true;
    alternationCondition = ConceptDeclaration_Editor._QueryFunction_NodeCondition_1161165530948(node, context.getOperationContext().getScope());
    EditorCell editorCell = null;
    if(alternationCondition) {
      editorCell = this.createImageCell(context, node);
    } else 
    {
      editorCell = this.createConstantCell9(context, node, "<no icon>");
    }
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1161165530947");
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
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell(context, node, "concept declaration"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1087215312705");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell1(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell1(context, node, "extends:"));
    editorCell.addEditorCell(this.createExtendsReferenceCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767723");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell2(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell2(context, node, "is root:"));
    editorCell.addEditorCell(this.createRootableCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767729");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createContentArea(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createRowCell1(context, node));
    editorCell.addEditorCell(this.createRowCell2(context, node));
    editorCell.addEditorCell(this.createSeparator1(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "properties:"));
    editorCell.addEditorCell(this.createPropertyDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator2(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell4(context, node, "links:"));
    editorCell.addEditorCell(this.createLinkDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator3(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell5(context, node, "concept properties:"));
    editorCell.addEditorCell(this.createConceptPropertyList(context, node));
    editorCell.addEditorCell(this.createSeparator4(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell6(context, node, "concept links:"));
    editorCell.addEditorCell(this.createConceptLinkList(context, node));
    editorCell.addEditorCell(this.createSeparator5(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell7(context, node, "concept property declarations:"));
    editorCell.addEditorCell(this.createConceptPropertyDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator6(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell8(context, node, "concept link declarations:"));
    editorCell.addEditorCell(this.createConceptLinkDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator7(context, node, ""));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726747113");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createIndent(context, node, "    "));
    editorCell.addEditorCell(this.createContentArea(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726622986");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNodeBox(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createHeaderRow(context, node));
    editorCell.addEditorCell(this.createSeparator(context, node, ""));
    editorCell.addEditorCell(this.createRowCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1087215312704");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRowCell3(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createHorizontal(context, node);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createConstantCell10(context, node, "icon"));
    editorCell.addEditorCell(this.createIconPathCell(context, node));
    editorCell.addEditorCell(EditorCell_Component.createComponentCell(context, node, Queries.cellJComponent_SelectIconButton(node, context), "1160492829178"));
    editorCell.putUserObject(EditorCell.CELL_ID, "1160492829175");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createColumnCell(EditorContext context, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createVertical(context, node);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.addEditorCell(this.createCellAlternation(context, node));
    editorCell.addEditorCell(this.createRowCell3(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, "1160492784517");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1087215312706");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105741360137");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createIndent(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726671674");
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
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767724");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767730");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator1(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767732");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739255643");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739255645");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767733");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator3(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767735");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726873348");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator4(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739239077");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1105739239078");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator5(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137467292180");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137467292181");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator6(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137467292184");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell8(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137532267759");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createSeparator7(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1137532267761");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell9(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(true);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1161165544408");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell10(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1160492829176");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createImageCell(EditorContext context, SNode node) {
    EditorCell_Image editorCell;
    editorCell = EditorCell_Image.createImageCell(context, node, Queries.imageFileName_ConceptIcon(node, context.getOperationContext()));
    editorCell.setDescent(0);
    editorCell.setDrawBrackets(false);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, "1161165534970");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createPropertyDeclarationList(EditorContext context, SNode node) {
    if(this.myPropertyDeclarationListHandler == null) {
      this.myPropertyDeclarationListHandler = new ConceptDeclaration_Editor_PropertyDeclarationListHandler(node, "propertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myPropertyDeclarationListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myPropertyDeclarationListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createLinkDeclarationList(EditorContext context, SNode node) {
    if(this.myLinkDeclarationListHandler == null) {
      this.myLinkDeclarationListHandler = new ConceptDeclaration_Editor_LinkDeclarationListHandler(node, "linkDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myLinkDeclarationListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(true);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myLinkDeclarationListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptPropertyList(EditorContext context, SNode node) {
    if(this.myConceptPropertyListHandler == null) {
      this.myConceptPropertyListHandler = new ConceptDeclaration_Editor_ConceptPropertyListHandler(node, "conceptProperty", context);
    }
    EditorCell_Collection editorCell = this.myConceptPropertyListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptPropertyListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptLinkList(EditorContext context, SNode node) {
    if(this.myConceptLinkListHandler == null) {
      this.myConceptLinkListHandler = new ConceptDeclaration_Editor_ConceptLinkListHandler(node, "conceptLink", context);
    }
    EditorCell_Collection editorCell = this.myConceptLinkListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptLinkListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptPropertyDeclarationList(EditorContext context, SNode node) {
    if(this.myConceptPropertyDeclarationListHandler == null) {
      this.myConceptPropertyDeclarationListHandler = new ConceptDeclaration_Editor_ConceptPropertyDeclarationListHandler(node, "conceptPropertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myConceptPropertyDeclarationListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptPropertyDeclarationListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptLinkDeclarationList(EditorContext context, SNode node) {
    if(this.myConceptLinkDeclarationListHandler == null) {
      this.myConceptLinkDeclarationListHandler = new ConceptDeclaration_Editor_ConceptLinkDeclarationListHandler(node, "conceptLinkDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myConceptLinkDeclarationListHandler.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptLinkDeclarationListHandler.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
      editorCellLabel.getTextLine().setTextBackgroundColor(Color.yellow);
      editorCellLabel.getTextLine().setSelectedTextBackgroundColor(Color.cyan);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1087215312707");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createNameCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("name");
    provider.setNoTargetText("<no name>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createNameCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
  public EditorCell createExtendsReferenceCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(new ConceptDeclaration_Editor_extends_InlineComponent());
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767725");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createExtendsReferenceCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new RefCellCellProvider(node, context);
    provider.setRole("extends");
    provider.setNoTargetText("<default>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createExtendsReferenceCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
  public EditorCell createRootableCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1105726767731");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createRootableCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("rootable");
    provider.setNoTargetText("");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(false);
    EditorCell cellWithRole = this.createRootableCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
  public EditorCell createIconPathCellinternal(EditorContext context, SNode node, CellProviderWithRole aProvider) {
    CellProviderWithRole provider = aProvider;
    provider.setAuxiliaryCellProvider(null);
    EditorCell editorCell = provider.createEditorCell(context);
    editorCell.setSelectable(true);
    editorCell.setDrawBorder(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    if(editorCell instanceof EditorCell_Label) {
      EditorCell_Label editorCellLabel = (EditorCell_Label)editorCell;
      editorCellLabel.setEditable(true);
    }
    editorCell.setSubstituteInfo(provider.createDefaultSubstituteInfo());
    editorCell.putUserObject(EditorCell.CELL_ID, "1160492829177");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createIconPathCell(EditorContext context, SNode node) {
    CellProviderWithRole provider = new PropertyCellProvider(node, context);
    provider.setRole("iconPath");
    provider.setNoTargetText("<no icon>");
    provider.setReadOnly(false);
    provider.setAllowsEmptyTarget(true);
    EditorCell cellWithRole = this.createIconPathCellinternal(context, node, provider);
    SNode attributeConcept = provider.getRoleAttribute();
    Class attributeKind = provider.getRoleAttributeClass();
    if(attributeConcept != null) {
      IOperationContext opContext = context.getOperationContext();
      EditorManager manager = EditorManager.getInstanceFromContext(opContext);
      return manager.createRoleAttributeCell(context, attributeConcept, attributeKind, cellWithRole);
    } else 
    return cellWithRole;
  }
}
