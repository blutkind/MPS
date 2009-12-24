package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ClassConcept;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BTestCase extends ClassConcept implements ITestCase {
  public static final String concept = "jetbrains.mps.baseLanguage.unitTest.structure.BTestCase";
  public static final String TEST_CASE_NAME = "testCaseName";
  public static final String NAME = "name";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";
  public static final String TEST_METHOD_LIST = "testMethodList";

  public BTestCase(SNode node) {
    super(node);
  }

  public String getTestCaseName() {
    return this.getProperty(BTestCase.TEST_CASE_NAME);
  }

  public void setTestCaseName(String value) {
    this.setProperty(BTestCase.TEST_CASE_NAME, value);
  }

  public String getName() {
    return this.getProperty(BTestCase.NAME);
  }

  public void setName(String value) {
    this.setProperty(BTestCase.NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(BTestCase.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BTestCase.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BTestCase.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BTestCase.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BTestCase.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BTestCase.VIRTUAL_PACKAGE, value);
  }

  public TestMethodList getTestMethodList() {
    return (TestMethodList) this.getChild(TestMethodList.class, BTestCase.TEST_METHOD_LIST);
  }

  public void setTestMethodList(TestMethodList node) {
    super.setChild(BTestCase.TEST_METHOD_LIST, node);
  }

  public static BTestCase newInstance(SModel sm, boolean init) {
    return (BTestCase) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.BTestCase", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BTestCase newInstance(SModel sm) {
    return BTestCase.newInstance(sm, false);
  }
}
