package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.AbstractUnaryNumberOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PrefixIncrementExpression extends AbstractUnaryNumberOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.PrefixIncrementExpression";

  public PrefixIncrementExpression(SNode node) {
    super(node);
  }

  public static PrefixIncrementExpression newInstance(SModel sm, boolean init) {
    return (PrefixIncrementExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.PrefixIncrementExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PrefixIncrementExpression newInstance(SModel sm) {
    return PrefixIncrementExpression.newInstance(sm, false);
  }

}
