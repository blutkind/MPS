package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class CellMenuPart_ReferentPrimary extends CellMenuPart_Abstract {
  public static final String concept = "jetbrains.mps.lang.editor.structure.CellMenuPart_ReferentPrimary";

  public CellMenuPart_ReferentPrimary(SNode node) {
    super(node);
  }

  public static CellMenuPart_ReferentPrimary newInstance(SModel sm, boolean init) {
    return (CellMenuPart_ReferentPrimary)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.CellMenuPart_ReferentPrimary", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static CellMenuPart_ReferentPrimary newInstance(SModel sm) {
    return CellMenuPart_ReferentPrimary.newInstance(sm, false);
  }

}
