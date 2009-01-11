package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_Alternation extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_Alternation";
  public static final String VERTICAL = "vertical";
  public static final String ALTERNATION_CONDITION = "alternationCondition";
  public static final String IF_TRUE_CELL_MODEL = "ifTrueCellModel";
  public static final String IF_FALSE_CELL_MODEL = "ifFalseCellModel";

  public CellModel_Alternation(SNode node) {
    super(node);
  }

  public boolean getVertical() {
    return this.getBooleanProperty(CellModel_Alternation.VERTICAL);
  }

  public void setVertical(boolean value) {
    this.setBooleanProperty(CellModel_Alternation.VERTICAL, value);
  }

  public QueryFunction_NodeCondition getAlternationCondition() {
    return (QueryFunction_NodeCondition)this.getChild(QueryFunction_NodeCondition.class, CellModel_Alternation.ALTERNATION_CONDITION);
  }

  public void setAlternationCondition(QueryFunction_NodeCondition node) {
    super.setChild(CellModel_Alternation.ALTERNATION_CONDITION, node);
  }

  public EditorCellModel getIfTrueCellModel() {
    return (EditorCellModel)this.getChild(EditorCellModel.class, CellModel_Alternation.IF_TRUE_CELL_MODEL);
  }

  public void setIfTrueCellModel(EditorCellModel node) {
    super.setChild(CellModel_Alternation.IF_TRUE_CELL_MODEL, node);
  }

  public EditorCellModel getIfFalseCellModel() {
    return (EditorCellModel)this.getChild(EditorCellModel.class, CellModel_Alternation.IF_FALSE_CELL_MODEL);
  }

  public void setIfFalseCellModel(EditorCellModel node) {
    super.setChild(CellModel_Alternation.IF_FALSE_CELL_MODEL, node);
  }


  public static CellModel_Alternation newInstance(SModel sm, boolean init) {
    return (CellModel_Alternation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_Alternation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_Alternation newInstance(SModel sm) {
    return CellModel_Alternation.newInstance(sm, false);
  }

}
