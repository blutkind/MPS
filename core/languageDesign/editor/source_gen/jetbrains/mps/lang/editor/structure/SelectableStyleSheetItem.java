package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SelectableStyleSheetItem extends BooleanStyleSheetItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem";

  public SelectableStyleSheetItem(SNode node) {
    super(node);
  }

  public static SelectableStyleSheetItem newInstance(SModel sm, boolean init) {
    return (SelectableStyleSheetItem) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SelectableStyleSheetItem newInstance(SModel sm) {
    return SelectableStyleSheetItem.newInstance(sm, false);
  }
}
