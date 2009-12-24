package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropertyConfiguration extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyConfiguration";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DATE_TIME_PROPERTY_FORMAT_TYPE = "dateTimePropertyFormatType";

  public DateTimePropertyConfiguration(SNode node) {
    super(node);
  }

  public String getName() {
    return this.getProperty(DateTimePropertyConfiguration.NAME);
  }

  public void setName(String value) {
    this.setProperty(DateTimePropertyConfiguration.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DateTimePropertyConfiguration.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DateTimePropertyConfiguration.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DateTimePropertyConfiguration.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DateTimePropertyConfiguration.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DateTimePropertyConfiguration.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DateTimePropertyConfiguration.VIRTUAL_PACKAGE, value);
  }

  public int getDateTimePropertyFormatTypesCount() {
    return this.getChildCount(DateTimePropertyConfiguration.DATE_TIME_PROPERTY_FORMAT_TYPE);
  }

  public Iterator<DateTimePropertyFormatType> dateTimePropertyFormatTypes() {
    return this.children(DateTimePropertyFormatType.class, DateTimePropertyConfiguration.DATE_TIME_PROPERTY_FORMAT_TYPE);
  }

  public List<DateTimePropertyFormatType> getDateTimePropertyFormatTypes() {
    return this.getChildren(DateTimePropertyFormatType.class, DateTimePropertyConfiguration.DATE_TIME_PROPERTY_FORMAT_TYPE);
  }

  public void addDateTimePropertyFormatType(DateTimePropertyFormatType node) {
    this.addChild(DateTimePropertyConfiguration.DATE_TIME_PROPERTY_FORMAT_TYPE, node);
  }

  public void insertDateTimePropertyFormatType(DateTimePropertyFormatType prev, DateTimePropertyFormatType node) {
    this.insertChild(prev, DateTimePropertyConfiguration.DATE_TIME_PROPERTY_FORMAT_TYPE, node);
  }

  public static DateTimePropertyConfiguration newInstance(SModel sm, boolean init) {
    return (DateTimePropertyConfiguration) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyConfiguration", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropertyConfiguration newInstance(SModel sm) {
    return DateTimePropertyConfiguration.newInstance(sm, false);
  }
}
