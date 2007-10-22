package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ParameterQueryFun extends ConceptFunction implements IDesignFunction {
  public static final String concept = "jetbrains.mps.ypath.structure.ParameterQueryFun";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";

  public  ParameterQueryFun(SNode node) {
    super(node);
  }

  public static ParameterQueryFun newInstance(SModel sm, boolean init) {
    return (ParameterQueryFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.ParameterQueryFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ParameterQueryFun newInstance(SModel sm) {
    return ParameterQueryFun.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(ParameterQueryFun.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(ParameterQueryFun.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(ParameterQueryFun.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(ParameterQueryFun.ALIAS, value);
  }

}
