package jetbrains.mps.xmlSchema.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ComplexTypeReference extends BaseConcept {
  public static final String concept = "jetbrains.mps.xmlSchema.structure.ComplexTypeReference";
  public static final String COMPLEX_TYPE = "complexType";

  public ComplexTypeReference(SNode node) {
    super(node);
  }

  public ComplexType getComplexType() {
    return (ComplexType) this.getReferent(ComplexType.class, ComplexTypeReference.COMPLEX_TYPE);
  }

  public void setComplexType(ComplexType node) {
    super.setReferent(ComplexTypeReference.COMPLEX_TYPE, node);
  }

  public static ComplexTypeReference newInstance(SModel sm, boolean init) {
    return (ComplexTypeReference) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlSchema.structure.ComplexTypeReference", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ComplexTypeReference newInstance(SModel sm) {
    return ComplexTypeReference.newInstance(sm, false);
  }
}
