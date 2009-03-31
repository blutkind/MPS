package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.regexp.structure.UnaryRegexp;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class QuestionRegexp extends UnaryRegexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.QuestionRegexp";

  public QuestionRegexp(SNode node) {
    super(node);
  }

  public static QuestionRegexp newInstance(SModel sm, boolean init) {
    return (QuestionRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.QuestionRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static QuestionRegexp newInstance(SModel sm) {
    return QuestionRegexp.newInstance(sm, false);
  }

}
