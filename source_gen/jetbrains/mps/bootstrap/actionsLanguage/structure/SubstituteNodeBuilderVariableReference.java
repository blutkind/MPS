package jetbrains.mps.bootstrap.actionsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SubstituteNodeBuilderVariableReference extends VariableReference {

  public  SubstituteNodeBuilderVariableReference(SNode node) {
    super(node);
  }

  public static SubstituteNodeBuilderVariableReference newInstance(SModel sm, boolean init) {
    return (SubstituteNodeBuilderVariableReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.actionsLanguage.SubstituteNodeBuilderVariableReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static SubstituteNodeBuilderVariableReference newInstance(SModel sm) {
    return SubstituteNodeBuilderVariableReference.newInstance(sm, false);
  }

  public SubstituteNodeBuilderVariableDeclaration getNodeBuilderVariableDeclaration() {
    return (SubstituteNodeBuilderVariableDeclaration)this.getVariableDeclaration();
  }
  public void setNodeBuilderVariableDeclaration(SubstituteNodeBuilderVariableDeclaration node) {
    this.setVariableDeclaration(node);
  }
}
