package jetbrains.mps.baseLanguage.ext.collections.lang.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetFirstOperation extends SequenceOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation";

  public  GetFirstOperation(SNode node) {
    super(node);
  }

  public static GetFirstOperation newInstance(SModel sm, boolean init) {
    return (GetFirstOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.ext.collections.lang.structure.GetFirstOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetFirstOperation newInstance(SModel sm) {
    return GetFirstOperation.newInstance(sm, false);
  }

}
