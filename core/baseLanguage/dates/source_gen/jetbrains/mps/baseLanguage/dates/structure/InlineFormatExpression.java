package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.datesInternal.structure.Locale;
import java.util.Iterator;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InlineFormatExpression extends UnaryDateTimeOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.InlineFormatExpression";
  public static final String WITH_LOCALE = "withLocale";
  public static final String LOCALE = "locale";
  public static final String FORMAT_TOKEN = "formatToken";

  public InlineFormatExpression(SNode node) {
    super(node);
  }

  public boolean getWithLocale() {
    return this.getBooleanProperty(InlineFormatExpression.WITH_LOCALE);
  }

  public void setWithLocale(boolean value) {
    this.setBooleanProperty(InlineFormatExpression.WITH_LOCALE, value);
  }

  public Locale getLocale() {
    return (Locale)this.getReferent(InlineFormatExpression.LOCALE);
  }

  public void setLocale(Locale node) {
    super.setReferent(InlineFormatExpression.LOCALE, node);
  }

  public int getFormatTokensCount() {
    return this.getChildCount(InlineFormatExpression.FORMAT_TOKEN);
  }

  public Iterator<FormatToken> formatTokens() {
    return this.children(InlineFormatExpression.FORMAT_TOKEN);
  }

  public List<FormatToken> getFormatTokens() {
    return this.getChildren(InlineFormatExpression.FORMAT_TOKEN);
  }

  public void addFormatToken(FormatToken node) {
    this.addChild(InlineFormatExpression.FORMAT_TOKEN, node);
  }

  public void insertFormatToken(FormatToken prev, FormatToken node) {
    this.insertChild(prev, InlineFormatExpression.FORMAT_TOKEN, node);
  }


  public static InlineFormatExpression newInstance(SModel sm, boolean init) {
    return (InlineFormatExpression)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.InlineFormatExpression", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InlineFormatExpression newInstance(SModel sm) {
    return InlineFormatExpression.newInstance(sm, false);
  }

}
