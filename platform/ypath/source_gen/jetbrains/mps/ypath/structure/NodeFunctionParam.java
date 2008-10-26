package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeFunctionParam extends ConceptFunctionParameter {
public    static final String concept = "jetbrains.mps.ypath.structure.NodeFunctionParam";

  public NodeFunctionParam(SNode node) {
    super(node);
  }

  public static NodeFunctionParam newInstance(SModel sm, boolean init) {
    return (NodeFunctionParam)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.NodeFunctionParam", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeFunctionParam newInstance(SModel sm) {
    return NodeFunctionParam.newInstance(sm, false);
  }

}
