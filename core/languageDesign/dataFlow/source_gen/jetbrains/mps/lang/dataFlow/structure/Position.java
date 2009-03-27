package jetbrains.mps.lang.dataFlow.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class Position extends jetbrains.mps.lang.core.structure.BaseConcept {
  public static final String concept = "jetbrains.mps.lang.dataFlow.structure.Position";

  public Position(SNode node) {
    super(node);
  }

  public static Position newInstance(SModel sm, boolean init) {
    return (Position)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.dataFlow.structure.Position", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static Position newInstance(SModel sm) {
    return Position.newInstance(sm, false);
  }

}
