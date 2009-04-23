package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class RemoveDefaultsPart extends MenuBuilderPart {
  public static final String concept = "jetbrains.mps.lang.actions.structure.RemoveDefaultsPart";

  public RemoveDefaultsPart(SNode node) {
    super(node);
  }

  public static RemoveDefaultsPart newInstance(SModel sm, boolean init) {
    return (RemoveDefaultsPart)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.RemoveDefaultsPart", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static RemoveDefaultsPart newInstance(SModel sm) {
    return RemoveDefaultsPart.newInstance(sm, false);
  }

}
