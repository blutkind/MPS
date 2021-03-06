package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NegativeLookBehindRegexp extends LookRegexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.NegativeLookBehindRegexp";

  public NegativeLookBehindRegexp(SNode node) {
    super(node);
  }

  public static NegativeLookBehindRegexp newInstance(SModel sm, boolean init) {
    return (NegativeLookBehindRegexp) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.NegativeLookBehindRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NegativeLookBehindRegexp newInstance(SModel sm) {
    return NegativeLookBehindRegexp.newInstance(sm, false);
  }
}
