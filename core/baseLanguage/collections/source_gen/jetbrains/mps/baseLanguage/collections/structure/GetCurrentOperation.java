package jetbrains.mps.baseLanguage.collections.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.SNode;
import jetbrains.mps.smodel.SModel;
import jetbrains.mps.smodel.SModelUtil_new;
import jetbrains.mps.project.GlobalScope;

public class GetCurrentOperation extends AbstractEnumeratorOperation {
  public static final String concept = "jetbrains.mps.baseLanguage.collections.structure.GetCurrentOperation";

  public GetCurrentOperation(SNode node) {
    super(node);
  }

  public static GetCurrentOperation newInstance(SModel sm, boolean init) {
    return (GetCurrentOperation)SModelUtil_new.instantiateConceptDeclaration("jetbrains.mps.baseLanguage.collections.structure.GetCurrentOperation", sm, GlobalScope.getInstance(), init).getAdapter();
  }

  public static GetCurrentOperation newInstance(SModel sm) {
    return GetCurrentOperation.newInstance(sm, false);
  }

}
