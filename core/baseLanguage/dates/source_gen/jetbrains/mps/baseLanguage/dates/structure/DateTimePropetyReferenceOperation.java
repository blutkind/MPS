package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropetyReferenceOperation extends DateTimeOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimePropetyReferenceOperation";
  public static final String DATE_TIME_PROPERTY = "dateTimeProperty";

  public DateTimePropetyReferenceOperation(SNode node) {
    super(node);
  }

  public DateTimeProperty getDateTimeProperty() {
    return (DateTimeProperty)this.getReferent(DateTimeProperty.class, DateTimePropetyReferenceOperation.DATE_TIME_PROPERTY);
  }

  public void setDateTimeProperty(DateTimeProperty node) {
    super.setReferent(DateTimePropetyReferenceOperation.DATE_TIME_PROPERTY, node);
  }


  public static DateTimePropetyReferenceOperation newInstance(SModel sm, boolean init) {
    return (DateTimePropetyReferenceOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimePropetyReferenceOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropetyReferenceOperation newInstance(SModel sm) {
    return DateTimePropetyReferenceOperation.newInstance(sm, false);
  }

}
