package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GFCardinalParamFun extends GFCardinalFun implements IParamFeatureFun, IDesignFunction {
  public static final String concept = "jetbrains.mps.ypath.structure.GFCardinalParamFun";
  public static final String SHORT_DESCRIPTION = "shortDescription";
  public static final String ALIAS = "alias";
  public static final String VIRTUAL_PACKAGE = "virtualPackage";

  public GFCardinalParamFun(SNode node) {
    super(node);
  }

  public String getShortDescription() {
    return this.getProperty(GFCardinalParamFun.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(GFCardinalParamFun.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(GFCardinalParamFun.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(GFCardinalParamFun.ALIAS, value);
  }

  public String getVirtualPackage() {
    return this.getProperty(GFCardinalParamFun.VIRTUAL_PACKAGE);
  }

  public void setVirtualPackage(String value) {
    this.setProperty(GFCardinalParamFun.VIRTUAL_PACKAGE, value);
  }


  public static GFCardinalParamFun newInstance(SModel sm, boolean init) {
    return (GFCardinalParamFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.GFCardinalParamFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GFCardinalParamFun newInstance(SModel sm) {
    return GFCardinalParamFun.newInstance(sm, false);
  }

}
