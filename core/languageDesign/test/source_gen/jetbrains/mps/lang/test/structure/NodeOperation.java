package jetbrains.mps.lang.test.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.unitTest.structure.ITestMethod;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NodeOperation extends BaseConcept implements ITestMethod {
  public static final String concept = "jetbrains.mps.lang.test.structure.NodeOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public NodeOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(NodeOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(NodeOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(NodeOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(NodeOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(NodeOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(NodeOperation.VIRTUAL_PACKAGE, value);
  }

  public static NodeOperation newInstance(SModel sm, boolean init) {
    return (NodeOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.test.structure.NodeOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NodeOperation newInstance(SModel sm) {
    return NodeOperation.newInstance(sm, false);
  }
}
