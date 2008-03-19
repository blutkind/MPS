package jetbrains.mps.bootstrap.helgins.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NonTypesystemRule extends AbstractCheckingRule {
  public static final String concept = "jetbrains.mps.bootstrap.helgins.structure.NonTypesystemRule";

  public  NonTypesystemRule(SNode node) {
    super(node);
  }

  public static NonTypesystemRule newInstance(SModel sm, boolean init) {
    return ((NonTypesystemRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.bootstrap.helgins.structure.NonTypesystemRule", sm, GlobalScope.getInstance(), init).getAdapter());
  }

  public static NonTypesystemRule newInstance(SModel sm) {
    return NonTypesystemRule.newInstance(sm, false);
  }

}
