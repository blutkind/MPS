package jetbrains.mps.testbench.suite.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.baseLanguage.structure.ClassConcept;
import java.util.Iterator;
import jetbrains.mps.lang.core.structure.Attribute;
import java.util.List;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class JUnit3TestCaseRef extends BaseConcept implements ITestRef {
  public static final String concept = "jetbrains.mps.testbench.suite.structure.JUnit3TestCaseRef";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String MUTED = "muted";
  public static final String KLASS = "klass";
  public static final String _$ATTRIBUTE = "_$attribute";

  public JUnit3TestCaseRef(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(JUnit3TestCaseRef.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(JUnit3TestCaseRef.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(JUnit3TestCaseRef.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(JUnit3TestCaseRef.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(JUnit3TestCaseRef.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(JUnit3TestCaseRef.VIRTUAL_PACKAGE, value);
  }

  public boolean getMuted() {
    return this.getBooleanProperty(JUnit3TestCaseRef.MUTED);
  }

  public void setMuted(boolean value) {
    this.setBooleanProperty(JUnit3TestCaseRef.MUTED, value);
  }

  public ClassConcept getKlass() {
    return (ClassConcept) this.getReferent(ClassConcept.class, JUnit3TestCaseRef.KLASS);
  }

  public void setKlass(ClassConcept node) {
    super.setReferent(JUnit3TestCaseRef.KLASS, node);
  }

  public int get_$attributesCount() {
    return this.getChildCount(JUnit3TestCaseRef._$ATTRIBUTE);
  }

  public Iterator<Attribute> _$attributes() {
    return this.children(Attribute.class, JUnit3TestCaseRef._$ATTRIBUTE);
  }

  public List<Attribute> get_$attributes() {
    return this.getChildren(Attribute.class, JUnit3TestCaseRef._$ATTRIBUTE);
  }

  public void add_$attribute(Attribute node) {
    this.addChild(JUnit3TestCaseRef._$ATTRIBUTE, node);
  }

  public void insert_$attribute(Attribute prev, Attribute node) {
    this.insertChild(prev, JUnit3TestCaseRef._$ATTRIBUTE, node);
  }

  public static JUnit3TestCaseRef newInstance(SModel sm, boolean init) {
    return (JUnit3TestCaseRef) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.testbench.suite.structure.JUnit3TestCaseRef", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static JUnit3TestCaseRef newInstance(SModel sm) {
    return JUnit3TestCaseRef.newInstance(sm, false);
  }
}
