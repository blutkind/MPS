package jetbrains.mps.bootstrap.structureLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.nodeEditor.cellProviders.AbstractCellListHandler;
import jetbrains.mps.nodeEditor.EditorCell;
import jetbrains.mps.nodeEditor.EditorContext;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.nodeEditor.EditorCell_Collection;
import java.awt.Color;
import jetbrains.mps.nodeEditor.EditorCell_Constant;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_ExtendsListHandler_extendsList_;
import jetbrains.mps.nodeEditor.CellLayout_Vertical;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_PropertyDeclarationListHandler_propertyDeclarationList_;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_LinkDeclarationListHandler_linkDeclarationList_;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_ConceptPropertyListHandler_conceptPropertyList_;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_ConceptLinkListHandler_conceptLinkList_;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_ConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_;
import jetbrains.mps.bootstrap.structureLanguage.editor.InterfaceConceptDeclaration_Editor_ConceptLinkDeclarationListHandler_conceptLinkDeclarationList_;
import jetbrains.mps.nodeEditor.cellProviders.CellProviderWithRole;
import jetbrains.mps.nodeEditor.EditorCell_Label;
import jetbrains.mps.bootstrap.editorLanguage.cellProviders.PropertyCellProvider;
import jetbrains.mps.smodel.IOperationContext;
import jetbrains.mps.nodeEditor.EditorManager;

public class InterfaceConceptDeclaration_Editor extends DefaultNodeEditor {

  /* package */AbstractCellListHandler myExtendsListHandler_extendsList_;
  /* package */AbstractCellListHandler myPropertyDeclarationListHandler_propertyDeclarationList_;
  /* package */AbstractCellListHandler myLinkDeclarationListHandler_linkDeclarationList_;
  /* package */AbstractCellListHandler myConceptPropertyListHandler_conceptPropertyList_;
  /* package */AbstractCellListHandler myConceptLinkListHandler_conceptLinkList_;
  /* package */AbstractCellListHandler myConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_;
  /* package */AbstractCellListHandler myConceptLinkDeclarationListHandler_conceptLinkDeclarationList_;

