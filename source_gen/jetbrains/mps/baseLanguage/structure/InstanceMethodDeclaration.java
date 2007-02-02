package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil;
import jetbrains.mps.project.GlobalScope;

public class InstanceMethodDeclaration extends BaseMethodDeclaration {

  public  InstanceMethodDeclaration(SNode node) {
    super(node);
  }

  public static InstanceMethodDeclaration newInstance(SModel sm) {
    return (InstanceMethodDeclaration)SModelUtil.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.InstanceMethodDeclaration", sm, GlobalScope.getInstance()).getAdapter();
  }
}
