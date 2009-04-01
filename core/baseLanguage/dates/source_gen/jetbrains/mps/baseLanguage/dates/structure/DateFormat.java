package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.datesInternal.structure.IDateFormat;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.dates.structure.DateFormatVisibility;
import java.util.Iterator;
import jetbrains.mps.baseLanguage.dates.structure.FormatToken;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateFormat extends BaseConcept implements IDateFormat {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.DateFormat";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String NAME = "name";
  public static final String IS_PUBLIC = "isPublic";
  public static final String DATE_FORMAT_VISIBILITY = "dateFormatVisibility";
  public static final String TOKEN = "token";

  public DateFormat(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(DateFormat.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DateFormat.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DateFormat.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DateFormat.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DateFormat.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DateFormat.VIRTUAL_PACKAGE, value);
  }

  public String getName() {
    return this.getProperty(DateFormat.NAME);
  }

  public void setName(String value) {
    this.setProperty(DateFormat.NAME, value);
  }

  public boolean getIsPublic() {
    return this.getBooleanProperty(DateFormat.IS_PUBLIC);
  }

  public void setIsPublic(boolean value) {
    this.setBooleanProperty(DateFormat.IS_PUBLIC, value);
  }

  public DateFormatVisibility getDateFormatVisibility() {
    String value = super.getProperty(DateFormat.DATE_FORMAT_VISIBILITY);
    return DateFormatVisibility.parseValue(value);
  }

  public void setDateFormatVisibility(DateFormatVisibility value) {
    super.setProperty(DateFormat.DATE_FORMAT_VISIBILITY, value.getValueAsString());
  }

  public int getTokensCount() {
    return this.getChildCount(DateFormat.TOKEN);
  }

  public Iterator<FormatToken> tokens() {
    return this.children(FormatToken.class, DateFormat.TOKEN);
  }

  public List<FormatToken> getTokens() {
    return this.getChildren(FormatToken.class, DateFormat.TOKEN);
  }

  public void addToken(FormatToken node) {
    this.addChild(DateFormat.TOKEN, node);
  }

  public void insertToken(FormatToken prev, FormatToken node) {
    this.insertChild(prev, DateFormat.TOKEN, node);
  }


  public static DateFormat newInstance(SModel sm, boolean init) {
    return (DateFormat)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.DateFormat", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateFormat newInstance(SModel sm) {
    return DateFormat.newInstance(sm, false);
  }

}
