package jetbrains.mps.bootstrap.smodelLanguage.structure;

/*Generated by MPS  */

import jetbrains.mps.smodel.INodeAdapter;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;
import jetbrains.mps.bootstrap.structureLanguage.structure.ConceptPropertyDeclaration;

public class SConceptPropertyAccess extends SNodeOperation implements INodeAdapter {
  public static String CONCEPT_PROPERTY = "conceptProperty";

  public  SConceptPropertyAccess(SNode node) {
    super(node);
  }

  public static SConceptPropertyAccess newInstance(SModel sm, boolean init) {
    return (SConceptPropertyAccess)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.smodelLanguage.SConceptPropertyAccess", sm, GlobalScope.getInstance(), init).getAdapter();
  }
  public static SConceptPropertyAccess newInstance(SModel sm) {
    return SConceptPropertyAccess.newInstance(sm, false);
  }

  public ConceptPropertyDeclaration getConceptProperty() {
    return (ConceptPropertyDeclaration)this.getReferent(SConceptPropertyAccess.CONCEPT_PROPERTY);
  }
  public void setConceptProperty(ConceptPropertyDeclaration node) {
    super.setReferent(SConceptPropertyAccess.CONCEPT_PROPERTY, node);
  }
}
