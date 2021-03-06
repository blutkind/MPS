package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class FirstPositionAllowedStyleClassItem extends BooleanStyleSheetItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.FirstPositionAllowedStyleClassItem";

  public FirstPositionAllowedStyleClassItem(SNode node) {
    super(node);
  }

  public static FirstPositionAllowedStyleClassItem newInstance(SModel sm, boolean init) {
    return (FirstPositionAllowedStyleClassItem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.FirstPositionAllowedStyleClassItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static FirstPositionAllowedStyleClassItem newInstance(SModel sm) {
    return FirstPositionAllowedStyleClassItem.newInstance(sm, false);
  }
}
