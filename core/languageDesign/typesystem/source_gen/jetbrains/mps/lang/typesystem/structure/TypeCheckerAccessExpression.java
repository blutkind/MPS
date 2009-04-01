package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TypeCheckerAccessExpression extends Expression {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.TypeCheckerAccessExpression";

  public TypeCheckerAccessExpression(SNode node) {
    super(node);
  }

  public static TypeCheckerAccessExpression newInstance(SModel sm, boolean init) {
    return (TypeCheckerAccessExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.TypeCheckerAccessExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TypeCheckerAccessExpression newInstance(SModel sm) {
    return TypeCheckerAccessExpression.newInstance(sm, false);
  }

}
