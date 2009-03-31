package jetbrains.mps.baseLanguage.regexp.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RegexpExpression extends Expression {
  public static final String concept = "jetbrains.mps.baseLanguage.regexp.structure.RegexpExpression";

  public RegexpExpression(SNode node) {
    super(node);
  }

  public static RegexpExpression newInstance(SModel sm, boolean init) {
    return (RegexpExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.regexp.structure.RegexpExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RegexpExpression newInstance(SModel sm) {
    return RegexpExpression.newInstance(sm, false);
  }

}
