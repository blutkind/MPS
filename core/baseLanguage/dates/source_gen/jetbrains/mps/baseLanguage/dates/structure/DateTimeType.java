package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeType extends jetbrains.mps.baseLanguage.structure.PrimitiveType {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimeType";

  public DateTimeType(SNode node) {
    super(node);
  }

  public static DateTimeType newInstance(SModel sm, boolean init) {
    return (DateTimeType)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimeType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeType newInstance(SModel sm) {
    return DateTimeType.newInstance(sm, false);
  }

}
