package jetbrains.mps.lang.plugin.structure;

/*Generated by MPS */

import jetbrains.mps.lang.core.structure.BaseConcept;
import jetbrains.mps.baseLanguage.structure.IOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetSelectedTabOperation extends BaseConcept implements IOperation {
  public static final String concept = "jetbrains.mps.lang.plugin.structure.GetSelectedTabOperation";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public GetSelectedTabOperation(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GetSelectedTabOperation.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GetSelectedTabOperation.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GetSelectedTabOperation.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GetSelectedTabOperation.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GetSelectedTabOperation.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GetSelectedTabOperation.VIRTUAL_PACKAGE, value);
  }

  public static GetSelectedTabOperation newInstance(SModel sm, boolean init) {
    return (GetSelectedTabOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.plugin.structure.GetSelectedTabOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetSelectedTabOperation newInstance(SModel sm) {
    return GetSelectedTabOperation.newInstance(sm, false);
  }
}
