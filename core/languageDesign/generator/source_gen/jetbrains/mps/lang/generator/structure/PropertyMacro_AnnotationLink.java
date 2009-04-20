package jetbrains.mps.lang.generator.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.generator.structure.PropertyMacro;

public class PropertyMacro_AnnotationLink {
  public static final String PROPERTY_MACRO = "propertyMacro";

  public static void setPropertyMacro(BaseConcept source, String propertyName, PropertyMacro target) {
    source.setPropertyAttribute(PropertyMacro_AnnotationLink.PROPERTY_MACRO, propertyName, target);
  }

  public static PropertyMacro getPropertyMacro(BaseConcept source, String propertyName) {
    return (PropertyMacro)source.getPropertyAttribute(PropertyMacro_AnnotationLink.PROPERTY_MACRO, propertyName);
  }

}
