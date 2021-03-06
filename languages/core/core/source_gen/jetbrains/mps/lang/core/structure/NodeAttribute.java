package jetbrains.mps.lang.core.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeAttribute extends Attribute {
  public static final String concept = "jetbrains.mps.lang.core.structure.NodeAttribute";

  public NodeAttribute(SNode node) {
    super(node);
  }

  public static NodeAttribute newInstance(SModel sm, boolean init) {
    return (NodeAttribute) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.core.structure.NodeAttribute", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeAttribute newInstance(SModel sm) {
    return NodeAttribute.newInstance(sm, false);
  }
}
