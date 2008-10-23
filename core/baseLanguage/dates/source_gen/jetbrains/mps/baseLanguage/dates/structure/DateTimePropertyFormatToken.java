package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyConfiguration;
import jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyFormatType;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropertyFormatToken extends FormatToken {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken";
  public static final String DATE_TIME_PROPERTY_FORMAT_CONFIGURATION = "dateTimePropertyFormatConfiguration";
  public static final String DATE_TIME_PROPERTY_FORMAT_TYPE = "dateTimePropertyFormatType";

  public DateTimePropertyFormatToken(SNode node) {
    super(node);
  }

  public DateTimePropertyConfiguration getDateTimePropertyFormatConfiguration() {
    return (DateTimePropertyConfiguration)this.getReferent(DateTimePropertyFormatToken.DATE_TIME_PROPERTY_FORMAT_CONFIGURATION);
  }

  public void setDateTimePropertyFormatConfiguration(DateTimePropertyConfiguration node) {
    super.setReferent(DateTimePropertyFormatToken.DATE_TIME_PROPERTY_FORMAT_CONFIGURATION, node);
  }

  public DateTimePropertyFormatType getDateTimePropertyFormatType() {
    return (DateTimePropertyFormatType)this.getReferent(DateTimePropertyFormatToken.DATE_TIME_PROPERTY_FORMAT_TYPE);
  }

  public void setDateTimePropertyFormatType(DateTimePropertyFormatType node) {
    super.setReferent(DateTimePropertyFormatToken.DATE_TIME_PROPERTY_FORMAT_TYPE, node);
  }


  public static DateTimePropertyFormatToken newInstance(SModel sm, boolean init) {
    return (DateTimePropertyFormatToken)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateTimePropertyFormatToken", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropertyFormatToken newInstance(SModel sm) {
    return DateTimePropertyFormatToken.newInstance(sm, false);
  }

}
