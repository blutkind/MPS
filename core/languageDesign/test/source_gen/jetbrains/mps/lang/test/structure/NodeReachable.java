package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeReachable extends NodeProperty {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeReachable";

  public NodeReachable(SNode node) {
    super(node);
  }

  public static NodeReachable newInstance(SModel sm, boolean init) {
    return (NodeReachable) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeReachable", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeReachable newInstance(SModel sm) {
    return NodeReachable.newInstance(sm, false);
  }
}
