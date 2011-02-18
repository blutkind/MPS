package jetbrains.mps.xmlUnitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.Statement;
import jetbrains.mps.baseLanguage.unitTest.structure.MessageHolder;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.Expression;
import jetbrains.mps.baseLanguage.unitTest.structure.Message;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class AssertXMLEquals extends Statement implements MessageHolder {
  public static final String concept = "jetbrains.mps.xmlUnitTest.structure.AssertXMLEquals";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String EXPECTED = "expected";
  public static final String ACTUAL = "actual";
  public static final String MESSAGE = "message";
  public static final String _$ATTRIBUTE = "_$attribute";

  public AssertXMLEquals(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(AssertXMLEquals.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(AssertXMLEquals.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(AssertXMLEquals.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(AssertXMLEquals.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(AssertXMLEquals.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(AssertXMLEquals.VIRTUAL_PACKAGE, value);
  }

  public Expression getExpected() {
    return (Expression) this.getChild(Expression.class, AssertXMLEquals.EXPECTED);
  }

  public void setExpected(Expression node) {
    super.setChild(AssertXMLEquals.EXPECTED, node);
  }

  public Expression getActual() {
    return (Expression) this.getChild(Expression.class, AssertXMLEquals.ACTUAL);
  }

  public void setActual(Expression node) {
    super.setChild(AssertXMLEquals.ACTUAL, node);
  }

  public Message getMessage() {
    return (Message) this.getChild(Message.class, AssertXMLEquals.MESSAGE);
  }

  public void setMessage(Message node) {
    super.setChild(AssertXMLEquals.MESSAGE, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(AssertXMLEquals._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, AssertXMLEquals._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, AssertXMLEquals._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(AssertXMLEquals._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, AssertXMLEquals._$ATTRIBUTE, node);
  }

  public static AssertXMLEquals newInstance(SModel sm, boolean init) {
    return (AssertXMLEquals) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.xmlUnitTest.structure.AssertXMLEquals", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static AssertXMLEquals newInstance(SModel sm) {
    return AssertXMLEquals.newInstance(sm, false);
  }
}
