package jetbrains.mps.lang.typesystem.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class SubtypingRule extends AbstractSubtypingRule {
  public static final String concept = "jetbrains.mps.lang.typesystem.structure.SubtypingRule";

  public SubtypingRule(SNode node) {
    super(node);
  }

  public static SubtypingRule newInstance(SModel sm, boolean init) {
    return (SubtypingRule)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.typesystem.structure.SubtypingRule", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static SubtypingRule newInstance(SModel sm) {
    return SubtypingRule.newInstance(sm, false);
  }

}
