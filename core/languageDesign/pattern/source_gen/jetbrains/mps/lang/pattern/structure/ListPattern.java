package jetbrains.mps.lang.pattern.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class ListPattern extends jetbrains.mps.lang.pattern.structure.AsPattern {
  public static final String concept = "jetbrains.mps.lang.pattern.structure.ListPattern";

  public ListPattern(SNode node) {
    super(node);
  }

  public static ListPattern newInstance(SModel sm, boolean init) {
    return (ListPattern)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.pattern.structure.ListPattern", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static ListPattern newInstance(SModel sm) {
    return ListPattern.newInstance(sm, false);
  }

}
