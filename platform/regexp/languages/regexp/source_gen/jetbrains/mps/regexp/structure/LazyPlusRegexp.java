package jetbrains.mps.regexp.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LazyPlusRegexp extends UnaryRegexp {

  public  LazyPlusRegexp(SNode node) {
    super(node);
  }

  public static LazyPlusRegexp newInstance(SModel sm, boolean init) {
    return (LazyPlusRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.regexp.LazyPlusRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static LazyPlusRegexp newInstance(SModel sm) {
    return LazyPlusRegexp.newInstance(sm, false);
  }
}
