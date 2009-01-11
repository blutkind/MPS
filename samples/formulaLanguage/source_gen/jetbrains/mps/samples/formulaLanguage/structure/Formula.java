package jetbrains.mps.samples.formulaLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Formula extends BaseConcept {
  public static final String concept = "jetbrains.mps.samples.formulaLanguage.structure.Formula";
  public static final String EXPRESSION = "expression";

  public Formula(SNode node) {
    super(node);
  }

  public Expression getExpression() {
    return (Expression)this.getChild(Expression.class, Formula.EXPRESSION);
  }

  public void setExpression(Expression node) {
    super.setChild(Formula.EXPRESSION, node);
  }


  public static Formula newInstance(SModel sm, boolean init) {
    return (Formula)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.samples.formulaLanguage.structure.Formula", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Formula newInstance(SModel sm) {
    return Formula.newInstance(sm, false);
  }

}
