package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;

public class MeetAnnotation_AnnotationLink {
  public static final String MEET_ANNOTATION = "MeetAnnotation";

  public static void setMeetAnnotation(BaseConcept source, MeetContainer target) {
    source.setAttribute(MeetAnnotation_AnnotationLink.MEET_ANNOTATION, target);
  }

  public static MeetContainer getMeetAnnotation(BaseConcept source) {
    return (MeetContainer)source.getAttribute(MeetAnnotation_AnnotationLink.MEET_ANNOTATION);
  }

}
