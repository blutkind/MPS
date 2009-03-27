package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class StarRegexp extends jetbrains.mps.baseLanguage.regexp.structure.UnaryRegexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.StarRegexp";

  public StarRegexp(SNode node) {
    super(node);
  }

  public static StarRegexp newInstance(SModel sm, boolean init) {
    return (StarRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.StarRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static StarRegexp newInstance(SModel sm) {
    return StarRegexp.newInstance(sm, false);
  }

}
