package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.regexp.structure.UnaryRegexp;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LazyQuestionRegexp extends UnaryRegexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.LazyQuestionRegexp";

  public LazyQuestionRegexp(SNode node) {
    super(node);
  }

  public static LazyQuestionRegexp newInstance(SModel sm, boolean init) {
    return (LazyQuestionRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.LazyQuestionRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LazyQuestionRegexp newInstance(SModel sm) {
    return LazyQuestionRegexp.newInstance(sm, false);
  }

}
