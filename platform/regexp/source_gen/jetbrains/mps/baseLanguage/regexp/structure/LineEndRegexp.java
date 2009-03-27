package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LineEndRegexp extends jetbrains.mps.baseLanguage.regexp.structure.Regexp {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp";

  public LineEndRegexp(SNode node) {
    super(node);
  }

  public static LineEndRegexp newInstance(SModel sm, boolean init) {
    return (LineEndRegexp)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.LineEndRegexp", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LineEndRegexp newInstance(SModel sm) {
    return LineEndRegexp.newInstance(sm, false);
  }

}
