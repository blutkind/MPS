package jetbrains.mps.lang.quotation.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.quotation.structure.ReferenceAntiquotation;

public class ReferenceAntiquotation_AnnotationLink {
  public static final String REFERENCE_ANTIQUOTATION = "referenceAntiquotation";

  public static void setReferenceAntiquotation(BaseConcept source, String propertyName, ReferenceAntiquotation target) {
    source.setLinkAttribute(ReferenceAntiquotation_AnnotationLink.REFERENCE_ANTIQUOTATION, propertyName, target);
  }

  public static ReferenceAntiquotation getReferenceAntiquotation(BaseConcept source, String linkRole) {
    return (ReferenceAntiquotation)source.getLinkAttribute(ReferenceAntiquotation_AnnotationLink.REFERENCE_ANTIQUOTATION, linkRole);
  }

}
