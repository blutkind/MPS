package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.PrimitiveType;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ShortType extends PrimitiveType {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.ShortType";

  public ShortType(SNode node) {
    super(node);
  }

  public static ShortType newInstance(SModel sm, boolean init) {
    return (ShortType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.ShortType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ShortType newInstance(SModel sm) {
    return ShortType.newInstance(sm, false);
  }

}
