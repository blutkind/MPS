package jetbrains.mps.samples.formulaLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Expression extends BaseConcept {
  public static final String concept = "jetbrains.mps.samples.formulaLanguage.structure.Expression";

  public Expression(SNode node) {
    super(node);
  }

  public static Expression newInstance(SModel sm, boolean init) {
    return (Expression) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.formulaLanguage.structure.Expression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Expression newInstance(SModel sm) {
    return Expression.newInstance(sm, false);
  }
}
