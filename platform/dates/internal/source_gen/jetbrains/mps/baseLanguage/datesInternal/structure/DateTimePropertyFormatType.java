package jetbrains.mps.baseLanguage.datesInternal.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.lang.core.structure.INamedConcept;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class DateTimePropertyFormatType extends BaseConcept implements INamedConcept {
  public static final String concept = "jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyFormatType";
  public static final String LETTER = "letter";
  public static final String MEANING = "meaning";
  public static final String EXAMPLES = "examples";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String DATE_TIME_PROPERTY_CARDINALITY = "dateTimePropertyCardinality";
  public static final String _$ATTRIBUTE = "_$attribute";

  public DateTimePropertyFormatType(SNode node) {
    super(node);
  }

  public String getLetter() {
    return this.getProperty(DateTimePropertyFormatType.LETTER);
  }

  public void setLetter(String value) {
    this.setProperty(DateTimePropertyFormatType.LETTER, value);
  }

  public String getMeaning() {
    return this.getProperty(DateTimePropertyFormatType.MEANING);
  }

  public void setMeaning(String value) {
    this.setProperty(DateTimePropertyFormatType.MEANING, value);
  }

  public String getExamples() {
    return this.getProperty(DateTimePropertyFormatType.EXAMPLES);
  }

  public void setExamples(String value) {
    this.setProperty(DateTimePropertyFormatType.EXAMPLES, value);
  }

  public String getName() {
    return this.getProperty(DateTimePropertyFormatType.NAME);
  }

  public void setName(String value) {
    this.setProperty(DateTimePropertyFormatType.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(DateTimePropertyFormatType.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(DateTimePropertyFormatType.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(DateTimePropertyFormatType.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(DateTimePropertyFormatType.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(DateTimePropertyFormatType.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(DateTimePropertyFormatType.VIRTUAL_PACKAGE, value);
  }

  public DateTimePropertyCardinality getDateTimePropertyCardinality() {
    return (DateTimePropertyCardinality) this.getReferent(DateTimePropertyCardinality.class, DateTimePropertyFormatType.DATE_TIME_PROPERTY_CARDINALITY);
  }

  public void setDateTimePropertyCardinality(DateTimePropertyCardinality node) {
    super.setReferent(DateTimePropertyFormatType.DATE_TIME_PROPERTY_CARDINALITY, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(DateTimePropertyFormatType._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, DateTimePropertyFormatType._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, DateTimePropertyFormatType._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(DateTimePropertyFormatType._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, DateTimePropertyFormatType._$ATTRIBUTE, node);
  }

  public static DateTimePropertyFormatType newInstance(SModel sm, boolean init) {
    return (DateTimePropertyFormatType) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.datesInternal.structure.DateTimePropertyFormatType", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static DateTimePropertyFormatType newInstance(SModel sm) {
    return DateTimePropertyFormatType.newInstance(sm, false);
  }
}
