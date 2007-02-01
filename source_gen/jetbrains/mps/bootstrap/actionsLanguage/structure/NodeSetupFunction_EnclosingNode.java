package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class NodeSetupFunction_EnclosingNode extends ConceptFunctionParameter {

  public  NodeSetupFunction_EnclosingNode(SNode node) {
    super(node);
  }

  public static NodeSetupFunction_EnclosingNode newInstance(SModel sm) {
    return (NodeSetupFunction_EnclosingNode)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_EnclosingNode", sm, GlobalScope.getInstance()).getAdapter();
  }
}
