package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_ListWithRole extends CellModel_WithRole {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_ListWithRole";
  public static final String SEPARATOR_TEXT = "separatorText";
  public static final String VERTICAL = "vertical";
  public static final String GRID_LAYOUT = "gridLayout";
  public static final String USES_BRACES = "usesBraces";
  public static final String USES_FOLDING = "usesFolding";
  public static final String SEPARATOR_LAYOUT_CONSTRAINT = "separatorLayoutConstraint";
  public static final String NODE_FACTORY = "nodeFactory";
  public static final String EMPTY_CELL_MODEL = "emptyCellModel";
  public static final String CELL_LAYOUT = "cellLayout";

  public CellModel_ListWithRole(SNode node) {
    super(node);
  }

  public String getSeparatorText() {
    return this.getProperty(CellModel_ListWithRole.SEPARATOR_TEXT);
  }

  public void setSeparatorText(String value) {
    this.setProperty(CellModel_ListWithRole.SEPARATOR_TEXT, value);
  }

  public boolean getVertical() {
    return this.getBooleanProperty(CellModel_ListWithRole.VERTICAL);
  }

  public void setVertical(boolean value) {
    this.setBooleanProperty(CellModel_ListWithRole.VERTICAL, value);
  }

  public boolean getGridLayout() {
    return this.getBooleanProperty(CellModel_ListWithRole.GRID_LAYOUT);
  }

  public void setGridLayout(boolean value) {
    this.setBooleanProperty(CellModel_ListWithRole.GRID_LAYOUT, value);
  }

  public boolean getUsesBraces() {
    return this.getBooleanProperty(CellModel_ListWithRole.USES_BRACES);
  }

  public void setUsesBraces(boolean value) {
    this.setBooleanProperty(CellModel_ListWithRole.USES_BRACES, value);
  }

  public boolean getUsesFolding() {
    return this.getBooleanProperty(CellModel_ListWithRole.USES_FOLDING);
  }

  public void setUsesFolding(boolean value) {
    this.setBooleanProperty(CellModel_ListWithRole.USES_FOLDING, value);
  }

  public _Layout_Constraints_Enum getSeparatorLayoutConstraint() {
    String value = super.getProperty(CellModel_ListWithRole.SEPARATOR_LAYOUT_CONSTRAINT);
    return _Layout_Constraints_Enum.parseValue(value);
  }

  public void setSeparatorLayoutConstraint(_Layout_Constraints_Enum value) {
    super.setProperty(CellModel_ListWithRole.SEPARATOR_LAYOUT_CONSTRAINT, value.getValueAsString());
  }

  public QueryFunction_NodeFactory getNodeFactory() {
    return (QueryFunction_NodeFactory)this.getChild(CellModel_ListWithRole.NODE_FACTORY);
  }

  public void setNodeFactory(QueryFunction_NodeFactory node) {
    super.setChild(CellModel_ListWithRole.NODE_FACTORY, node);
  }

  public EditorCellModel getEmptyCellModel() {
    return (EditorCellModel)this.getChild(CellModel_ListWithRole.EMPTY_CELL_MODEL);
  }

  public void setEmptyCellModel(EditorCellModel node) {
    super.setChild(CellModel_ListWithRole.EMPTY_CELL_MODEL, node);
  }

  public CellLayout getCellLayout() {
    return (CellLayout)this.getChild(CellModel_ListWithRole.CELL_LAYOUT);
  }

  public void setCellLayout(CellLayout node) {
    super.setChild(CellModel_ListWithRole.CELL_LAYOUT, node);
  }


  public static CellModel_ListWithRole newInstance(SModel sm, boolean init) {
    return (CellModel_ListWithRole)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_ListWithRole", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_ListWithRole newInstance(SModel sm) {
    return CellModel_ListWithRole.newInstance(sm, false);
  }

}
