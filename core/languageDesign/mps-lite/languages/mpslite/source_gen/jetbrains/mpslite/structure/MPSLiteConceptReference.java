package jetbrains.mpslite.structure;

/*Generated by MPS */

import jetbrains.mpslite.structure.AbstractConceptReference;
import jetbrains.mps.smodel.SNode;
import jetbrains.mpslite.structure.IMPSLiteConcept;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class MPSLiteConceptReference extends AbstractConceptReference {
  public static final String concept = "jetbrains.mpslite.structure.MPSLiteConceptReference";

  public MPSLiteConceptReference(SNode node) {
    super(node);
  }

  public IMPSLiteConcept getMpsLiteConceptDeclaration() {
    return this.ensureAdapter(IMPSLiteConcept.class, "conceptDeclaration", this.getConceptDeclaration());
  }

  public void setMpsLiteConceptDeclaration(IMPSLiteConcept node) {
    this.setConceptDeclaration(node);
  }


  public static MPSLiteConceptReference newInstance(SModel sm, boolean init) {
    return (MPSLiteConceptReference)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mpslite.structure.MPSLiteConceptReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static MPSLiteConceptReference newInstance(SModel sm) {
    return MPSLiteConceptReference.newInstance(sm, false);
  }

}
