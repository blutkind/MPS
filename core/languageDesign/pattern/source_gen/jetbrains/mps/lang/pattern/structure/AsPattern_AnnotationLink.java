package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class AsPattern_AnnotationLink {
  public static final String AS_PATTERN = "asPattern";

  public static void setAsPattern(BaseConcept source, AsPattern target) {
    source.setAttribute(AsPattern_AnnotationLink.AS_PATTERN, target);
  }

  public static AsPattern getAsPattern(BaseConcept source) {
    return (AsPattern) source.getAttribute(AsPattern_AnnotationLink.AS_PATTERN);
  }
}
