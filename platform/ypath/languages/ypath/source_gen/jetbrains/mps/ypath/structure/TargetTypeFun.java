package jetbrains.mps.ypath.structure;

/*Generated by MPS */

import jetbrains.mps.baseLanguage.structure.ConceptFunction;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class TargetTypeFun extends ConceptFunction implements IDesignFunction {
  public static final String concept = "jetbrains.mps.ypath.structure.TargetTypeFun";
  public static String SHORT_DESCRIPTION = "shortDescription";
  public static String ALIAS = "alias";

  public  TargetTypeFun(SNode node) {
    super(node);
  }

  public static TargetTypeFun newInstance(SModel sm, boolean init) {
    return (TargetTypeFun)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.ypath.structure.TargetTypeFun", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static TargetTypeFun newInstance(SModel sm) {
    return TargetTypeFun.newInstance(sm, false);
  }


  public String getShortDescription() {
    return this.getProperty(TargetTypeFun.SHORT_DESCRIPTION);
  }

  public void setShortDescription(String value) {
    this.setProperty(TargetTypeFun.SHORT_DESCRIPTION, value);
  }

  public String getAlias() {
    return this.getProperty(TargetTypeFun.ALIAS);
  }

  public void setAlias(String value) {
    this.setProperty(TargetTypeFun.ALIAS, value);
  }

}
