package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.ConceptFunctionParameter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class NodeSetupFunction_NewNode extends ConceptFunctionParameter {

  public  NodeSetupFunction_NewNode(SNode node) {
    super(node);
  }

  public static NodeSetupFunction_NewNode newInstance(SModel sm) {
    return (NodeSetupFunction_NewNode)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.NodeSetupFunction_NewNode", sm, GlobalScope.getInstance()).getAdapter();
  }
}
