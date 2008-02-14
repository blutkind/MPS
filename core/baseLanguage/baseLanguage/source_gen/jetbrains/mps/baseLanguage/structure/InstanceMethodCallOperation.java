package jetbrains.mps.baseLanguage.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class InstanceMethodCallOperation extends BaseMethodCall implements IOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";
  public static String VIRTUAL_PACKAGE = "virtualPackage";

  public  InstanceMethodCallOperation(SNode node) {
    super(node);
  }

  public static InstanceMethodCallOperation newInstance(SModel sm, boolean init) {
    return (InstanceMethodCallOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.structure.InstanceMethodCallOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static InstanceMethodCallOperation newInstance(SModel sm) {
    return InstanceMethodCallOperation.newInstance(sm, false);
  }


  public InstanceMethodDeclaration getInstanceMethodDeclaration() {
    return (InstanceMethodDeclaration)this.getBaseMethodDeclaration();
  }

  public void setInstanceMethodDeclaration(InstanceMethodDeclaration node) {
    this.setBaseMethodDeclaration(node);
  }

  public String getShortDescription() {
    return this.getProperty(InstanceMethodCallOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(InstanceMethodCallOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(InstanceMethodCallOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(InstanceMethodCallOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(InstanceMethodCallOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(InstanceMethodCallOperation.VIRTUAL_PACKAGE, value);
  }

}
