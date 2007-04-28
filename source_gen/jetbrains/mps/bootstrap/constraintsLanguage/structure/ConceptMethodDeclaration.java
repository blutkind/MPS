package jetbrains.mps.bootstrap.constraintsLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptMethodDeclaration extends BaseMethodDeclaration {
  public static String IS_VIRTUAL = "isVirtual";
  public static String IS_PRIVATE = "isPrivate";
  public static String OVERRIDEN_METHOD = "overridenMethod";

  public  ConceptMethodDeclaration(SNode node) {
    super(node);
  }

  public static ConceptMethodDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptMethodDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.constraintsLanguage.ConceptMethodDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static ConceptMethodDeclaration newInstance(SModel sm) {
    return ConceptMethodDeclaration.newInstance(sm, false);
  }

  public boolean getIsVirtual() {
    return this.getBooleanProperty(ConceptMethodDeclaration.IS_VIRTUAL);
  }
  public void setIsVirtual(boolean value) {
    this.setBooleanProperty(ConceptMethodDeclaration.IS_VIRTUAL, value);
  }
  public boolean getIsPrivate() {
    return this.getBooleanProperty(ConceptMethodDeclaration.IS_PRIVATE);
  }
  public void setIsPrivate(boolean value) {
    this.setBooleanProperty(ConceptMethodDeclaration.IS_PRIVATE, value);
  }
  public ConceptMethodDeclaration getOverridenMethod() {
    return (ConceptMethodDeclaration)this.getReferent(ConceptMethodDeclaration.OVERRIDEN_METHOD);
  }
  public void setOverridenMethod(ConceptMethodDeclaration node) {
    super.setReferent(ConceptMethodDeclaration.OVERRIDEN_METHOD, node);
  }
}
