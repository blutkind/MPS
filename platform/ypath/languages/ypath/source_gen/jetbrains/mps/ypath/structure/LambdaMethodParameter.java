package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClosureParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class LambdaMethodParameter extends ClosureParameter {
  public static final String concept = "jetbrains.mps.ypath.structure.LambdaMethodParameter";

  public  LambdaMethodParameter(SNode node) {
    super(node);
  }

  public static LambdaMethodParameter newInstance(SModel sm, boolean init) {
    return (LambdaMethodParameter)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.LambdaMethodParameter", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static LambdaMethodParameter newInstance(SModel sm) {
    return LambdaMethodParameter.newInstance(sm, false);
  }

}
