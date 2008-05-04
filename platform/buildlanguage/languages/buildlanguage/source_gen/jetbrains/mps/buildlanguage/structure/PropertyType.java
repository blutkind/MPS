package jetbrains.mps.buildlanguage.structure;

/*Generated by MPS */

import jetbrains.mps.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class PropertyType extends BaseConcept {
  public static final String concept = "jetbrains.mps.buildlanguage.structure.PropertyType";

  public PropertyType(SNode node) {
    super(node);
  }

  public static PropertyType newInstance(SModel sm, boolean init) {
    return (PropertyType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.buildlanguage.structure.PropertyType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static PropertyType newInstance(SModel sm) {
    return PropertyType.newInstance(sm, false);
  }

}
