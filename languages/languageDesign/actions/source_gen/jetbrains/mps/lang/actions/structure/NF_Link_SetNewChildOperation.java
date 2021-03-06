package jetbrains.mps.lang.actions.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.structure.Link_SetNewChildOperation;
import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class NF_Link_SetNewChildOperation extends Link_SetNewChildOperation {
  public static final String concept = "jetbrains.mps.lang.actions.structure.NF_Link_SetNewChildOperation";

  public NF_Link_SetNewChildOperation(SNode node) {
    super(node);
  }

  public static NF_Link_SetNewChildOperation newInstance(SModel sm, boolean init) {
    return (NF_Link_SetNewChildOperation) SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.lang.actions.structure.NF_Link_SetNewChildOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static NF_Link_SetNewChildOperation newInstance(SModel sm) {
    return NF_Link_SetNewChildOperation.newInstance(sm, false);
  }
}
