package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellModel_AttributedLinkCell extends EditorCellModel {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellModel_AttributedLinkCell";

  public CellModel_AttributedLinkCell(SNode node) {
    super(node);
  }

  public static CellModel_AttributedLinkCell newInstance(SModel sm, boolean init) {
    return (CellModel_AttributedLinkCell)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellModel_AttributedLinkCell", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellModel_AttributedLinkCell newInstance(SModel sm) {
    return CellModel_AttributedLinkCell.newInstance(sm, false);
  }

}
