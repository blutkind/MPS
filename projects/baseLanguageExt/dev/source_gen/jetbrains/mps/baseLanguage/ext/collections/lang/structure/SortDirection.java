package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BooleanConstant;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SortDirection extends BooleanConstant {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection";

  public  SortDirection(SNode node) {
    super(node);
  }

  public static SortDirection newInstance(SModel sm, boolean init) {
    return (SortDirection)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.SortDirection", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SortDirection newInstance(SModel sm) {
    return SortDirection.newInstance(sm, false);
  }

}
