package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellLayout_Indent_Old extends CellLayout {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellLayout_Indent_Old";

  public CellLayout_Indent_Old(SNode node) {
    super(node);
  }

  public static CellLayout_Indent_Old newInstance(SModel sm, boolean init) {
    return (CellLayout_Indent_Old)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellLayout_Indent_Old", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellLayout_Indent_Old newInstance(SModel sm) {
    return CellLayout_Indent_Old.newInstance(sm, false);
  }

}
