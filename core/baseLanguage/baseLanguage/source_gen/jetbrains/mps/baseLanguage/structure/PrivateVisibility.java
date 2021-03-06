package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PrivateVisibility extends Visibility {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.PrivateVisibility";

  public PrivateVisibility(SNode node) {
    super(node);
  }

  public static PrivateVisibility newInstance(SModel sm, boolean init) {
    return (PrivateVisibility) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PrivateVisibility", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PrivateVisibility newInstance(SModel sm) {
    return PrivateVisibility.newInstance(sm, false);
  }
}
