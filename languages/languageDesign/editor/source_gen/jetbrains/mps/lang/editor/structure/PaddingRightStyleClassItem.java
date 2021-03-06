package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PaddingRightStyleClassItem extends AbstractPaddingStyleClassItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem";

  public PaddingRightStyleClassItem(SNode node) {
    super(node);
  }

  public static PaddingRightStyleClassItem newInstance(SModel sm, boolean init) {
    return (PaddingRightStyleClassItem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PaddingRightStyleClassItem newInstance(SModel sm) {
    return PaddingRightStyleClassItem.newInstance(sm, false);
  }
}
