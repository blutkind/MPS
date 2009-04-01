package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.typesystem.structure.Processed;

public class Processed_AnnotationLink {
  public static final String PROCESSED = "processed";

  public static void setProcessed(BaseConcept source, Processed target) {
    source.setAttribute(Processed_AnnotationLink.PROCESSED, target);
  }

  public static Processed getProcessed(BaseConcept source) {
    return (Processed)source.getAttribute(Processed_AnnotationLink.PROCESSED);
  }

}
