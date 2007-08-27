package jetbrains.mps.bootstrap.structureLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ConceptLinkDeclaration extends BaseConcept implements INamedConcept {
  public static String TARGET_TYPE = "targetType";
  public static String NAME = "name";

  public  ConceptLinkDeclaration(SNode node) {
    super(node);
  }

  public static ConceptLinkDeclaration newInstance(SModel sm, boolean init) {
    return (ConceptLinkDeclaration)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.structureLanguage.structure.ConceptLinkDeclaration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ConceptLinkDeclaration newInstance(SModel sm) {
    return ConceptLinkDeclaration.newInstance(sm, false);
  }


  public ConceptDeclaration getTargetType() {
    return (ConceptDeclaration)this.getReferent(ConceptLinkDeclaration.TARGET_TYPE);
  }

  public void setTargetType(ConceptDeclaration node) {
    super.setReferent(ConceptLinkDeclaration.TARGET_TYPE, node);
  }

  public String getName() {
    return this.getProperty(ConceptLinkDeclaration.NAME);
  }

  public void setName(String value) {
    this.setProperty(ConceptLinkDeclaration.NAME, value);
  }

}
