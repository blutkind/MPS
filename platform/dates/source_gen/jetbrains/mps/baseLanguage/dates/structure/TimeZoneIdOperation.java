package jetbrains.mps.baseLanguage.dates.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TimeZoneIdOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.dates.structure.TimeZoneIdOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String _$ATTRIBUTE = "_$attribute";

  public TimeZoneIdOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(TimeZoneIdOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TimeZoneIdOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TimeZoneIdOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TimeZoneIdOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TimeZoneIdOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TimeZoneIdOperation.VIRTUAL_PACKAGE, value);
  }

  public int get_$attributesCount() {
    return this.getChildCount(TimeZoneIdOperation._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, TimeZoneIdOperation._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, TimeZoneIdOperation._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(TimeZoneIdOperation._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, TimeZoneIdOperation._$ATTRIBUTE, node);
  }

  public static TimeZoneIdOperation newInstance(SModel sm, boolean init) {
    return (TimeZoneIdOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.dates.structure.TimeZoneIdOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TimeZoneIdOperation newInstance(SModel sm) {
    return TimeZoneIdOperation.newInstance(sm, false);
  }
}
