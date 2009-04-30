package jetbrains.mps.lang.editor.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StrikeOutStyleSheet extends BooleanStyleSheetItem {
  public static final String concept = "jetbrains.mps.lang.editor.structure.StrikeOutStyleSheet";

  public StrikeOutStyleSheet(SNode node) {
    super(node);
  }

  public static StrikeOutStyleSheet newInstance(SModel sm, boolean init) {
    return (StrikeOutStyleSheet)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.editor.structure.StrikeOutStyleSheet", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StrikeOutStyleSheet newInstance(SModel sm) {
    return StrikeOutStyleSheet.newInstance(sm, false);
  }

}
