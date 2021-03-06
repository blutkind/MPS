package jetbrains.mps.lang.textGen.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DecreaseDepthOperation extends SimpleTextGenOperation {
  public static final String concept = "jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation";

  public DecreaseDepthOperation(SNode node) {
    super(node);
  }

  public static DecreaseDepthOperation newInstance(SModel sm, boolean init) {
    return (DecreaseDepthOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.textGen.structure.DecreaseDepthOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DecreaseDepthOperation newInstance(SModel sm) {
    return DecreaseDepthOperation.newInstance(sm, false);
  }
}
