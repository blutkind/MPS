package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class KindBlock extends LambdaMethod {
  public static final String concept = "jetbrains.mps.ypath.structure.KindBlock";

  public  KindBlock(SNode node) {
    super(node);
  }

  public static KindBlock newInstance(SModel sm, boolean init) {
    return (KindBlock)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.KindBlock", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static KindBlock newInstance(SModel sm) {
    return KindBlock.newInstance(sm, false);
  }

}
