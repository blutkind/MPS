package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class OrRegexp extends jetbrains.mps.baseLanguage.regexp.structure.BinaryRegexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.OrRegexp";

  public OrRegexp(SNode node) {
    super(node);
  }

  public static OrRegexp newInstance(SModel sm, boolean init) {
    return (OrRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.OrRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static OrRegexp newInstance(SModel sm) {
    return OrRegexp.newInstance(sm, false);
  }

}
