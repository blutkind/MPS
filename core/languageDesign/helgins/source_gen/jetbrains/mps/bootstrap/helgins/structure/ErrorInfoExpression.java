package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ErrorInfoExpression extends Expression {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.ErrorInfoExpression";

  public  ErrorInfoExpression(SNode node) {
    super(node);
  }

  public static ErrorInfoExpression newInstance(SModel sm, boolean init) {
    return ((ErrorInfoExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.ErrorInfoExpression", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static ErrorInfoExpression newInstance(SModel sm) {
    return ErrorInfoExpression.newInstance(sm, false);
  }

}