  public EditorCell createEditorCell(EditorContext context, SNode node) {
    return this.createNodeBox(context, node);
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
    editorCell.addEditorCell(this.createConstantCell(context, node, "interface concept declaration"));
    editorCell.addEditorCell(this.createNameCell(context, node));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008914");
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
    editorCell.addEditorCell(this.createConstantCell1(context, node, "extends:"));
    editorCell.addEditorCell(this.createExtendsList(context, node));
    editorCell.addEditorCell(this.createConstantCell2(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell3(context, node, "properties:"));
    editorCell.addEditorCell(this.createPropertyDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator1(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell4(context, node, "links:"));
    editorCell.addEditorCell(this.createLinkDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator2(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell5(context, node, "concept properties:"));
    editorCell.addEditorCell(this.createConceptPropertyList(context, node));
    editorCell.addEditorCell(this.createSeparator3(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell6(context, node, "concept links:"));
    editorCell.addEditorCell(this.createConceptLinkList(context, node));
    editorCell.addEditorCell(this.createSeparator4(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell7(context, node, "concept property declarations:"));
    editorCell.addEditorCell(this.createConceptPropertyDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator5(context, node, ""));
    editorCell.addEditorCell(this.createConstantCell8(context, node, "concept link declarations:"));
    editorCell.addEditorCell(this.createConceptLinkDeclarationList(context, node));
    editorCell.addEditorCell(this.createSeparator6(context, node, ""));
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008920");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008918");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008913");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008915");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008917");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008919");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169127688705");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConstantCell2(EditorContext context, SNode node, String text) {
    EditorCell_Constant editorCell = EditorCell_Constant.create(context, node, text, false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setEditable(false);
    editorCell.setDefaultText("");
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169127682234");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008930");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008932");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008933");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008935");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008936");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008938");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008939");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008941");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008942");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008944");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008945");
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008947");
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createExtendsList(EditorContext context, SNode node) {
    if(this.myExtendsListHandler_extendsList_ == null) {
      this.myExtendsListHandler_extendsList_ = new InterfaceConceptDeclaration_Editor_ExtendsListHandler_extendsList_(node, "extends", context);
    }
    EditorCell_Collection editorCell = this.myExtendsListHandler_extendsList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(false);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myExtendsListHandler_extendsList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createPropertyDeclarationList(EditorContext context, SNode node) {
    if(this.myPropertyDeclarationListHandler_propertyDeclarationList_ == null) {
      this.myPropertyDeclarationListHandler_propertyDeclarationList_ = new InterfaceConceptDeclaration_Editor_PropertyDeclarationListHandler_propertyDeclarationList_(node, "propertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myPropertyDeclarationListHandler_propertyDeclarationList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myPropertyDeclarationListHandler_propertyDeclarationList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createLinkDeclarationList(EditorContext context, SNode node) {
    if(this.myLinkDeclarationListHandler_linkDeclarationList_ == null) {
      this.myLinkDeclarationListHandler_linkDeclarationList_ = new InterfaceConceptDeclaration_Editor_LinkDeclarationListHandler_linkDeclarationList_(node, "linkDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myLinkDeclarationListHandler_linkDeclarationList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myLinkDeclarationListHandler_linkDeclarationList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptPropertyList(EditorContext context, SNode node) {
    if(this.myConceptPropertyListHandler_conceptPropertyList_ == null) {
      this.myConceptPropertyListHandler_conceptPropertyList_ = new InterfaceConceptDeclaration_Editor_ConceptPropertyListHandler_conceptPropertyList_(node, "conceptProperty", context);
    }
    EditorCell_Collection editorCell = this.myConceptPropertyListHandler_conceptPropertyList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptPropertyListHandler_conceptPropertyList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptLinkList(EditorContext context, SNode node) {
    if(this.myConceptLinkListHandler_conceptLinkList_ == null) {
      this.myConceptLinkListHandler_conceptLinkList_ = new InterfaceConceptDeclaration_Editor_ConceptLinkListHandler_conceptLinkList_(node, "conceptLink", context);
    }
    EditorCell_Collection editorCell = this.myConceptLinkListHandler_conceptLinkList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptLinkListHandler_conceptLinkList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptPropertyDeclarationList(EditorContext context, SNode node) {
    if(this.myConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_ == null) {
      this.myConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_ = new InterfaceConceptDeclaration_Editor_ConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_(node, "conceptPropertyDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptPropertyDeclarationListHandler_conceptPropertyDeclarationList_.getElementRole());
    editorCell.setLayoutConstraint("");
    return editorCell;
  }
  public EditorCell createConceptLinkDeclarationList(EditorContext context, SNode node) {
    if(this.myConceptLinkDeclarationListHandler_conceptLinkDeclarationList_ == null) {
      this.myConceptLinkDeclarationListHandler_conceptLinkDeclarationList_ = new InterfaceConceptDeclaration_Editor_ConceptLinkDeclarationListHandler_conceptLinkDeclarationList_(node, "conceptLinkDeclaration", context);
    }
    EditorCell_Collection editorCell = this.myConceptLinkDeclarationListHandler_conceptLinkDeclarationList_.createCells(context, new CellLayout_Vertical(), false);
    editorCell.setSelectable(false);
    editorCell.setDrawBorder(false);
    editorCell.setGridLayout(true);
    editorCell.setDrawBrackets(false);
    editorCell.setBracketsColor(Color.black);
    editorCell.setUsesBraces(false);
    editorCell.setCanBeFolded(false);
    editorCell.putUserObject(EditorCell.ROLE, this.myConceptLinkDeclarationListHandler_conceptLinkDeclarationList_.getElementRole());
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
    editorCell.putUserObject(EditorCell.CELL_ID, node.getId() + "_1169126008916");
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
}
