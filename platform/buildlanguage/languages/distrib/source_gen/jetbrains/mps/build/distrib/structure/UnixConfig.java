package jetbrains.mps.build.distrib.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class UnixConfig extends SystemSpecificConfig {
  public static final String concept = "jetbrains.mps.build.distrib.structure.UnixConfig";

  public UnixConfig(SNode node) {
    super(node);
  }

  public static UnixConfig newInstance(SModel sm, boolean init) {
    return (UnixConfig)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.build.distrib.structure.UnixConfig", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static UnixConfig newInstance(SModel sm) {
    return UnixConfig.newInstance(sm, false);
  }
}
