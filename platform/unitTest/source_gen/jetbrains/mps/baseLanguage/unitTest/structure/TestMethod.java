package jetbrains.mps.baseLanguage.unitTest.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.BaseMethodDeclaration;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TestMethod extends BaseMethodDeclaration implements ITestMethod {
  public static final String concept = "jetbrains.mps.baseLanguage.unitTest.structure.TestMethod";
  public static String METHOD_NAME = "methodName";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public TestMethod(SNode node) {
    super(node);
  }

  public static TestMethod newInstance(SModel sm, boolean init) {
    return (TestMethod)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.unitTest.structure.TestMethod", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TestMethod newInstance(SModel sm) {
    return TestMethod.newInstance(sm, false);
  }


  public String getMethodName() {
    return this.getProperty(TestMethod.METHOD_NAME);
  }

  public void setMethodName(String value) {
    this.setProperty(TestMethod.METHOD_NAME, value);
  }

  public String getShortDescription() {
    return this.getProperty(TestMethod.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TestMethod.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TestMethod.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TestMethod.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(TestMethod.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(TestMethod.VIRTUAL_PACKAGE, value);
  }

}
