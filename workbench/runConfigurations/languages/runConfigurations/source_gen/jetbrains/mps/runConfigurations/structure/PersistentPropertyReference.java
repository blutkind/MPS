package jetbrains.mps.runConfigurations.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.VariableReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PersistentPropertyReference extends VariableReference {
  public static final String concept = "jetbrains.mps.runConfigurations.structure.PersistentPropertyReference";

  public PersistentPropertyReference(SNode node) {
    super(node);
  }

  public PersistentPropertyDeclaration getVariableDeclaration() {
    return this.ensureAdapter(PersistentPropertyDeclaration.class, "variableDeclaration", this.getVariableDeclaration());
  }

  public void setVariableDeclaration(PersistentPropertyDeclaration node) {
    this.setVariableDeclaration(node);
  }

  public static PersistentPropertyReference newInstance(SModel sm, boolean init) {
    return (PersistentPropertyReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.runConfigurations.structure.PersistentPropertyReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PersistentPropertyReference newInstance(SModel sm) {
    return PersistentPropertyReference.newInstance(sm, false);
  }
}
