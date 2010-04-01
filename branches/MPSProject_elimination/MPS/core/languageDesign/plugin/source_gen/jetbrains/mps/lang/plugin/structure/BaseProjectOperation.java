package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class BaseProjectOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.BaseProjectOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public BaseProjectOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(BaseProjectOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(BaseProjectOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(BaseProjectOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(BaseProjectOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(BaseProjectOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(BaseProjectOperation.VIRTUAL_PACKAGE, value);
  }

  public static BaseProjectOperation newInstance(SModel sm, boolean init) {
    return (BaseProjectOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.BaseProjectOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static BaseProjectOperation newInstance(SModel sm) {
    return BaseProjectOperation.newInstance(sm, false);
  }
}
