package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.StaticMethodDeclaration;
import jetbrains.mps.baseLanguage.structure.InstanceMethodDeclaration;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimeProperty extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty";
  public static final String SINGLE_FORM = "singleForm";
  public static final String PLURAL_FORM = "pluralForm";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String JODA_DATE_TIME_FIELD_TYPE = "jodaDateTimeFieldType";
  public static final String JODA_PERIOD_TYPE = "jodaPeriodType";
  public static final String JODA_DURATION_TYPE = "jodaDurationType";
  public static final String PERIOD_FORMAT_METHOD = "periodFormatMethod";

  public DateTimeProperty(SNode node) {
    super(node);
  }

  public String getSingleForm() {
    return this.getProperty(DateTimeProperty.SINGLE_FORM);
  }

  public void setSingleForm(String value) {
    this.setProperty(DateTimeProperty.SINGLE_FORM, value);
  }

  public String getPluralForm() {
    return this.getProperty(DateTimeProperty.PLURAL_FORM);
  }

  public void setPluralForm(String value) {
    this.setProperty(DateTimeProperty.PLURAL_FORM, value);
  }

  public String getName() {
    return this.getProperty(DateTimeProperty.NAME);
  }

  public void setName(String value) {
    this.setProperty(DateTimeProperty.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DateTimeProperty.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DateTimeProperty.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DateTimeProperty.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DateTimeProperty.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DateTimeProperty.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DateTimeProperty.VIRTUAL_PACKAGE, value);
  }

  public StaticMethodDeclaration getJodaDateTimeFieldType() {
    return (StaticMethodDeclaration) this.getReferent(StaticMethodDeclaration.class, DateTimeProperty.JODA_DATE_TIME_FIELD_TYPE);
  }

  public void setJodaDateTimeFieldType(StaticMethodDeclaration node) {
    super.setReferent(DateTimeProperty.JODA_DATE_TIME_FIELD_TYPE, node);
  }

  public StaticMethodDeclaration getJodaPeriodType() {
    return (StaticMethodDeclaration) this.getReferent(StaticMethodDeclaration.class, DateTimeProperty.JODA_PERIOD_TYPE);
  }

  public void setJodaPeriodType(StaticMethodDeclaration node) {
    super.setReferent(DateTimeProperty.JODA_PERIOD_TYPE, node);
  }

  public StaticMethodDeclaration getJodaDurationType() {
    return (StaticMethodDeclaration) this.getReferent(StaticMethodDeclaration.class, DateTimeProperty.JODA_DURATION_TYPE);
  }

  public void setJodaDurationType(StaticMethodDeclaration node) {
    super.setReferent(DateTimeProperty.JODA_DURATION_TYPE, node);
  }

  public InstanceMethodDeclaration getPeriodFormatMethod() {
    return (InstanceMethodDeclaration) this.getReferent(InstanceMethodDeclaration.class, DateTimeProperty.PERIOD_FORMAT_METHOD);
  }

  public void setPeriodFormatMethod(InstanceMethodDeclaration node) {
    super.setReferent(DateTimeProperty.PERIOD_FORMAT_METHOD, node);
  }

  public static DateTimeProperty newInstance(SModel sm, boolean init) {
    return (DateTimeProperty) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimeProperty", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimeProperty newInstance(SModel sm) {
    return DateTimeProperty.newInstance(sm, false);
  }
}
